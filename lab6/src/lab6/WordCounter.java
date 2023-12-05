package lab6;

import java.util.HashMap;
import java.util.Map;

/**
 * The WordCounter class provides methods for counting unique words within a sentence.
 */
public class WordCounter {
    /**
     * Maps words to their occurrence count.
     */
    private final Map<String, Integer> wordMap = new HashMap<>();

    /**
     * Adds a word to the word map, updating its occurrence count.
     *
     * @param word The word to be added.
     */
    public void addWord(String word) {
        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
    }

    /**
     * Adds words from a sentence to the word map.
     *
     * @param sentence The sentence containing words separated by spaces.
     */
    public void addSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            addWord(word);
        }
    }

    /**
     * Displays each word within the map along with its associated occurrence count.
     */
    public void outputResults() {
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
