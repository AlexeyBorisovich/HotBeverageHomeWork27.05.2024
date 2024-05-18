import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine {
    private List<HotBeverageWithTemperature> productList;

    public HotBeverageVendingMachine(List<HotBeverageWithTemperature> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public List<HotBeverageWithTemperature> getProductList() {
        return new ArrayList<>(productList);
    }

    public void setProductList(List<HotBeverageWithTemperature> productList) {
        this.productList = new ArrayList<>(productList);
    }

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    public HotBeverageWithTemperature getProduct(String name, int volume, int temperature) throws IllegalStateException {
        for (HotBeverageWithTemperature hotBeverage : productList) {
            if (hotBeverage.getName().equalsIgnoreCase(name) && hotBeverage.getVolume() == volume && hotBeverage.getTemperature() == temperature) {
                return hotBeverage;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    public void addProduct(HotBeverageWithTemperature hotBeverage) {
        this.productList.add(hotBeverage);
    }
}