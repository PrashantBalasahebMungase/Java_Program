/*Accept two number from user and display first number in second number of times */

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program13.java 
//  Description :  Accept two number from user and display first number in second number of times
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  25/06/2025
//  Input       :  Two integers (first number and frequency)
//  Output      :  First number printed repeatedly
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    Start 

            Step 1 : Create two integer variables
                        iValue and iCount.

            Step 2 : Accept the first number from the user and store in iValue.

            Step 3 : Accept the second number (frequency) from the user and store in iCount.

            Step 4 : Create an object of the Display class.

            Step 5 : Call the Display(iValue, iCount) method.

            Step 6 :Inside the method, use a for loop to print the first number, iCount number of times.

    End 

 */

import java.util.Scanner;

class Display
{
    public void Display(int iNo , int iFrequncy)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iFrequncy ; iCnt++)
        {
            System.out.print( "\t"+iNo);
        }
    }
}
public class program13 
{
   public static void main(String A[])
   {
        int iValue = 0;
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter First number :");
        iValue = sobj.nextInt();

        System.out.println("Enter second number :");
        iCount = sobj.nextInt();

        Display dobj = new Display();
        dobj.Display(iValue , iCount);

        sobj.close();
        

   } 
}
