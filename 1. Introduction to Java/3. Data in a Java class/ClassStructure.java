
/*
Everything in Java is constructed based on 'classes' or objects. As mentioned
before, classes consist of either data, or methods. The most important thing to
remember, everything (and I mean everything) revolves around an object. No
information is stored without an object, no data is manipulated, no calculations
done, nothing. Java files themselves are named after the object that is being
created.
*/
//To initate an object, start with public class _______
public class ClassStructure {
/*
In Java, Data is stored in two types of data, primitive and abstract. I will
include more information on the differences between the two, but as it sounds,
one is more complicated than ther other.
*/
    //in Java, numbers have quite a few ways of being stored, the most obvious
    //are integers. They function like in standard math, no decimals, and several
    //operators apply to them. Remember, information is only stored once it is
    //initiated (i.e, when the int is included).

    //We will be talking in more detail about each of these data types, but a
    //brief summary is included.
    int integer; //Stores a basic integer, no decimals.
    //Other numerical storing data types are listed below:
    short short_int; //I don't really recommended using this type, as it is
    //basically int with restrictions (can't go as high, can't go as low)
    long long_int; //This type is like integer, but includes several different
    //features such as higher max values and lower minimum values.
    double double_number; //This is a data type that stores up to two decimal
    //points, such as 3.33, or 5.55. It does not store past two decimal points.
    float float_number; //This is a data type that stores decimal values of any
    //length. However, I recommended capping these values or sticking with
    //simpler numbers, because this takes up a lot of cache (storage).

    //There are data types that store text.
    String text; //This data type stores text of any length and any value.
    //(e.g "This is text" or "Hello World!") What is interesting and should be
    //kept in mind is that String's are not primitive data types, they're abstract.
    //Usually, they are just kept as an array of char values.
    char character; //Speaking of chars, char data types store a single character
    // in a unicode value. Meaning that chars have both a numerical value and a
    //textual value. (i.e, char's can be numbers such as 65 which also represent
    // an unicode value of 'A'). Capitalization does make a difference.
    byte bytes; //Bytes are interesting, as they store data at its most core concept
    //of bytes. Research more about it, because it is quite interesting.

    //The other types of data are the most basic types.
    boolean true_or_false; //The boolean data type stores either of two values.
    //True or false. Quite literally, there is no other type of data that booleans
    //can store.

    public ClassStructure() { //This 'method' is a special method. This is
    // due to one fact, the name of the method is the same as the name of the class.
    //This means that this 'method' is a constructor. A constructor modifies or
    //is used when the object is called, and allows us to call functions or change
    //variables upon initalization. There can be multiple constructors, each with
    //different arguements.
        text = "Each called variable, unless it has 'final' in it, can be modified";
    }
    public ClassStructure(String arguements) {
        text = arguements; //Since constructors can take arugements, it is possible
        //to modify instance variables upon initalization.
    }
    public void print_method() { //This is a more standard method. The structure
    //of creating a method is simple. The first word in a defining a function defines
    //its 'scope' or what has the ability to access this. See, 'public' means that
    //any object with the pointer to this class can access it, and 'private' means
    //only internal classes can access the method.
    //The second word is the return type of the function, i.e, what does the function
    //produce. Functions can return any primitive or abstract data, and a special
    //type called 'void'. When returning type void, the function doesn't need to
    //return any value.
    //The last word is the name of the method. Like the constructor, methods can
    //be changed to accommodate different arguements. See below.
        super_secret_print("Super secret message"); //Methods can call upon
          //other methods, as shown. Only internal methods can call upon 'private'
          //functions.
    }
    private void super_secret_print(String arguements) {
        System.out.println(arguements);
        //This is one of the most basic types of functions, an essentially is a
        //print function. There are many types of prints and I recommend looking
        //at the documentation for it themselves. However, notice the structure.
        //The 'super' class or originating class is 'System'. After that, its
        //'out'. Essentially, what is happening is that we're accessing the class
        //'System', and then the instance variable 'out', which is an object
        //that contains the default output methods of Java.
    }
    public static void main(String[] args) { //This is one of the more complicated
      //methods. Some objects have a 'main' method or a driver method. Whenever an
      //object is initizliated, the main method is automatically called. From here,
      //you can do all kinds of things, but is generally the kickstarter to any
      //Java program.
      ClassStructure obj = new ClassStructure("Arguement");
      //here we are creating a new object, which is the class object here. For any
      //method except the main method, we dont need to use an object to call upon
      //nternal methods, but we do for the main method. This is crutial to remember.
      obj.print_method(); //Here, we are calling upon the function that we created
      //earlier, the print_method() function.
      System.out.println(obj.text); //See, this is more complicated. Remember,
      //you can spot a function with a pair of (). Whenever we are not calling a
      //function, then we're accessing data, which is exactly what we're doing here.
      //We are accessing the text variable, which we talked about above.
    }
}
