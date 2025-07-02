/* write a program to find factorial to given number */

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program58.java
//  Description : Accept an integer >= 0 from the user and display its factorial.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 02/07/2025
//  Input       : 5
//  Output      : 120
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        Start
                Step 1: Accept an integer input n from the user

                Step 2: If n < 0:

                    -> Display "Factorial of negative numbers is not defined"
                    -> Stop

                Step 3: Initialize a variable factorial = 1

                Step 4:Repeat for iCnt = 2 to n:
                        -> factorial = factorial * iCnt

                Step5: Display the value of factorial
       Stop
 */
import java. util.*;
class factorial
{
    public int Factorial(int iNo)
    {
        int iFact = 1;
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    
    }
  
}
public class program58 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        factorial fobj = new factorial();

         iRet = fobj.Factorial(iValue);
         System.out.println("Factoreial is :"+iRet);
    }
}
