package strategypattern.example2.strategy

class RoadDelivery : DeliveryStrategy {
    override fun calculateDeliveryCost(weight: Double): Double {
        return weight * 0.5
    }

    override fun calculateDeliveryTime(distance: Double): Double {
        return distance * 0.5
    }
}
