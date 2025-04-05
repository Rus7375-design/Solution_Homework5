package flyweight;

public class Marker {
    private int x;
    private int y;
    private String name;
    private MarkerStyle style;

    public Marker(int x, int y, String name, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.style = style;
    }

    public void render() {
        System.out.println("Маркер \"" + name + "\" на координатах (" + x + ", " + y + ")");
        style.displayStyle();
    }
}

