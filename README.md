# Assignment 1
## Java Programming

This first assignment is about basic Java programming using sequence, selection and iterations as well as arrays and methods. The following tasks are *necessary* to pass the course, but you will most likely need to do more than the task in this assignment to fully understand how Java works. 

The tasks themselves are seldom small in this assignment. The idea is that, by doing them, you cover most of what is fundamental of Java. You are also not new to programming. Therefore we have made few but fairly large tasks.

> Carefully read the assignment rules as defined on Moodle. In brief, do the assignments yourself, hand them in at the deadline and don't cheat.

> Do not hesitate to ask your teaching assistant at the practical meetings (or the teacher at the lectures) if you have any problems. You can also post a question in the Slack channel for the course.

> **Submission:** you submit your solution using git and GitLab following the instructions given for the course.

### First Program
Compile and run the following program in your IDE of choice to make sure everything is working as expected.

```java
/* The classic "Hello World!" program. */
public class Hello {
   
    public static void main(String[] args) {
       System.out.println("Hello World!"); // Print
    }
}
```

### Time
Write a program **Time.java**, which reads a number of seconds (an integer) and then prints the same amount of time given in hours, minutes and seconds. Hint: Use integer division and the modulus (remainder) operator. This is the same as in the Python course, so if you have taken that, you can reuse and "translate" your solution. An example of an execution: 

```
Give a number of seconds: 9999
This corresponds to: 2 hours, 46 minutes and 39 seconds.
```

<!-- ### Random Dice
Create a file called **RandomDice.java** that, when run, ask the user for how many six sided dice they would like to roll. When the user has answered, the program should roll that many dice and show them comma separated. Do not forget to check for only positive values and not to put a comma after the last rolled die.

```
How many six sided dice would you like to roll? 4
1, 6, 3, 5
``` -->

### Hit a nine
In this task you are to create a program called **Nine.java** which will simulate a simple game using selection (no iteration, only one play-through per execution). The game is one using two normal six sided dice. You play against the computer and the objective is to get as close to nine as possible, but not more.

The game works as follows. Both you and the computer have two possible dice to roll. First you roll a die and then decide if you would like to roll another. When you are done, that is if you decide to roll another or to skip the second roll, it is time for the computer to do the same. The computer rolls the first die and if it is four or lower, it will roll anther, otherwise it will skip the second roll.

When both players have done their rolls, the program should calculate who, if anyone, won. As stated, the one closest to nine wins, unless it is ten or more. If either player gets ten or more, the player is declared "fat" and automatically loses. 

```
Playing a game
=================

Ready to play? (Y/N) Y
You rolled 3
Would you like to roll again? (Y/N) Y
You rolled 6 and in total you have 9
The computer rolled 3
The computer rolls again and gets 4 in total 7
You won!
```

<!-- ### Counting Numbers
Create a program called **CalcNumbers.java** that asks for integers (positive or negative) until the user enters 0. When 0 is entered, the program should display the sum of all the numbers that were entered. See an example execution below:

```
Give me a number: 5
Give me a number: 3
Give me a number: -6
Give me a number: 4
Give me a number: 0
The sum is: 6
``` -->

### Dangerous Work
You have decided to take on some very dangerous work with some rather strange payment. For each day you stay at the work, the salary is doubled -- it will begin with 0.01 of a Swedish krona (also called 1 "öre") the first day and it will be 0.02 the second, 0.04 the third, 0.08 the fourth and so on. Write a program called **DangerousWork.java** that helps you calculate your salary based on number of days you work. You do not need to validate the input, but you should keep in mind that you probably won't survive working more than 30 days... See an example of the program running below:

```
How much would you like to earn? 1000000
You will have your money in 27 days.
```

### Diamonds
This task is to create an *diamond of stars* by having the user input a positive number which corresponds to the height till the middle of the diamond. In this task the user will be able to create new diamonds until a negative number is entered and you should also check for validity of the input. This task should be completed *without* using *StringBuilder* to create strings, but rather by printing stars directly. Call the program **Diamonds.java** and see an example execution below:

```
Give a positive number: 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
    
    
Give a positive number: 3
  *
 ***
*****
 ***
  *
Give a positive number: -3
```

### Scissor, rock, paper
Write a program called **GameSRP.java** that plays the popular scissor-rock-paper game where a scissor can cut paper, a rock kan nock a scissor and a paper can wrap a rock. The program asks the user for one of the options (1 for scissor, 2 for rock or 3 for paper) and then randomly picks one of them for the computer. It then presents if you or the computer won, or if it was a draw. If the user enters 0 the program will end and display the total score (number of wins for you and the computer and the draws). Here is a sample run:

