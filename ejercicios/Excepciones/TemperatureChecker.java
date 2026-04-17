public class TemperatureChecker {

    int temperature = 0;

    public TemperatureChecker (int temperature) {
        this.temperature = temperature;
    }

    public void checkTemperature() throws TemperatureOutOfRange {
        if (this.temperature < -50) {
            throw new TemperatureOutOfRange("Peligro, temperatura fuera de rango");
        }
        if (this.temperature > 50) {
            throw new TemperatureOutOfRange("Peligro, temperatura fuera de rango");
        }
        else {
            System.out.println("La temperatura es correcta");
        }
    }
    
}
