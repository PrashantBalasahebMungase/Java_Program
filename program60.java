/* Write a program which Accept Number from user and display its table in Reverse order*/
////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program60.java
//  Description : Accept a number from the user and display its multiplication table in reverse order
//                (10 to 1).
//  Author      : Prashant Balasaheb Mungase
//  Date        : 02/07/2025
//  Input       : 5
//  Output      : 5 * 10 = 50 ... 5 * 1 = 5
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        Start
                Step 1 : Accept an integer n from the user
                Step 2 :  If n is negative, convert it to its positive equivalent (n = -n)
                Step 3 :  For iCnt  = 10 down to 1:
                            -> result = n × iCnt
                            -> Print "n * iCnt = result"
       Stop
 */
import java.util.*;

class ReverseTable
{
    public int ReverseTable(int iNo)
    {
        int iTable = 0;
        int iCnt = 0;
        for(iCnt = 10 ; iCnt >= 1 ; iCnt--)
        {
            iTable = iCnt * iNo;
            System.out.print("\t"+iTable);
        }
        return iTable;
    }
}
public class program60 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);
         iValue = sobj.nextInt();

         ReverseTable robj = new ReverseTable();
         iRet = robj.ReverseTable(iValue);

        

    }
}
