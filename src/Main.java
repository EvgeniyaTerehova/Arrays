import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    /**
     * Объявите три массива:
     */
    public static void task1() {
        System.out.println("задача 1");
        /**Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.*/
        int[] apples = new int[3];
        apples[0] = 1;
        apples[1] = 2;
        apples[2] = 3;

    }
    /**Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.*/

    double[] numbers = {1.57, 7.654, 9.986};

    /**Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
     с помощью ключевого слова или сразу заполненный элементами.*/

    int[] num = {22, 15, 49, 78, 47, 97, 79};


    /**Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую
     ставить не надо.*/
    public static void task2() {
        System.out.println("задача 2");
        int[] apples = new int[]{1, 2, 3};
        apples[0] = 1;
        for (int i = 0; i < 3; i++) {
                System.out.print(apples[i]);
        }

        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        numbers[0] =1.57;
        for (double i = 0; i < 3; i++){
            System.out.print(numbers[(int) i] + ", ");
        }  System.out.println();

        int[] num = {22, 15, 49, 78, 47, 97, 79};
        num[0] = 22;
        for (int i = 0; i < 7; i++) {
            System.out.print(num[i] + ", ");
        } System.out.println();
    }


    /**Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки
    запятую ставить не надо.*/
    public static void task3() {
        System.out.println("задача 3");
        int[] apples = new int[]{1, 2, 3};
        apples[0] = 1;
        for (int i = 2; i >= 0; i--) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        numbers[0] =1.57;
        for (double i = 2; i >= 0; i--){
            System.out.print(numbers[(int) i] + ", ");
        }  System.out.println();

        int[] num = {22, 15, 49, 78, 47, 97, 79};
        num[0] = 22;
        for (int i = 6; i >= 0; i--) {
            System.out.print(num[i] + ", ");
        } System.out.println();
    }
/**Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).

 Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.

 Распечатайте результат преобразования в консоль.*/

    public static void task4() {
        System.out.println("задача 4");
        int[] apples = new int[]{1, 2, 3};
        apples[0] = 1 +1;
        apples[2] = 3 +1;
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(apples));
        }
    }
}
