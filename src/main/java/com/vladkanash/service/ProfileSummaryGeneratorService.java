package com.vladkanash.service;

import com.vladkanash.model.ProfileInfoContext;

import java.io.InputStream;
import java.io.OutputStream;

public interface ProfileSummaryGeneratorService {

    void generateDocx(final InputStream template, final ProfileInfoContext context, final OutputStream result);

    void generatePdf(final InputStream template, final ProfileInfoContext context, final OutputStream result);
}
