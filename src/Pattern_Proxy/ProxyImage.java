package Pattern_Proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // В данном случае если не происходит новая загрузка файла, файл лишь выводится на экран, если он уже был загружен в систему
        if (realImage == null) {
            realImage = new RealImage(fileName);

        }
        realImage.display();
    }
}
