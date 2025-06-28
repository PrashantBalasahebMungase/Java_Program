//////////////////////////////////////////////////////////////////////////////////////////////
//  File Name   : program41.java
//  Description : Accept number of rows and columns from user and display star pattern.
//                The pattern prints a border of stars (*), with spaces inside.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 28/06/2025
//  Input       : Integer 
//  Output      : Border star pattern
///////////////////////////////////////////////////////////////////////////////////////////////

    /* Input : iRow = 4 iCol = 4

    Output :
            *       *       *       *
            *                       *
            *                       *
            *       *       *       *
            
    /*        
   Start

            Step 1: Accept two integers iRow and iCol from the user (number of rows and columns).

            Step 2: Loop through each row from 1 to iRow
                        - for i = 1 to iRow

            Step 3: Inside the row loop, loop through each column from 1 to iCol
                        - fo r j = 1 to iCol

            Step 4:
                      - If i == 1 (first row)
                        OR i == iRow (last row)
                        OR j == 1 (first column)
                        OR j == iCol (last column)
                    -> Then print *
                - Else
                -> Print tab/space

            Step 5: After inner loop, move to next line (print newline)

            Step 6: End outer loop

   End


 */
import java.util.Scanner;

class Pattern 
{
    public void  Display(int iRow , int iCol)
    {
        int i = 0;
        int j = 0;
        int iCnt = 0;
        
        for(i = 1 ; i<= iRow ; i++ )
        {
                
            for(j= 1; j<= iCol; j++ )

            if(((j== 1) || (j == iCol)) || ((i == 1) || (i == iRow)))
            {
               System.out.print( "*\t");
               
            }
            else 
            {
                System.out.print(" \t");
            }
            System.out.println();
        }
    }
}

class program106
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