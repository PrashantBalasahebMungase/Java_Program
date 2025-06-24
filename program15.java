//  write a program which accept one number from user and print that number of even number on screen
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program15.java 
//  Description :  Accept a number from the user and print that many even numbers starting from 2
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  25/06/2025
//  Input       :  Integer
//  Output      :  Multiple even numbers starting from 2
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  /* 
    Start

            Step 1 : Create an integer variable 'iValue' to store user input.
            Step 2 : Prompt the user to enter a number.
            Step 3 : Read the input using Scanner and store it in 'iValue'.
            Step 4 : Create an object of class PrintEven.
            Step 5 : Call the method PrintEven(iValue) using the object.
            Step 6 : Inside the method:
                    - Use a for loop to generate numbers from 2 to iNo*2.
                    - For each number, check if it is even (i.e., divisible by 2).
                    - If it is even, print it.
        End

*/

import java.util.Scanner;

class PrintEven
{
    public void PrintEven(int iNo)
    {
        if(iNo <= 0)
        {
            return ;
        }

        int iCnt = 0;
        
        for(iCnt = 2; iCnt <= iNo *2 ; iCnt++)
        {
            if((iCnt % 2 )== 0)
            {
              System.out.print("\t"+iCnt);
            }
            
        }

    }
}

public class program15
{
    public static void main(String A[])
    {
        int iValue = 0;
        System.out.println("Enter number :");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        PrintEven pobj = new PrintEven();

        pobj.PrintEven(iValue);

        sobj.close();

    }
}
