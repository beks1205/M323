package org.example;
import java.util.*;

public class WordScorerApp {
    private List<String> words;
    private Map<String, Integer> wordScores;

    public WordScorerApp() {
        words = new ArrayList<>();
        wordScores = new HashMap<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    private int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (Character.toLowerCase(c) != 'a') {
                score++;
            }
        }
        return score;
    }

    public void calculateScores() {
        for (String word : words) {
            int score = calculateScore(word);
            wordScores.put(word, score);
        }
    }

    public List<String> getSortedWordsByScore() {
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(wordScores.entrySet());
        sortedScores.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        List<String> sortedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sortedScores) {
            sortedWords.add(entry.getKey());
        }
        return sortedWords;
    }

    public void printSortedWordsByScore() {
        List<String> sortedWords = getSortedWordsByScore();
        System.out.println("Liste der Wörter nach Punktzahl sortiert:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordScores.get(word) + " Punkte");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordScorerApp app = new WordScorerApp();

        System.out.println("Willkommen zur Word Scorer App!");
        System.out.println("Bitte geben Sie eine Liste von Wörtern ein (jedes Wort in einer neuen Zeile).");
        System.out.println("Geben Sie 'Ende' ein, um die Eingabe zu beenden.");

        String inputWord;
        while (true) {
            inputWord = scanner.nextLine();
            if (inputWord.equalsIgnoreCase("Ende")) {
                break;
            }
            app.addWord(inputWord);
        }

        app.calculateScores();
        app.printSortedWordsByScore();
    }
}
