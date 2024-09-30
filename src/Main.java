import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);

        Methods.print("If you are ready to play, type 'yes'");
        String answer = system.nextLine();

        if(!answer.equals("yes")){
            Methods.exitProgram();
        }
        else{
            Methods.print("Question 1\n We are using only 10% of our brain\n Type 'true' or 'false'");
            String answer2 = system.nextLine();

            if(!answer2.equals("false")){
                Methods.exitProgram();
            }
            else{
                Methods.print("Question 2\n Reading in a lite darkness is not affecting your eyesight\n Type 'true' or 'false'");
                String answer3 = system.nextLine();

                if(!answer3.equals("true")){
                    Methods.exitProgram();
                }
                else{
                    Methods.print("Question 3\n Is Emilbek agay crush?\n Type 'true' or 'false'");
                    String answer4 = system.nextLine();

                    if(answer4.equals("true")){
                        Methods.print("gay");
                    }
                    else{
                        Methods.print("shakal");
                    }
                }
            }
        }
    }
}