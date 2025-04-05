package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainFlyweightDemo {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();
        String[] types = {"hospital", "restaurant", "gas"};
        Random rand = new Random();

        for (int i = 0; i < 10_000; i++) {
            String type = types[rand.nextInt(types.length)];
            MarkerStyle style = MarkerFactory.getStyle(type);

            int x = rand.nextInt(1000);
            int y = rand.nextInt(1000);
            String name = type + "_#" + i;

            Marker marker = new Marker(x, y, name, style);
            markers.add(marker);
        }

        for (int i = 0; i < 5; i++) {
            markers.get(i).render();
            System.out.println();
        }

        System.out.println("Всего маркеров: " + markers.size());
        System.out.println("Уникальных стилей: " + MarkerFactory.getStyleCount());
    }
}
