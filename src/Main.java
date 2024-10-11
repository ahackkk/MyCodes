import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Scanner system = new Scanner(System.in);
        Methods.print("If you are ready to play, type 'yes'.");
        String answer = system.nextLine().toLowerCase();

        while (!answer.equals("yes")) {
            Methods.print("When ready, type 'yes'");
            answer = system.nextLine().toLowerCase();
        }

        String[][] questions = {
                {"We can use 100% of our brain at one time", "false", "It's a myth, some parts are used for different purposes"},
                {"550 / 2 = 225", "false", "Bro, really?"},
                {"Bananas grow on trees.", "false", "Бананы растут на травянистых растениях, а не на деревьях."},
                {"The Great Wall of China is visible from space.", "false", "Великая китайская стена не видна из космоса."},
                {"Goldfish have a memory span of only three seconds.", "false", "Это миф. У золотых рыбок память может длиться несколько месяцев."},
                {"The human body contains more bacterial cells than human cells.", "true", "В теле человека больше бактериальных клеток, чем человеческих."},
                {"Venus is the hottest planet in the Solar System.", "true", "Венера действительно самая горячая планета."},
                {"Hairs of the human continue to grow even after death.", "false", "Волосы не растут после смерти, это миф."},
                {"People have never seen dinosaurs.", "true", "Динозавры вымерли задолго до появления людей."},
                {"Finland has land borders with Denmark.", "false", "Между Финляндией и Данией находится вода, Балтийское море."}
        };

        int score = 0;
        int lives = 3;

        for (String[] question : questions) {
            if (askQuestion(system, question[0], question[1], question[2])) {
                score++;
            } else {
                lives--;
                Methods.checkLives(lives, score);
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000; // время в секундах
        Methods.print("Your score is " + score + " and you took " + totalTime + " seconds with " + lives + " lives left.");
    }

    public static boolean askQuestion(Scanner system, String question, String correctAnswer, String explanation) {
        Methods.print("\n" + question + "\nType 'true' or 'false'");
        String userAnswer = system.nextLine().toLowerCase();
        if (userAnswer.equals(correctAnswer)) {
            Methods.print("Correct");
            return true;
        } else {
            Methods.print("Incorrect\n" + explanation);
            return false;
        }
    }
}