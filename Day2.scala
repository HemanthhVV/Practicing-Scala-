import java.util.Date
object Day2:
    //Here the concepts comes "Match Expression"
    //It's similar to the concept of Switch cases 

    @main def hello() = 
        println("Main function Defined, also it executes at last after executing beyoing the scope of main functions operations")

    var age = 25
    age match
        case 5 => println("It's 5")
        case 10 => println("It's 10")
        case 15 => println("It's 15")
        case 20 => println("It's 20")
        case 55 => println("It's 55")
        case 25 => println("It's 25")
        case _ => println("Default case")
        println("hello Universe")

    var num = age match
                case 5 => println("It's 5")
                case 10 => println("It's 10")
                case 15 => println("It's 15")
                case 20 => println("It's 20")
                case 55 => println("It's 55")
                case 25 => println("It's 25")
                case _ => println("Default case")
    // println(num)

    age match
        case 5|15|25|35|45|55 => println("It's 5")
        case 10|20|30 => println("It's 10")
        
        case _ => println("Default case")

    //Anonymous Functions and default parameter values

    //Default parameter values and
    //their working

    def add(x:Int = 45,y:Int = 15) = x+y

    //Passing our parameter values to the function
    println(add(25,35)) 

    //Passing one parameter 35 which will be consider as x in the function parameter
    println(add(35))

    //Passing specific parameter that we like to call for a function 
    println(add(y = 35))

    //Anonymous Functions

    var anony_add = (X:Int,Y:Int) => X+Y
    println(anony_add(3,4)+" - Thala for a reason")

    //Higher Order Functions 

    // def DoYourFunction(x:Double,y:Double,f:(Double,Double)=>Double) = f(x,y)

    // var res = DoYourFunction(30,20,(x,y)=>x+y) //Is it similar ? , Yeah, It's anonymous

    // def DoYourFunction(x:Double,y:Double,z:Double,f:(Double,Double)=>Double) = f(f(x,y),z)

    // var res = DoYourFunction(30,20,50,(x,y)=>x+y)

    def DoYourFunction(x:Double,y:Double,z:Double,f:(Double,Double)=>Double) = f(f(x,y),z)

    // var res = DoYourFunction(30,20,50,_+_) //"_" is also called as Wild Card Operator.
    var res = DoYourFunction(30,20,50,_ max _) //"_" is also called as Wild Card Operator.
    println(res)

    //partial functions 
    //Partial used in many cases ,especially like loggings in our application

    def log(date:Date,strs:String) = println(s"$date -> $strs")

    var date = new Date //Instantiating Obj
    var logs = log(date,_:String) // it can be called to store the logs
    logs("This is partial applying")

    //Closure concepts in scala
    //Using the outside variable inside the function
    var value = 10
    var run = (x:Int) => x+value
    println(run(10)) 
    //Function currying



    
    