```
Scissor (1), rock (2), paper (3) or 0 to quit: 1
You lost, computer had rock!
Scissor (1), rock (2), paper (3) or 0 to quit: 2
It's a draw!
Scissor (1), rock (2), paper (3) or 0 to quit: 3
You won, computer had rock!
Scissor (1), rock (2), paper (3) or 0 to quit: 1
You lost, computer had rock!
Scissor (1), rock (2), paper (3) or 0 to quit: 2
It's a draw!
Scissor (1), rock (2), paper (3) or 0 to quit: 3
You won, computer had rock!
Scissor (1), rock (2), paper (3) or 0 to quit: 0
Score: 2 (you) 2 (computer) 2 (draw).
```

### Day of week
The following formula can be used to determin the day of week:

$` h = \begin{pmatrix} q + \frac{26(m+1)}{10} + k + \frac{k}{4} + \frac{j}{4} + 5j \end{pmatrix} \% 7 `$

where 
- h is the day of week where 0 is Saturday, 1 is Sunday and so on.
- q is the day of the month.
- m is the month, where 3 is March, 4 is April. Notice that January and February are counted as months 13 and 14 for the previous year.
- j is $`\frac{year}{100}`$.
- k is the year of the century (year % 100).

Note that all divisions in this task are integer divisions. Write a program called **DayOfWeek.java** that asks for a day and prints the name of that day. You do not need to do any error checks (like leap day of a year that does not have one, or even day 31 in April). 

Below are three test runs of the program, it does not have to restart after displaying a day:

```
Enter year: 2015
Enter month (1-12): 1
Enter day of the month (1-31): 25
Day of week is Sunday

Enter year: 2012
Enter month (1-12): 5
Enter day of the month (1-31): 12
Day of week is Saturday

Enter year: 1975
Enter month (1-12): 8
Enter day of the month (1-31): 21
Day of week is Thursday
```

### The Ant
Imagine a chess board and an ant. The ant is randomly put on the board and after that it can walk up, down, left and right (not diagonally). The ant cannot walk over the edge of the chess board (if it tries, it is not counted as a movement -- see it as a wall around the chess board). The task is to create a program called **Ants.java** that simulates the walking over the chess board of an ant. To walk to another square than the one the ant is currently on is called a "step" (even though it will take the ant several steps to move...). Each simulation should calculate the number of "steps" the ant takes to visit all squares on the chess board. The simulations must be done ten times and an average should be calculated at the end of the simulation. An example run of the simulation is shown below:

```
Ants
=====

Number of steps in simulation 1: 708
Number of steps in simulation 2: 818
Number of steps in simulation 3: 953
Number of steps in simulation 4: 523
Number of steps in simulation 5: 671
Number of steps in simulation 6: 338
Number of steps in simulation 7: 535
Number of steps in simulation 8: 702
Number of steps in simulation 9: 548
Number of steps in simulation 10: 418
Average amount of steps: 621.4
```

### Converting Hexadecimals to Decimals
A hexadecimal number like AB8C can be converted to a decimal number, in which case it will become 43916. The way to do this is as follows:
$`10 \times 16^3 + 11 \times 16^2 + 8 \times 16^1 + 12 \times 16^0 = 43916`$

Create a program called **Hex2Dec.java** that has a method called **hexToDecimal(String hex)** that returns the deciaml value for a string containing a hexadecimal value. You do not need to do any error checking for the string but you might need to have additional methods to support the mandatory method. Below is an example run of the program:

```
Enter a hex number: af71
The decimal value for af71 is 44913.
```

### Print Calendar
In this task you are going to create a program that prints a nice calendar overview of a month and year specified by the user. The program should be called **PrintCalendar.java** and it should begin with asking the user for a year and a month. The program will then print an overview of the month with days and the number for each day (see below.)

Important in this course is that you need to create a suitable number of methods in your program. You will not pass if you do everything in main. With suitable, we expect you to do five to ten different methods, each well defined and only doing one thing.

You do not need to validate user input too much, you need, however, to be able to calculate for example leap year and so on. You do not need to handle years before 1800. You should **not** use the built in Java class for calendar. Also, the week starts on Mondays :smiley:

```
Enter a year after 1800: 1975
Enter a month (1-12): 8
August 1975
-----------------------------
 Mon Tue Wed Thu Fri Sat Sun
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
```

Another example:
```
Enter a year after 1800: 2020
Enter a month (1-12): 11
November 2020
-----------------------------
 Mon Tue Wed Thu Fri Sat Sun
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28  29
  30
```