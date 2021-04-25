fun main(){
println(isEven(8))
    println(isEven(11))
    println(fruits("banana"))
    println(name(arrayOf("mary","adama","apple")))
    var catergory1=Product("meat",35,90,"grocery")
    var catergory2=Product("ToiletBalls",5,10,"hygiene")
    var catergory3=Product("Book",4,40,"other")
    println(catergory1)
    println(catergory2)
    println(catergory3)
}
fun isEven(number:Int):Boolean{
    if (number%2==0){
        return true
    }
    else{
        return false
    }
}
data class Product(var name:String,var weight:Int,var price:Int,var catergory:String){
    fun glocery(name: String,weight: Int,price:Int,catergory: String){
        var groceryList = mutableListOf<String>()
        var hygieneList = mutableListOf<String>()
        var otherList = mutableListOf<String>()

    when ("grocery"){
        "grocery"-> println(groceryList.add(name))
        "hygiene"-> println(hygieneList.add(name))
        else-> println(otherList.add(name))

    }
       println("${name}:${catergory}")
    }

    }




fun fruits(name:String):String{
    var market= ""
    for (letter in name){
        if (name.indexOf(letter)%2==0){
             market+=letter

        }

    }
    return market
}
fun name(names:Array<String>):MutableList<String>{
    var namesList= mutableListOf<String>()
    for (kay in names){
        if (kay.length%2==0){
            namesList.add(kay)
        }
    }
return namesList
}


