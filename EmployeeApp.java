/*
Author: Kevin Mwithiga
Reg: CT101/G/19870/23
*/
import java.util.Scanner;
//Employee class

class Employee
{

//Attribute
String name;
double salary;

//Constructor
public Employee(String name, double salary)
	{
this.name = name;
this.salary = salary;
	}

//Display Function
public void Display()
	{
System.out.println("Name: " + name);
System.out.println("Salary: " + salary);
	}
}

//Class to calculate the 10% Bonus
class SalaryCalculator
{
static double Calculator(double salary)
	{
return salary * 0.1;
	}
}

//Main Class to Input and Output everything
public class EmployeeApp
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
//Prompt user for there salary
System.out.print("Enter Salary: ");
double salary =
scanner.nextDouble();

//Creating an object for an Employee
Employee employee1 = new Employee(name, salary);

//Calling a method for EmployeeClass
employee1.Display();

//Use method from Salary Calculator
double bonus = SalaryCalculator.Calculator(salary);
System.out.println("Bonus: " + bonus);

scanner.close();
	}
}
