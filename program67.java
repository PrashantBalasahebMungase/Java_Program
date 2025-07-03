/*  write a program which accept width and height of rectangle from user and Calculate its area 
(Area = Width * Height)
*/


///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   : Program67.java
//  Description : Accepts width and height of a rectangle and calculates its area.
//  Author      : Prashant Balasaheb Mungase
//  Date        : 03/07/2025
//  Input       : Width = 5, Height = 4
//  Output      : The area of rectangle is : 20.0
//
///////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        Start
                Step 1: Accept the width and height of the rectangle from the user

                Step 2: Multiply width and height → Area = width * height

                Step 3: Return the area
                
                Step 4: Display the area to the user
       Stop
*/
import java.util.*;

class RectArea
{
    public double RectArea(float Width , float Heigth)
    {
        float Area = Width * Heigth;
        return Area;
    }
}
public class program67 
{
    public static void main(String A[])
    {
        float fValue1 = 0.0f;
        float fValue2 = 0.0f;
        double dRet = 0.0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Width :");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter Heigth :");
         fValue2 = sobj.nextFloat();

        

        
        
        RectArea robj = new RectArea();

        dRet = robj.RectArea(fValue1, fValue2);

        System.out.println("The area of rectangle is :"+dRet);


    }
}
