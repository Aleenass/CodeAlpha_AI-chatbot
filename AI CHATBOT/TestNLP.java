import java.io.IOException;
import java.util.Arrays;

public class TestNLP {
    public static void main(String[] args) throws IOException {
        NLPProcessor nlp = new NLPProcessor();
        String text = "Hello! How are you doing today?";
        String[] words = nlp.tokenize(text);
        
        System.out.println("Tokenized Words: " + Arrays.toString(words));
    }
}


