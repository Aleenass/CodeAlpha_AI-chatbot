import opennlp.tools.tokenize.*;
import java.io.*;

public class NLPProcessor {
    private Tokenizer tokenizer;

    public NLPProcessor() throws IOException {
        // Load the pre-trained tokenizer model
        InputStream modelStream = new FileInputStream("src/en-token.bin");



        TokenizerModel model = new TokenizerModel(modelStream);
        this.tokenizer = new TokenizerME(model);
    }

    public String[] tokenize(String sentence) {
        return tokenizer.tokenize(sentence); // Splits text into words
    }
}
