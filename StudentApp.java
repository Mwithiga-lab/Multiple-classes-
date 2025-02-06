/*
Author: Kevin Mwithiga
Reg: CT101/G/19870/23
*/
import java.util.Scanner;
//Student class

class Student
{

//Attribute
String name;
double marks;

//Constructor
public Student(String name, double marks)
        {
this.name = name;
this.marks = marks;
        }

//Display Function
public void displayDetails()
        {
System.out.println("Name: " + name);
System.out.println("Mark: " + marks);
        }
}

//Class to calculate the grades of the students
class gradeCalculator
{
static String calculateGrade(double marks)
        {
         String grade;
if(marks >= 90)
	{
		grade = "A";
	}

else if(marks >= 75 && marks < 90)
        {
                grade = "B";
        }

else if(marks >= 50 && marks < 75)
        {
                grade = "C";
        }

else
        {
                grade = "D";
        }
	return grade;
    }
}

//Main Class to Input and Output everything
public class StudentApp
{
// main Method
public static void main(String[] args)
        {
//Create scanner object
Scanner scanner = new Scanner(System.in);
// Prompt user for there name
System.out.print("Enter Name: ");
String name =
scanner.nextLine();
//Prompt user for there mark
System.out.print("Enter Mark: ");
double marks =
scanner.nextDouble();

//Creating an object for an Student
Student student1 = new Student(name, marks);

//Calling a method for StudentClass
student1.displayDetails();

//Use the method from GradeCalculator to get the grade
String grade = gradeCalculator.calculateGrade(marks);

//To Display the grade
System.out.println("Grade: " + grade);

scanner.close();
        }
}
