
public class home_Statements {
    public static void main(String[] args) {
//1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.
//        checkNum(6);
//        checkNum(18);
//        checkNum(7);
//        checkNum(15);

//2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
//          checkNum(-5);
//          checkNum(3);
//          checkNum(0);

//3․Գրել method, որը ստուգում է տրված x ամբողջ թիվը կամ փոքր 8ից և մեծ 5ից,Կամ փոքր 20ից և մեծ 15ից
//        System.out.println(inequality(6));
//        System.out.println(inequality(5));
//        System.out.println(inequality(10));
//        System.out.println(inequality(16));
//        System.out.println(inequality(10));
//        System.out.println(inequality(25));

//4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.
//        System.out.println(isDivision5and7(14));
//        System.out.println(isDivision5and7(5));
//        System.out.println(isDivision5and7(70));
//        System.out.println(isDivision5and7(35));
//        System.out.println(isDivision5and7(7));

//5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
//        System.out.println(checkSecondDigit(171));
//        System.out.println(checkSecondDigit(253));
//        System.out.println(checkSecondDigit(8999));
//        System.out.println(checkSecondDigit(27));

//7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
//          System.out.println("Մեծագույնը = " + findMax(10, 25, 15));
//          System.out.println("Մեծագույնը = " + findMax(18, 19, 12));
//          System.out.println("Մեծագույնը = " + findMax(-9, -2, -10));

//8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։ (նահանջ է համարվում այն տարին որը բաժանվում է 4, բայց բացառություն է արվում այն տարիների համար, որոնք 100-ի բաժանվող են։ Այդ տարիները նահանջ են միայն, եթե նաև բաժանվում են 400-ի։)
//        System.out.println(checkYear(2000));
//        System.out.println(checkYear(1900));
//        System.out.println(checkYear(1904));

//11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․
//        printNumber();

//12․Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.
//          System.out.println("Առաջին թվանշանը = " + firstDigit(12345));
//          System.out.println("Առաջին թվանշանը = " + firstDigit(8740104));
//          System.out.println("Առաջին թվանշանը = " + firstDigit(1532654920));

//13.Տրված են int x = 1, int y = 0.Քանի դեռ x < 5 ից  և  y < 10 տպել x+y արտահայտությունը․
//            int x = 1;
//            int y = 0;
//
//            while (x < 5 && y < 10){
//                System.out.println("x + y = " + (x + y));
//                x++;
//                y++;
//            }

//14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։
//             printSquare();


   }
//14.շարունակություննա
//            public static void printSquare(){
//                for (int i = 0; i < 4; i++){
//                    for(int j = 0; j < 4; j++){
//                        System.out.print("* ");
//                    }
//                System.out.println();
//                }
//            }



//12. շարունակություննա
//public static int firstDigit(int x){
//          int num = Math.abs(x);
//
//          while(num >= 10){
//              num /= 10;
//
//    }
//          return num;
//}





//11. 11-ի շարունակություննա
//    public static void printNumber(){
//        for (int i = 1; i <= 200; i++){
//            System.out.println(i);
//        }
//    }

//8.ՈՒթերորդի շարունակություննա
//    public static boolean checkYear(int x) {
//        if (x % 400 == 0) return true;
//        if (x % 100 == 0) return false;
//        return x % 4 == 0;
//    }

//7.Յոթերորդի շարունակություննա
//public static int findMax(int a,int b,int c){
//        if (a >= b && a >= c){
//            return a;
//        }else if (b >= a && b >= c){
//            return b;
//        }else {
//            return c;
//        }
//
//    }

//5,հինգերորդի շարունակություննա
//public static boolean checkSecondDigit(int x){
//ստուգում ա թիվը եռանիշա թե չէ
//        if (x < 100 || x > 999){
//            System.out.println(x + " Number is not three digits");
//            return false;
//        }
//        int secondDigit = (x / 10) % 10;
//        return secondDigit == 7;
//
//}


//    public static boolean inequality(int x,) {
//3․երրորդի շարունակություննա
//Ստուգումա 5ից մեծ 8ից փոքր (5ը ու 8ը ներառյալ չեն) նույն ձև էլ են մյուսը
//       return  (x > 5 && x < 8) || (x > 15 && x < 20);
//    }

//      public static boolean isDivision5and7(int x) {
//4.չորրորդ շարունակություննա
//          return x % 5 == 0 && x % 7 == 0;
//      }

//    public static void checkNum(int x) {
//1․Առաջինի շարունակություննա
//        if (x % 2 == 0) {
//            System.out.println(x + " Number is even");
//        } else {
//            System.out.println(x + " Number is odd");
//        }

//2.Երկրորդի շարունակություննա
//          if (x > 0){
//              System.out.println(x + " Number is positive");
//          } else if (x < 0) {
//              System.out.println(x + " Number is negative");
//          }else {
//              System.out.println(x + " Number is zero");
//          }









    }















