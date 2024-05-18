import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание нескольких горячих напитков
        HotBeverageWithTemperature tea = new HotBeverageWithTemperature("Tea", 1.0, 250, 80);
        HotBeverageWithTemperature coffee = new HotBeverageWithTemperature("Coffee", 1.5, 200, 90);
        HotBeverageWithTemperature hotChocolate = new HotBeverageWithTemperature("Hot Chocolate", 2.0, 300, 85);

        // Создание автомата с этими напитками
        HotBeverageVendingMachine vendingMachine = new HotBeverageVendingMachine(Arrays.asList(tea, coffee, hotChocolate));

        try {
            // Поиск и получение напитка из автомата
            HotBeverageWithTemperature foundBeverage = vendingMachine.getProduct("Tea", 250, 80);
            System.out.println(foundBeverage);

            // Попытка найти несуществующий напиток
            Product notFoundBeverage = vendingMachine.getProduct("NonExistent");
            System.out.println(notFoundBeverage);
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }
}