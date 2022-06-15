package ru.nino.db.configuration

import kotlin.math.cos
import kotlin.math.sin


fun main() {
    val a = 60.0
    val b = 60.0
    println("$a - в радианах, $b - в радианах")

    val resultZ1 = functionZ1(a, b)
    val resultZ2 = functionZ2(b)

    println("$resultZ1 == $resultZ2")
    print(resultZ1 == resultZ2)


}

private fun functionZ2(b: Double) = (1 + sin(2 * b)) / cos(2 * b)

private fun functionZ1(a: Double, b: Double) =
    (sin(a) + cos(2 * b - a)) / (cos(a) - sin(2 * b - a))


