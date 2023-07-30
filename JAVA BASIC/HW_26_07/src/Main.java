import java.util.Scanner;

public class Main {
    public static void main(String...args){
        //Задание 1 .
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введи число от 0 до 1000 - ");
        int a = scanner.nextInt();
        System.out.print("веди еще одно, пожалуйста - ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("первое число стало вторым - " + a + ", а второe стало первым - " + b);

        // Задание 2 .

        WorldState worldState = new WorldState(false , true);

        System.out.println(worldState.isWorldNegativlyGood);
        System.out.println(worldState.isWorldPositivlyGood);
    }
}