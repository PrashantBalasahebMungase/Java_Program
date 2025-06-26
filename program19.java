

///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program19.java 
//  Description :  Accept a number from user and return the summation of its non-factors.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Integer (Sum of non-factors)
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
 
        Start


            Step 1: Accept an integer number iNo from the user.


            Step 2 : Initialize a variable iSum to 0 (this will store the sum of non-factors).


            Step 3 :Run a loop from iCnt = 1 to iCnt <= iNo:

                        For each iCnt, check:

                        If iNo % iCnt != 0, then:

                        Add iCnt to iSum


            Step 4 : After the loop ends, return the value of iSum.


            Step 5 :Display the result to the user.


        Stop


 */
import java.util.*;

class Number
{
    public int AdditionNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1 ; iCnt <= iNo ; iCnt ++)
        if((iNo % iCnt )!= 0)
        {
           iSum = iSum + iCnt ;
        }
        return iSum;
    }
}

class program63
{
 public static void main(String A[])
 {

    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number :");
    int iValue1 = sobj.nextInt();

    Number nobj = new Number();

    nobj.AdditionNonFactors(iValue1);
    int iRet = nobj.AdditionNonFactors(iValue1);

    System.out.println("Sumition of Factor :"+iRet);

 }   
}
