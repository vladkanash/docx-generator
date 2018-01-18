package com.vladkanash;

import com.vladkanash.model.ProfileInfoContext;
import com.vladkanash.service.ProfileSummaryGeneratorService;
import com.vladkanash.service.ProfileSummaryGeneratorServiceImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        final ProfileInfoContext context = new ProfileInfoContext();
        context.setName("Vlad Kanash");
        context.setEmail("vlad.kanash@gmail.com");

        final List<String> summary = new ArrayList<String>();
        summary.add("•\tResponsible for key features delivery in several e-commerce and SAP integration projects;\n");
        summary.add("•\tDetailed knowledge about the integration of SAP and non-SAP systems for service, order management, price and inventory data;\n");
        summary.add("•\tTechnical team lead experience from managing and mentoring technical development teams of up to three developers, with varying skill levels and technical specialization areas;\n");
        summary.add("•\tAgile project and SCRUM experience, cooperation with product owners; \n");
        summary.add("•\tBachelor degree in Engineering at Belarusian State University, 2009\n");

//        "•\tResponsible for key features delivery in several e-commerce and SAP integration projects;\n" +
//                "•\tDetailed knowledge about the integration of SAP and non-SAP systems for service, order management, price and inventory data;\n" +
//                "•\tTechnical team lead experience from managing and mentoring technical development teams of up to three developers, with varying skill levels and technical specialization areas;\n" +
//                "•\tAgile project and SCRUM experience, cooperation with product owners; \n" +
//                "•\tExperience in working closely and reporting to the business analysts, project managers and other cross-functional teams;\n" +
//                "•\tExcellent communication and interpersonal skills. Ability to work as a part of an integrated team as well as independently.\n" +
//                "•\tBachelor degree in Engineering at Belarusian State University, 2009\n"

        context.setSummary(summary);

        final ProfileSummaryGeneratorService service = new ProfileSummaryGeneratorServiceImpl();

        final InputStream template = Main.class.getClassLoader().getResourceAsStream("ES-template.docx");
        OutputStream result = null;

        try {
            result = new FileOutputStream(new File("result\\Result.docx"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        service.generateDocx(template, context, result);

        try {
            result.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
