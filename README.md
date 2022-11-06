# Jets Program

# Description

The Jets program was created to reinforce ideas of the four pillars of object oriented programming.
Those 4 pillars being: Abstraction, Polymorphism, Inheritance, and Encapsulation. In this program we were required to create
and abstract Jets class that would extend to all of our other classes. Each class would extend the original Jets class inheriting all of the fields originally attached to it. These fields included the model, speed, price, and the distance each jet could travel. Effectively being "polymorphed". Within this abstract Jet class, the data also had to be well encapsulated, however, it could not be private because of the rules of inheritance. This states only that class can see its private data. Therefore the solution to this problem was to make the abstract Jet class's data "Protected". This way each child class would have access to the original fields. Once each class was set up with it's proper constructors and fields, the next task was to read data from a text file and properly parse that data into an Array List data structure. An Array list was chosen due to its ability to add and subtract items from the program which the user has control over. Separating the data was quite simple, all that needed to be done was to parse each section of data, i.e. name, speed, range, and price, into their respective data types, string, double, double, and long. Once that was complete I added those data points to what I called the "fleet" or my collection of Jets.

Once the classes were established, I had created interfaces within a couple of the classes. Those interfaces being "Combat Ready" and "Cargo Carrier". Each of these interfaces were simple in nature. Just allowing the user to scramble certain jets for combat and load cargo for others.

After all of the data was in place I constructed the actual program, or the user interaction sections. many of these cases iterated through my fleet using a foreach loop printing out the required parameters of the assignment. Most notably adding and subtracting jets from the fleet. The user has complete control over how they name their jet, how fast it can go, the price, and the distance. once the Jet is created the user has the ability to view their jets in the already pre-constructed fleet. Users can also remove Jets from the fleet, even ones that were already created when the program begins. This was done through the use of constructors and the use of the Array List collection.

#Technologies used
. Atom
. GitHub
. Git
. Eclipse
. Terminal


# Lessons Learned
Throughout the course of this assignment I have learned the importance of the four pillars of Object Oriented Programming. Polymorphism being my favorite so far. I find it fascinating to be able to create a blueprint of a data type and then implement that data type into my program. It makes creating programs much easier I think. I learned that I still am lacking in the practice aspect of actually implementing code into my programs. I feel I have a strong understanding of the topics working in this program. However, typing is still difficult for me. I also learned the importance of pseudo code and outlining how I would like things to be done. In previous assignments I struggled to get my programs off the ground. But outlining my ideas first came in handy when dealing with the larger ideas in this assignment. Dry code was also very important to me in this assignment. I tried to create my airfield using if statements before I changed to a switch statement and it made my code borderline unreadable. Making edits was a pain. Keeping my code dry has taught me, the drier the code the less the errors. Finally I learned when creating classes through an abstract class, if you want to manipulate anything like changing the speed of a Jet, a brand new method must be created to achieve this. I often messed with the getters and setters of speed to change the speed to mach. But I finally created a new method and added it to each of my toStrings and it worked like a charm. I didn't have to overly edit. Finally, the last thing I learned from this homework assignment was to always add comments to my code. It further reinforces the lessons I am learning in class and why some things work, and others don't


	
