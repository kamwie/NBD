import scala.annotation.tailrec
//cw1
//zad 1
val days=List("Poniedziałek","Wtorek","Środa","Czwartek","Piątek","Sobota","Niedziela") 

def zad1a () : String = {
    var result = ""
    for (day <- days)
    {
        result+= day + ","
        
    }
    return result.dropRight(1)
}  
println("zad1a")
println(zad1a())

def zad1b() : String = {
    var result = ""
    for (day <- days if(day.startsWith("P"))) result+=day + ","
    return result.dropRight(1)
}
println("zad1b")
println(zad1b())

def zad1c() : String = {
    var result = ""
    var i = 0
    while(i < days.length )
    {
        result += days(i) + ","
        i+=1
    }
    return result.dropRight(1)
}

println("zad1c")
println(zad1c())

//zad2
  def zad2a(days: List[String]): String = {
    if (days.tail.isEmpty)
      return days.head
    return days.head + "," + zad2a(days.tail)
  }

  def zad2b(days: List[String]): String ={
    if (days.length == 1)
      days.last
    else
      days.last + "," + zad2b(days.slice(0, days.length-1))
  }
  println("zad2b")
  println(zad2b(days))

// zad 3
def zad3(days: List[String]): String = {
@tailrec
def funk(days: List[String], result: String): String = {
      if (days.length == 1) result + days.head
      else {
        funk(days.tail, result + days.head + ",")
    }
  }
    funk(days,"")
  }
println("zad3")
println(zad3(days))

//zad 4
def zad4a(): String = {
  days.foldLeft(""){(z, i) => z+i+","}.dropRight(1) 
}
println("zad4a")
println(zad4a())

def zad4b(): String = {
  days.foldRight(""){(z, i) => z+","+i}.dropRight(1) 
}
println("zad4b")
println(zad4b())

def zad4c(): String = 
days.filter(_.startsWith("P")).foldLeft(""){(z, i) => z+i+","}.dropRight(1) 

println("zad4c")
println(zad4c())

// zad 5
val products = Map(
  "IceCream" -> 1.00,
  "Cookies" -> 2.20,
  "Chips" -> 4.40,
  "Onion" -> 0.50
)
println("zad5 products")
println(products)

val productsDis = products.map{ case (key,value) => key -> (value-value*0.10)}
println("zad5 products with discount")
println(productsDis)
// zad 6
def zad6(x: (Int,Double,String)) = println(x)

println("zad6")
zad6(2,3.0,"Kamil")

//zad 7
println("zad 7")
println(products.find(p => p._1=="Onion"))

//zad 8
 val zad8list = List(1,-1,-3,4,0,8,-5,30,-40)
def zad8(input: List[Int]): List[Int] = input match {
    case Nil => Nil
    case h :: t =>
      if (h == 0) 
        zad8(t)
      else
        h :: zad8(t)
  }
println("ZAD 8")
println(zad8(zad8list))

// zad 9
println("zad9")
def zad9(lista: List[Int]): List[Int] = lista.map{x => x+1}
println(zad9(zad8list))

// zad 10
println("zad10")
val zad10list = List(1,0.5,-25,-30,-5,-4,-3,2,2.153,1.516,3,4,1,5,-8.15864,6,4,3)
def zad10(lista: List[Double]): List[Double] = lista.filter(x => (x>=(-5) && x <=(12))).map{x=> x.abs}
println(zad10(zad10list))