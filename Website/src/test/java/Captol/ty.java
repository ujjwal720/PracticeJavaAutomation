package Captol;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ty {
    public static void main(String[] args) {
        String inputPdfPath = "C:\\final\\Full Bid Set_03112025_SunVet Building 2 (Regency Centers) Holbrook NY.pdf"; // Input PDF path
        String outputPdfPath = "C:\\final\\Compiled.pdf"; // Output compiled PDF path

        File inputFile = new File(inputPdfPath);
        if (!inputFile.exists() || !inputFile.isFile()) {
            System.out.println("❌ PDF file not found at the specified path.");
            return;
        }

        Pattern pattern = Pattern.compile("(SP|FP)-\\d+(\\.\\d+)?"); // Regex to match SP-XX or FP-XX
        PDDocument compiledDocument = new PDDocument();

        try (PDDocument document = PDDocument.load(inputFile)) {
            PDFTextStripper textStripper = new PDFTextStripper();
            textStripper.setSortByPosition(true);

            int totalPages = document.getNumberOfPages();
            List<Integer> matchingPages = new ArrayList<>();

            for (int page = 1; page <= totalPages; page++) {
                textStripper.setStartPage(page);
                textStripper.setEndPage(page);
                String fullText = textStripper.getText(document).trim();

                Matcher matcher = pattern.matcher(fullText);
                if (matcher.find()) {
                    matchingPages.add(page);
                }
            }

            if (!matchingPages.isEmpty()) {
                System.out.println("✅ Matching pages found: " + matchingPages);
                for (int page : matchingPages) {
                    compiledDocument.addPage(document.getPage(page - 1));
                }
                compiledDocument.save(outputPdfPath);
                System.out.println("📂 Compiled PDF saved at: " + outputPdfPath);
            } else {
                System.out.println("❌ No matching pages found. No PDF was created.");
            }

        } catch (IOException e) {
            System.out.println("⚠️ Error processing PDF: " + e.getMessage());
        } finally {
            try {
                compiledDocument.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
