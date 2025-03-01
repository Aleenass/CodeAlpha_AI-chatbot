import opennlp.tools.sentdetect.*;
import java.io.*;

public class NLPSentenceDetector {
    private SentenceDetectorME sentenceDetector;

    public NLPSentenceDetector() throws IOException {
      
        InputStream modelStream = new FileInputStream("src/en-sent.bin");
        SentenceModel model = new SentenceModel(modelStream);
        this.sentenceDetector = new SentenceDetectorME(model);
    }

    public String[] detectSentences(String paragraph) {
        return sentenceDetector.sentDetect(paragraph);
    }

    public static void main(String[] args) throws IOException {
        NLPSentenceDetector detector = new NLPSentenceDetector();
        String text = "Hello! How are you doing today? I hope you're doing well.";
        String[] sentences = detector.detectSentences(text);

        System.out.println("Detected Sentences:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
