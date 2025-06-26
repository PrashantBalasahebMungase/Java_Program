///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program32.java 
//  Description :  Accept number of rows and columns from user and display continuous characters
//                 starting from 'A' row-wise (capital letters), i.e., pattern of characters.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer (iRow, iCol)
//  Output      :  Pattern of characters
//
///////////////////////////////////////////////////////////////////////////////////////////////



/*
        Start

                Step 1: Accept two integer inputs iRow and iCol from the user.

                Step 2: Initialize a character variable ch = 'A'

                Step 3: Use nested loops:
                        Outer loop runs from i = 1 to iRow
                        Inner loop runs from j = 1 to iCol
                            -> Print current character ch
                            -> Increment ch by 1

                Step 4: After each row, print a newline



        End        
*/


/* input : iRow = 4 , iCol = 4
     
Output :
     A B C D
     E F G H
     I J K L
     M N O P
  
 */

import java.util.Scanner;

class Pattern 
{
    public void  Display(int iRow , int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = 'A';

        for(i = 1; i<= iRow ; i++)
        {
            for(j= 1; j<= iCol; j++)
            {
                System.out.print(ch+ "\t");
                ch++;
            }
            System.out.println("\t");
        }
    }
}
class program32
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter number of rows :");
        iValue1 = sobj .nextInt();

         System.out.println("Enter number of Columns :");
        iValue2 = sobj .nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1 , iValue2);
    }

}