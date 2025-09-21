package Pattern_strategy;

public class Animal {
    private String name;
    protected FlyStrategy flyStrategy;

    public Animal(String name){
        this.name = name;
    }

    public void say(){
        System.out.println("Издает звук!");
    }

    public void fly(){
        flyStrategy.fly();
    }
}
