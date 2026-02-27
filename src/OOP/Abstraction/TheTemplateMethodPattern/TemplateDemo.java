package OOP.Abstraction.TheTemplateMethodPattern;

public class TemplateDemo {
    public static void main(String[] args) {
        DocumentProcessor pdf = new PDFProcessor();
        pdf.processDocument(); // Follows 1 -> 2 (PDF) -> 3

        DocumentProcessor img = new ImageProcessor();
        img.processDocument(); // Follows 1 -> 2 (Image) -> 3
    }
}