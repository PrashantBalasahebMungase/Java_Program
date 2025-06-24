/* write a program which Accept number from user and print Even factor of that number */

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program16.java 
//  Description :  Accept a number from the user and print even factors of that number
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Even factors of the input number
//
//////////////////////////////////////////////////////////////////////////////////////////////////
/* 
    Start

            Step 1 : Create an integer variable 'iValue' to store user input.
            Step 2 : Prompt the user to enter a number.
            Step 3 : Read the input using Scanner and store it in 'iValue'.
            Step 4 : Create an object of class EvenFactor.
            Step 5 : Call the method EvenFactor(iValue) using the object.
            Step 6 : Inside the method:
                        - Use a for loop from 2 to iNo/2
                        - For each iCnt, check:
                        - If iNo % iCnt == 0 (iCnt is a factor)
                        - And iCnt % 2 == 0 (iCnt is even)
                        - If both are true, print iCntven, print it.
        End

*/

import java.util.Scanner;

class EvenFactor
{
    public void EvenFactor(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 2 ; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt == 0)&&(iNo % 2 )==0)
            {
                System.out.print("\t"+iCnt);
            }
        }
    }
}
public class program16 
{
    public static void main(String A[])
    {
        int iValue = 0;
        System.out.println("Enter number :");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        EvenFactor eobj = new EvenFactor();

        eobj.EvenFactor(iValue);

        sobj.close();

    }
}
