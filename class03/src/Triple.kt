fun main(){
    var age:Int? = null
    var name: String? = null
//    name = "Nazrul Islam"
//    age = 22
    info(age, name)
}
fun info(age:Int?, name:String?){
    if (age != null){
        println(age)
    }
    if(name != null){
        println(name)
    }

}
