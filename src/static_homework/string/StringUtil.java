package static_homework.string;
//6.Create a class with a static method that accepts two strings and returns a string that contains all the characters that appear in both strings. Use this method in another class to find the common characters in two randomly generated strings.
public class StringUtil {
    public static String findCommon(String a, String b){
        String result = "";
        for (int i = 0; i < a.length(); i++){
            char lettar = a.charAt(i);

            if (b.indexOf(lettar) != -1){
                if (result.indexOf(lettar) == -1){
                    result = result + lettar;
                }
            }
        }
        return result;
    }
}
