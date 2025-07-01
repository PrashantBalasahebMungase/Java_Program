/* write a program  which accept N and print first 5 Multiple of N */
///////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program55.java                                                                       
//  Description : Accept an integer N from user and print first 5 multiples of that number                                     
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 1/07/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : First 5 multiples of N
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 
    Start
            Step 1: Accept integer N from user

            Step 2: Call Multiple

            Step 3: Inside Multiple function:
                    - Run loop iCnt = 1 to 5
                    - Print iCnt * iNo in each iteration
            
    Stop
 */
import java .util.*;

class Multiple
{
    public void Multiple(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1 ; iCnt <= 5 ; iCnt++)
        {

            System.out.print("\t"+iCnt * iNo);
        }
    }
}

public class program55 
{
    public static void main(String A[])
    {
        int iValue = 0;
        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        Multiple mobj = new Multiple();

        mobj.Multiple(iValue);
    }
}
