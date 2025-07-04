/* Write a program which accept tempertaure in Fahrenhiet and convert it into celsius
    (1 celcius = Fahrenhiet - 32)* (5/9)

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program69.java
//  Description : Accepts temperature in Fahrenheit and converts it to Celsius.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 04/07/2025
//  Input       : 98.6
//  Output      : Temperature in Celsius is : 37.0
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept temperature in Fahrenheit from the user
                
                Step 2: Convert using the formula:
                        Celsius = (Fahrenheit - 32) * (5 / 9)

                Step 3: Return the Celsius value
                
                Step 4: Display the Celsius temperature
       Stop
*/

import java.util.*;
class FhtoCs
{
    public double FhtoCs(float fFahrenhiet)
    {
        if(fFahrenhiet < 0)
        {
            fFahrenhiet = -fFahrenhiet;
        }
        double dCelcius = 0.0;

        dCelcius = (fFahrenhiet - 32) * (5.0/9.0);
        return dCelcius;

    }
}
public class program69 
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        double dRet = 0;

        System.out.println("Enter Temperature in Fahrenhiet:");
        Scanner sobj = new Scanner(System.in);

        fValue = sobj.nextFloat();

        FhtoCs fobj = new FhtoCs();
        dRet = fobj.FhtoCs(fValue);
        System.out.println("emperatuer Celcius is:"+dRet);
    }
}
