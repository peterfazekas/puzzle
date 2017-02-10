# Puzzle
A web page publishes an interesting puzzle every week. In the puzzle lighthouses are placed on a field of N×M squares. These towers have numbers assigned to them. The task in each case is to place X ships on the field so that the total number of ships seen from a given tower (horizontally and vertically) corresponds to the number in the square representing the tower.
The rules for the ships are as follows:
- Each ship fits into one square.
- The ships may not touch each other, not even diagonally.
- The ships may not touch the lighthouses, not even diagonally.
- The ships do not cover each other. That is, from the lighthouse all ships in a line are visible.
For example:
In the case of a field of 5×4 squares and 3 ships
Similarly to the previous weeks, 12 ships should be placed in a field of 10×10 squares on the web page. The solutions submitted by the contestants are concatenated into a txt file by an application. The first line of this file gives the number of solutions, whose maximum value is 20. Before each solution the name of the solver is given. In the individual solutions number 0 stands for water, numbers between 1 and 9 stand for lighthouses and number 11 stands for ships. In the file the numbers are separated by one space.
For example:
A part of file solution.txt. (For better understanding the example is displayed in an ordered table.)
  <pre>
  10
  Absolon
  0 0 0 0 11 0 11 0 0 0
  11 0 2 0 0 0 0 0 0 11
  0 0 0 0 0 1 0 11 0 0
  0 0 0 11 0 0 0 0 0 0
  0 3 0 0 0 0 0 0 11 0
  0 0 0 0 2 0 11 0 0 0
  0 11 0 0 0 0 0 0 3 0
  0 0 0 0 0 0 3 0 0 0
  0 11 0 3 0 0 0 0 11 0
  0 0 0 0 0 0 11 0 0 0
  …
  </pre>
So there is a lighthouse in column 3 of row 2, whose row and column contain a total of 2 ships. There is one ship in column 1 of row 2 and one ship in column 10 of row 2. Create a program that checks the correctness of the solutions submitted for the puzzle. Save the source code of the program as puzzle.
Before the solution of each exercise part display the number of the exercise part on the screen. If you request data from the user, display the value to be entered on the screen (for example in exercise part 1 display: “Give the data of the lighthouse.”). Displays with or without accents are accepted as well.
In the solution of the exercise parts we assume that the read data are correct, so you do not have to check these anywhere.

1. Request the position of a lighthouse (the row and column numbers of the tower) and the number of ships visible from the lighthouse on a field of 10×10 squares from the user. It is better to start the checking of the solution of the puzzle with lighthouses whose assigned number is high. So if the value assigned to the lighthouse is greater than three then display “Difficult lighthouse.” on the screen, in other cases do not display anything.

2. Based on the position of the given lighthouse determine which squares around the lighthouse can not have ships on them according to the rules. Display the result on the screen so that the row and column identifiers of the forbidden squares are displayed separated by commas in one line each. For example, if there is a lighthouse in position 2, 3, then:
(1,2) (1,3) (1,4) (2,2) (2,4) (3,2) (3,3) (3,4)

3. File puzzle.txt contains this week’s puzzle in the already known format. Read the puzzle from the file and from the submitted solutions that are in file solution.txt filter out those that were not submitted for this week’s puzzle. Display the name(s) of this (these) solver(s) on the screen. If each solution was submitted for this week’s puzzle, then display “Each solution was submitted for this week’s puzzle.” on the screen!

4. Out of the solutions that were submitted for this week’s puzzle determine which solutions contain fewer or more ships than 12. Display the number of incorrect “solutions” from this aspect on the screen.
5. How many incorrect solutions were submitted for this week’s puzzle where:
– the number of ships is correct and
– the position of one or more ships does not correspond to the rules concerning adjacency?
Display the result on the screen.

6. Determine the number of correct solutions submitted. When checking the solutions consider the contents of the previous exercise parts and whether the lighthouses see the number of ships that correspond to the numbers assigned to them. Display the names of the submitters of correct solutions on the screen.
