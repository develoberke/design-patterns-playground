package strategypattern.example2.strategy

class SeaDelivery : DeliveryStrategy {
    override fun calculateDeliveryCost(weight: Double): Double {
        return weight * 0.1
    }

    override fun calculateDeliveryTime(distance: Double): Double {
        return distance * 0.5
    }
}
