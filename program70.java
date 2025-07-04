/* Write a program which accept area in squere feet and convert it into squere meter 
(1 squere feet  = 0.0929 squere meter)
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program70.java
//  Description : Accepts area in square feet and converts it to square meters.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 04/07/2025
//  Input       : 100
//  Output      : Area in square meters is : 9.29
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept area in square feet from the user
                
                Step 2: Convert using the formula:
                        SquareMeter = SquareFeet * 0.0929

                Step 3: Return the converted area
                
                Step 4: Display the result
       Stop
*/

import java.util.*;
class SquereMeter
{
    public double SquereMeter(int iValue)
    {
         double dSqureMeter = 0.0;
         dSqureMeter =  iValue * 0.0929 ;

       return dSqureMeter;
    }
}
public class program70 
{
    public static void main(String A[])
    {
        int iValue = 0;
        double  dRet = 0.0;
        System.out.println("Enetr area of square feet :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        SquereMeter mobj = new SquereMeter();

        dRet = mobj.SquereMeter(iValue);
        System.out.println(" Area of Squre Feet is : "+dRet);


    }
    
}
