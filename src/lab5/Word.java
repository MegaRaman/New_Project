package lab5;

public class Word implements SentenceMember{
    private final Letter[] letters;
    public Word(String wordInString) {
        letters = new Letter[wordInString.length()];
        for (int i = 0; i < wordInString.length(); i++) {
            letters[i] = new Letter(wordInString.charAt(i));
        }
    }


    @Override
    public String toString(){
        StringBuilder wordToString = new StringBuilder();
        for (Letter letter : letters) {
            wordToString.append(letter);
        }
        return wordToString.toString();
    }
}
