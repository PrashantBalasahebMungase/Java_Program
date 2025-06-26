///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program25.java 
//  Description :  Accept a number from user and count the frequency of digit 5.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Integer (Frequency of digit 5)
//
///////////////////////////////////////////////////////////////////////////////////////////////




/*
 
        Start


                Step 1: Accept an integer number iNo from user

                Step 2: If iNo < 0 -> convert to positive

                Step 3: Initialize iCnt = 0

                Step 4: Repeat until iNo != 0
                        - Extract digit = iNo % 10
                        - If digit == 5 -> increment iCnt
                        - iNo = iNo / 10

                Step 5: Return iCnt

                Step 6: Display result

        Stop
*/
import java .util.*;

class Digits
{
    public int CountFrequncy(int iNo)
    {
        int iCnt = 0 , iDigit = 0;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo < 0 )
        
        {
            iDigit = iNo % 10;
            if(iDigit == 5)
            {
                
                iCnt ++;
                
            }
            iNo = iNo/10;
        }
        return iCnt;
    }
}
class program69
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue = sobj.nextInt(); 

        Digits dobj = new Digits();
        int iRet = dobj.CountFrequncy(iValue);
        System.out.println(" Number of :"+iRet);
    }
}


