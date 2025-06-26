

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program20.java 
//  Description :  Accept a number from user and display summation of its factors and non-factors.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Two Integers (Sum of factors and sum of non-factors)
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
 
        Start

            Step 1: Accept an integer number iNo from the user.

            Step 2: Initialize two variables:
                    - iSum for sum of factors = 0
                    - iSum1 for sum of non-factors = 0

            Step 3: Run a loop from iCnt = 1 to iCnt <= iNo:
                    - If iNo % iCnt == 0 -> iCnt is factor -> add to iSum
                    - Else -> add to iSum1

            Step 4: Display both iSum and iSum1

       Stop


 */
import java.util.*;

class Number
{
    public void SumNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        int iSum1 = 0;
        for(iCnt = 1 ; iCnt <= iNo ; iCnt ++)
        {
                if((iNo % iCnt )== 0)
            {
            iSum = iSum + iCnt ;
            }
            else
            {
                iSum1 = iSum1 + iCnt ;
            }
        }
        System.out.println("Sumition of Factor "+iSum);
         System.out.println("Sumition of Factor "+iSum1);
    }
    
}

class program64
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue1 = sobj.nextInt();

        Number nobj = new Number();

        nobj.SumNonFactors(iValue1);
        
        
    }

}
