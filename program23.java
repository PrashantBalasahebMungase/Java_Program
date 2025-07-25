///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program23.java 
//  Description :  Accept a number from user and count the number of digits.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Integer (Count of digits)
//
///////////////////////////////////////////////////////////////////////////////////////////////


/*
 
        Start

                Step 1: Accept an integer number iNo from user

                Step 2: If iNo is 0 -> return 1

                Step 3: Take absolute value of iNo 

                Step 4: Initialize counter iCnt = 0

                Step 5: Repeat until iNo != 0
                        - Increment iCnt
                        - Divide iNo by 10

                Step 6: Return iCnt

                Step 7: Display result

    Stop
*/



import java .util.*;


class Digits
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;
        
        while(iNo > 0 )
        {
            
            iCnt ++;
            iNo = iNo/10;

        }
        return iCnt;
    }
}
class program67
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
