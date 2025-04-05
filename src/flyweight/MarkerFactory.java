package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String type) {
        if (!styles.containsKey(type)) {
            switch (type) {
                case "hospital":
                    styles.put(type, new MarkerStyle("🏥", "красный", "Arial"));
                    break;
                case "restaurant":
                    styles.put(type, new MarkerStyle("🍽️", "оранжевый", "Verdana"));
                    break;
                case "gas":
                    styles.put(type, new MarkerStyle("⛽", "синий", "Tahoma"));
                    break;
                default:
                    styles.put(type, new MarkerStyle("❓", "серый", "Sans"));
            }
        }
        return styles.get(type);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}

