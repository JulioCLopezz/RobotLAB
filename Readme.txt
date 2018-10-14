Name: Julio Cesar Jesus Lopez Jimenez
Student Number: 2016113

My code does the following actions:
RobotLab.java: is the main method of this programme from thi file the programme call
the other method that its need to run and show the robots moving in processing.

Alice.java: in this file is all the behavior related with ALice. This is the 
robot that have patrol movement. This robot is just rounding the whole window 
around its borders. The patrol done there is only clockwise.

Bob.java: this file is for the robot that have random walk. There, this robot is 
moving around the area from one wall to another in different directions.

Charlie.java: This file is for the remote robot. The you can manage it using 
the numerical keys (from 1 to 9) with constant speed. Where:
 1- Its used to move the robot decreasing 'X' and increasing 'Y'.
 2- Its used to move the robot increasing 'Y' and no change in 'X'.
 3- Its used to move the robot increasing 'X' and 'Y'.
 4- Its used to move the robot decreasing 'X' and no change in 'Y'.
 5- Its used to stop the robot and show current position.
 6- Its used to move the robot increasing 'X' and no change in 'Y'.
 7- Its used to move the robot decreasing 'X' and 'Y'.
 8- Its used to move the robot decreasing 'Y' and no change in 'X'.
 9- Its used to move the robot increasing 'X' and decreasing in 'Y'.


To compile my code do the following steps:
1- First of all extract the file that are in this compressed folder. For example
in Documents.
2- After that copy core.jar folder from library in Processing inside this 
folder (after extract all the files *.java).
3- Open a terminal or command prompt.
4- Surf into your computer by using terminal or command prompt to the folder or 
directory where you located and extracted my folder.
5-Once inside this folder or directory in your command prompt or terminal write
down "javac -cp .:core.jar RobotLab.java Bob.java  Charlie.java Alice1.java" 
to compile.
6-After that the computer will check the files and will show if everything is 
ok or not.
7- Next and final step is type on command prompt or terminal "java -cp 
.:core.jar RobotLab" to run it.
8- Then, it will open a window of 500 pixel x 500 pixel showing the robots, 
one running around the borders clockwise, another moving from one wall to 
another and another that you will drive with numerical keys (numbers from 1 
to 9).
9- to close the window and stop this programme, type "break" or press 
'ctrl' + 'c'.
10- thanks for your time.  

 
