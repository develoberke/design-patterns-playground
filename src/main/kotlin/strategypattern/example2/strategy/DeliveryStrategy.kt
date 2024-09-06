package strategypattern.example2.strategy

interface DeliveryStrategy {
    fun calculateDeliveryCost(weight: Double): Double

    fun calculateDeliveryTime(distance: Double): Double
}
