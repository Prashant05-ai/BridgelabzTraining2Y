public class StringBufferConcatenate {
    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "Java", " ", "World"};
        StringBuffer sb = new StringBuffer();
        for (String s : arr) sb.append(s);
        System.out.println(sb);
    }
}