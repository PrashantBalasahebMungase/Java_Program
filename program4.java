//  Write a java program to accept input from user and addition of two integer number

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program4.java 
//  Description :  Accept input from user and addition of two integer number 
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  Integer 
//  Output      :  Integer
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////


/*
        Start

                    Step 1 : Define a function Addition(iNo1, iNo2)
                                This function takes two integers as input.
                                    It calculates the sum: iRet = iNo1 + iNo2
                                        It returns iRet.

                    In the main() method:

                    Step 2 : Create  a Scanner object 

                    Step 3 : Create a three integer variables: 
                                iValue1, iValue2, iSum.

                    Step 4 : Enter first number

                    Step 5 : Read the first number and store in iValue1.

                    Step 6 : Enter second number

                    Step 7 : Read the second number and store in iValue2.

                    Step 8 : Call the Addition iValue1, iValue2 function and store the returned result in iSum.

                    Step 9 : Display the result: Addition is: 

                    Step 10 : Close the Scanner object.

        End

 */

import java.util.Scanner;


class program4
{
    public static int Addition(int iNo1 , int iNo2)
    {
        int iRet = 0;
        iRet = iNo1 + iNo2;
        return iRet;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       int iValue1 = 0, iValue2 = 0, iSum = 0;

        System.out.println("Enter first number :");
         iValue1 = sobj.nextInt();

        System.out.println("Enter second number :");
         iValue2 = sobj.nextInt();

         iSum = iValue1 + iValue2 ;

        iSum = Addition(iValue1 , iValue2);
        System.out.println("Addition is :"+iSum);

        sobj.close();

    }
}
