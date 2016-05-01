import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float presure;
	
	public WeatherData(){
	}
	
	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float presure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.presure = presure;
		measurementChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPresure() {
		return presure;
	}
	
	
	
	

}
