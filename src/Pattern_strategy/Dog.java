package Pattern_strategy;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
        flyStrategy = new NoCanFlyStrategy();
    }
}
