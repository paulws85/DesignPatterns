package excersises.adapter;

public class ToPdfConverterImpl implements Converter {

    private final FileFormat fileFormat;

    public ToPdfConverterImpl(FileFormat fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public void convert() {
        fileFormat.printText();
    }

}
