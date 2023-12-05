package lab2;


public class WordProcessor implements Counter {
 private String text;

 public WordProcessor(String text) {
     this.text = text;
 }

 public String getText() {
     return text;
 }

 public void setText(String text) {
     this.text = text;
 }

 @Override
 public int countWords(String sentence) {
     if (sentence == null) {
         sentence = text;
     }
     String[] words = sentence.split("\\s+");
     return words.length;
 }

 @Override
 public int countLetters(String sentence) {
     if (sentence == null) {
         sentence = text;
     }
     int letters = 0;
     for (int i = 0; i < sentence.length(); i++) {
         if (Character.isLetter(sentence.charAt(i))) {
             letters++;
         }
     }
     return letters;
 }

 @Override
 public int getLength(String sentence) {
     if (sentence == null) {
         sentence = text;
     }
     return sentence.length();
 }
}
