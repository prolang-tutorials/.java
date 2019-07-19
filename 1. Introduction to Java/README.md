# The Basics of Java

This section of the .java lessons cover the very basics of Java, with information such as classes, variables, functions, I.e, the basics of basics of programming. If you're already familiar with programming, this section isn't neccessary, however, it might be beneficial to learn the syntax if the language. 

# Overview of Java's Syntax

* ## **[Declaring Variables](https://github.com/prolang-tutorials/.java/blob/master/1.%20Introduction%20to%20Java/3.%20Data%20in%20a%20Java%20class/3.1_Class_Structure.java)**
    ```java
    String text = "text";
    ```
    Like many other C derived languages, variables in Java require three fundemental aspects. The data type, (in this case a String type), the reference address (the name of the variable, in this case text), and the content of the variable (in this case "text"). Note that the content of any variable can always list to a '**null**' data type. Listed **[here](https://github.com/prolang-tutorials/.java/blob/master/1.%20Introduction%20to%20Java/3.%20Data%20in%20a%20Java%20class/3.1_Class_Structure.java)** is where I cover the basics of primitive data types. 

* ## **[Declaring Functions](https://github.com/prolang-tutorials/.java/blob/master/1.%20Introduction%20to%20Java/3.%20Data%20in%20a%20Java%20class/3.1_Class_Structure.java)** 
    Also similar to many other languages, Java natively supports the use of calling and creating functions for custom objects.
    ```java 
    public int function(int arguement) {
        return arguement; 
    }     
    ```
    Declaring a function is simple, and a properly declared function consists of 4 aspects. The first is the *scope* of the function. This references which objects are allowed to access the function, the default for this is public. **Public** functions are accessable by all objects that call on it, while **private** functions are only accessable within the same object. The second aspect to a function is the data type in which it will return. Please note that functions can also return abstract data types, such as objects. The third aspect of a function declaration is the function name, and the final aspect is the arguements in which the function can take. Also note that functions can access instance variables of an object.
    ```java
    System.out.println(object.function(arguement));
    ```
    Above is an example of how to call a function. The object in which this function rests in is called object, the function name is function, and the arguement is variable that stores an integer. In this case, it will print out the arguement. Essentially, functions are ways to manipulate data in an organized fashion. 