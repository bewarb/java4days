import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] responses = {
                "Girl, dw",
                "You did that!",
                "Is it a question?",
                "YUPPPPP",
                "Yes trusttttt",
                "I'd be fooled",
                "Like probably",
                "Vibes good",
                "Yes",
                "Crystals say yes",
                "lets think of something else",
                "hell no.",
                "chat says its cooked",
                "time to move on",
                "no shot",
                "uhhhhh idk",
                "dont bug me rn",
                "use ur big head, and try again",
                "shordy i cant rn",
                "lowkey maybe"};

        Random rand = new Random();


        System.out.println("        Welcome to Botobop's Magic 8ball!");
        System.out.println("""
                                        ____
                                 dIi  (_)   G8888@b
                                    ,dP9CGG88@b,
                                  ,IP  _   Y888@@b,
                                dCII  (_)   G8888@@b
                                GCCIi     ,GG8888@@@
                                GGCCCCCCCGGG88888@@@
                                GGGGCCCGGGG88888@@@@...
                                Y8GGGGGG8888888@@@@P.....
                                 Y88888888888@@@@@P......
                                 `Y8888888@@@@@@@P'......
                                    `@@@@@@@@@P'.......
                                        ""\""........
                """);
        System.out.println("I hope you have good questions! First, what is your name?");
        String name = sc.nextLine();

        System.out.println("Hi " + name +", do you have a Yes or No question for me?");

        System.out.print("\nYour question (or 'quit' to exit): ");

        if (sc.nextLine().equalsIgnoreCase("YES")) {

        }



    }
}
