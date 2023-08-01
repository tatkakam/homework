import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int correctAnswer = 0;
        int userAnswer = 1;
        Scanner sc = new Scanner(System.in) ;
        Random randomizer = new Random();

       

           do {int a = randomizer.nextInt(55) + 1;
            int b = randomizer.nextInt(45) + 1;
            correctAnswer = a + b;
            System.out.print("Сложите эти два случайных числа " + a + "+" + b + " и напишите ответ: ");
            userAnswer = sc.nextInt();
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ".");
             } while (userAnswer != correctAnswer);
        System.out.println("Ура! Опросник завершён! Вы победили!");
    }
}