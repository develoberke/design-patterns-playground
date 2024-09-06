package observerpattern.example1

interface WeatherDataObserver {
    fun update(
        temp: Double,
        humidity: Double,
        pressure: Double,
    )
}
