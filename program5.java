//  Write a java program to accept input from user and addition of two integer number

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program5.java 
//  Description :  Accept input from user and addition of two integer number 
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  Integer 
//  Output      :  Integer
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 
    Start

            Step 1 : Define a class Arithematic
                         Addition(iNo1, iNo2)

            Step 2 : Calculate iRet = iNo1 + iNo2
                        Return iRet

            In the main() class Program5:

            Step 3 : Create three integer variables
                         iValue1, iValue2, iSum

            Step 4 : Create a Scanner object 

            Step 5 : Enter the first number

            Step 6 : Read the first number and store  in iValue1

            Step 7 : Enter the second number

            Step 8 : Read the second number and store in iValue2

            Step 9 : Create an object aobj of class Arithematic

            Step 10 : Call the method aobj.Addition iValue1, iValue2

            Step 11 : Display the result: "Addition is:
                         Store the  value of iSum

            Step 12 : Close the Scanner object

    End

 */
import java.util.Scanner;

class Arithematic 
{
    public int Addition(int iNo1 , int iNo2)
    {
        int iRet = 0;
        iRet = iNo1 + iNo2 ;
        return iRet;
    }
}
class program5 
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iSum = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number :");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter second number :");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();
            
        iSum = iValue1 + iValue2 ;

        System.out.println("Addition is :"+iSum);
        
        sobj.close();

    }
}
