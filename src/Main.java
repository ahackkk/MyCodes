import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        print("If you are ready to play, type 'yes'");
        Scanner system = new Scanner(System.in);
        String answer = system.nextLine();
        if(!answer.equals("yes")){
            exitProgram();
        }
        else{
            print("Question 1\n We are using only 10% of our brain\n Type 'true' or 'false'");
            String answer2 = system.nextLine();
            if(!answer2.equals("false")){
                exitProgram();
            }
            else{
                print("Question 2\n Reading in a lite darkness is not affecting your eyesight\n Type 'true' or 'false'");
                String answer3 = system.nextLine();
                if(!answer3.equals("true")){
                    exitProgram();
                }
                else{
                    print("Question 3\n Is Emilbek agay crush?\n Type 'true' or 'false'");
                    String answer4 = system.nextLine();
                    if(answer4.equals("true")){
                        print("gay");
                    }
                    else{
                        print("shakal");
                    }
                }
            }
        }
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void exitProgram(){
        System.exit(1);
        System.out.println("Invalid syntaxes");
    }
}