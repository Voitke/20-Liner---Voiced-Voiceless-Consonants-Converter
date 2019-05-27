import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);
        char[][] consonants = { {'v', 'f'}, {'g', 'c'}, {'b', 'p'}, {'z', 's'}, {'d', 't'}}; //first = voiced, second = voiceless

        System.out.println("Please type in the sentence you want to alter: ");
        String phrase = consoleReader.nextLine();
        System.out.println("Do you wish to make 'voiced' or 'voiceless'? ");
        String choice = consoleReader.nextLine();

        for (int index = 0; index < consonants.length; index++) {
            if(choice.equalsIgnoreCase("voiceless")) phrase = phrase.replace(consonants[index][0], consonants[index][1]);
            if(choice.equalsIgnoreCase("voiced")) phrase = phrase.replace(consonants[index][1], consonants[index][0]);
        }
        System.out.println("Here you go! : " + phrase);
    }
}
