import java.util.*;
public class sortFrequency {
    public static void main(String[] args) {

    }
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue()); //store larger first
        maxHeap.addAll(freq.entrySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll(); //get highest entry
            for (int i = 0; i < entry.getValue(); i++) { //add to sb acc to its frequency
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}
