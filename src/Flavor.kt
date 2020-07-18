import java.io.File
import kotlin.system.exitProcess

class Flavor(flavor: String) {
    val priceList: Map<String, String>
    var flavor = flavor

    init {
        val reader = File("FlavorPrices.txt")
        priceList = reader.readLines().windowed(2,2) {
            it[0] to it[1]
        }.toMap()

    }

    init {
        if (!priceList.containsKey(flavor.toLowerCase())) println("We don't have that flavor") else this.flavor = flavor.toLowerCase()
    }

    fun getPrice(flavor: Flavor): Int? {
        return if ( priceList.containsKey(flavor.toString()) ) priceList[flavor.toString()]?.toInt() else exitProcess(-1)
    }

    override fun toString(): String {
        return flavor
    }
}
