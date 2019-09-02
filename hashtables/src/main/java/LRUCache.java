import java.util.LinkedHashMap;

public class LRUCache {

    /*
     * 13.3
     */

    private int capacity;
    LinkedHashMap<Integer, Integer> isbnToPrice;

    public LRUCache(int capacity) {
        this.isbnToPrice = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
                return this.size() > capacity;
            }
        };
    }

    public Integer lookup(Integer key) {
        return isbnToPrice.getOrDefault(isbnToPrice.get(key), null);
    }

    public Integer insert(Integer key, Integer value) {
        Integer currentValue = isbnToPrice.get(key);
        if (!isbnToPrice.containsKey(key)) {
            isbnToPrice.put(key, value);
            return currentValue;
        }

        return null;
    }

    public Integer remove(Integer key) {
        return isbnToPrice.remove(key);
    }
}
