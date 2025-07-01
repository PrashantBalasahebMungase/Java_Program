/* Write A program  Which accept number from user and if number is less than 50  then print Small
    if is greatar  than 50  and less 100 then print medium if it is greater then 100 then print large 
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program56.java                                                                       
//  Description : Accept a number from user and display "Small" if < 50, "Medium" if 50-99,            
//                and "Large" if >= 100                                    
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 1/07/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : Small / Medium / Large 
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 
         Start
                Step 1: Accept integer input iNo from user

                Step 2: Call CheckSize(iNo)
            
                Step 3: In CheckSize(iNo)
                    - If iNo < 50, print "Small"
                    - Else if iNo >= 50 and iNo < 100, print "Medium"
                    - Else, print "Large"
         Stop
 */

import java.util.*;

class Number 
{
    public void Number(int iNo)
    {
        if(iNo < 50)
        {
            System.out.println("Small");
        }
        else if((iNo >= 50) && (iNo < 100))
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Large");
        }
    }
}
public class program56 
{
    public static void main(String A[])
    {
        int iValue = 0;
        System.out.println("Enter Number :");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Number(iValue);



    }
}
