package observerpattern.example1

class StatisticsDisplay(
    private val weatherData: WeatherDataSubject,
) : WeatherDataObserver, DisplayElement {
    private var maxTemp: Double = 0.0
    private var minTemp: Double = 200.0
    private var tempSum: Double = 0.0
    private var numReadings: Int = 0

    override fun update(
        temp: Double,
        humidity: Double,
        pressure: Double,
    ) {
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }

        if (temp < minTemp) {
            minTemp = temp
        }

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${tempSum / numReadings}/$maxTemp/$minTemp")
    }
}
