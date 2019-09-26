# CS2011Midterm
Java Program using Console I/O


Write a Java program that does the following tasks one at a time. Use Console I/O, not JOptionPanes. 
The program must not crash on invalid input, including input that can not be parsed to the data types you need.

Use loops for data validation.

 

Asks the user for his or her best-ever bowling score, which must be an integer between 0 and 300. 
(Bowling in this case refers to the sport of bowling, not cricket.) Validate both the data format and the numeric range. 
If the user enters input that can't be parsed to an int, tell him/her the problem. Keep asking until you get a valid score. 
When you have one, print a message that says that the user is a poor bowler (best score under 100), 
a competent bowler (at least 100, less than 200), or a good bowler (200+).


Asks the user to enter his or her weight in pounds and keeps asking until s/he enters a valid double between 90.0 and 300.0, 
then calculates the user's weight in KG by dividing by the conversion constant 2.205, which should be a final. 
When the result is calculated, output it using System.out.println. Provide appropriate error messages with any invalid input.


Asks the user whether s/he lives nearby, which is defined as within 5 miles of campus, and whether s/he is tall, 
which is defined as being at least 5 feet 10 inches tall. Take input for these two values in two separate do...while loops, 
validating the input separately, and store them both in booleans. 
Provide output that shows: 
a) whether the user either lives nearby or is tall; 
b) whether the user either doesn’t live nearby or isn’t tall 
c) whether the user has the same values for both of the Booleans, ie if s/he either lives nearby and is tall 
or does not live nearby and is not tall; 
d) whether the user is tall if s/he weighs more than 45 KG, using the input from the last section. 
Use logical operators, rather than nested if statements, in the conditions.
