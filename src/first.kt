import java.util.*

fun main(){
    intArray()
    println(Arrays.toString(returnElements()))
    print()


}
//getting elements and accessing of an array
fun intArray (){
    var ages = intArrayOf(23,56,78,21,54,23,53)
    println(ages.get(5))
    println(ages.get(2))
    println(ages.get(1))
    println(ages[6])
    println(ages[4])
}
// return arrays
fun returnElements ():Array<Any>{
    return arrayOf(45,"student", "e", true, 34)
}
//print arrays
fun print (){
    var a = arrayOf("34", 89, "study", 78)
    println(Arrays.toString(a))
}

