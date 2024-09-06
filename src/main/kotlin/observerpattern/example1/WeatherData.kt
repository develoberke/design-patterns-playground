package observerpattern.example1

class WeatherData : WeatherDataSubject {
    private var observers: MutableList<WeatherDataObserver> = mutableListOf()
    private var temperature: Double = 0.0
    private var humidity: Double = 0.0
    private var pressure: Double = 0.0

    override fun registerObserver(weatherDataObserver: WeatherDataObserver) {
        observers.add(weatherDataObserver)
    }

    override fun removeObserver(weatherDataObserver: WeatherDataObserver) {
        observers.remove(weatherDataObserver)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(
        temperature: Double,
        humidity: Double,
        pressure: Double,
    ) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
