
///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : program40.java
//  Description : Display hollow rectangle pattern using '*' and '0'.
//                Border rows and columns show '*', inner cells show '0'.
//  Author      :  Prashant Balasaheb Mungase
//  Date        :  27/06/2025
//  Input       :  Integer 
//  Output      :  Pattern of characters (* and 0)
//
///////////////////////////////////////////////////////////////////////////////////////////////

/*
 Start

    Step 1: Accept two integers iRow and iCol from the user.
            -> iRow: Total number of rows
            -> iCol: Total number of columns

    Step 2: Loop through each row (i = 1 to iRow):

    Step 3: Loop through each column (j = 1 to iCol):

            -> If current cell is in:
                - first row (i == 1) OR
                - last row (i == iRow) OR
                - first column (j == 1) OR
                - last column (j == iCol)

                -> Print '*'

            -> Else
                -> Print '0'

    Step 4: After inner loop, move to the next line (print newline)

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
                System.out.print("0\t");
            }
            System.out.println();
        }
    }
}

class program105
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