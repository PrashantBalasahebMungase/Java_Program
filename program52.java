/* Write a program  Which accept number from user and print number till that number */

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program52.java                                                                       
//  Description : Accept number from user and print numbers from 1 till that number                                                   
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 1/07/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : 1   2   3 .... 
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 
    Start
            Step 1: Accept integer number iNo

            Step 2: Define a function Pattern(iNo)

            Step 3: Inside Pattern function:
                    - Run a loop from iCnt = 1 to iCnt <= iNo
                    - Print each value of i on the same line with tab

            Step 4: Call the Pattern function from main
            
    Stop
 */
import java.util.*;

class Pattern
{
    public void Pattern(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            System.out.print( "\t"+iCnt);
        }
    }
}

public class program52 
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter number:");
         iValue = sobj.nextInt();

         Pattern pobj = new Pattern();

         pobj.Pattern(iValue);
    }
    
}
