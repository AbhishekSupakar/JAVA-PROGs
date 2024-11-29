import java.util.Scanner;

class hackerrankprog1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : " );
        String s = sc.nextLine();
        System.out.println("You entered: " + s);
        sc.close();
    }
}