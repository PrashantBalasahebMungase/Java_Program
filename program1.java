

//  Write a Java program to Take the user name, age, and marks as input

  
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program1.java 
//  Description :  Java program that accepts name (String), age (int), and marks (float) from the user
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  String , Integer , float
//  Output      :  Name , Age , Marks
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Start



            Step 1: Create a Scanner object to take input from the user.

            Step 2: Display Enter Your Name
            Step 3: Read the user's name as a String.

            Step 4: Display Enter Your Age
            Step 5: Read the user's age as an integer.

            Step 6: Display Enter Your Marks 
            Step 7: Read the user's marks as a float.

            Step 8: Check if the marks are invalid (marks < 0.0 OR marks > 100.0)
                    -> If yes, display "Invalid marks entered" and stop.

            Step 9: Display all user details:
                    - Name
                    - Age
                    - Marks

            Step 10: Check result:
                    - If marks >= 35.0 -> Display "Result: Pass"
                    - Else -> Display "Result: Fail"

            Step 11: Close the Scanner object


    End


 */
import java.util.Scanner;

class CalculatePercentage
{
    public float Percentage(float Total , float Obtained)
    {
        float fTotalMark = 0.0f;
        fTotalMark =(Obtained / Total)*100;

        return fTotalMark;
        
    }
}


class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Total Mark  ");
        float fValue1 = sobj.nextFloat();
        
        System.out.println("Enter Your Obtained Mark");
        float fValue2 = sobj.nextFloat();

        if(fValue1 < 0.0f )
        {
            System.out.println("Invalid Input");
        }
        if(fValue1 < fValue2)
        {
            System.out.println("Wrong output");

        }
        
        CalculatePercentage cobj = new CalculatePercentage();
        float TotalPercentage = 0.0f;

        TotalPercentage = cobj.Percentage(fValue1 ,fValue2);
        if((TotalPercentage <= 0.0f)||(TotalPercentage < 35))
        {
            System.out.println("You Are Fail :"+TotalPercentage);
        }
        else if ((TotalPercentage >= 35)&&(TotalPercentage < 100))
        {
            System.out.println("You Are Pass :"+TotalPercentage);
        }

    }


}