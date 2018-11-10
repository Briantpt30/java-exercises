package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name:");
        String name = reader.nextLine();
        System.out.println("Hello " + name);
    }
}
