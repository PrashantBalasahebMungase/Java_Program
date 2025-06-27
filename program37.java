
///////////////////////////////////////////////////////////////////////////////////////////////
//  File Name   :  program37.java 
//  Description : Display character pattern based on input rows and columns.
//                Odd rows print uppercase letters, even rows print lowercase.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  27/06/2025
//  Input       :  Integer 
//  Output      :  Pattern of characters
//
//////////////////////////////////////////////////////////////////////////////////////////////



/*
        
  Start

        
    Step 1: Accept two integers iRow and iCol from the user.

    Step 2: Initialize two characters

            -> ch = 'a'  // for lowercase
            -> ch1 = 'A' // for uppercase

    Step 3: Loop from i = 1 to iRow

    Step 4: Loop from j = 1 to iCol
            -> If i is even:
                - Print ch (lowercase)
            -> Else:
                - Print ch1 (uppercase)
                
    Step 5: Increment both ch and ch1
    Step 6: Move to next line

        

    End        

/*Input : iRow = 4 ,  iCol = 4
    Output : 
        A       A       A       A
        b       b       b       b
        C       C       C       C
        d       d       d       d


*/
import java.util.Scanner;

class Pattern 
{
    public void  Display(int iRow , int iCol)
    {
        int i = 0;
        int j = 0;
        char ch = 'a';
        char ch1 = 'A';

        for(i = 1 , ch = 'a', ch1 = 'A'; i<= iRow ; i++ , ch++,ch1++)
        {
                
            for(j= 1; j<= iCol; j++)
            {
               if(i % 2 == 0)
               {
                System.out.print(ch+ "\t");
                
               }
               else
               {
                System.out.print(ch1+ "\t");
                
               }
               
            }
            System.out.println("\t");
        }
    }
}
class program101
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