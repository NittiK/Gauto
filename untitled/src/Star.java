import java.util.Scanner;

public class Star{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");

        //Outer loop handles number of rows

        for (int i = 1; i <= rows; i++)
        {
            //Printing rows-i spaces at the beginning of each row

            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(" ");
            }

            //Printing i stars at the end of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        //Closing the resources

        sc.close();
    }
}