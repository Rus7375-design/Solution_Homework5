public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }
    private void loadImage() {
        System.out.println("[RealImage] Загружается полноразмерное изображение с диска: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("[RealImage] Показывается миниатюра изображения: " + fileName);
    }

    // Показ полноразмерного изображения
    @Override
    public void displayFullImage() {
        System.out.println("[RealImage] Показывается полноразмерное изображение: " + fileName);
    }
}
