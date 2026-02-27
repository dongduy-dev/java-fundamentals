package OOP.Abstraction.TheTemplateMethodPattern;

abstract class DocumentProcessor {
    // The Template Method: marked 'final' so subclasses can't change the steps
    public final void processDocument() {
        loadDocument();
        extractText(); // This step varies
        saveResults();
        System.out.println("Processing complete.\n");
    }

    private void loadDocument() {
        System.out.println("Step 1: Loading file into memory...");
    }

    // Abstract step: specific extraction logic depends on the file type
    protected abstract void extractText();

    private void saveResults() {
        System.out.println("Step 3: Saving extracted text to database...");
    }
}
