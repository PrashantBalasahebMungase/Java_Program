// Accept one number and check whether it is divisible by 5 or not   

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program10.java 
//  Description :  Check whether it is divisible by 5 or not 
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  Integer
//  Output      :  Integer
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/*  Start

        Step 1 : Accept a number from the user

        Step 2 : Divide the number by 5

        Step 3 : If the remainder is 0
                     Display "Divisible by 5
                      Else
                      Display "Not Divisible by 5"

    End 

*/
import java.util.Scanner;

class CheckWhether
{
    public boolean CheckWhether(int iNo)
    {
        
        if((iNo % 5) == 0)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }
}
public class program10 
{
    public static void main(String A[])
    {
        int iValue =0;
        boolean bRet = false;

         System.out.println("Enter number :");

        Scanner sobj = new Scanner(System.in);
        iValue= sobj.nextInt();
        CheckWhether cobj = new CheckWhether();

        bRet = cobj.CheckWhether(iValue);
            

             if(bRet == true )
             {
                System.out.println(" Divisible 5");
             }
             else
             {
                System.out.println(" Not Divisible 5");
             }
             System.out.println(""+iValue);

             sobj.close();
    }
}
