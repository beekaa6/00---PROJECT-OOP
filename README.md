# Java Week 3: Clean Project and Object-Oriented Programming (OOP)
### The Mission
The goal of this challenge is to introduce you to the concepts of Object-Oriented Programming (OOP), unit testing, and build tools in the context of Java. You will be building a data analysis command-line tool that processes a CSV file (see Resources folder) containing information about how Covid-19 has affected trade as of July 2021. The program should accept commands as inputs and process them immediately, handling only one command at a time. The commands can also receive parameters, which can either be immediately passed with the command or prompted from the user after the command is entered. Here is the list of mandatory commands your program should recognize:


- `help`: Returns a list of available commands with a brief description.
- `help <command>`: Provides a full explanation of what the "" does and the parameters it requires.
- `monthly_total`: Returns the sum of both the export and import for a specified month of a specified year.
- `monthly_average`: Returns the average of both the export and import of a specified month of a specified year.
- `yearly_total`: Provides an overview of all the monthly totals for a particular year. This command returns the total of each month for both import and export and then gives the yearly total for both import and export.
- ```yearly_average```: Provides an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export.
- ```overview```: Returns all the unique values that span the data set: years, countries, commodities, transportation modes, and measures.

The commands `monthly_total`, `monthly_average`, `yearly_total`, and `yearly_average` have the following parameters available to customize their query:

- `country` (default: "all")
- `commodity` (default: "all")
- `transport_mode` (default: "all")
- `measure` (default: "$")


In addition to writing the program, you must also write tests (unit tests or integration tests) to streamline the debugging process. You will also use the build tool Maven to manage the project and its dependencies. Although these steps may seem like extra work, they have the potential to save you lots of time during more extensive future projects. Always make sure to write tests and automate project management!

Once you have completed the implementation, take a step back and ask yourself the following questions to improve your code and OOP implementation:

1. How difficult is it to add another command to your program? How can you make this process easy?
2. What if some users do not want a command-line tool and prefer a UI instead? How hard is it to change this in your program? How can you make this easy to do?
3. What if some users want the results written to a file instead of being displayed in the terminal window? How hard is it to change this in your program? How can you make this easy to do?
4. The previous questions ask for changes in the core of your program, changes in input, and changes in output. Is this a coincidence? What does this tell you about programming and programmatic solutions in general?

The power of object-oriented programming lies in being able to abstract stakeholder requirements (the "whats" the program needs to do) into simple APIs that can be implemented in different ways using polymorphism. For this to work effectively, you need classes/modules that can function independently, meaning what these classes/modules need to function is encapsulated within the class.

> **WARNING**: To comfortably tackle this exercise, you should already be able to create rudimentary Java programs. You should know the basic syntax, be able to create classes and interfaces, and have a good understanding of collections and generics. It's okay to look up some edge cases such as APIs or keywords; the basics are what you should already be familiar with.

