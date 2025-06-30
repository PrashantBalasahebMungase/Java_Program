/* Write a program which accept number from user and return differnt between Summition of all its factor and 
Non factor*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program49.java                                                                       
//  Description : Accept a number from the user and return the difference between                     
//                summation of its factors and non-factors               
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 30/06/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : Difference = (Sum of factors) - (Sum of non-factors) 
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    

     Start

            Step 1 : Accept an integer iNo from the user

            Step 2 : Initialize iSum1 = 0 (for factors), iSum2 = 0 (for non-factors)

            Step 3 : Run loop from i = 1 to i < iNo:
                        -> If (iNo % i == 0), then i is a factor ⇒ Add to iSum1
                        -> Else i is a non-factor ⇒ Add to iSum2

            Step 4 : Calculate iDiff = iSum1 - iSum2

            Step 5 : Return iDiff
     Stop
  */  

import java.util.*;

class SumitionDiff
{
    public int SumitionDiff(int iNo)
    {
        int iCnt = 0;
        int iSum1 = 0;
        int iSum2 = 0;
        int iDiff = 0;

        for(iCnt = 1 ; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum1 = iSum1 + iCnt ;
            }
            else

            {
             iSum2  = iSum2 + iCnt;
            }
            iDiff = iSum1 - iSum2;
            
        }
        return iDiff;

    }
}
public class program50 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

       SumitionDiff dobj = new SumitionDiff();
       iRet = dobj.SumitionDiff(iValue);
       System.out.println(""+iRet);


    }    
}
