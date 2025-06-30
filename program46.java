/* Write  program which Accept number from user and display its multiplication of factor */

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program46.java                                                                       
//  Description : Accept number from user and display the multiplication of its factors               
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 30/06/2025                                                                           
//  Input       : Integer                                                                     
//  Output      : Multiplication of all factors of that number (excluding the number itself)           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Start 

            Step 1 : Accept an integer number from the user and store it in variable No1.

            Step 2 : Initialize a variable iMul to 1. This will store the multiplication result.

            Step 3 : Run a loop from i = 1 to i <= No1/2
                    - For each i, check if it is a factor of No1 (i.e., No1 % i == 0).
                    - If yes, then multiply iMul = iMul * i.

            Step 4 : After the loop ends, return or display iMul.
    End 
 */

import java.util.*;

class FactorMulti
{
    public int FactorMulti(int No1 )
    {
        int iCnt = 0;
        int iSum = 1;

        for(iCnt = 1 ; iCnt <= (No1/2); iCnt++)
        {
            iSum = iSum * iCnt;
        }
        return iSum;
        

    }
}
 public class program46
{
    public static void  main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :\n");
        iValue = sobj.nextInt();

       FactorMulti  mobj = new FactorMulti();

         iValue = mobj.FactorMulti(iValue);
        System.out.println("Multipliction of factor :"+iValue);


    }
}
