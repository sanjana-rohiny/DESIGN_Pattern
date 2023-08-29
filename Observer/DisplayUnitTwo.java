
public class DisplayUnitTwo implements Observer {
	private float temperature;  
	private float humidity;
	private float pressure;

	private WeatherData weatherData;

	public DisplayUnitTwo(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        	this.pressure = pressure;
		this.humidity = humidity;
		this.temperature = temp;

		display();
	}

	public void display() {
		System.out.println("DisplayUnitTwo: " + temperature + "F degrees and " + humidity + "% humidity" + "Pressure = " + pressure);
	}

}
