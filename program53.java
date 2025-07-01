/* Write a program which accept N number from user and print all odd number up to N */
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program53.java                                                                       
//  Description : Accept an integer N from user and print all odd numbers from 1 up to N                                             
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 1/07/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : Odd numbers sequence : 1   3   5  
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 
    Start
            Step 1: Accept integer N from user.

            Step 2: Call DisplayOdd

            Step 3: In DisplayOdd

            Step 4: Loop iCnt  = 1 to N

            Step 5: If i is odd (iCnt  % 2 != 0), print i with a tab.
            
    Stop
 */
import java.util.*;

class DisplayOdd
{
    public void  DisplayOdd(int iNo)
    {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2) != 0)
            {
                System.out.print("\t"+iCnt);
            }
        }
    }

}
public class program53 
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        DisplayOdd pobj = new DisplayOdd();

        pobj.DisplayOdd(iValue);
    }

}
