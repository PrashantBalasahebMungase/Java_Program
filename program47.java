/* write a program which Accept number from user and display its factor in decressing order*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                     
//  File Name   : program47.java                                                                       
//  Description : Accept number from user and display its factors in decreasing order                 
//  Author      : Prashant Balasaheb Mungase                                                           
//  Date        : 30/06/2025                                                                           
//  Input       : Integer                                                                              
//  Output      : All factors of the number in decreasing order                                        
/////////////////////////////////////////////////////////////////////////////////////////////////////////

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
    public void  Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = (iNo /2)  ; iCnt >= 1; iCnt--)
        if (( iNo % iCnt) == 0)
        {
            System.out.print("\t"+iCnt);
        }

        
    }
}
public class program47 
{
    public static void main(String A[])
    {
        int iRet = 0;
        
        Scanner sobj = new Scanner(System. in);
        System.out.println("Enter number :");
        iRet = sobj.nextInt();
        Display dobj = new Display();

         dobj.Display(iRet);
       

    }
}
