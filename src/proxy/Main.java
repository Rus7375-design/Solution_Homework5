package proxy;

import proxy.Image;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("house1.jpg");

        System.out.println(">>> Пользователь зашёл на сайт");
        image.display(); // Только миниатюра

        System.out.println("\n>>> Пользователь нажал 'Увеличить'");
        image.displayFullImage(); // Полное изображение
    }
}