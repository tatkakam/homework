import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static int start() {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        int correctAnswer = 0;
        int userAnswer = 1;

        int x = 0;
        int y = 0;

        int score = 0;

        do {
            x = randomizer.nextInt(9) + 1;
            y = randomizer.nextInt(9) + 1;

            System.out.println("Сложите эти два случайных числа " + x + "+" + y + " и напишите ответ: ");
            userAnswer= sc.nextInt();
            correctAnswer = Calculator.add(x, y);
            if (correctAnswer != userAnswer) { score = score - 5 ;}
            else {score = score + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);

            System.out.println("Произведите вычитание этих двух случайных чисел " + x + "-" + y + " и напишите ответ: ");
            userAnswer= sc.nextInt();
            correctAnswer = Calculator.substract(x, y);
            if (correctAnswer != userAnswer) { score = score - 5 ;}
            else {score = score + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);

            System.out.println("Перемножьте эти два случайных числа " + x + "*" + y + " и напишите ответ: ");
            userAnswer = sc.nextInt();
            correctAnswer = Calculator.multyply(x, y);
            if (correctAnswer != userAnswer) { score = score - 5 ;}
            else {score = score + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);

            System.out.println("Поделите эти два случайных числа " + x + "/" + y + " и напишите ответ в виде целой части: ");
            userAnswer= sc.nextInt();
            correctAnswer = Calculator.divide(x, y);
            if (correctAnswer != userAnswer) { score = score - 5 ;}
            else {score = score + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + score);
               break;
        } while (correctAnswer != userAnswer);

        if (score < 20)
        {System.out.println ("Ваш финальный счет: " + score + " баллов. Вы допустили ошибки, можете попробовать заново в следующий раз. Удачи!");}
        else {System.out.println("Ура! Опросник завершён! Вы победили!  Ваш финальный счет составил  максимальное количество: " + score + " баллов.");}

        return correctAnswer;
    }
}
