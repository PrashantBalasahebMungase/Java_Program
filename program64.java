
///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program64.java
//  Description :  Accept a number from user and return the product of all odd numbers up to that number.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 03/07/2025
//  Input       : 6
//  Output      : Odd factorial number is : 15
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
               Step 1: Accept an integer number N from the user
                Step 2: Initialize variable: iEven = 1
                Step 3: Repeat from iCnt = 1 to N:
                            If i is even (iCnt % 2 != 0):
                                iEven  = iEven * iCnt
                Step 4: Display the value of Result
       Stop
*/
import java.util.*;

class OddNumber
{
    public int OddNumber(int iNo)
    {
        int iCnt = 0;
        int iOdd = 1;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                iOdd = iOdd * iCnt;
            }
        }
        return iOdd;
    }
}
public class program64 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        OddNumber nobj = new OddNumber();
        iRet = nobj.OddNumber(iValue);
        System.out.println("Odd factorial number is : "+iRet);

    }
    
}
