import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherSystem {

    private String weather;
    private PropertyChangeSupport support;

    public WeatherSystem() {
        // TODO
    }

    public void addObserver(PropertyChangeListener listener) {
        // TODO
    }

    public void removeObserver(PropertyChangeListener listener) {
        // TODO
    }

    public void setWeather(String newWeather) {
        // TODO:
        // Store the old weather
        // Change the weather
        // Notify observers
    }
}
