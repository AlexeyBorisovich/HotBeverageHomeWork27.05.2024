public class HotBeverageWithTemperature extends HotBeverage {
    private int temperature;

    public HotBeverageWithTemperature(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotBeverageWithTemperature{" +
               "name='" + getName() + '\'' +
               ", cost=" + getCost() +
               ", volume=" + getVolume() +
               ", temperature=" + temperature +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HotBeverageWithTemperature)) return false;
        if (!super.equals(o)) return false;

        HotBeverageWithTemperature that = (HotBeverageWithTemperature) o;

        return temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + temperature;
        return result;
    }
}