//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1․Ստեղծել 2 փոփոխական(byte a և byte b ),վերագրել կամայական արժեքներ և տպել console-ում․
        /*
        byte a = 5;
        byte b = 10;
        System.out.println(a);
        System.out.println(b);
         */
        //2․Ստեղծել 2 փոփոխական(short c և short d ),վերագրել կամայական արժեքներ և տպել console-ում․
        /*
        short c = 200;
        short d = 654;
        System.out.println(c);
        System.out.println(d);
        */
        //3․Ստեղծել 2 փոփոխական(int e և int f ),վերագրել կամայական արժեքներ և տպել console-ում․
        /*
        int e = 849;
        int f = 954;
        System.out.println(e);
        System.out.println(f);
        */
        //4․Ստեղծել 2 փոփոխական(long g և long h ),վերագրել կամայական արժեքներ և տպել console-ում․
        /*
        long g = 64000;
        long h = -87000;
        System.out.println(g);
        System.out.println(h);
        */
        /*
         System.out.println(Byte.MIN_VALUE);
         System.out.println(Byte.MAX_VALUE);

         System.out.println(Short.MIN_VALUE);
         System.out.println(Short.MAX_VALUE);

         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);

         System.out.println(Long.MIN_VALUE);
         System.out.println(Long.MAX_VALUE);
         */
        //6.Ստեղծել 2 փոփոխական (byte և int ) ,վերագրել կամայական արժեքներ 2-ական տեսքով  և տպել console-ում․
        /*
        byte b = 15;
        byte bBinary = 0b1111;

        int i = 42;
        int iBinary = 0b101010;

        System.out.println(b);
        System.out.println("binary" +  bBinary);
        System.out.println("binary" + iBinary);
        System.out.print(i);
        */
        //6․Ստեղծել 2 փոփոխական(float j և float k ),վերագրել կամայական արժեքներ և տպել console-ում․
        //ՏԻԳՐԱՆ ՋԱՆ ՍՏԵՂ ՀԱՐՑ ՈՒՆԵՄ ՈՐ float-ին առժեք եմ վերագրում վերջում f չեմ գրում compiler-ի սխալա տալիս
        /*
        float j = -1.25f;
        float k = 0.625f;
        System.out.println(j);
        System.out.println(k);
        */
        //7․ Ստեղծել 2 փոփոխական(double l և double m ) վերագրել կամայական արժեքներ և տպել console -ում․
        /*
        double l = 2.6895;
        double m = -6.74515;
        System.out.println(l);
        System.out.println(m);
        */
        //8.Տպել float և double  Max & Min  արժեքները.
        /*
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        */
        //9 Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?
        /*
        double d1 = 34.567839023;
        double d2 = 8923.1234857;
        double d3 = 12.345;
        double d4 = 3456.091;
        float f1 = 12.345f;
        float f2 =  3456.091f;
        */
        //10․Ստեղծել 2 փոփոխական(char n և char o ),վերագրել կամայական արժեքներ և տպել console-ում․
        /*
        char n = 72;
        char o = 65;
        char k = 89;
        char l = 75;

        System.out.println(n);
        System.out.println(o);
        System.out.println(k);
        System.out.println(l);
        */
        //11.  Օգտվելով https://www.ssec.wisc.edu/~tomw/java/unicode.html
        //11.1 Տպել char s = 77;  և char w = 109;  արժեքները;
        /*
        char s = 77;
        char w = 109;
        System.out.println(s);
        System.out.println(w);
        */


        //11.2 Տպել ՛K՛ symbolը բոլոր հնարավոր տարբերակներով․
        /*
        char k1 = 'K';
        char k2 = 75;
        System.out.println(k1);
        System.out.println(k2);
        */
        //12․Ստեղծել 2 փոփոխական(boolean p և boolean q ),վերագրել կամայական արժեքներ և տպել console-ում․
        /*
        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);
        */
        //13. Ի՞նչ կտպի կոդի այս հատվածը և ինչու՞։
        /* ՍԽԱԼԱ ՏԱԼՈՒ ՈՐՏԵՎ ՁԵՐ ԲԱՑԱՏՐԱԾ ՎԻԴԵՈՅԻ ՄԵՋ ԴՈՒՔ ԷԻՔ ԱՍՈՒՄ ՄԵԾԻՑ ՓՈՔՐ ԱՎՏՈՄԱՏ ԼԻՆՈՒՄԱ ԲԱՅՑ ՓՈՔՐԻՑ ՄԵԾ ՉԻ ԼԻՆՈՒՄ
        int year = 201l;
        System.out.print (year);
        */
        //14. Ստեղծել int aa  = 7 և long bb փոփոխականներ,կատարել Cast գործողություն  aa -> bbb  և տպել console -ում․
        /*
        int aa = 7;
        long bb;
            bb = (long) aa;
        System.out.println(bb);
         */
        //15. Ստեղծել int myInt  = 7 և double myDouble փոփոխականներ,կատարել Cast գործողություն  myInt -> myDouble  և տպել console -ում․
        /*
        int myInt = 7;
        double myDouble;
        myDouble = (double) myInt;
        System.out.println(myDouble);
        */
        //16.Ստեղծել double dd = 9.78d և int ii փոփոխականներ,կատարել Cast գործողություն  dd -> ii  և տպել console -ում․
        /*
        double dd = 9.78d;
        int ii;
        ii = (int) dd;
        System.out.println(ii);
        */
        //17.Ստեղծել int ff = 9999 և byte gg փոփոխականներ,կատարել Cast գործողություն  ff -> gg  և տպել console -ում․
        //ՍՏԵՂ ՀԱՐՑ ՈՒՆԵՄ consol-ՈՒՄ 15-Ա ՏՊՈՒՄ
        /*
        int ff = 9999;
        byte gg;
        gg = (byte) ff;
        System.out.println(gg);
         */
        //18․ Գտնել սխալը , ուղղել և տպել․
        /*
        long max = 3123456789L;
        double d = 1000_00;
        char i =105; char j=106; char ij =(char) (i + j);
        int a7 = 8;
        long h =  8;
        int n = 0 , m = 11; m = n;
        System.out.println(max);
        System.out.println(d);
        System.out.println(ij);
        System.out.println(a7);
        System.out.println(h);
        System.out.println(m);
        */
        //
    }
}