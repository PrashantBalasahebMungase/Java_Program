///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program31.java 
//  Description :  Accept number of rows and columns from user and display pattern:
//                 Odd column -> print column number; Even column -> print '*'.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer (iRow, iCol)
//  Output      :  Pattern 3
//
///////////////////////////////////////////////////////////////////////////////////////////////



/*
        Start

                Step 1: Accept two integer inputs iRow and iCol from the user.
                Step 2: Use nested loops:
                        Outer loop runs from i = 1 to iRow
                        Inner loop runs from j = 1 to iCol
                        -> If j is even (j % 2 == 0), then print '*'
                        -> Else (odd column), print the value of j
                Step 3: After each row, print a new line


        End        
*/



import java.util.Scanner;

class Pattern 
{
    public void  Display(int iRow , int iCol)
    {
        int i = 0;
        int j = 0;
        for(i = 1; i<= iRow ; i++)
        {
            for(j= 1; j<= iCol; j++)
            {
                if((j % 2 ) == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
       
    }
}
class program31
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