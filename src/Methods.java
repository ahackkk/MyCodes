public class Methods {
    public static void print(String message){
        System.out.println(message);
    }

    public static void checkLives(int lives, int score){
        if(lives == 0){
            print("Oops! You lost\n Your score is " + score);
            System.exit(1);
        }
    }
}
