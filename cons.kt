// Ejercicio 1: positivo, negativo o cero.
/* 
fun main() {
    print("Número: ")
    val numero = readln().toInt()
    if (numero > 0) println("Positivo")
    else if (numero < 0) println("Negativo")
    else println("Cero")
}*/

/* 
// Ejercicio 2: triángulo equilátero, isósceles o escaleno.
fun main() {
    print("Lado 1: "); val lado1 = readln().toDouble()
    print("Lado 2: "); val lado2 = readln().toDouble()
    print("Lado 3: "); val lado3 = readln().toDouble()
    if (lado1 == lado2 && lado2 == lado3) println("Equilátero")
    else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) println("Isósceles")
    else println("Escaleno")
}
*/

/*
// Ejercicio 3: calculadora con when.
fun main() {
    print("Primer número: "); val numero1 = readln().toDouble()
    print("Segundo número: "); val numero2 = readln().toDouble()
    print("Operador (+, -, *, /): "); val operador = readln()
    when (operador) {
        "+" -> println(numero1 + numero2)
        "-" -> println(numero1 - numero2)
        "*" -> println(numero1 * numero2)
        "/" -> println(numero1 / numero2)
        else -> println("Operador no válido")
    }
}
*/


// Ejercicio 4: clasificar una nota.
fun main() {
    print("Nota (0-100): "); val nota = readln().toInt()
    when (nota) {
        in 90..100 -> println("Excelente")
        in 70..89 -> println("Aprobado")
        in 50..69 -> println("Regular")
        in 0..49 -> println("Reprobado")
        else -> println("Nota no válida")
    }
}


/*
// Ejercicio 5: tabla del 1 al 10.
fun main() {
    print("Número: "); val numero = readln().toInt()
    for (i in 1..10) println("$numero x $i = ${numero * i}")
}
*/

/*
// Ejercicio 6: sumar números hasta escribir 0.
fun main() {
    var suma = 0; var numero: Int
    do { print("Número (0 termina): "); numero = readln().toInt(); suma += numero }
    while (numero != 0)
    println("Suma total: $suma")
}
*/

/*
// Ejercicio 7: contar pares entre 10 números.
fun main() {
    var pares = 0
    for (i in 1..10) { print("Número $i: "); if (readln().toInt() % 2 == 0) pares++ }
    println("Cantidad de pares: $pares")
}
*/

/*
// Ejercicio 8: arreglo de 10 enteros y cantidad de pares.
fun main() {
    val numeros = Array(10) { 0 }
    for (posicion in numeros.indices) { print("Número ${posicion + 1}: "); numeros[posicion] = readln().toInt() }
    var pares = 0
    for (numero in numeros) if (numero % 2 == 0) pares++
    println("Cantidad de pares: $pares")
}
*/

/*
// Ejercicio 9: arreglo de 5 números y suma total.
fun main() {
    val numeros = Array(5) { 0 }
    for (posicion in numeros.indices) { print("Número ${posicion + 1}: "); numeros[posicion] = readln().toInt() }
    var suma = 0
    for (numero in numeros) suma += numero
    println("Suma total: $suma")
}
*/

/*
// Ejercicio 10: promedio de un arreglo de notas.
fun main() {
    val notas = Array(5) { 0.0 }; var suma = 0.0
    for (posicion in notas.indices) { print("Nota ${posicion + 1}: "); notas[posicion] = readln().toDouble(); suma += notas[posicion] }
    println("Promedio: ${suma / notas.size}")
}
*/

/*
// Ejercicio 11: mayor valor en un arreglo.
fun main() {
    val numeros = Array(5) { 0 }
    for (posicion in numeros.indices) { print("Número ${posicion + 1}: "); numeros[posicion] = readln().toInt() }
    var mayor = numeros[0]
    for (numero in numeros) if (numero > mayor) mayor = numero
    println("Mayor: $mayor")
}
*/

/*
// Ejercicio 12: ingresar nombres hasta escribir fin.
fun main() {
    val nombres: MutableList<String> = mutableListOf(); var nombre: String
    do { print("Nombre (fin termina): "); nombre = readln(); if (nombre != "fin") nombres.add(nombre) }
    while (nombre != "fin")
    println(nombres)
}
*/

/*
// Ejercicio 13: verificar si un nombre está en la lista.
fun main() {
    val nombres = listOf("Ana", "Carlos", "María", "Juan")
    print("Nombre: "); val nombre = readln()
    if (nombre in nombres) println("Está en la lista") else println("No está en la lista")
}
*/

/*
// Ejercicio 14: eliminar los números impares.
fun main() {
    val numeros: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    numeros.removeAll { it % 2 != 0 }
    println(numeros)
}
*/

/*
// Ejercicio 15: función que retorna una suma.
fun main() {
    val resultado = sumar(5, 10)
    println(resultado)
}
fun sumar(numero1: Int, numero2: Int): Int { return numero1 + numero2 }
*/

/*
// Ejercicio 16: factorial usando una función.
fun main() {
    print("Número: "); val numero = readln().toInt(); println(factorial(numero))
}
fun factorial(numero: Int): Long {
    var resultado = 1L
    for (i in 1..numero) resultado *= i
    return resultado
}
*/

