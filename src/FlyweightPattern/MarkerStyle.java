package FlyweightPattern;
import java.util.HashMap;
import java.util.Map;

public class MarkerStyle {
    public static final Map<String, MarkerStyle> styles = new HashMap<>();
    private String icon, color, labelStyle;

    private MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + "_" + color + "_" + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
        }
        return styles.get(key);
    }
}
