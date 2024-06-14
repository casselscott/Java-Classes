import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Retrieving a value from the map
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Checking if the map contains a key
        System.out.println("Map contains key 'Banana': " + map.containsKey("Banana"));

        // Removing a key-value pair from the map
        map.remove("Banana");

        // Iterating over key-value pairs in the map
        System.out.println("Key-Value pairs in map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Size of the map
        System.out.println("Size of map: " + map.size());
    }
}
