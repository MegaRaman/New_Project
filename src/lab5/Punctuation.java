package lab5;

public class Punctuation implements SentenceMember{
    private final String punctuation;
    public Punctuation(String punctuation) {
        this.punctuation = punctuation;
    }   

    @Override
    public String toString(){
        return punctuation;
    }
}
