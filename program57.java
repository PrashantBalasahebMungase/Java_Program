/* Accept single Digit number from user and print into word */

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program57.java
//  Description : Accept a single‑digit integer (1‑9) from user and print its word form.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 02/07/2025
//  Input       : Integer 
//  Output      : "One" to "Nine"
//
///////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        Start
                Step 1: Declare an integer variable iNo

                Step 2: Accept input from the user and store it in iNo

                Step 3: If iNo < 0
                -> Convert it to positive using iNo = -iNo

                Step 4: Check the value of iNo using switch statement:
                        -> If iNo == 1, print "One"
                        -> If iNo == 2, print "Two"
                        -> If iNo == 3, print "Three"
                        -> If iNo == 4, print "Four"
                        -> If iNo == 5, print "Five"
                        -> If iNo == 6, print "Six"
                        -> If iNo == 7, print "Seven"
                        -> If iNo == 8, print "Eight"
                        -> If iNo == 9, print "Nine"
                        -> Else, print "Invalid Number"
       Stop
 */
import java.util.*;

class Number
{
    public void Number(int iNo)
    {
        if(iNo < 0)
        {
            iNo = - iNo;

        } 
        switch(iNo)
        {
            case 1:
            System.out.println("One");
            break;
            case 2:

            System.out.println("Two");
            break;

            case 3:
            System.out.println("Three");
            break;

            case 4:
            System.out.println("Four");
            break;

            case 5:
            System.out.println("Five");
            break;

            case 6:
            System.out.println("Six");
            break;

            case 7:
            System.out.println("Seven");
            break;

            case 8:
            System.out.println("Eigth");
            break;

            case 9:
            System.out.println("Nine");
            break;

            default :
            System.out.println("Invalid Number:");
            break;

        }

    }
}

public class program57 
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number :");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        Number nobj = new Number();
        nobj.Number(iValue);

    }
}
