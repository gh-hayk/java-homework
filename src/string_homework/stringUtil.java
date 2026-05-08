package string_homework;

public class stringUtil {
    //1․Գրել method,որը կատարում է String concatenation տվյալ պարամետրով․
    public String concat(String s1, String s2) {
        return s1.concat(s2);
    }

    public String concat(int a, int b, String s) {
        return String.valueOf(a).concat(String.valueOf(b)).concat(s);
    }

    public String concat(String a, int b, String s) {
        return a.concat((String.valueOf(b)).concat(s));
    }

    public String concat(String a, int b, int c, String s) {
        return a.concat((String.valueOf(b).concat(String.valueOf(c))).concat(s));
    }

    //2.Գրել method,որը ստանում է String պարամետր և տպում է ամեն դատարկ սիվոլից նոր տողում օգտագործելով String Literal(\t,\b….)․
    public String printWords(String a) {
        return a;
    }

    //3.Գրել method (reverse), որը  շուռ է տալիս String.
    public static String reverse(String a) {
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            result += a.charAt(i);
        }
        return result;
    }

    //5.Գրել method,որը տեքստը սարքում է մեծատառերով գրված,օգտագործելով String.Նույն խնդիրը StringBuilder-ով.
    public static String toUpperCaseString(String text) {
        if (text == null) return null;

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // a-z տառերը փոխարկել A-Z  (ASCII տարբերություն = 32)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch; // String-ը immutable է, ամեն անգամ նոր object է ստեղծվում
        }

        return result;
    }

    //6.Գրել method,որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող ,տպում այն եթե տողի երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    public static String padToTwenty(String text1) {
        if (text1 == null) text1 = "";
        String result = text1;
        for (int i = text1.length(); i < 20; i++) {
            result += "*";

        }
        return result;
    }

    //7.Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները. Նույնը խնդիրը  StringBuilder-ով.
    public static String removeA(String text2) {
        if (text2 == null) return null;

        String result = "";
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            if (ch != 'a') {
                result += ch;
            }
        }
        return result;
    }

    //8.Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.
    public static String replaceA(String text) {
        if (text == null) return null;

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a') {
                result += '*';
            } else {
                result += ch;
            }
        }

        return result;
    }

    //9.Գրել method,որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.
    public static String longWord(String text5) {
        if (text5 == null) return null;
        String[] words = text5.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }

    //10.Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը.
    public static int findFirstIndex(String text4, String c) {
        if (text4 == null || c == null) ;

        return text4.indexOf(c);
    }

    //11.Գրել method,որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը,օգտագործելով String.Նույնը խնդիրը StringBuilder-ով
    public static void printSubLine(String line, int n) {
        if (line == null) return;
        System.out.println(line.substring(0, n + 1));
    }

    //12.Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․
    public static boolean notNullEmpty(String text) {
        if (text == null) return false;
        if (text.isEmpty()) return false;

        return true;
    }

    public static void main(String[] args) {
        stringUtil sc = new stringUtil();
//1.շարունակություննա
        String r1 = sc.concat("hello", "world");
        System.out.println("1.1  \" hello\" world  \"" + r1 + "\"");
        String r2 = sc.concat(1, 2, "hello");
        System.out.println("1.2 1,2, \"hello       \"" + r2 + "\"");
        String r3 = sc.concat("1", 2, "hello");
        System.out.println("1.3 \"1\",2, \"hello\"   \"" + r3 + "\"");
        String r4 = sc.concat("hello", 1, 2, "world");
        System.out.println("1.3 \"hello\" 1,2 \"world\"  \"" + r4 + "\"");
//2.շարունակություննա
        String a = "We \nare \nliving \nin";
        System.out.println("2 " + a);
//3.շարունակություննա
        System.out.println("3 \"sample\"  \"" + reverse("sample") + "\"");
//5.շարունակություննա
        String text = "5 hello world";
        System.out.println(toUpperCaseString(text));
//6.շարունակություննա
        String text1 = "6 Armenia";
        System.out.println(padToTwenty(text1));
//7.շարունակություննա
        String text2 = "7 We are living in an yellow submarine. We don't  have anything";
        System.out.println(removeA(text2));
//8.շարունակություննա
        String text3 = "8 We are living in an yellow submarine. We don't  have anything";
        System.out.println(replaceA(text3));
//9.շարունակություննա
        String text5 = "We are living in an yellow submarine. We don't have anything";
        System.out.print("9 ");
        System.out.println(longWord(text5));
//10.շարունակություննա
        String text4 = "We are living in an yellow submarine. We don't have anything";
        String c = "a";
        System.out.print("10 ");
        System.out.println(findFirstIndex(text4, c));
//11.շարունակություննա
        String text6 = "We are living in an yellow submarine. We don't have anything";
        System.out.print("11 ");
        printSubLine(text6, 12);
//12.շարունակություննա
        System.out.print("12 ");
        System.out.println(notNullEmpty(null));
        System.out.println(notNullEmpty(""));
        System.out.println(notNullEmpty(" "));
        System.out.println(notNullEmpty("hello"));
//13.շարունակություննա

    }
}
