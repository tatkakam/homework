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

        int counter = 0;

        do {
            x = randomizer.nextInt(9) + 1;
            y = randomizer.nextInt(9) + 1;

            System.out.println("Сложите эти два случайных числа " + x + "+" + y + " и напишите ответ: ");
            userAnswer= sc.nextInt();
            correctAnswer = Calculator.add(x, y);
            if (correctAnswer != userAnswer) { counter = counter - 5 ;}
            else {counter = counter + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counter);

            System.out.println("Произведите вычитание этих двух случайных чисел " + x + "-" + y + " и напишите ответ: ");
            userAnswer= sc.nextInt();
            correctAnswer = Calculator.substract(x, y);
            if (correctAnswer != userAnswer) { counter = counter - 5 ;}
            else {counter = counter + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counter);

            System.out.println("Перемножьте эти два случайных числа " + x + "*" + y + " и напишите ответ: ");
            userAnswer = sc.nextInt();
            correctAnswer = Calculator.multyply(x, y);
            if (correctAnswer != userAnswer) { counter = counter - 5 ;}
            else {counter = counter + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counter);

            System.out.println("Поделите эти два случайных числа " + x + "/" + y + " и напишите ответ в виде целой части: ");
            userAnswer= sc.nextInt();
            correctAnswer = Calculator.divide(x, y);
            if (correctAnswer != userAnswer) { counter = counter - 5 ;}
            else {counter = counter + 5;}
            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ: " + correctAnswer + ". Текущее количество баллов: " + counter);
               break;
        } while (correctAnswer != userAnswer);

        if (counter < 20)
        {System.out.println ("Ваш финальный счет: " + counter + " баллов. Вы допустили ошибки, можете попробовать заново в следующий раз. Удачи!");}
        else {System.out.println("Ура! Опросник завершён! Вы победили!  Ваш финальный счет составил  максимальное значение: " + counter);}

        return correctAnswer;
    }
}
