///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program27.java 
//  Description :  Contains logic to count frequency of digit 5
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer
//  Output      :  Integer 
//
///////////////////////////////////////////////////////////////////////////////////////////////
/*
        Start

                Step 1 : Accept integer input iNo from the user.

                Step 2 : If iNo < 0, then set iNo = -iNo (to make it positive).

                Step 3 : Initialize iCnt = 0 (only for Option B: counting even digits).

                Step 4 : Repeat until iNo becomes 0:

                Step 5 : Extract the last digit: digit = iNo % 10

                Step 6 : If digit % 2 == 0 (i.e., digit is even), then:

                        -> Display digit

                        -> Increment iCnt by 1

                Step 7 : Remove last digit: iNo = iNo / 10

                Step 8 : Return iCnt as result.

        End
 */
import java .util.*;
class Digits
{
    public void DisplayEven(int iNo)
    {
    
        if(iNo<0)
        {
            iNo = -iNo;
        }
        while(iNo == 0 )
        
        {
         
            if(( (iNo % 10   )% 2 )== 0)
            {
                
                System.out.println(iNo % 10);
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


