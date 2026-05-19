package lambda_method;

public class LambdaMethods {

    interface ReturnZero{
        int returnZero(int a, int b);
    }
    interface DoNothing {
        void doNthing();
    }
    interface PintHello{
        void printHello(boolean a, boolean b);
    }
    interface ReturnChar{
        char returnChar(char c);
    }
    interface ReturnFloat{
        float returnFloat(float f);
    }

    public static void main(String[] args) {
        //1.lambda Return zero
        ReturnZero m1 =(a , b) -> 0;
        System.out.println("Return zero " + m1.returnZero(5, 8));

        //2.lambda doNothing
        DoNothing m2 = () -> {};
        m2.doNthing();
        System.out.println("Do nothing ");

        //3.lambda Return Hello
        PintHello m3 = ((a, b) -> System.out.println("Hello World"));
        m3.printHello(false, true);

        //4.lambda Return char
        ReturnChar m4 = (c) -> c;
        System.out.print("Return char " + m4.returnChar('A') + " ");
        System.out.print(m4.returnChar('a')  + " ");
        System.out.println(m4.returnChar('4'));

        //5.lambda Return float
        ReturnFloat m5 = (f) -> f;
        System.out.print("Return float " + m5.returnFloat(4.5F) + " ");
        System.out.print(m5.returnFloat(6.666f)  + " ");
        System.out.println(m5.returnFloat(9.08766553f));
    }
}
