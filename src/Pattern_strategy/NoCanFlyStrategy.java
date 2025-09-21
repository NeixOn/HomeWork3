package Pattern_strategy;

public class NoCanFlyStrategy implements FlyStrategy {
    public void fly(){
        System.out.println("Не умеет летать");
    }
}
