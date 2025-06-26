///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program26.java 
//  Description :  Accept a number from user and display its even digits.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Integer
//  Output      :  Individual even digits
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
 
        Start


                    Step 1: Accept an integer number iNo from user

                    Step 2: If iNo < 0 -> convert to positive

                    Step 3: Repeat until iNo != 0
                            - Extract digit = iNo % 10
                            - If digit % 2 == 0 -> it's even -> display 
                            - iNo = iNo / 10


        Stop
*/
import java .util.*;

class Digits
{
    public void DisplayEven(int iNo)
    {
        int  iDigit = 0;
        
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo == 0 )
        
        {
            iDigit = iNo % 10;
            if((iDigit % 2 )== 0)
            {
                
                System.out.println(iDigit);
            }
            iNo = iNo/10;
        }
        
    }
}
class program70
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        int iValue = sobj.nextInt(); 

        Digits dobj = new Digits();

         dobj.DisplayEven(iValue);
        System.out.println(" Number of :"+iRet);
    }
}


