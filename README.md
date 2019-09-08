# SmallInt

# Description 

* This assignment asks you to write a Java class called **SmallInt** (similar to a wrapper class). 
* It also asks you to create a testing class called **TestSmallInt**.

* **SmallInt** contains the following: 

    • A private instance variable of type int named value, which is the value of an integer stored by the class constructor. 
 
    • A public static constant named MAXVALUE. MAXVALUE should be used as an upper limit for the values SmallInt can represent. You should set MAXVALUE to 1000. However, keep in mind, the grader may change the value of MAXVALUE when testing your program.   
 
    • A constructor that assigns an integer between 0 and MAXVALUE (inclusive) to value. That's all the constructor has to do, using the int parameter that is passed to it. However, the constructor must check to make sure the parameter value is between 0 and MAXVALUE. If it is not, it should print an informative error message and store the number 0 instead.
 
    • An instance getter method *getDec* (returns a String, no parameters) which will return a String representation of the decimal integer.    
 
    • An instance setter method *setDec* (returns void, accepts one int parameter) which assigns an integer between 0 and MAXVALUE to value. However, this setter must check to make sure the parameter value is between 0 and MAXVALUE. If it is not, it should print an informative error message and store the number 0 instead.

    • An instance getter method *getBin* (returns a String, takes no parameters) should take the number stored in the instance variable value, generate the corresponding binary string and return that string. **You should not use any built in function or library in Java.**   

    • An instance getter method *getHex* (returns a String, takes no parameters) should take the number stored in the instance variable value, generate the corresponding hexadecimal string and return that string. Just like with getBin, your implementation must consist of only your work.  
    
    • A static method *sameValue* (returns a boolean, accepts two String parameters) should take a binary representation of an int and a hexadecimal representation of an int, convert the bin to hex OR convert the hex to bin, then compare the Strings to see if they are equal. The result of this comparison is returned. 

    EX)  
    
         sameValue ("101", "5") would return true 
   
         sameValue ("101", "6") would return false 
   
         sameValue ("1101", "D") would return true 






* **TestSmallInt** contains the following: 




 • TestSmallInt will have just one main() method. It will prompt the user (using Scanner) for a number in the range 0 – MAXVALUE (inclusive). You should get MAXVALUE from the SmallInt class. Remember that you can access this variable from the class itself since it is static (e.g., SmallInt.MAXVALUE).  
 
 • Then the main() method will simply instantiate a SmallInt object using SmallInt's constructor and print the decimal representation, the binary representation and the hexadecimal representation of the number entered by the user.
