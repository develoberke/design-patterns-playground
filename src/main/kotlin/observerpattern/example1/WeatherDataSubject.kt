package observerpattern.example1

interface WeatherDataSubject {
    fun registerObserver(weatherDataObserver: WeatherDataObserver)

    fun removeObserver(weatherDataObserver: WeatherDataObserver)

    fun notifyObservers()
}
