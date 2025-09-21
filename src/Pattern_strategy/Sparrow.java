package Pattern_strategy;

public class Sparrow extends Animal {
    public Sparrow(String name) {
        super(name);
        flyStrategy = new CanFlyStrategy();
    }
}
