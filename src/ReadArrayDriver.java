import javax.swing.*;
import java.util.Scanner;

public class ReadArrayDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        boolean valid = false;
        int numberOfArray = 0;
        while(valid == false)
        {
            String inputBox = JOptionPane.showInputDialog("How many numbers are in your array?");
            numberOfArray = Integer.parseInt(inputBox);
            if (numberOfArray >= 0 && numberOfArray <= 50)
            {
                valid = true;
            }//end if permissible values
        }//end while validation loop

        int[] myArray = new int[numberOfArray];

        int numberInput = 0;
        for(int i = 0; i < myArray.length; i++)
        {
            boolean numberValid = false;
            while (numberValid == false) {
                String inputBox = null;
                if (i == 0) {
                    inputBox = JOptionPane.showInputDialog("Enter your 1st number.");
                }//end if inputBox message
                else {
                    inputBox = JOptionPane.showInputDialog("Enter your " + (i+1) + "th" + " number.");
                }//end else inputBox message
                numberInput = Integer.parseInt(inputBox);
                if (numberInput < 50 && numberInput > 0)
                {
                    numberValid = true;
                }
            }
            myArray[i] = numberInput;
        }//end for loop

        readArray array = new readArray(myArray);
        System.out.println(array.getArray());
        System.out.println("*****************************************************************");
        System.out.println(array.generateChart());
    }//end main
}//end class

