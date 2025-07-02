/*  Write a program which accept number from user and display pattern */

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program61.java
//  Description : Accept a number from the user and display a pattern:
//                First line: n stars (*) || Second line: n hashes (#)
//  Author      : Prashant Balasaheb Mungase
//  Date        : 02/07/2025
//  Input       : 5
//  Output      : * * * * *
//                # # # # #
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept an integer n from the user

                Step 2: If n < 0, convert it to positive (n = -n)

                Step 3: Loop from 1 to n:
                         -> Print '*'

                Step 4: Print a newline

                Step 5: Loop from 1 to n:
                         -> Print '#'
       Stop
*/
import java.util.*;

class Pattern
{
    public void Pattern(int iNo) 
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            System.out.print("*\t");
        }
        for(iCnt = 1 ; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t");
        }
    }
}
public class program61
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        Pattern  pobj = new Pattern();

       pobj.Pattern(iValue);

    }
    
}
