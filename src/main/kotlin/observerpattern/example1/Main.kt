package observerpattern.example1

fun main() {
    val weatherData = WeatherData()

    val currentConditionDisplay = CurrentConditionDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)

    weatherData.registerObserver(currentConditionDisplay)
    weatherData.registerObserver(statisticsDisplay)

    weatherData.setMeasurements(80.0, 65.0, 30.4)
    weatherData.setMeasurements(82.0, 70.0, 29.2)

    weatherData.removeObserver(statisticsDisplay)

    weatherData.setMeasurements(62.0, 90.0, 28.1)
}
