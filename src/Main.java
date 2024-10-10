import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Scanner system = new Scanner(System.in);
        Methods.print("If you are ready to play, type 'yes'.");
        String answer = system.nextLine();

        while(!answer.equals("yes")){
            Methods.print("When ready, type 'yes'");
            answer = system.nextLine();
        }

        int score = 0;
        int lives = 3;

        Methods.print("\nQuestion 1\n We can use 100% of our brain at one time\n Type 'true' or 'false'");
        String answer2 = system.nextLine();

        if(answer2.equals("false")){
            Methods.print("Correct");
            score++;
        }
        else {
            Methods.print("Incorrect\n It's myth, some parts are used for different purposes");
            lives--;
        }

        Methods.print("\nQuestion 2\n 550 / 2 = 225\n Type 'true' or 'false'");
        String answer3 = system.nextLine();

        if(answer3.equals("false")){
            Methods.print("Correct");
            score++;
        }
        else {
                Methods.print("Incorrect\n Bro, really?");
            lives--;
        }

        Methods.print("\nQuestion 3\n Bananas grow on trees.\n Type 'true' or 'false'");
        String answer4 = system.nextLine();

        if(answer4.equals("false")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Бананы растут не на деревьях, а на травянистых растениях, которые ошибочно принимают за деревья.");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 4\n The Great Wall of China is visible from space.\n Type 'true' or 'false'");
        String answer5 = system.nextLine();

        if(answer5.equals("false")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Это миф. Великая китайская стена не видна из космоса невооруженным глазом.");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 5\n Goldfish have a memory span of only three seconds.\n Type 'true' or 'false'");
        String answer6 = system.nextLine();

        if(answer6.equals("false")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Это миф. У золотых рыбок память может длиться несколько месяцев.");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 6\n The human body contains more bacterial cells than human cells.\n Type 'true' or 'false'");
        String answer7 = system.nextLine();

        if(answer7.equals("true")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n В теле человека действительно больше бактериальных клеток, чем человеческих, но они маленькие и составляют малую часть массы.");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 7\n Venus is the hottest planet in the Solar System\n Type 'true' or 'false'");
        String answer8 = system.nextLine();

        if(answer8.equals("true")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Венера действительно самая горячая планета, несмотря на то, что Меркурий ближе к Солнцу.");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 8\n Hairs of the human continue to grow even after death\n Type 'true' or 'false'");
        String answer9 = system.nextLine();

        if(answer9.equals("false")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Это миф; волосы и ногти не растут после смерти.");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 9\n People have never seen dinosaurs\n Type 'true' or 'false'");
        String answer10 = system.nextLine();

        if(answer10.equals("true")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Первые динозавры появились около 230 миллионов лет назад, а первые люди - лишь 200 тысяч лет назад");
            lives--;
        }

        Methods.checkLives(lives, score);

        Methods.print("\nQuestion 10\n Finland have land borders with Denmark\n Type 'true' or 'false'");
        String answer11 = system.nextLine();

        if(answer11.equals("false")){
            Methods.print("Correct");
            score++;
        } else{
            Methods.print("Incorrect\n Между Финляндией и Данией находится вода, а именно Балтийское море и пролив Эресунн");
            lives--;
        }

        Methods.checkLives(lives, score);

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000; // время в секундах
        Methods.print("Your score is " + score + " and you took " + totalTime + " seconds " + "with " + lives + " leftno");
    }
}