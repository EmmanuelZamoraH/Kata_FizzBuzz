fun main(args: Array<String>) {
    fizzBuzz(15)
}

fun fizzBuzz(numbrer: Int) {

    if (numbrer % 3 == 0) {
        print("Fizz!")
    } else if (numbrer % 5 == 0) {
        print("Buzz!")
    } else if (numbrer % 3 == 0 && numbrer % 5 == 0) {
        print("FizzBuzz!")
    } else {
        noFizz(numbrer)
    }

}


fun noFizz(num: Int) {
    var aux: Int = num
    if (aux / 10000 != 0) {
        var x: Int = aux / 10000
        aux -= x * 10000
        if (x == 1) {
            println("Diez")
        } else if (x == 2) {
            println("Veinte")
        } else if (x == 3) {
            println("Treinta")
        } else if (x == 4) {
            println("Cuarenta")
        } else if (x == 5) {
            println("Cincuenta")
        } else if (x == 6) {
            println("Seisienos")
        } else if (x == 7) {
            println("Setecientos")
        } else if (x == 8) {
            println("Ochocientos")
        } else if (x == 9) {
            println("Noventa")
        }
    }
    if (aux / 1000 != 0) {
        var x: Int = aux / 1000
        aux -= x * 1000
        if (x == 1) {
            println("Mil")
        } else if (x == 2) {
            println("Dos mil")
        } else if (x == 3) {
            println("Tres mil")
        } else if (x == 4) {
            println("Cuatro mil")
        } else if (x == 5) {
            println("Cinco mil")
        } else if (x == 6) {
            println("Seis mil")
        } else if (x == 7) {
            println("Siete mil")
        } else if (x == 8) {
            println("Ocho mil")
        } else if (x == 9) {
            println("Nueve mil")
        }
    }

    if (aux / 100 != 0) {
        var x: Int = aux / 100
        aux -= x * 100
        if (x == 1) {
            println("Cien")
        } else if (x == 2) {
            println("Docientos")
        } else if (x == 3) {
            println("Trecientos")
        } else if (x == 4) {
            println("Cuatrocientos")
        } else if (x == 5) {
            println("Quinientos")
        } else if (x == 6) {
            println("Seicientos")
        } else if (x == 7) {
            println("Setecientos")
        } else if (x == 8) {
            println("Ochocientos")
        } else if (x == 9) {
            println("Novecientos")
        }
    }
    if (aux / 10 != 0) {
        var x: Int = aux / 10
        aux -= x * 10
        if (x == 2) {
            println("Veinte")
        } else if (x == 3) {
            println("Treinta")
        } else if (x == 4) {
            println("Cuarenta")
        } else if (x == 5) {
            println("Cincuenta")
        } else if (x == 6) {
            println("Sesenta")
        } else if (x == 7) {
            println("Setenta")
        } else if (x == 8) {
            println("Ochenta")
        } else if (x == 9) {
            println("Noventa")
        }
    }

    if (aux / 1 != 0) {
        var x: Int = aux / 1
        aux -= x * 1
        if (x == 1) {
            println("UNO")
        } else
            if (x == 2) {
                println("DOS")
            } else if (x == 3) {
                println("TRES")
            } else if (x == 4) {
                println("CUATRO")
            } else if (x == 5) {
                println("CINCO")
            } else if (x == 6) {
                println("SEIS")
            } else if (x == 7) {
                println("SIETE")
            } else if (x == 8) {
                println("OCHO")
            } else if (x == 9) {
                println("NUEVE")
            }
    }
}