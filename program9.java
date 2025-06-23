// Program to print 5 to 1 number  on Screen

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program9.java 
//  Description :  Print 5 to 1 number 
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  Integer
//  Output      :  Integer
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start

                    Step 1: Create ainteger variable iCnt

                    Step 2 : Initialize iCnt to 5

                    Step 3 : Repeat the following steps while iCnt is greater than or equal to 1:

                    Step 4 : Print the value of iCnt
                    
                    Step 5 : Decrease the value of iCnt by 1

        End


 */
public class program9
{
    public static void main(String A[])
    {
        int iCnt = 5;

        System.out.println("Display number :");

        while(iCnt >= 1)
        {
            System.out.println(+iCnt);
            iCnt--;
        }
    }
}
