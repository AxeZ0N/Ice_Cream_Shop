import java.awt.FlowLayout

fun main(){
    val myIceCream = IceCream()
    val flavors = listOf<Flavor>(Flavor("a"), Flavor("b"), Flavor("c"))
    val toppings = listOf<Topping>(Topping("1"), Topping("2"))

    for (Flavor in flavors){
        myIceCream.addFlavor(Flavor)
    }

    for (Topping in toppings){
        myIceCream.addTopping(Topping)
    }

    val totalPrice = myIceCream.price()

    println(totalPrice)

}