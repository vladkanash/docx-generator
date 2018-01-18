package com.vladkanash.service;

import com.vladkanash.model.ProfileInfoContext;
import org.wickedsource.docxstamper.DocxStamper;

import java.io.*;

public class ProfileSummaryGeneratorServiceImpl implements ProfileSummaryGeneratorService {

    private final DocxStamper<ProfileInfoContext> stamper = new DocxStamper<ProfileInfoContext>();

    public void generateDocx(InputStream template, ProfileInfoContext context, OutputStream result) {
        stamper.stamp(template, context, result);
    }

    public void generatePdf(InputStream template, ProfileInfoContext context, OutputStream result) {
        
    }
}
