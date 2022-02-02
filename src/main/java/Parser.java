import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Parser {
    public static Map<String, Integer> findUniqueWords(String s) {
        var map = new HashMap<String, Integer>();
        var arr = s.toUpperCase(Locale.ROOT).split("[ ,\\.!?\";:\\[\\]\\(\\)\n\r\t]");
        for (var elem : arr) {
            if (elem.isBlank() || elem.isEmpty()) {
                continue;
            }
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
            }
        }
        return map;
    }
}
