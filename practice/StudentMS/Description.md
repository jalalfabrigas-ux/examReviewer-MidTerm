1. Student Management System (Recommended)
Concepts:

✅ Classes and Objects
✅ Encapsulation
✅ Inheritance
✅ Polymorphism
✅ Abstraction
✅ Arrays
✅ Method Overloading

Problem:

Create a Student Management System.

Requirements:
Abstract Class: Person

Attributes:

name
age

Methods:

getName()
getAge()
setName()
setAge()
abstract void displayInfo()
Class: Student extends Person

Attributes:

studentID
course

Override:

displayInfo()
Class: Teacher extends Person

Attributes:

employeeID
subject

Override:

displayInfo()
Method Overloading

Create:

search(String name)
search(int id)
Main Program
Ask user how many persons to enter
Store them in an array
User chooses Student or Teacher
Display all records using polymorphism
2. Online Food Ordering System
Concepts:

✅ Everything on your list

Requirements

Abstract Class:

MenuItem

Attributes:

name
price

Method:

abstract double calculateTotal();

FoodItem

Attributes:

quantity

DrinkItem

Attributes:

size

Method Overloading

calculateDiscount()
calculateDiscount(double percentage)

Store orders in an array.

Display receipt using polymorphism.

3. Library Management System
Concepts:

✅ Classes and Objects
✅ Encapsulation
✅ Inheritance
✅ Arrays
✅ Polymorphism

Classes

Abstract Class

LibraryItem

Attributes:

title
author

Book extends LibraryItem

Attributes:

pages

Magazine extends LibraryItem

Attributes:

issueNumber

Store books and magazines in one array.

Display using:

item.displayInfo();
4. Vehicle Rental System
Classes

Abstract Class:

Vehicle

Attributes:

brand
rentalPrice

Method:

abstract double calculateRental();

Car extends Vehicle

Attribute:

days

Motorcycle extends Vehicle

Attribute:

hours

Method Overloading

calculateRental()
calculateRental(double discount)

Store rentals in an array.

5. Hospital System (Exam-Level)
Abstract Class
Patient

Attributes:

name
age

Method:

abstract double calculateBill();

InPatient

Attributes:

daysAdmitted

Bill:

daysAdmitted * 1500

OutPatient

Attributes:

consultationFee

Bill:

consultationFee

Store patients in an array.

Display bills using polymorphism.

Challenge Problem (Very Similar to Actual Exams)
School Payroll System

Create:

Abstract Class
Employee

Attributes:

name
id

Method:

abstract double computeSalary();

FullTimeEmployee

Attributes:

monthlySalary

PartTimeEmployee

Attributes:

hoursWorked
ratePerHour

Method Overloading

computeBonus()
computeBonus(double amount)

Store employees in an array.

Display all salaries using:

Employee[] emp

and

emp[i].computeSalary();

This single problem practices all 7 topics at once and is excellent exam preparation.