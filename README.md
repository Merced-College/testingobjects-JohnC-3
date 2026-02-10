[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22563877)
# testingObjects

this is an example of a ReadMe file.


Checkpoints:
Q1: Printing an object with no toString will display the object's name followed by an @ and the hex hash code. This is due to the default toString being in that format.

Q2: name = null, age = 0, breed = null; name and breed are reference types, age is a primitive type.

Q3: Constructors actually initialize the variables with a default value instead of keeping the default value set by Java.

Q4: The printout in part D displays the values of the variables in a list, while part A's printout just displays the object's name and hex hash code with an @ in between. This is because we used @Override to override the original toString that is set in Java by default to display what we want to display.

Q5: Private fields with getters and setters is prefered over public fields because not everybody should be able to access and change that information. For example, in an online store, customers should not be able to change the price of items, only the store managers should be able to do that.


Reflection Questions:
2. name = null, clawsTrimmed = false, eyeColor = null

4. @Override is added to toString() because toString() is already in Java by default. It is best practice to use @Override when defining a new toString() to avoid any unwanted errors. If it is not used, you could misspell toString and end up creating a whole new method and the default toString() would not be overrided.