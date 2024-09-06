package strategypattern.example2

import strategypattern.example2.strategy.AirDelivery
import strategypattern.example2.strategy.SeaDelivery

fun main() {
    val parcel = Parcel(10.0, 100.0)
    parcel.setDeliveryStrategy(SeaDelivery())
    println("Delivery cost: ${parcel.calculateDeliveryCost()}")
    println("Delivery time: ${parcel.calculateDeliveryTime()}")

    parcel.setDeliveryStrategy(AirDelivery())
    println("Delivery cost: ${parcel.calculateDeliveryCost()}")
    println("Delivery time: ${parcel.calculateDeliveryTime()}")
}
