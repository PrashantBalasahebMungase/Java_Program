///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program29.java 
//  Description :  Accept a number from user and count the frequency of even digits
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer
//  Output      :  Integer (Count of even digits)
//
///////////////////////////////////////////////////////////////////////////////////////////////


/*
        Start


                Step 1 : Accept integer input iNo from the user.

                Step 2 : If iNo < 0, then convert it to positive using:
                            iNo = -iNo

                Step 3 : Initialize a variable iRev = 0 to hold the reversed number.

                Step 4 : Repeat the following steps until iNo becomes 0:

                Step 5 : Extract the last digit using iDigit = iNo % 10

                Step 6 : Add the digit to the reverse using iRev = iRev * 10 + iDigit

                Step 7 : Remove the last digit from original number using iNo = iNo / 10

                Step 8 : After the loop ends, iRev contains the reversed number.

                Step 9 : Display or return iRev.


        End        
*/
import java .util.*;
class Digits
{
    public int Reverse(int iNo)
    {
        int  iDigit = 0, iRev = 0;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo != 0 )
        
        {
            iDigit = iNo % 10;
            iRev = iRev*10 +  iDigit ;
        }
        return iRev ;
        
    }
}
class program29
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue = sobj.nextInt(); 

        Digits dobj = new Digits();
        int iRet = dobj.Reverse(iValue);
        System.out.println(" Number of Reverse"+iRet);
    }
}


