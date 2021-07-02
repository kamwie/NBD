// zad 1
println("zad1")

def zad1(day: String): String = day match{

    case "Poniedziałek" => "Praca"
    case "Wtorek" => "Praca"
    case "Środa" => "Praca"
    case "Czwartek" => "Praca"
    case "Piątek" => "Praca"
    case "Sobota" => "Weekend"
    case "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
}

println("Poniedziałek = " + zad1("Poniedziałek"))
println("Sobota = " + zad1("Sobota"))
println("Poniedzielnik = "+ zad1("Poniedzielnik"))

// zad 2
println("zad2")

class KontoBankowe( private var stanKonta: Double = 0){
    def wplata(wartosc: Double) =  stanKonta += wartosc
    def wyplata(wartosc: Double) = if(stanKonta<=0 || stanKonta<wartosc) println("Brak kasy do wypłaty") else stanKonta -= wartosc
    def srodki(): Double = stanKonta
}
val konto = new KontoBankowe()
konto.wplata(40)
konto.wyplata(50)
println(konto.srodki())

//zad 3
println("zad3")

class Osoba(val imie:String, val nazwisko:String){

    def przywitanie(os: Osoba): String = os.nazwisko match{
        
        case "Jowalski"  => "Siema"
        case "Powalski"  => "Witam"
        case "Kowalski"  => "Cześć"
        case _ => "Dzień Dobry"
    } 
}
        val o1 = new Osoba("Jan", "Jowalski")
        val o2 = new Osoba("Pan","Powalski")
        val o3 = new Osoba("Kan", "Kowalski")

    println(o1.przywitanie(o1))
    println(o2.przywitanie(o2))
    println(o3.przywitanie(o3))
    println(o1.przywitanie(new Osoba("Kamil","Wiewior")))

// zad 4
println("zad4")

def zad4(x: Int, funk: Int => Int): Int= funk(funk(funk(x)))
println(zad4(10,z=>z+5))


// zad 5
println("zad5")
 trait Student extends Person {
    override val tax: BigDecimal = BigDecimal(0)
  }

  trait Teacher extends Employee {
    override val tax: BigDecimal = BigDecimal(0.1) * salary
  }

  trait Employee extends Person {
    var salary: BigDecimal = BigDecimal(10000)
    override val tax: BigDecimal = BigDecimal(0.2) * salary
  }

  class Person(val firstName: String, val lastName: String, val tax: BigDecimal = BigDecimal(0))

  
    val student = new Person("Jan", "Jowalski") with Student
    val teacher = new Person("Pan", "Powalski") with Teacher
    val employee = new Person("Kan", "Kowalski") with Employee
    val employeeStudent = new Person("Ran", "Rowalski") with Employee with Student
    val studentEmployee = new Person("Wan", "Wowalski") with Student with Employee

    println("Student tax: " + student.tax)
    println("Teacher tax: " + teacher.tax)
    println("Employee tax: " + employee.tax)
    println("EmployeeStudent tax: " + employeeStudent.tax)
    println("StudentEmployee tax: " + studentEmployee.tax)
  