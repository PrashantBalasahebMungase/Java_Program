//  Write a java program to accept input from user and addition of two integer number

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program3.java 
//  Description :  Accept input from user and addition of two integer number 
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  Integer 
//  Output      :  Integer
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    Start

                Step 1 : Create a Scanner object 

                Step 2 : Enter first integer

                Step 3 : Read the first integer from the user 
                                Store the number in iValue1

                Step 4 : Enter second integer

                Step 5 : Read the second integer from the user 
                                Store the number in  iValue2.

                Step 6 : Calculate the sum of iValue1 and iValue2 and store it in iSum.

                Step 7 : Display the Addition are 

            Step 8 : Close the Scanner object.

    End 
    
*/

import java.util.Scanner;

public class program3
{
    public static void main(String A[])
    {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the second number :");
        int iValue2 = sobj.nextInt();

        int iSum = iValue1 + iValue2 ;

        System.out.println("Addition are :"+iSum);

        sobj.close();

    }
}
