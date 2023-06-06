import org.w3c.dom.ls.LSOutput;

public class Task {
    /*


    3) * Дополнительно * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */


    public static void main(String[] args) {

//        System.out.println(ex_N1(5,0));
//
//        ex_N2(); //почему вышло это: java: class, interface, enum, or record expected, а не ArrayIndexOutOfBoundsException

//        ex_N3();

        int[] a = {1, 2, 3, 5};
        int[] b = {4, 1, 1, 0};

        dif(a, b);


    }


    // 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static int ex_N1(int a, int b) {   //  ArithmeticException
        return a / b;
    }

    public static void ex_N2() {            // ArrayIndexOutOfBoundsException
        int[] arr = new int[5];
        System.out.println(arr[10]);
    }

    public static void ex_N3() {            // NullPointerException
        String s = null;
        System.out.println(s.charAt(0));
    }


    /*
    2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя.
    */

    public static void dif(int[] a, int[] b) {
        int[] c = new int[a.length];
        if(a.length != b.length){
            System.out.println("Размеры массивов должны быть равны");
        }else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
                System.out.print(c[i] + "] ");

            }
        }
    }

//    public static void dif(int[] a, int[] b) {
//        int len = 0;
//        if (a.length < b.length) {
//            len = b.length;
//        } else {
//            len = a.length;
//        }
//        int[] c = new int[len];
//
//        if (a.length != b.length) {
//            System.out.println("Разная длина массивов");
//        } else {
//            for (int i = 0; i < len; i++) {
//
//                c[i] = a[i] - b[i];
//                System.out.print("[" + c[i] + "] ");
//            }
//        }
//    }

}







