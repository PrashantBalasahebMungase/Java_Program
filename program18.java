

/*  Accept one Character from user and convert case of that character*/


///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program18.java 
//  Description :  Accept a string from user and convert the case of each character.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  String
//  Output      :  Case-converted string (Uppercase <-> Lowercase)
//
//////////////////////////////////////////////////////////////////////////////////////////////////

/* 
    Start


           
            Step 1: Create a string variable 'Name' to store user input.
            Step 2: Accept the full string using Scanner.
            Step 3: Convert string into character array using toCharArray().
            Step 4: Traverse the character array using a loop.
                -> If character is in range A to Z
                    - Add 32 to convert to lowercase.
                -> Else if character is in range a to z
                    - Subtract 32 to convert to uppercase.
                -> Leave other characters (digits, spaces, symbols) as they are.
            Step 5: Print the modified character array as a string.
    End

*/


import java.util.Scanner;

class program18
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String :");

        String Name = sobj.nextLine();
        
        char Arr[] = Name.toCharArray();
        
       
        
        
        for(int iCnt = 0 ; iCnt< Arr.length ;iCnt++)
        {
            if((Arr[iCnt] >= 'A')&&(Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt]+32);
                
            }
            else if((Arr[iCnt] >= 'a')&& (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt]-32);
                
            }
           
        }
        for(int iCnt = 0 ; iCnt < Arr.length; iCnt++ )
        {
             System.out.print(Arr[iCnt]);
        }    
    }  
    
}