import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner system = new Scanner(System.in);
        Methods.print("If you are ready to play, type 'yes'");
        String answer = system.nextLine();

        while(!answer.equals("yes")){
            Methods.print("When ready, type 'yes'");
            answer = system.nextLine();
        }

        int score = 0;

        Methods.print("Question 1\n We can use 100% of our brain at one time\n Type 'true' or 'false'");
        String answer2 = system.nextLine();

        if(answer2.equals("false")){
            Methods.print("Correct");
            score++;
        }
        else {
            Methods.print("Incorrect\n It's myth, some parts are used for different purposes");
        }

        Methods.print("Question 2\n 550 / 2 = 225\n Type 'true' or 'false'");
        String answer3 = system.nextLine();

        if(answer3.equals("false")){
            Methods.print("Correct");
            score++;
        }
        else {
                Methods.print("Incorrect\n Bro, really?");
        }

        Methods.print("Question 3\n Is Emilbek agay crush?\n Type 'true' or 'false'");
        String answer4 = system.nextLine();

                    if(answer4.equals("true")){
                        Methods.print("Correct");
                        score++;
                    } else{
                        Methods.print("Incorrect\n You lost my trust");
                    }

        Methods.print("Your score is " + score);
    }
}