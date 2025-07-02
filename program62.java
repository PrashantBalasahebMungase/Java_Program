/* Accept Ammount in US ToINR and return its corresponding value in Inadian currency Consider 1 $ as 70 rupees*/
////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program62.java
//  Description : Accept an amount in US Dollars and convert it to Indian Rupees.
//                Consider 1 USD = 70 INR.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 02/07/2025
//  Input       : 5
//  Output      : INR: 350
//
////////////////////////////////////////////////////////////////////////////////////////////////////////


/*
        Start
                Step 1: Accept an integer amount in USD from the user

                Step 2:  Define conversion rate as 1 USD = 70 INR

                Step 3: Multiply the USD amount by 70 to get INR
                
                Step 4: Display the INR amount
       Stop
*/
import java.util.*;

class DollerToINR
{
    public int DollerToINR(int iNo)
    {
        int iToINR = 70;
        int INR = 0;

        INR = iToINR * iNo;
        return INR;
    }
}
public class program62
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        DollerToINR dobj = new DollerToINR();

        iRet = dobj.DollerToINR(iValue);
        System.out.println(iRet);
    }
}
