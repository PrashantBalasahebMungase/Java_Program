///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program28.java 
//  Description :  Accept a number from user and count the frequency of even digits
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer
//  Output      :  Integer (Count of even digits)
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start

                Step 1: Accept integer input iNo from user.
                Step 2: If iNo < 0, then set iNo = -iNo
                Step 3: Initialize counter iCnt = 0
                Step 4: Repeat until iNo becomes 0:
                        -> Extract last digit: iDigit = iNo % 10
                        -> If iDigit % 2 == 0, increment iCnt
                        -> Remove last digit: iNo = iNo / 10
                Step 5: Return iCnt
        End        
*/
import java .util.*;
class Digits
{
    public int CountEven(int iNo)
    {
        int  iDigit = 0, iCnt = 0;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo == 0 )
        
        {
            iDigit = iNo % 10;
            if((iDigit % 2 )== 0)
            {
                
                System.out.println(iCnt);
            }
            iNo = iNo/10;
        }
        return iCnt ;
        
    }
}
class program70
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue = sobj.nextInt(); 

        Digits dobj = new Digits();
        int iRet = dobj.CountEven(iValue);
        System.out.println(" Number of Even Digit  :"+iRet);
    }
}


