
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
 **Product story:**
Collect the requirement such that the user story is: Independent Negotiable Valuable Estimatable Small Testable.
In each sprint create a reasonable product. Design product paradigm ,design modules ,integrate modules and test.
Sprint planning with Product Owner ,Scrum Master and Devolopment  Team. Daily Scrum to discuss and evaluate the progress.
**Sprint Review:**Elicit feedback and foster collaboration. End of each week. At the end, the product is presented to the product owner for acceptance or refusal.
**Sprint Retrospective:** Meeting to plan and decide on enhancing and integrating in the next project.

Company Lockers Pvt. Ltd. hired you as a Full Stack Developer. They aim to digitize their products and chose LockedMe.com as their first project to start with. You’re asked to develop a prototype of the application. The prototype of the application will be then presented to the relevant stakeholders for the budget approval. Your manager has set up a meeting where you’re asked to present the following in the next 15 working days (3 weeks): 

Specification document - Product’s capabilities, appearance, and user interactions

Number and duration of sprints required 

Setting up Git and GitHub account to store and track your enhancements of the prototype 

Java concepts being used in the project 

Data Structures where sorting and searching techniques are used. 

Generic features and three operations: 

Retrieving the file names in an ascending order

Business-level operations:

Option to add a user specified file to the application

Option to delete a user specified file from the application

Option to search a user specified file from the application

Navigation option to close the current execution context and return to the main context

Option to close the application

 

The goal of the company is to deliver a high-end quality product as early as possible. 
 

The flow and features of the application:

Plan more than two sprints to complete the application

Document the flow of the application and prepare a flow chart 

List the core concepts and algorithms being used to complete this application

Code to display the welcome screen. It should display:

Application name and the developer details 

The details of the user interface such as options displaying the user interaction information 

Features to accept the user input to select one of the options listed 

The first option should return the current file names in ascending order. The root directory can be either empty or contain few files or folders in it

 The second option should return the details of the user interface such as options displaying the following:

Add a file to the existing directory list

You can ignore the case sensitivity of the file names 

Delete a user specified file from the existing directory list

You can add the case sensitivity on the file name in order to ensure that the right file is deleted from the directory list

Return a message if FNF (File not found)

Search a user specified file from the main directory

You can add the case sensitivity on the file name to retrieve the correct file

Display the result upon successful operation

Display the result upon unsuccessful operation

Option to navigate back to the main context

There should be a third option to close the application

Implement the appropriate concepts such as exceptions, collections, and sorting techniques for source code optimization and increased performance 


  
### Flow Chart:

![Blank diagram (2)](https://user-images.githubusercontent.com/100947706/157736730-5bc7c3a3-a780-4bc4-9bf3-cbfc1b950bd2.jpeg)

 
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









