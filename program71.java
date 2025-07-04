/* Write a program Which accept number from user and display its digit in reverse order */

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program71.java
//  Description : Accept a number from user and display its digits in reverse order.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 04/07/2025
//  Input       : 7521
//  Output      : 1
//                2
//                5
//                7
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

/*

/*
        Start
                Step 1: Accept number from user

                Step 2: Isolate each digit using (%) and (/)

                Step 3: Display digits one by one in reverse order
       Stop
*/
import java.util.*;
class DisplayDigit  
{
    public void  DisplayDigit (int iNo)
    {
        int iDigit = 0;
        
           while(iNo !=0)
            {
                iDigit = iNo % 10 ;
                 System.out.println(iDigit);
                 
                 iNo = iNo / 10;
            }       
    }
}
public class program71 
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        DisplayDigit dobj = new DisplayDigit();

        dobj.DisplayDigit(iValue);
    }
}
