
 
 ///////////////////////////////////////////////////////////////////////////////////////////////
//  File Name   :  program35.java 
//  Description : Accept number of rows and columns from user and display pattern.
//                 Each row contains the same alphabet character starting from 'A'
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  26/06/2025
//  Input       :  Integer (iRow, iCol)
//  Output      :  Pattern of characters
//
///////////////////////////////////////////////////////////////////////////////////////////////



/*
        Start

                Step 1 : Accept two integer inputs iRow and iCol from the user.

                Step 2 : Initialize character ch = 'A'

                Step 3 : For i = 1 to iRow
                    -> For j = 1 to iCol
                            - Print character ch
                    -> Print newline
                    -> Increment ch

        End        
/*
input : iRow = 4 , iCol = 4
Output : 
        A       A       A       A
        B       B       B       B
        C       C       C       C
        D       D       D       D
  
 */

import java.util.Scanner;

class Pattern 
{
    public void  Display(int iRow , int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = 'A';

        for(i = 1 , ch = 'A'; i<= iRow ; i++ , ch++)
        {
            for(j= 1; j<= iCol; j++)
            {
                System.out.print(ch+ "\t");
               
            }
            System.out.println("\t");
        }
    }
}
class program35
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