
import java.util.Scanner;


public class Throwlearn {

    public static String Scanf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String res = sc.nextLine();
        sc.close();
        return res;
    }

    public static void main(String[] args) {
        String inp = Scanf();

    }
}


