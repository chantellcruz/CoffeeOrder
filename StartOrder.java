import java.util.Scanner;

public class StartOrder {

    public static void main(String[] args) {
        // this is an automated coffee ordering system
        // we don't have as many options as starbucks
        // "it ain't much, but it's honest work." - our customers

        Scanner console = new Scanner(System.in);

        System.out.println("> Hi there! Would you like your coffee hot or iced?");
        System.out.println("> YOUR OPTIONS: hot / iced");
        String hotOrCold = console.nextLine();
        while (!hotOrCold.equalsIgnoreCase("hot") && (!hotOrCold.equalsIgnoreCase("iced"))) {
            System.out.println("Sorry, that's not an option. PLease enter \"hot\" or \"iced.\"");
            hotOrCold = console.nextLine();
        }

        System.out.println("> What size coffee would you like?");
        System.out.println("> YOUR OPTIONS: small / medium / large");
        String coffeeSize = console.nextLine();
        while ((!coffeeSize.equalsIgnoreCase("small")) && (!coffeeSize.equalsIgnoreCase("medium")) && (!coffeeSize.equalsIgnoreCase("large"))) {
            System.out.println("Sorry, that's not an option. PLease enter \"small,\" \"medium,\" or \"large.\"");
            coffeeSize = console.nextLine();
        }

        System.out.println("> What flavor coffee?");
        System.out.println("> YOUR OPTIONS: plain / vanilla / hazelnut");
        String coffeeFlavor = console.nextLine();
        while (!coffeeFlavor.equalsIgnoreCase("plain") && (!coffeeFlavor.equalsIgnoreCase("vanilla")) && (!coffeeFlavor.equalsIgnoreCase("hazelnut"))) {
            System.out.println("Sorry, that's not an option. PLease enter \"plain,\" \"vanilla,\" or \"hazelnut.\"");
            coffeeFlavor = console.nextLine();
        }

        String finalSentence = "Sounds great! Your ___, _____ ______ coffee will be ready in a minute.";
        int dashesCount = finalSentence.length();

        System.out.println("-".repeat(dashesCount));
        System.out.printf("Sounds great! Your %s, %s %s coffee will be ready in a minute.\n", coffeeSize, hotOrCold, coffeeFlavor );
        System.out.println("Your total is $9000.01 :-)");
        System.out.println("-".repeat(dashesCount));



    }

}