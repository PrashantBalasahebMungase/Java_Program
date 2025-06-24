

/*  Accept one Character from user and convert case of that character*/


///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program17.java 
//  Description :  Accept one character from user and convert its case.
//  Author      :  Prashant Balasaheb Mungase 
//  Date        :  25/06/2025
//  Input       :  Character
//  Output      :  Converted case character
//
//////////////////////////////////////////////////////////////////////////////////////////////////

/* 
    Start


            Step 1: Create a character variable cLetter
            Step 2: Accept a character from the user using Scanner.
            Step 3: Create object of DisplayCharacter class.
            Step 4: Call ConvertCase method using object, passing the character.
            Step 5: In ConvertCase method:
                -> If character is in range A to Z
                    - Add 32 to convert to lowercase.
                -> Else if character is in range a to z
                    - Subtract 32 to convert to uppercase.
                -> Print the converted character.


        End

*/
import java.util.Scanner;

class DisplayCharacter
{

    
    public void ConvertCase(char cChar)
    {
        
        if((cChar >= 'A') && (cChar <= 'Z'))
        {
            cChar = (char)(cChar + 32) ;
            System.out.println("Convert to lowarcase "+cChar);
        }
        else if((cChar >= 'a')&& (cChar <= 'z'))
        {
            cChar = (char) (cChar - 32) ;
            System.out.println("Convert to Upercase :"+cChar);
        }
    }
}


    public class program17
{
    public static void main(String[] A)
    {
        char cLetter = '\0';

        System.out.print("Enter Character: ");
        Scanner sobj = new Scanner(System.in);

        cLetter = sobj.next().charAt(0);  // Read first character from input

        DisplayCharacter dobj = new DisplayCharacter();  // No-arg constructor

        dobj.ConvertCase(cLetter);  // Call method

        sobj.close();
    }
}



