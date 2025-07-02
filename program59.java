/* Write a program which Accept Number from user and display its table*/
///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program59.java
//  Description : Accept a number from the user and display its multiplication table (1 to 10)
//  Author      : Prashant Balasaheb Mungase
//  Date        : 02/07/2025
//  Input       : 5
//  Output      : 5 * 1 = 5  ...  5 * 10 = 50
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        Start
                 Step 1 : Accept an integer input n from the user
                 Step 2 :  Repeat iCnt = 1 to 10:
                 Step 3 :  Print n * iCnt = result
       Stop
 */
import java.util.*;

 class Table 
{
    public int Table(int iNo)
    {
        int iTable = 0;
        int iCnt = 0;
        for(iCnt = 1 ; iCnt <=  10 ; iCnt++)
        {
            iTable = iCnt * iNo;
            System.out.print("\t"+iTable);
        }
        return iTable;
    }
}
public class program59
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj. nextInt();

        Table tobj = new Table();
        iRet = tobj.Table(iValue);

        


    } 
}
