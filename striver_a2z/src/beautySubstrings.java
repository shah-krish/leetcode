public class beautySubstrings {
    public static void main(String[] args) {

    }

    public static int beautySum(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a'] = freq[s.charAt(j) - 'a'] + 1;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                counter += max - min;
            }
        }
        return counter;
    }
}