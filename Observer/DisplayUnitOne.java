
	
public class DisplayUnitOne implements Observer {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public DisplayUnitOne (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	public void display() {
		System.out.println("DisplayUnitOne: " + temperature + "F degrees and " + humidity + "% humidity" + "Pressure = " + pressure);
	}
}
