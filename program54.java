/* Write a program which accept N number from user and print all Even number up to N */
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program54.java                                                                       
//  Description : Accept an integer N from user and print all Even numbers from 1 up to N                                             
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 1/07/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : Odd numbers sequence : 2 4 6 8 .. 
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 
    Start
            Step 1: Accept integer N from user.

            Step 2: Call DisplayEven.

            Step 3: In DisplayEven

            Step 4: Loop iCnt  = 1 to N

            Step 5: If i is Even (iCnt % 2 == 0), print i with a tab.
            
    Stop
 */
import java.util.*;

class DisplayEven
{
    public void DisplayEven(int iNo)
    {
       int iCnt = 0;
       
       for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
       {
        if((iCnt % 2) == 0)
        {
            System.out.print("\t"+iCnt);
        }
       }
    }
}
public class program54 
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enetr Number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        DisplayEven dobj = new DisplayEven();

        dobj.DisplayEven(iValue);

    }
    
}
