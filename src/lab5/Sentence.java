package lab5;

import java.util.ArrayList;

public class Sentence {
    private final SentenceMember[] sentenceMembers;
    public ArrayList<Word> words = new ArrayList<>();
    public Sentence(String sentenceString) {
        String[] wordsWithPunctInString = sentenceString.split("(?=\\p{Punct})| ");
        sentenceMembers = new SentenceMember[wordsWithPunctInString.length];
        for (int i = 0; i < wordsWithPunctInString.length; i++) {
            if (wordsWithPunctInString[i].matches("(\\p{Punct})")) {
                sentenceMembers[i] = new Punctuation(wordsWithPunctInString[i]);
            }
            else {
                sentenceMembers[i] = new Word(wordsWithPunctInString[i]);
                words.add((Word) sentenceMembers[i]);}
        }
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    @Override
    public String toString(){
        StringBuilder sentenceToString = new StringBuilder();
        for (int i = 0; i<sentenceMembers.length-1; i++) {
            sentenceToString.append(sentenceMembers[i]);
            if (sentenceMembers[i+1] instanceof Word){
                sentenceToString.append(" ");
            }
        }
        sentenceToString.append(sentenceMembers[sentenceMembers.length-1]);
        return sentenceToString.toString();
    }
}



