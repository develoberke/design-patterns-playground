package observerpattern.example2

interface WeatherDataSubject {
    fun registerObserver(weatherDataObserver: WeatherDataObserver)

    fun removeObserver(weatherDataObserver: WeatherDataObserver)

    fun notifyObservers()
}
