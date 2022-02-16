public class TemperaturaDiaria {

    private TemperaturaDiaria() {

    };
    private static TemperaturaDiaria instance = new TemperaturaDiaria();
    public static TemperaturaDiaria getInstance() {
        return instance;
    }

    private Float grausCelsius;

    public Float getGrausCelsius() {
        return grausCelsius;
    }

    public void setGrausCelsius(Float grausCelsius) {
        this.grausCelsius = grausCelsius;
    }
}
