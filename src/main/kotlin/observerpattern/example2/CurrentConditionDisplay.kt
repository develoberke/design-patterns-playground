package observerpattern.example2

class CurrentConditionDisplay(
    private val weatherData: WeatherData,
) : WeatherDataObserver, DisplayElement {
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0

    override fun update() {
        this.temperature = weatherData.getTemperature()
        this.humidity = weatherData.getHumidity()
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }
}
