package OOP.Abstraction.TheTemplateMethodPattern;

class ImageProcessor extends DocumentProcessor {
    @Override
    protected void extractText() {
        System.out.println("Step 2 (Image): Applying OCR to detect characters in pixels.");
    }
}