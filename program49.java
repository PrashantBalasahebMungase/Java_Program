/* Write a program which Accept number from user and return summition of all its non factor*/


/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program49.java                                                                       
//  Description : Accept a number from the user and return summation of all its non-factors                 
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 30/06/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : Summation of all non-factors given number 
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Start 
            
            Step 1 : Accept an integer iNo from the user.

            Step 2 : Initialize iSum = 0

            Step 3 : Run a loop from i = 1 to i < iNo
                     -> If (iNo % i != 0), then i is a non-factor
                     -> Add i to iSum

            Step 4 : Return iSum
    End 
 */
import java.util.*;

class  Sumition
{
    public int Sumition(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
           
        }
         return iSum;
    }
}
public class program49 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;


        System.out.println("Enter Number :");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Sumition nobj = new Sumition();
        iRet =  nobj.Sumition(iValue);
       System.out.println(""+iRet);

    } 
}
