import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваше впечатление о прожитом дне двумя словами:  ");
        String answer = scanner.nextLine();

        TextMessage textMessage = new TextMessage(answer);
        System.out.println("Выражаясь культурно, ваш ответ: " + textMessage.answer);
    }
    }