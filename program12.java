//  Accept on number from user is number is less than 10 then print "Hallo"  otherwise print "Demo"

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program12.java 
//  Description :  Accept one number from user and display "Hello" if number is less than or equal to 10, otherwise display "Demo"
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  25/06/2025
//  Input       :  Integer 
//  Output      :  "Hello" ," Demo"
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start 

                Step 1 : Create a variable iValue to store user input.

                Step 2 : Display the message "Enter number:".

                Step 3 : Accept the number from the user using Scanner and store it in iValue.

                Step 4 : Create an object of the Display class.

                Step 5 : Call the Display() method with iValue as the argument.

                Inside the Display() method:

                Step 6 : If the number is less than or equal to 10, print "Hello".

                Step 7: Else, print "Demo".

         End 

 */
import java.util.Scanner;

class Display
{
    public void Display(int iNo )
    {
        if(iNo <= 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }

    }
}
public class program12 
{
   public static void main(String A[])
   {
        int iValue = 0;
        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        Display dobj = new Display();

        dobj.Display(iValue);

        sobj.close();

   } 
}
