import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class WeatherObserver implements PropertyChangeListener {
    private String heroName;

    public WeatherObserver(String heroName) {
        this.heroName = heroName;
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        // TODO:
        // print how this hero reacts to the new weather
    }
}
