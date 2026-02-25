import java.util.HashMap;

public class Codec {
    private HashMap<String, String> map = new HashMap<>();
    private int counter = 0;
    private static final String BASE_URL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = String.valueOf(counter++);
        map.put(key, longUrl);
        return BASE_URL + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(BASE_URL, "");
        return map.get(key);
    }
}