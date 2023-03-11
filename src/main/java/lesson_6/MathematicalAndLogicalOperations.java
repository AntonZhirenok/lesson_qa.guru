package lesson_6;

public class MathematicalAndLogicalOperations {

    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static int intMaxVal = Integer.MAX_VALUE;
    public static double doubleMaxVal = Double.MAX_VALUE;

    public static void main(String[] args) {

        System.out.println("\n Переполнение типов данных" + ":");
        System.out.println(" - Результат переполнения byte: " + (byte) (byteMaxVal + 3));
        System.out.println(" - Результат переполнения int: " + (intMaxVal + 3));
        System.out.println(" - Результат переполнения double: " + (doubleMaxVal + 3.3D));
        System.out.println(" - Конкатенация строк 123 " + 456 + " 789");

        //---------------

        System.out.println("\n Уножение \"double\" , \"float\" , \"int\"" + ":");
        multiple(2.34D,2.56D);
        multiple(2.34F,2.56F);
        multiple(2.34D,2.56F);
        multiple(2.34D,32);

        //---------------

        double d1 = 123.1;
        double d2 = d1 * 1;
        final double threshold = 0.5;
        d1 += .1;

        System.out.println("\n Сравнение чисел " + d1 + " и " + d2 + ":");

        if (d1 == d2)
            System.out.println(" - Сравнение без погрешности: d1 и d2 равны!");
        else
            System.out.println(" - Сравнение без погрешности: d1 и d2 не равны!");

        if (Math.abs(d1 - d2) < threshold)
            System.out.println(" - Сравнение с погрешностью: d1 и d2 равны");
        else
            System.out.println(" - Сравнение с погрешностью: d1 и d2 не равны");
    }

    private static void multiple(double a, double b){
        System.out.println(" - Результат умножения:" + a + " на " + b + " равен: " + (a*b));
    }

    private static void multiple(float a, float b){
        System.out.println(" - Результат умножения:" + a + " на " + b + " равен: " + (a*b));
    }

    private static void multiple(double a, int b){
        System.out.println(" - Результат умножения:" + a + " на " + b + " равен: " + (a*b));
    }

    private static void multiple(double a, float b){
        System.out.println(" - Результат умножения:" + a + " на " + b + " равен: " + (a*b));
    }
}
