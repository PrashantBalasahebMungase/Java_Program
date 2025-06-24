/* Accept number from user and check wheather number is Even or Odd */

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program14.java 
//  Description :  Accept a number from user and check whether it is Even or Odd
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  25/06/2025
//  Input       :  Integer
//  Output      :  "Even " , "Odd"
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
    Start

            Step 1 : Create an integer variable 
                        int iValue 

            Step 2 : Create a boolean variable bRet to store the result of the even check.

            Step 3 : Enter number

            Step 4 : Read the number from the user and store it in iValue.

            Step 5 : Create an object of the class CheckEven.

            Step 6 : Call the method CheckEven(iValue) using the object.

            Step 7 : This method will check if the number is divisible by 2.

            Step 8 : If (iValue % 2) == 0, return true (number is even).

            Step 9 : Else, return false (number is odd).

            Step 10 : Store the result in the variable bRet.

            Step 11 : Check the value of bRet:

            Step 12 : If bRet is true, display "Even".

            Step 13 : Otherwise, display "Odd".

    End


 */
import java.util.Scanner;

class CheckEven
{
    public boolean CheckEven(int iNo)
    {
        if((iNo % 2 )== 0)
        {
            return true ;
        }
        else
        {
            return false ;
        }
    }
}
public class program14
 
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number :");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        CheckEven cobj = new CheckEven();

        bRet = cobj.CheckEven(iValue);
        if(bRet == true)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        sobj.close();

    }
}
