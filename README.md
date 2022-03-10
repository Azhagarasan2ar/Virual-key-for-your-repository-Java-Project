
# Virual-key-for-your-repository-Java-Project
# Project Title: Virtual Key For Your Repositories
***Developer Name:Azhagarasan A***
### Project objective: 
As a Full Stack Developer, complete the features of the application by planning the development in terms of sprints and then push the source code to the GitHub repository. As this is a prototyped application, the user interaction will be via a command line. 
### Project Description:
This project is based on user experience prototype. In this project user can get file manipulation experience they can able to add, delete, search file and also user can get list of files present in the folder in ascending order. 

I desinged this project in strategy  pattern which is one of the type of behavioral design pattern so it will intisitilize object  of the selected class only so we can to use  less memory in heap area.First I created Interface(Locker) then I created Four class(AddFile,Delete File,SortFile,SearchFile)  in each and every of this four class I implemened the  method from Locker interface called doOperation. But each class have different implementation of that same method so that I can over ride that method easily. I created context class then I created constructor of this class to instialize the object of selected class of that four class(AddFile,Delete File,SortFile,SearchFile)  this construct get the instansiation of this object through call by value from main method  which is according to user option.I initialize object of context class in main method.For user intraction I created a new class in this class I can get input from user.

### Sprints:
***Sprints number: 3(Timebox  1 week 1 sprint)***
 **Product story:** Collect the requirement such that the user story is: Independent Negotiable Valuable Estimatable Small Testable.
	In each sprint create a reasonable product. Design product paradigm ,design modules ,integrate modules and test.
	Sprint planning with Product Owner ,Scrum Master and Devolopment  Team. Daily Scrum to discuss and evaluate the progress.
	**Sprint Review:**Elicit feedback and foster collaboration. End of each week. At the end, the product is presented to the product owner for acceptance or refusal.
	**Sprint Retrospective:** Meeting to plan and decide on enhancing and integrating in the next project.

### Program Algorithm:
Start the program.
It will print the welcome message, company name and developers details.
Then it will print the statement 1)File List 2)Business operation 3)Exit .
	Waiting for input to and get the input from user.
	If the the input is one it display the files in ascending order if no file exist it
	Print the message like no file present and loop to the print statement.
	If the the input is 2 it print the statement  1)Add 2)Delete 3)Search 4)Home.
	And  waiting for input from user.
	If the input is one it will go to add operation and ask for name to add.
	Waiting for user input and get the user Input.
	And  do add operation if the file already exist it shows file already exist message
	and loop to Business Operation and ask for input
	If the input is two it will go to delete operation and ask for file name to delete.
	Waiting for user input and get the user Input.
	And  do the delete operation if the file already exist it shows file doesnot exist message
	and loop to Business Operation and ask for input.
	If the input is three it will go to serarch operation and ask for file name to search.
	Waiting for user input and get the user Input.
And  do the search operation it check the file name in the folder.If file name doesnot match  shows file doesn’t exist message and loop to Business Operation and ask for input.
	If the input is four it loop  to home menu.
And Then it will print the statement 1)File List 2)Business operation 3)Exit .
	Waiting for input to and get the input from user.
	If the input is three It will terminate the program.
  
### Flow Chart:

![Flow Chart](https://lucid.app/lucidchart/b6b3bf18-affb-4bc3-9473-d8ea7b8c7e7f/edit?page=0_0#)

 
### Tools used in this Project:
***IDE:***Eclipse 
***Language Used:*** CoreJava
Git,GitHub,Scrum

***Concept used in the Project:
	Abstraction,Encapsulation,Inheritance,Hieraricl Inheritance,Polymorphism(method overriding,constructor overloading),Exception handling,File Handling,Array,Collection Framework .***

### Datastructure and Algorithm:
 	***Sorting:*** Heap Data Structure(min-Heap for sort ascending order)And Heap sort algorithm.
	***Searching:*** Array Data Structure And Linear Search Algorithm and I use hashing technique to generate hash code of two string for string comparision.Two same string can generate same hashcode but we don’t assure that two different string can get different hashcode.In rare scenario it can generate same. So First it check two length of string then hashcode if two hashcode are same it check each char of both string.

***Unique Selling Point: This project designed with well structured design Pattern so it will improve the user experience and more memory efficient. By using reliable data structure it will improve the quality of the product. It is user friendly so file manipulation are done easily. Stored procedures to reuse the code connect with database to implement on multiple devices.***
	This prototype is more focused for user friendly and more efficient in user experience on file handling it can also further improve for future use.
Github:







