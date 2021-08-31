import java.util.Locale;

public class App {
    public static void main(String[] main) {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.format("Trong chuỗi có %d ký tự in hoa.\n", countUpper(str));
        System.out.format("%s\n", upperFirstChar(str));
        System.out.format("%s\n", upperFirstWords(str));
    }

    public static int countUpper(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    public static String upperFirstChar(String str){
        String[] words= str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String remainingLetters = words[i].substring(1);
            result += firstLetter + remainingLetters + " ";
        }
        return result;
    }

    public static String upperFirstWords(String str){
        String[] words= str.split("\\. ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            //System.out.println(words[i]);
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String remainingLetters = words[i].substring(1).toLowerCase();
            result += firstLetter + remainingLetters;
            if (i != words.length-1) {
                result +=  ". ";
            }
        }
        return result;
    }
}
