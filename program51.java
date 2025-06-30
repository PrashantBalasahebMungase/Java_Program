/* write a program which accept number from user and print the number of $ and * on screen*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program51.java                                                                       
//  Description : Accept number from user and print that many '$' and '*'                                            
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 30/06/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : Pattern of $ * $ *
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 
    Start

            Step 1: Accept integer iNo from user

            Step 2: Run a loop from i = 1 to i <= iNo:
                -> Print "$ *" in each iteration

    Stop
 */
import java.util.*;
class Pattern
{
    public int Pattern(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < iNo ; iCnt++)
        {
            System.out.print("$\t *\t");
        }
         return iCnt;
    }
    
    
}
public class program51 
{
    public static void main(String A[])
    {

       
        int iValue = 0;

        System.out.println("Enter number:");
        Scanner sobj = new Scanner(System.in);

        iValue = sobj.nextInt();
        Pattern  pobj = new Pattern(); 

        pobj.Pattern(iValue);

        

    }    
}
