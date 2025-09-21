package Pattern_Proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }


    @Override
    public void display() {
        System.out.println("Вывод на экран");

    }


    private void loadFromDisk() {
        System.out.println("Loading image: " + fileName);
    }

}
