package excersises.adapter;

public class PdfConverterTest {

    public static void main(String[] args) {
        DocFile docFile = new DocFile();
        PdfFile pdfFile = new PdfFile();

        ToPdfConverterImpl toPdfConverter = new ToPdfConverterImpl(docFile);
        pdfFile.printText(toPdfConverter);
    }
}
