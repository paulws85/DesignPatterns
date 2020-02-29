package excersises.adapter;

public class DocFile implements FileFormat {

    @Override
    public void printText() {
        System.out.println("I'm .doc");
    }
}
