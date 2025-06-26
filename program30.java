/* Accept one Charcter from user and check whether that character is vowel (a,e,i,o,u) or not 
 
///////////////////////////////////////////////////////////////////////////////////////////////
//
//  File Name   :  program30.java
//  Description :  Accept one character from user and check whether it is a vowel (a, e, i, o, u).
//  Author      :  Prashant Balasaheb Mungase
//  Date        :  26/06/2025
//  Input       :  Character
//  Output      :  whether the character is a vowel or not
//
///////////////////////////////////////////////////////////////////////////////////////////////
    Start
        Step 1 : Accept a character from user.
        Step 2 : Convert the character to lowercase.
        Step 3 : Check if character is 'a', 'e', 'i', 'o', or 'u'.
        Step 4 : If yes, print "It is a Vowel."
        Step 5 : Else, print "It is not a Vowel."
   End
*/



import java.util.Scanner;

class CheckVowel {
    public boolean isVowel(char ch)
     {
        // Convert to lowercase for simplicity
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}

public class program30 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char cValue = sobj.next().charAt(0);  // Read one character

        CheckVowel obj = new CheckVowel();
        boolean bRet = obj.isVowel(cValue);

        if (bRet)
        {
            System.out.println("It is a Vowel.");
        } 
        else 
        {
            System.out.println("It is not a Vowel.");
        }
    }
}