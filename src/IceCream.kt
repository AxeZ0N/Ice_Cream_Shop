class IceCream{
    var flavors: MutableList<Flavor> = mutableListOf()
    var toppings: MutableList<Topping> = mutableListOf()

    fun price(): Int{
        var totalPrice = 0
        for (Flavor in flavors){
            totalPrice += Flavor.getPrice(Flavor)!!
        }

        for (Topping in toppings){
            totalPrice += Topping.getPrice(Topping)!!
        }

        return totalPrice
    }

    fun addFlavor(flavor: Flavor){
        flavors.add(flavor)
    }

    fun addTopping(topping: Topping){
        toppings.add(topping)
    }

}