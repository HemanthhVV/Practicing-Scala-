import Array.* 
import scala.compiletime.ops.int
object  Day3:
    @main def houae() = println("This is a my function")
    //Function currying
    /* 
    It's a technique that transforming the multiple 
    arguments function in to a function that
    takes single argument 
    */

    def add(x:Int,y:Int) = x+y //Normal function definition in scala that takes two arguments

    def addcurry(x:Int) = (y:Int) => x+y //What do we see here,
                                         // This function can be called with 'x' and 'y' or 'x' only
                                         //but when after only giving the 'y'
                                         //the function will start it's annonymous function definition(kind of anonymous function)
                                         //Here we can also see the lazy loading that happens in scala

    def addcurry2(x:Int)(y:Int) = x+y //This type of currying is also supports in scala

    println(addcurry(30)(40))

    var temp = addcurry(50)
    println(temp(60))

    println(addcurry2(22)(23))

    var temp1 = addcurry2(60)
    println(temp1(60))

    //Strings in Scala
    /*
    As we know Scala runs on the JVM
    i.e Java Platform, So it is make use of the String Class in java
    It does not have it's own string class 
    */

    var name:String = "Hemanthh Velliyangirie"
    println(name.length())
    println(name.contains('h'))
    println(name.startsWith("H"))
    println(name.charAt(7))
    println(name.substring(0,8))

    //Refer all string methods on "https://www.javatpoint.com/java-string"

    //Arrays in Scala
    //Mutable, One data type applied

    var arr:Array[String] = new Array[String](4)// Array[datatype](size)

    for (i <- 0 until 4) {
        arr(i) = f"$i" //A strange thing is to be noticed that , there is no "[]"
        println(arr(i)) //Instead of that, use "()" for indexing on array
    }

    var arr1 = Array(1,2,3,4,5)
    arr1(0) = 0

    var arr2 = new Array[Int](3)  //try print this with various datatype
    /* When you are not assinging any values to the array
    It will make the array with default values
    if Int type,then the default values will be 0 */

    println("Started printing Array")
    var result = concat(arr1,arr2)
    for (i <- concat(arr1,arr2)){
        println(i)   
    }
    
    // I referred in "https://www.scala-lang.org/api/2.13.3/scala/Array.html" +
    