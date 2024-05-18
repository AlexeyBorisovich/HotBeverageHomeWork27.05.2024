public class HotBeverage extends Product {
    private int volume;

    public HotBeverage(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotBeverage{" +
               "name='" + getName() + '\'' +
               ", cost=" + getCost() +
               ", volume=" + volume +
               '}';
    }
}