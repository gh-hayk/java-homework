package Array_homework;

public class ArrayUtills {
    //1.Գրել method, որը տպում է int[] n array-ի դրական տարրերը․
    public static void positiveElement(int[] n) {
        for (int element : n) {
            if (element > 0) {
                System.out.print(" " + element);
            }
        }
        System.out.println();
    }

    //2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ Օրինակ՝ ( 257 -> 752)․
    public static void printReversed(short[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(" " + s[i]);
        }
        System.out.println();
    }

    //3.Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը․
    public static void printMax(long[] l) {
        long max = l[0];
        for (int i = 1; i < l.length; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println("Max element: " + max);
    }

    //4.Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը․
    public static void printMin(float[] f) {
        float min = f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }
        System.out.println("Min element: " + min);
    }

    //5 ․ Գրել method, որը int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ։
    public static void copyArray(int[] n, int[] m) {
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
            System.out.println("copy " + m[i]);
        }
    }

    //6․ Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։
    public static void sumArrays() {
        int[] a = {1, 5, 6, 4, 7};
        int[] b = {7, 4, 2, 3, 5};
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println("a[" + i + "] + b[" + i + "] = " + c[i]);
        }
    }

    //7.Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։
    public static void dubleElement(int[] array, int k) {
        int dub = 0;
        for (int element : array) {
            if (element == k) {
                dub++;
            }
        }
        System.out.println("k = " + k + " dub: " + dub);
    }

    //8.Գրել method,որը տպում է բոլոր չկրկնվող եռյակները array-ի։Եռյակներում թվերի դասավորությունը էական չէ:
    public static void printTriplets(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    System.out.println("{" + array[i] + ", " + array[j] + ", " + array[k] + "}");
                }
            }
        }
    }

    //9.Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
    public static void sortDescending(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //10.Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:
    public static void firstEvens(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    //11.Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
    public static void removeZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);

        }
    }

    //13.Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված զանգված և արտածել n  թվի 10-ական ներկայացումը:
    public static void binaryToDecimal(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result * 2 + array[i];
        }
        System.out.print(result);
    }

    //14.Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:
    public static void matric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
        }
        System.out.println();
        for (int h = 0; h < matrix.length - 1; h++) {
            System.out.println();
            for (int k = 0; k < matrix[h].length - 1 - h; k++) {
                System.out.print(" " + matrix[h][k]);
            }
        }
    }

    //15.Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:
    public static void turnAround(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //16.Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե նրա բոլոր տողերի տարրերի գումարը զույգ է։NO հակառակ դեպքում։
    public static void rowSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            if (sum % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
//1. շարունակություննա
        int[] i = {3, 5, 0, 1, -8, -1};
        System.out.println("positive element");
        positiveElement(i);
//2. շարունակություննա
        short[] s = {5, 4, 8, 9, 2, 0};
        System.out.println("revers numbers");
        printReversed(s);
//3.շարունակություննա
        long[] l = {3L, 54L, 4L, 0L, -200L, 555L};
        printMax(l);
//4.շարունակություննա
        float[] f = {3.4f, 5.6f, 1.1f, 7.9f,};
        printMin(f);
//5.շարունակություննա
        System.out.println("copy Array");
        int[] n = {1, 2, 3, 4};
        int[] m = new int[n.length];
        copyArray(n, m);
//6.շարունակություննա
        System.out.println("sum Arrays");
        sumArrays();
//7.շարունակություննա
        System.out.println("duble Element");
        int[] duble = {1, 2, 4, 5, 6, 4};
        dubleElement(duble, 4);
//8.շարունակություննա
        System.out.println("print Triplets");
        int[] tripletArray = {1, 5, 6, 4};
        printTriplets(tripletArray);
//9.շարունակություննա
        System.out.println("print sort");
        int[] sortArray = {1, 4, 5, 8, 9, 6};
        sortDescending(sortArray);
//10.շարունակություննա
        System.out.println("first evens");
        int[] evenOddArray = {1, 5, 6, 4, 9, 7, 1};
        firstEvens(evenOddArray);
//11.շարունակություննա
        System.out.println("remove Zero");
        int[] zeroArray = {1, 0, 4, 0, 0, 7, 1};
        removeZero(zeroArray);
//12.շարունակություննա

//13.շարունակություննա
        System.out.println("binary To Decimal");
        int[] binaryTo = {1, 1, 0, 0, 1, 1};
        binaryToDecimal(binaryTo);
//14.շարունակություննա
        System.out.println("matrix");
        int[][] matrix = {
                {1, 4, 5, 6},
                {5, 2, 4, 7},
                {4, 5, 8, 9},
                {7, 8, 8, 9}};
        matric(matrix);
//15.շարունակություննա
        System.out.println("turn around");
        int[][] a = {
                {1, 4, 5, 6},
                {5, 2, 4, 7},
                {4, 5, 8, 9},
                {7, 8, 8, 9}};
        turnAround(a);
        System.out.println("Row Sum");
        int[][] matric = {
                {1, 4, 5, 6},
                {5, 2, 4, 7},
                {4, 5, 8, 9},
                {7, 8, 8, 9}};
        rowSum(matric);
    }
}
