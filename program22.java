///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program22.java 
//  Description :  Accept a number from user and count the number of digits.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Integer (Count of digits)
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
 
        Start

                Step 1: Accept an integer number iNo from user.

                Step 2: If iNo is 0 -> return 1 )

                Step 3: Initialize counter iCnt = 0

                Step 4: Repeat until iNo != 0
                        - Increment iCnt
                        - Divide iNo by 10

                Step 5: Return iCnt

                Step 6: Display result

       Stop
       */


import java .util.*;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;
        
        while(iNo != 0 )
        {
            
            iCnt ++;
            iNo = iNo/10;

        }
        return iCnt;
    }
}
class program66
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue = sobj.nextInt(); 

        Digits dobj = new Digits();
        int iRet = dobj.CountDigits(iValue);
        System.out.println(""+iRet);
    }
}
