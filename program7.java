 //  Write a java program to accept input from user and Divide of two integer number

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program6.java 
//  Description :  Accept input from user and Divide of two integer number 
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  Integer 
//  Output      :  Integer
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////
 /*
 
  Start

        Step 1 : Create  a class named as Arithematic

        Step 2 : Create  two integer variablesas 
                     iNo1, iNo2

        Step 3 : Define a constructor that accepts two integers as 
                     A and B

        Step 4 :Assign iNo1 = A ,  Assign iNo2 = B

        Define a method Division()

        Step 5 : Create integer iAns
                    iAns = iNo1 / iNo2
                        Return iAns

        In the main() method of class program6:

        Step 7 : Create a Scanner object 

        Step 8 : Create three integer variablesas 
                 iValue1, iValue2, iSum

        Step 9 : Enter first number

        Step 10 : Read the first number into iValue1

        Step 11 : Enter second number

        Step 12 : Read the second number into iValue2

        Step 13 : Create an object aobj of class Arithematic
                     Passing iValue1 and iValue2 to the constructor

        Step 14 : Call the method aobj.Division() and store the result in iSum

        Step 15 : Display: "Division is : 

        Step 16 : Close the Scanner object

   End
*/

import java.util.Scanner;

class Arithematic
{
    public int iNo1 ;
    public int iNo2 ;

    public  Arithematic(int A , int B) // Paramertrise constructor
    {
        this.iNo1 = A; 
        this.iNo2 = B;
    }
    public int Division()
    {
        int iCnt = 0;
        iCnt = this.iNo1 / this.iNo2 ;
        return iCnt;
    }

}
class program57
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0 , iValue2 = 0 , iDiv = 0;

        System.out.println("Enter first number:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number :");
        iValue2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(iValue1, iValue2);

        iDiv = aobj.Division();

        System.out.println("Division is "+iDiv);
        sobj.close();


    }
}