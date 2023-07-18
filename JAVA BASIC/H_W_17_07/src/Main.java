import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TASK 1
        byte byteVar = 77;
        int  intVar  = 503445;
        double doubleVar = 87.64;
        float floatVar = 67345.89F;
        // сужение int, float, double до переменных типа byte
         byteVar = (byte)intVar;
         byteVar = (byte)doubleVar;
         byteVar = (byte)floatVar;

         // выведем результат на экран

         System.out.println(intVar);
         System.out.println(doubleVar);
         System.out.println(floatVar);

        // вернем переменным исходные значения

        byte byteVarr = 77;
        int  intVarr  = 503445;
        double doubleVarr = 87.64;
        float floatVarr = 67345.89F;

        // сделаем расширение

        intVarr = byteVarr;
        doubleVarr = floatVarr;

        // выведем результат на экран

        System.out.println(intVarr);
        System.out.println(doubleVarr);

        //TASK 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите своё имя: ");
        String name = scanner.nextLine();


        System.out.println();
        System.out.println();
        System.out.println("Привет, " + name + "!");

    }
}