
///////////////////////////////////////////////////////////////////////////////////////////////
//  File Name   : program36.java 
//  Description : Accept number of rows and columns from user and display character pattern.
//                Pattern displays sequential alphabets, each row skipping one character.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  27/06/2025
//  Input       :  Integer 
//  Output      :  Pattern of characters
//
//////////////////////////////////////////////////////////////////////////////////////////////



/*
        
  Start

        Step 1: Accept two integers iRow and iCol from the user.
        
        Step 2: Initialize character ch to 'A'.

        Step 3: Repeat iRow times:
            
        Step 4: Repeat iCol times:
                    - Print character ch
                    - Increment ch by 1

        Step 5: Increment ch once more to skip one character
        Step 6: Move to next line

        

    End        


    input : iRow = 4 , iCol = 4
    Ou tput :
    A       B       C       D
    F       G       H       I
    K       L       M       N
    P       Q       R       S
  
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
                ch++;
               
            }
            System.out.println("\t");
        }
    }
}
class program100
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