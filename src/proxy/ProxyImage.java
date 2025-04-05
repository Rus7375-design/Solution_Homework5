public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    // Показываем превью
    @Override
    public void display() {
        System.out.println("[ProxyImage] Показывается миниатюра изображения: " + fileName);
    }

    // Показываем полное изображение
    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayFullImage();
    }
}