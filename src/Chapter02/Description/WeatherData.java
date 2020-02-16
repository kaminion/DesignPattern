package Chapter02.Description;

import Chapter02.Description.inter.Observer;
import Chapter02.Description.inter.Subject;

import java.util.ArrayList;

// 구독할 클래스이다.
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humditiy;
    private float pressure;

    public WeatherData()
    {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(o);
        }
    }

    public void notifyObservers()
    {
        for(int i=0;i < observers.size();i++)
        {
            Observer observer = observers.get(i);
            observer.update(temperature, humditiy, pressure);
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humditiy, float pressure)
    {
        this.temperature = temperature;
        this.humditiy = humditiy;
        this.pressure = pressure;

        measurementsChanged();
    }

}
