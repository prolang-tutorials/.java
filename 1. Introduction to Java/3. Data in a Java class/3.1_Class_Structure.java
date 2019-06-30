/*
Everything in Java is constructed based on 'classes' or objects. As mentioned
before, classes consist of either data, or methods. The most important thing to
remember, everything (and I mean everything) revolves around an object. No
information is stored without an object, no data is manipulated, no calculations
done, nothing. Java files themselves are named after the object that is being
created.
*/
//To initate an object, start with public class _______
public class 3.1_Class_Structure.java {
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
    void; //This one is complicated to work with. Essentially, void means there
    //is nothing. Nothing, as in no memory stored, not as in 0. When we store
    //the value zero, we're storing the byte '0', however with void, it tells the
    //computer that 'Go away, there is nothing here. No memory.'. 
}
