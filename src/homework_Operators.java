//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class homework_Operators {
    public static void main(String[] args) {
//ARITHMETIC OPERATORS
//1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
//         int a = 8;
//         int b = 6;
//          System.out.println("a + b = " + (a+b));
//          System.out.println("a - b = " + (a-b));
//          System.out.println("a * b = " + (a*b));
//          System.out.println("a / b = " + (a/b));
//          System.out.println("a % b = " + (a%b));

//2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
//        double c = 6.4;
//        double d = 0.03;
//          System.out.println("c + d = " + (c + d));
//          System.out.println("c * d = " + (c * d));
//          System.out.println("c / d = " + (c / d));
//          System.out.println("c - d = " + (c - d));
//          System.out.println("c % d = " + (c % d));
//3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
//        int x = 2 *((5+3) * 4 -8);
//          System.out.println(x);
//        int y = 2 * 5 + 3 * 4 - 8;
//          System.out.println(y);
//UNARY OPERATORS
//4․ Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը․
//          int e = 10;
//          int f = -88;
//          boolean n1 = true;
//            System.out.println("1) -e = " + -e);
//            System.out.println("2) -f = " + -f);
//            System.out.println("3) +e = " + +e);
//            System.out.println("4) -e + 92 = " + (-e + 92));
//            System.out.println("5) !n1 = " + !n1);
//            System.out.println("6) !(!n1) = " + !(!n1));
//            System.out.println("7.0) before e++ = " + (e++));
//            System.out.println("7.1) after e++ = " + e);
//            System.out.println("8) --f = " + --f);
//
//          int x = 3;
//          int y = ++x * 5 / x-- + --x;
//            System.out.println("x is " + x);
//            System.out.println("y is " + y);
//ASSIGNMENT OPERATOR
//5․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները
//        int x = (int)1.0;
//            System.out.println(x);
//        short yShort = (short)1921222;
//            System.out.println(yShort);
//            System.out.print(2147483647+1);
//        long yLong = (x = 3);
//            System.out.println(yLong);
//        boolean a = false;
//        boolean y;
//        boolean b = (y = true);
//        System.out.println(x);
//        System.out.println(a);
//        System.out.println(b);
//6․ Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
//             int x = 10;
//             int y = 20;
//                System.out.println("x = 10 , y = 20");
//                System.out.println("x < y = " + (x < y));
//                System.out.println("x <= y = "+ (x <= y));
//                System.out.println("x >= y = " + (x >= y));
//                System.out.print("x > y = " + (x > y));
//ADDITIONAL  TASKS
//7. Գտնե և ուղղել սխալը․
//            float y = 2.1f;

//            byte x = 5;
//            byte y = 10;
//            byte z = (byte) (x + y);
//              System.out.println(z);

//              short x = 10;
//              short y = 3;
//              short z = (short) (x * y);
//                System.out.println(z);
//
//                long x = 10;
//                int y = 5;
//                y = (int) (y * x);
//                   System.out.println(y);
//8. Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։
//            int x = 10;
//            int y = 5;
//                System.out.println("BEFORE");
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//
//            int z = x;
//            x = y;
//            y = z;
//                System.out.println("AFTER");
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
//        int x = 10;
//            int y = 5;
//                System.out.println("BEFORE");
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//
//            x = x ^ y;
//            y = x ^ y;
//            x = x ^ y;
//                System.out.println("AFTER");
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
//Հա էս շատ հեշտա սովորական թվաբանական պրոգրեսիայի տիպի բանա
//            int n = 100;
//            int sum = n * (n + 1) / 2;
//                System.out.println(sum);
//Bitwise & Logical Operators
//11․Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
              int a = 8;
              int b = 3;
                System.out.println("1) a & b = " + (a & b));
                System.out.println("2) a ^ b = " + (a ^ b));
                System.out.println("3) a | b = " + (a | b));
                System.out.println("4) ~a = " + (~a));
                System.out.println("5) true || (a < 4) = " + (true || (a < 4)));
                System.out.println("6) (b >= 6) || (++a <= 7) = " + ((b >= 6) || (++a <= 7)));
                System.out.println("7) (a<b)?a:b = " + ((a<b)?a:b));
                System.out.println("8) b^b = " + (b^b));
//Shift Operator
//12․Տպել console -ում  հետևյալը․
                System.out.println(10 << 2);
                System.out.println(-10 << 3);
                System.out.println(20 >> 2);
                System.out.println(15 >> 3);
//13.Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
                  System.out.println(4<<3);/* 5 * 2^3 */
                  System.out.println(4<<4);/* 5 * 2^4 */














    }
}