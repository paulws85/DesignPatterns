package excersises.adapter;

public class PdfConverterTest {

    public static void main(String[] args) {
        DocFile docFile = new DocFile();
        PdfFile pdfFile = new PdfFile();

        Converter converter = new ToPdfConverterImpl(docFile);
        pdfFile.printText(converter);
    }

}