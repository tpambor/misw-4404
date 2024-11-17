package editor;

import java.util.ArrayList;

public class SpellChecker {
    private static final String[] REAL_WORDS = {
        "foo", "bar"
    };

    private ArrayList<String> errors = new ArrayList<String>();

    private boolean isValidWord(String word) {
        for (String realWord : REAL_WORDS) {
            if (word.equalsIgnoreCase(realWord)) {
                return true;
            }
        }

        return false;
    }

    public void check(String text) {
        String[] words = text.split(" ");

        for (String word : words) {
            if (!isValidWord(word))
                errors.add(word);
        }
    }

    public String[] getErrors() {
        String[] errors = new String[this.errors.size()];
        return this.errors.toArray(errors);
    }
}
