import scala.collection.mutable.ArrayBuffer
//Collections in Scala
//I referred the scala documentation which is very easy to understand
//https://docs.scala-lang.org/scala3/book/collections-classes.html

//List in Scala
 // List can be created in several ways
//List is immutable in Scala
//We can't able to change the elements,but it can be updated and store it in new variable

//Also the link mentioned above will also leads us to learn the mutability of the array

object Day4:
    @main def main() = print("hello")

    var LinkedList = 1::2::3::Nil
    //Note the value is ended using the Nil value ,cause it acts like the linked list

    var a = List(1,2,3)
    var b = List.range(1,10,2)
    var c = (1 until 3).toList // until n elements
    var d = (1 to 10 by 2).toList // similar to range
    var e = (1 to 5).toList //until n+1 elements
    println(a.indexOf(2))
    println(a(2))
    // a(2) = 5 //will throw the error
    a = a.updated(2,4) //see here we are just overwriting the variable
    //Note: Try tht using the val keyword where it can't be changed
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println("Sample testing")
    println(10000+:a:+20000)

    println(a.contains(4))
    println(b.equals(d))
    println(c.filter(_ < 2))
    println(d.find(5<_))
    println(d.drop(4))
    println(d.dropWhile(4<_))
    println(b.take(3))
    println(b.takeWhile(_<4))
    println(b.takeRight(5))
    
    var names = "Hemanthh" :: "Velliyangirie" :: "Vimala" :: Nil //Just an other to create List in Scala hahaha
    println(names)

    println(names.flatMap(_.toCharArray())) //Remember '_' is a wild card variable , It shows , the place can be filled with any datatype elements
    println(names.map(_.toUpperCase()))
    println((names.flatMap(_.toUpperCase())).toString())
    println(b.reduce(_+_))
    println(b.reduceLeft(_+_))
    println(names.foldRight("")(_.toUpperCase()+" "+_.toLowerCase()))    
    b.takeWhile(_<4).foreach(println)
    println(b.takeWhile(_<4))
    println(b)

    //LazyList
    var x = LazyList(88,77,66)
    println(x)//LazyList(<not computed>)
    println(x.take(3))//LazyList(<not computed>)

    //It can triggered by any functions to order to load the elements into the memory
    println(x.takeWhile(_<2).foreach(println))
    
    //Vector is so similar to List but Interms of technical terms
    // List -> Linked List(Linear) and immutable 
    // Vector -> Indexable and immutable sequences

    var v1 = Vector(1,2,3,4,5)
    // v1(2)=3 //will throw the error
    v1 = v1.updated(2,3) //It will overwrite the variable with new Vector
    println(5+:v1:+10)

    //ArrayBuffer
    //It's mutable and indexable sequences
    val af = ArrayBuffer(1,2,3,4,5)
    println(af+=6)
    println(af++=List(5,6,7,8))
    // println(af+:3) //Not suits for the ArrayBuffer
    println(af-=5)
    println(af--=Seq(5,6)) //It will not remove the repeated values
    println(af--=Set(2,3))
    println(af)

    //ArrayBuffer can also be created in the way
    var arr:ArrayBuffer[Any] = ArrayBuffer(1,'a',2,3,'c') //remember that the range will always take it's n-1 elelmmnt
    arr(2) = 3
    var arr2 = ArrayBuffer.range(1,8)
    println(arr)
    println(arr2)

    //Map
    var hm = Map(
        "A"->"Akainu",
        "B"->"Bartelomeo",
        "C"->"Cat Burglar",
        "D"->"D"
    )
    hm += ("D" -> "D will") // It will update the value of the key "D"
    //Same command will also be used for the adding of elements
    for((k,v) <- hm )
        println(f"$k->$v")
    println(hm)

    