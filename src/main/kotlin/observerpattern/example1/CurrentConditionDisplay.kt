package observerpattern.example1

class CurrentConditionDisplay(
    private val weatherData: WeatherDataSubject,
) : WeatherDataObserver, DisplayElement {
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0

    override fun update(
        temp: Double,
        humidity: Double,
        pressure: Double,
    ) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }
}
