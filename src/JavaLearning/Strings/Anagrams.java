package JavaLearning.Strings;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "Hello"));
        System.out.println(isAnagram("anagramm", "marganaa"));
    }

    static boolean isAnagram(String a, String b) {
        // initial quick test for non-anagrams
        if (a.length() != b.length())
            return false;
        //Convert to LowerCase
        a = a.toLowerCase();
        b = b.toLowerCase();
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (Character c : b.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }
        for (int k = 0; k < a.length(); k++) {
            char letter = a.charAt(k);

            if (!map.containsKey(letter))
                return false;

            Integer frequency = map.get(letter);

            if (frequency == 0)
                return false;
            else
                map.put(letter, --frequency);
        }
// if the code got that far it is an anagram
        return true;
    }
}
