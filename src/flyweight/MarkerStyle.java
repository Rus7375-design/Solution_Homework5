package flyweight;

public class MarkerStyle {
    private String icon;
    private String color;
    private String labelFont;

    public MarkerStyle(String icon, String color, String labelFont) {
        this.icon = icon;
        this.color = color;
        this.labelFont = labelFont;
    }

    public void displayStyle() {
        System.out.println("Стиль: Иконка = " + icon + ", Цвет = " + color + ", Шрифт = " + labelFont);
    }
}

