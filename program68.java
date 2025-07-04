/* Write a program which accept Distanc in kilometer  and Convert it into meter 
(1 kilometer  = 1000 meter)*/


///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program68.java
//  Description : Accepts distance in kilometers and converts it to meters.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 04/07/2025
//  Input       : 5
//  Output      : The distance in meters is : 5000
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept the distance in kilometers from the user (integer)

                Step 2: Convert kilometers to meters using: meters = kilometers * 1000

                Step 3: Return the value in meters
                
                Step 4: Display the distance in meters
       Stop
*/
import java.util.*;

class Kilometer
{
    public int kilometer(int iNo)
    {
        int iDist = 0;
        int iCnt = 1000;

        iDist = iCnt * iNo;
        return iDist;

    }
}
public class program68 
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number :");
        
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Kilometer kobj = new Kilometer();

        iRet = kobj.kilometer(iValue);
        System.out.println("The Disteance of meter is :"+iRet);

    }
}
