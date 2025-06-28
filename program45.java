/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : program45.java
//  Description : Accept number of rows and columns from user and display a special triangle pattern.
//                The pattern prints '*' on the diagonal, '$' below it, and '#' 
//  Author      : Prashant Balasaheb Mungase
//  Date        : 28/06/2025
//  Input       : Integer (iRow and iCol)
//  Output      : Diagonal pattern with '*', '$' and '#'
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* Input : iRow = 4 iCol = 4

    Output :
            *	#	#	#
            $	*	#	#
            $	$	*	#
            $	$	$	*
            
    /*        
   Start

Step 1: Accept two integers iRow and iCol from the user.

        Step 2: If iRow != iCol
                    -> Print "Invalid input" and return.

        Step 3: Loop through rows i = 1 to iRow

        Step 4: Loop through columns j = 1 to iCol
                - If i == j
                    -> Print "*"
                - Else if i > j
                    -> Print "$"
                - Else
                    -> Print "#"

        Step 5: After each row, move to the next line 


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

            if(i >= j)
            {
               System.out.print( "*\t");
               
            }
           
           
             System.out.println();
        }
    }
}

class program110
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