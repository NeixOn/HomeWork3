import Chain_Responsibilities.Order;
import Chain_Responsibilities.OrderProcessingSystem;
import Pattern_Adapter.Computer;
import Pattern_Adapter.Screen;
import Pattern_Builder.Figure;
import Pattern_Proxy.ProxyImage;
import Pattern_Proxy.RealImage;
import Pattern_strategy.Animal;
import Pattern_strategy.Dog;
import Pattern_strategy.Sparrow;
import Pattern_Proxy.Image;
import pattern_Decorator.Coffee;
import pattern_Decorator.MilkDecorator;
import pattern_Decorator.SimpleCoffee;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Паттерн стратегия
        System.out.println("Паттерн стратегия");
        Animal dog = new Dog("Рекс");
        Animal sparrow = new Sparrow("Чик-чирик");
        dog.fly();
        sparrow.fly();

        System.out.println("__________________________\nПаттерн цепочка обязанностей\n");
        //Паттерн цепочка обязанностей
        List<Order> orders = List.of(new Order("id1", 5000, true), new Order("id2", 15000, true), new Order("id3", 12000, false));
        OrderProcessingSystem system = new OrderProcessingSystem();
        system.processOrders(orders);

        //Паттерн билдер
        Figure figure = new Figure.FigureBuilder("круг").setSquare(142).build();


        System.out.println("__________________________\nПаттерн прокси\n");
        //Паттерн прокси
        Image image1 = new RealImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("__________________________\nпаттер декоратор\n");
        // паттер декоратор

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        System.out.println("__________________________\nпаттер адаптер\n");
        // паттерн адаптер

        Computer computer = new Computer(new Screen());
        computer.converDataToScreen();
    }




}