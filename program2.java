//  Write a Java program to Take the user name, age, and marks as input

  
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//  Flie Name   :  program2.java 
//  Description :  Java program that accepts name (String), age (int), and marks (float) from the user
//  Author      :  Prashant Balasaheb Mungase 
//  Dete        :  23/06/2025
//  Input       :  String , Integer , float
//  Output      :  Name , Age , Marks
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Start

            Step 1 : Create a Scanner object 

            Step 2 : Print the message:
                         "Enter Your Name:"

            Step 3 : Read the user's name as a String

            Step 4 : Print the message:
                         "Enter Your Age:"

            Step 5 : Read the user's age as an integer.

            Step 6 : Print the message:
                         "Enter Your Marks:"

            Step 7 : Read the user's marks as a float.

            Step 8 : Print the entered name, age, and marks 

            Stap 9 : close the Scanner object.

    End


 */

 import java.util.Scanner;

class program2

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name :");
        String sName = sobj.nextLine();

        System.out.println("Enter your age :");
        int iAge = sobj.nextInt();

        System.out.println("Enter your marks :");
        float fMarks = sobj.nextFloat();

        System.out.println("Name :"+sName);
        System.out.println("Age  :"+iAge);
        System.out.println("Marks :"+fMarks);

    }
}