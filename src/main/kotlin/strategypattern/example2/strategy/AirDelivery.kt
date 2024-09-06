package strategypattern.example2.strategy

class AirDelivery : DeliveryStrategy {
    override fun calculateDeliveryCost(weight: Double): Double {
        return weight * 1.5
    }

    override fun calculateDeliveryTime(distance: Double): Double {
        return distance * 0.1
    }
}
