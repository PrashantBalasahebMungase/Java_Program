/* Write a program which accept number  from user and check wheather it contains 0 in it or not*/

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program72.java
//  Description : Accept a number from user and check whether it contains 0 or not.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 04/07/2025
//  Input       : 1056
//  Output      : It contains zero.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

/*

/*
        Start
                Step 1: Accept number from user

                Step 2: Use loop to extract each digit using (%) and (/)

                Step 3: If any digit is 0, return true

                Step 4: Otherwise, return false
       Stop
*/

import java.util.*;

class CheckZero
{
    public boolean CheckZero(int iNo)
    {
        int iDigit = 0;

       while(iNo != 0)
    {
        iDigit = iNo % 10 ;
        
        if(iDigit == 0)
        {
            return true;
        }
        
        iNo = iNo /10 ;
    }
    return false;
    }
}
public class program72 
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();
        CheckZero cobj = new CheckZero();

        bRet = cobj.CheckZero(iValue);

        if(bRet == true)
        {
            System.out.println("It contains zero.");
        }
        else
        {
            System.out.println("There is no zero.");
        }

    }    
}
