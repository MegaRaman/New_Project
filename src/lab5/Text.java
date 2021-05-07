package lab5;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private final Sentence[] sentences;
    private int numberOfWords = 0;
    public Text(String text) {
        String[] sentencesInString = text.split("(?<=[!?])|(?<=\\.)\s|(?<=\\.{3})");
        sentences = new Sentence[sentencesInString.length];
        for (int i = 0; i < sentencesInString.length; i++) {
            sentences[i] = new Sentence(sentencesInString[i].trim());
        }
    }


    public static String[] sorting(String[] words) {
        int counter = 0;
        int[] numbersOfVowels = new int[words.length];
        Pattern p = Pattern.compile("[aouiey]");
        for (int i = 0; i < words.length; i++) {
            Matcher m = p.matcher(words[i]);
            while (m.find()){
                counter++;
            }
            numbersOfVowels[i] = counter;
            counter = 0;
        }
        algorithmOfSort(words, numbersOfVowels);
        return words;
    }

    private static void algorithmOfSort(String[] words, int[] numbersOfVowels) {
        boolean isSorted = false;
        int intermediate_var;
        String intermediate_var2;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < numbersOfVowels.length - 1; i++){
                if (numbersOfVowels[i] > numbersOfVowels[i+1]){
                    isSorted = false;
                    intermediate_var = numbersOfVowels[i];
                    numbersOfVowels[i] = numbersOfVowels[i+1];
                    numbersOfVowels[i+1] = intermediate_var;
                    intermediate_var2 = words[i];
                    words[i] = words[i+1];
                    words[i+1] = intermediate_var2;
                }
            }
        }
    }

    public String[] sortText() {
        ArrayList<Word> test = new ArrayList<>();
        for (Sentence sentence : sentences) {
            numberOfWords += sentence.getWords().size();
            test.addAll(sentence.getWords());
        }
        String[] words = new String[numberOfWords];
        for (int i = 0; i < test.size(); i++) {
            words[i] = test.get(i).toString();
        }
        return sorting(words);
    }

    @Override
    public String toString(){
        StringBuilder textToString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            if (i != 0){
                textToString.append(" ");
            }
            textToString.append(sentences[i]);
        }
        return textToString.toString();
    }
}
