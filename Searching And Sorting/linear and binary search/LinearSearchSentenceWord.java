public class LinearSearchSentenceWord {
    public static void main(String[] args) {
        String[] sentences = {"Java is easy", "I love programming", "Binary search is fast"};
        String target = "programming";
        String result = "Not Found";
        for (String sentence : sentences)
            if (sentence.toLowerCase().contains(target.toLowerCase())) {
                result = sentence;
                break;
            }
        System.out.println(result);
    }
}