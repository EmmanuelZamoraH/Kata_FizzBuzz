fun main(args: Array<String>) {
    val Numero = selector(7)
    print(Numero)
}

fun selector(Numero :Int) :String{
    return when{
        Numero % 3 == 0 && Numero % 5 == 0 -> "FizzBuzz"
        Numero % 3 == 0 -> "Fizz"
        Numero % 5 == 0 -> "Buzz"
        else -> "$Numero"
    }
}