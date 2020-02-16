package Chapter02.Description;

import Chapter02.Description.inter.DisplayElement;
import Chapter02.Description.inter.Observer;
import Chapter02.Description.inter.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 옵저버 등록
    }

    public void update(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    public void display()
    {
        System.out.println("온도 : " + temperature + "습도 : " + humidity);
    }


}
