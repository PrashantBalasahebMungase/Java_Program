// Accept one number from user and print that number of "*" on Scrren

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program11.java 
//  Description :  print that number of "*" on Scrren
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  25/06/2025
//  Input       :  Integer 
//  Output      :  *
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
class Accept
{
    public void Accept(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            System.out.print(" * ");
        }
    }
}

public class program11 
{
    public static void main(String A[])
    {
        int iValue = 0 ;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        Accept aobj = new Accept();

        aobj.Accept(iValue);

       
    }
}