/*
// Ejercicio 17: promedio, mayor y menor de notas.
fun main() {
    val notas: MutableList<Double> = mutableListOf()
    for (i in 1..5) { print("Nota $i: "); notas.add(readln().toDouble()) }
    println("Promedio: ${notas.average()}"); println("Mayor: ${notas.maxOrNull()}"); println("Menor: ${notas.minOrNull()}")
}
*/

/*
// Ejercicio 18: juego de adivinanza del 1 al 20.
import kotlin.random.Random
fun main() {
    val secreto = Random.nextInt(1, 21); var intentos = 0; var numero: Int
    do { print("Adivine (1-20): "); numero = readln().toInt(); intentos++
        if (numero < secreto) println("Más alto") else if (numero > secreto) println("Más bajo")
    } while (numero != secreto)
    println("Correcto en $intentos intentos")
}
*/

/*
// Ejercicio 19: pares, multiplicados por 2 y ordenados de mayor a menor.
fun main() {
    val numeros = listOf(3, 8, 1, 10, 6, 5, 12)
    val resultado = numeros.filter { it % 2 == 0 }.map { it * 2 }.sortedDescending()
    println(resultado)
}
*/

/*
// Ejercicio 20: funciones para las operaciones básicas.
fun main() {
    print("Primer número: "); val numero1 = readln().toDouble()
    print("Segundo número: "); val numero2 = readln().toDouble()
    print("Operación (+, -, *, /): "); val operacion = readln()
    println(calcular(numero1, numero2, operacion))
}
fun sumar(a: Double, b: Double) = a + b
fun restar(a: Double, b: Double) = a - b
fun multiplicar(a: Double, b: Double) = a * b
fun dividir(a: Double, b: Double) = a / b
fun calcular(a: Double, b: Double, operacion: String) = when (operacion) {
    "+" -> sumar(a, b); "-" -> restar(a, b); "*" -> multiplicar(a, b); "/" -> dividir(a, b); else -> 0.0
}
*/

/*
// Ejercicio 21: primeros n números de Fibonacci.
fun main() {
    print("Cantidad: "); val cantidad = readln().toInt(); var primero = 0; var segundo = 1
    for (i in 1..cantidad) { print("$primero "); val siguiente = primero + segundo; primero = segundo; segundo = siguiente }
}
*/

/*
// Ejercicio 22: perímetro y área de un cuadrado.
fun main() {
    print("Lado: "); val lado = readln().toDouble()
    println("Perímetro: ${lado * 4}"); println("Área: ${lado * lado}")
}
*/

/*
// Ejercicio 23: pedir un número válido entre 0 y 10.
fun main() {
    var numero: Int
    do { print("Número (0-10): "); numero = readln().toInt() } while (numero !in 0..10)
    println("Número válido: $numero")
}
*/

/*
// Ejercicio 24: pedir texto sin letras mayúsculas.
fun main() {
    var texto: String
    do { print("Texto sin mayúsculas: "); texto = readln() } while (texto.any { it.isUpperCase() })
    println("Texto válido: $texto")
}
*/

/*
// Ejercicio 25: mostrar números hasta ingresar uno negativo.
fun main() {
    var numero: Int
    do { print("Número: "); numero = readln().toInt(); if (numero >= 0) println(numero) } while (numero >= 0)
    println("Adiós")
}
*/

/*
// Ejercicio 26: área de un círculo usando 3.1416.
fun main() {
    print("Radio: "); val radio = readln().toDouble(); println("Área: ${areaCirculo(radio)}")
}
fun areaCirculo(radio: Double): Double { return 3.1416 * radio * radio }
*/

/*
// Ejercicio 27: convertir Celsius a Fahrenheit.
fun main() {
    print("Celsius: "); val celsius = readln().toDouble(); println(convertirFahrenheit(celsius))
}
fun convertirFahrenheit(celsius: Double): Double { return celsius * 9 / 5 + 32 }
*/

/*
// Ejercicio 28: media de una lista de números.
fun main() {
    val numeros = listOf(10.0, 20.0, 30.0, 40.0)
    println("Media: ${media(numeros)}")
}
fun media(numeros: List<Double>): Double {
    var suma = 0.0
    for (numero in numeros) suma += numero
    return suma / numeros.size
}
*/

/*
// Ejercicio 29: perímetro de un triángulo.
fun main() {
    print("Lado 1: "); val lado1 = readln().toDouble()
    print("Lado 2: "); val lado2 = readln().toDouble()
    print("Lado 3: "); val lado3 = readln().toDouble()
    println(perimetroTriangulo(lado1, lado2, lado3))
}
fun perimetroTriangulo(a: Double, b: Double, c: Double): Double { return a + b + c }
*/

/*
// Ejercicio 30: crear una lista con solo los impares.
fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(impares(numeros))
}
fun impares(numeros: List<Int>): List<Int> {
    val resultado: MutableList<Int> = mutableListOf()
    for (numero in numeros) if (numero % 2 != 0) resultado.add(numero)
    return resultado
}
*/
