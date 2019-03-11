import kotlin.math.*
import java.io.File

//data class Unit(val u: String){
//    fun u()
//}
data class Quantity(val x: Double, val u: String) {
    fun uSum(q: Quantity) = if (u == q.u) Quantity(x + q.x, u) else throw Exception("Unit Mismatch")
    fun uMin(q: Quantity) = if (u == q.u) Quantity(x - q.x, u) else throw Exception("Unit Mismatch")
    fun uDiv(q: Quantity) = if (u == q.u) x / q.x else throw Exception("Unit Mismatch")
    fun rMul(r: Double) =  Quantity(x * r, u)
    fun rDiv(r: Double) =  Quantity(x / r, u)
}
fun check() {
    val a = Quantity(10.0, "метры")
    val b = Quantity(15.0, "метры")
    val z1 = a.uSum(b)
    val z2 = a.uMin(b)
    val z3 = a.rDiv(3.0)
    val z4 = a.rMul(3.0)
    val z5 = a.uDiv(b)
    println(z1)
    println(z2)
    println(z3)
    println(z4)
    println(z5)
    return
}

fun main(args: Array<String>){
    check()
    println()
}