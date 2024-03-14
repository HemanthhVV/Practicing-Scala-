object Day1{

    //Scala is one of the recent Language built on Java and syntax were very similar to Python
    //Also It is faster than Python,where it's compile and run code in JVM
    //It supports both functional and object oriented  

    //I believed in the above statements related to scala , so I started preparing it

    /* 
    Day 1:
        # Function Declaration
        # Variable Declaration
        # DataTypes
        # Loops
        # Keywords
    */

    //Main function can be defined in ways

    //scala 2.x versions
    def main(args:Array[String]):Unit={
        print("Hello Universe!")
    }

    //scala 3.x versions
    //"@main"decorator tag will make the following function as a main function
    // @main def home() = print("Hello Universe..!")

    //Data types

    /* 
    Variable assigning types:
        Dynamic assignments:(Let Compiler decide the data type or Manual assignment)
            val -> once we assigned , it's immutable
            var -> once assigned, it's mutable
    */
    def house()={
        var Tmp : String = "Hey There !"
        var Tmp2 = "Hey There!"
        val Tmp3 = "Unchangable"

        Tmp = "Hello There  !" // Will changable(mutable)

        // Tmp3 = "Changable" //Will show the error
    }

    //String Interpolations - Like Format specifier
    var name = "hemanthh velliyangirie"
    println("Your name is "+name) // Using append operator
    println(s"Your name is $name") //Using the $ operator
    println(f"Your name is $name%s") //Similar to above, But, It's typesafe,usually use in production
    println(f"Your name is \n $name%s") // some format specifier similar to other languages
    println(raw"Your name is \n $name") //No space specifier will work (i.e \n)
    

    // Types of Function Declarations in Scala
    def add(X:Int,y:Int):Int = {
         var Result:Int = X+y
         return Result
    }

    def add1(X:Int,y:Int):Int = {
         var Result:Int = X+y
         Result
    }

    def add2(X:Int,y:Int):Int = {
        X+y
    }

    def add3(X:Int,y:Int):Int = X+y

    def add4(X:Int,y:Int) = X+y
    
    def +(X:Int,y:Int) = X+y


    //If-Else
    if(name == "hemanthh velliyangirie") println("His name is correct")
    //using logical operators
    var num1 = 20
    var num2 = 30
    if(num1 > 15 && num2 < 50) 
        println("Condition is correct")
    else 
        println("Condition is False")
    //like ternary 
    var new_name = if(name == "hemanthh velliyangirie") "Hemanthh" else "Wrong Answer"


    //loops 
    //Except the for, all loops were almost similar to py
    for (i <- 1 to 5) { // to keyword takes elements until len
        println(i)
    }
    for (i <- 1 until 5) { //until keyword is like "range" , takes element until len-1
        println(i)
    }
    for (i <- 1 to 5;j<- 6 to 10) { // It's 2d format loop O(n^2)
        println(i+ " -> " + j)
    }

    //for each loop 
    var l1 = List(1,2,3,4,5,6,7,8,9)
    for(element <- l1){
        println(element)
    }


    for (i <- 1 to 5;j<- 6 to 10;if(i==5 && j == 6)) { // It's 2d format loop O(n^2) with if conditions
        println(i+ " -> " + j)
    }

    //Note: I Have write all the code outside the main function
    // Although it works good in scala
    // But a file can't be executed without a main function
    // The main function will execute at last,where all the outside code completes

}