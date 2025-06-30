/* Write a program which accept number from user and display all its non factor */

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program48.java                                                                       
//  Description : Accept a number from the user and display all of its non‑factors                     
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 30/06/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : All non‑factors of the given number 
//                           
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Start 
            Step 1 : Accept an integer number from the user and store it in variable iNo.

            Step 2 : Run a loop from i = iNo / 2 down to 1
            
                    - For each i, check if it is a factor of iNo (i.e., iNo % i == 0).
                        - If yes, then display i.

    End 
 */
import java.util.*;

class Display
{
    public void DisplayNonFact(int iNo)
    {
        int iCnt = 0;
       
        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        
        {
            if((iNo % iCnt) != 0)
            {
                System.out.print("\t"+iCnt);
            }
        }
    }
}
public class program48 
{
    public static void main(String A[])
    {
        int iNo1 = 0;
        System.out.println("Enter number :");
        Scanner sobj = new Scanner(System.in);

        iNo1 = sobj.nextInt();

        Display dobj = new Display();

        dobj.DisplayNonFact(iNo1);
    }
    
}
