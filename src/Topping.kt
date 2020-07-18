import java.io.File
import kotlin.system.exitProcess

class Topping(topping: String) {
    val priceList: Map<String, String>
    var topping = ""

    init {
        val reader = File("ToppingPrices.txt")
        priceList = reader.readLines().windowed(2,2) {
            it[0] to it[1]
        }.toMap()

    }

    init {
        if (!priceList.containsKey(topping.toLowerCase())) println("We don't have that topping") else this.topping = topping.toLowerCase()
    }

    fun getPrice(topping: Topping): Int? {
        return if ( priceList.containsKey(topping.toString()) ) priceList[topping.toString()]?.toInt() else exitProcess(-1)
    }

    override fun toString(): String {
        return topping
    }
}
