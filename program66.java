/* Write a program which accept radius of circle from and calculate its area  consider value of PI as 3.14
    (Area = PI * Radius * Raduis)
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program66.java
//  Description : Accepts radius of a circle and calculates its area.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 03/07/2025
//  Input       : 5
//  Output      : Circle area is : 78.5
//
///////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        Start
                Step 1: Accept the radius from the user (float value)

                Step 2: If radius is negative, convert it to positive

                Step 3: Use the formula: Area = PI * radius * radius (where PI = 3.14)

                Step 4: Return the area
                
                Step 5: Display the area to the user
       Stop
*/
import java.util.*;
class CalculateArea
{
    public double CalculateArea(float Radius)
    {
        if(Radius < 0)
        {
            Radius = -Radius;
        }

        float  PI = 3.14f;

        float Area = PI *Radius * Radius;
        
        return Area;
    }
}
public class program66 
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        double dRet = 0.0;
        System.out.println("Enetr number:");
        Scanner sobj = new Scanner(System.in);
        fValue = sobj.nextFloat();

        CalculateArea cobj = new CalculateArea();
        dRet = cobj.CalculateArea(fValue);

        System.out.println("Circle area is :"+dRet);

    }
    
}
