package Chapter02;

import Chapter02.Description.CurrentConditionsDisplay;
import Chapter02.Description.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        ccd.display();

        weatherData.setMeasurements(10, 20, 30);

    }
}
