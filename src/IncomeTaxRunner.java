import java.util.Scanner;

public class IncomeTaxRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         double income = in.nextDouble();

         System.out.print("Are you married? (Y/N) ");
         String input = in.next();
         int status;
         if (input.equals("Y"))
             {
             status = Constant.MARRIED;
             }
        else
            {
             status = Constant.SINGLE;
            }
         IncomeTax aTaxReturn = new IncomeTax(income, status);
         System.out.println("Tax: " + aTaxReturn.getTax());
    }
}
