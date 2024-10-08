public class Methods {
    public static void print(String message){
        System.out.println(message);
    }

    public static void exitProgram(){
        System.exit(1);
        System.out.println("Invalid syntax");
    }

    public static void checkLives(int lives, int score){
        if(lives == 0){
            print("Oops! You lost\n Your score is " + score);
            System.exit(1);
        }
    }
}
