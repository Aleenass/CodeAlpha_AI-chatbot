import opennlp.tools.postag.*;
import opennlp.tools.tokenize.*;
import java.io.*;

public class NLPPOSTagger {
    private Tokenizer tokenizer;
    private POSTaggerME posTagger;

    public NLPPOSTagger() throws IOException {
        // Load Tokenizer Model
        InputStream tokenModelStream = new FileInputStream("src/en-token.bin");
        TokenizerModel tokenModel = new TokenizerModel(tokenModelStream);
        this.tokenizer = new TokenizerME(tokenModel);

        // Load POS Tagger Model
        InputStream posModelStream = new FileInputStream("src/en-pos-maxent.bin");
        POSModel posModel = new POSModel(posModelStream);
        this.posTagger = new POSTaggerME(posModel);
    }

    public void tagSentence(String sentence) {
        String[] tokens = tokenizer.tokenize(sentence);
        String[] tags = posTagger.tag(tokens);

        System.out.println("Tagged Words:");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i] + " -> " + tags[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        NLPPOSTagger tagger = new NLPPOSTagger();
        tagger.tagSentence("I love programming with Java.");
    }
}
