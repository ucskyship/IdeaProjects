package String;

public class Alphabet {

    public static void main(String[] args) {
        String s = "abcdabcdabca";
        char myAlphabet[] = s.toCharArray();
        int count = 0;

        for (int i = 0; i < myAlphabet.length; i++) {
            if(s.charAt(i)=='a'){
               count++;
            }
        }
        System.out.println(count);
    }
}
