package Pattern_Adapter;

public class Computer implements GPU {
    Screen screen;

    public Computer(Screen screen){
        this.screen = screen;
    }


    @Override
    public void converDataToScreen() {
        System.out.println("Конвертация данных в пискели");
        screen.display();
    }
}
