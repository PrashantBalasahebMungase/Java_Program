///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program33.java 
//  Description :  Accept number of rows and columns from user and display continuous characters
//                 starting from 'A' row-wise (capital letters), i.e., pattern of characters.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer (iRow, iCol)
//  Output      :  Pattern of characters
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
 input : iRow = 4 , iCol = 4
 output :
        A       B       C       D       E
        F       G       H       I       J
        K       L       M       N       O
        P       Q       R       S       T
 

        
/*
        Start

            Step 1 : Input number of rows (iRow) and columns (iCol).

            Step 2 : Set ch = 'A'.

            Step 3 : Repeat for each row i = 1 to iRow
            Step 4 : Repeat for each column j = 1 to iCol
                        - Print ch
                        - Increment ch

            Step 5 : End each row with a new line.



        End        
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
            for(j= 1; j<= iCol; j++,ch++)
            {
                System.out.print(ch+ "\t");
                
            }
            System.out.println();
        }
    }
}
class program33
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