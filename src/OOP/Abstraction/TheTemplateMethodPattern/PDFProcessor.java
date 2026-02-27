package OOP.Abstraction.TheTemplateMethodPattern;

class PDFProcessor extends DocumentProcessor {
    @Override
    protected void extractText() {
        System.out.println("Step 2 (PDF): Using PDFBox library to parse layout and text.");
    }
}
