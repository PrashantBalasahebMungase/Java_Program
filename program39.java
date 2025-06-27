


//////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program39.java 
//  Description : Display pattern using '*' and '0' based on input rows and columns.
//                First and last rows contain '*', other rows contain '0'.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  27/06/2025
//  Input       :  Integer 
//  Output      :  Pattern of characters (* and 0)
//
//
//////////////////////////////////////////////////////////////////////////////////////////////



/*
        
  Start

    Step 1: Accept two integers iRow and iCol from the user.

    Step 2: Loop from i = 1 to iRow:

    Step 3 Loop from j = 1 to iCol:

            -> If i is first or last row:
                - Print '*'
            -> Else:
                - Print '0'

         Step 4: Move to next line

        

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

            if((j== 1) || (j == iCol))
            {
               System.out.print( "*\t");
               
            }
            else 
            {
                System.out.print("0\t");
            }
            System.out.println();
        }
    }
}
class program104
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