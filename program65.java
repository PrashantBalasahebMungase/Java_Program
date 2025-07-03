/*  Write a program which returns Differnce between Even factorial and Odd factorial of given number */

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program65.java
//  Description : Calculates the difference between even and odd factorials of a given number.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 03/07/2025
//  Input       : 6
// Output       : Even factorial = 2 * 4 * 6 = 48
//                Odd factorial  = 1 * 3 * 5 = 15
//                Difference = 48 - 15 = 33

////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept a positive integer N from the user  
                Step 2: Initialize two variables:
                        - iEvenFact = 1
                        - iOddFact = 1
                Step 3: Repeat from i = 1 to N:
                        - If i is even (iCnt % 2 == 0):
                            Multiply EvenFact = EvenFact * iCnt
                        - Else:
                            Multiply OddFact = OddFact * iCnt
                Step 4: Calculate 
                        Difference = iEvenFact - iOddFact  
                Step 5: Display the Difference  
       Stop
*/
import java.util.*;

class EvenFactorial
{
    public int EvenFactorial(int iNo)
    {
        int iCnt = 0;
        int iEvenFact = 1;
        int iDiff = 0;
        int iOdd = 1;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEvenFact = iEvenFact * iCnt;
            }
            else
            {
                iOdd = iOdd * iCnt;
            }
            
        }
        iDiff = iEvenFact - iOdd;
        return iDiff;
    }
}
public class program65 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        EvenFactorial eobj = new EvenFactorial();
        iRet = eobj.EvenFactorial(iValue);

        System.out.println("Factorial differance is :"+iRet);

    }
}
