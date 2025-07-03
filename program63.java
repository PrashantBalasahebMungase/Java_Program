///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program63.java
//  Description : Accept a number from user and return the product of all even numbers up to that number.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 03/07/2025
//  Input       : 6
//  Output      : Even factorial is : 48  ( 2 * 4 * 6)
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept an integer number N from the user
                Step 2: Initialize variable: iEven = 1
                Step 3: Repeat from iCnt = 1 to N:
                            If i is even (iCnt % 2 == 0):
                                iEven  = iEven* iCnt
                Step 4: Display the value of Result
       Stop
*/
import java.util.*;

class EvenNumber
{
    public int EvenNumber(int iNo)
    {
        int iCnt = 0;
        int iEven = 1;
        for(iCnt = 1; iCnt<= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven = iEven * iCnt;
            }
            
        }
        return iEven;
    }
}
public class program63
{
    public static void  main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number:");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        EvenNumber eobj = new EvenNumber();
        iRet = eobj.EvenNumber(iValue);
        System.out.println("Even factorial number  is :"+iRet);


    }
    
}
