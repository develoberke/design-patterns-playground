package strategypattern.example2

import org.junit.jupiter.api.Test
import strategypattern.example2.strategy.AirDelivery
import strategypattern.example2.strategy.SeaDelivery

class ParcelTest {
    @Test
    fun `it should calculate delivery cost and time for sea delivery`() {
        val parcel = Parcel(10.0, 100.0)
        parcel.setDeliveryStrategy(SeaDelivery())
        assert(parcel.calculateDeliveryCost() == 1.0)
        assert(parcel.calculateDeliveryTime() == 50.0)
    }

    @Test
    fun `it should calculate delivery cost and time for air delivery`() {
        val parcel = Parcel(10.0, 100.0)
        parcel.setDeliveryStrategy(AirDelivery())
        assert(parcel.calculateDeliveryCost() == 15.0)
        assert(parcel.calculateDeliveryTime() == 10.0)
    }

    @Test
    fun `it should change delivery strategy`() {
        val parcel = Parcel(10.0, 100.0)
        parcel.setDeliveryStrategy(SeaDelivery())
        assert(parcel.calculateDeliveryCost() == 1.0)
        assert(parcel.calculateDeliveryTime() == 50.0)

        parcel.setDeliveryStrategy(AirDelivery())
        assert(parcel.calculateDeliveryCost() == 15.0)
        assert(parcel.calculateDeliveryTime() == 10.0)
    }
}
