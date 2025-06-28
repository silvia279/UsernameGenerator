import java.util.Scanner;

public class UsernameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for NickName and RealName
         System.out.print("Enter your nickname: ");
        String NickName = sc.nextLine();
        System.out.print("Enter your real name: ");
        String RealName = sc.nextLine();

        // Combine using underscore
        String username = NickName + "_" + RealName;

        // Display the suggested username
        System.out.println("Your username could be \"" + username + "\"");

        sc.close();
    }
}


