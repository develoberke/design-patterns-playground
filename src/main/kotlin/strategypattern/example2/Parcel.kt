package strategypattern.example2

import strategypattern.example2.strategy.DeliveryStrategy

class Parcel(
    var weight: Double,
    var distance: Double,
) {
    private lateinit var strategy: DeliveryStrategy

    fun setDeliveryStrategy(strategy: DeliveryStrategy) {
        this.strategy = strategy
    }

    fun calculateDeliveryCost(): Double {
        return strategy.calculateDeliveryCost(weight)
    }

    fun calculateDeliveryTime(): Double {
        return strategy.calculateDeliveryTime(distance)
    }
}
