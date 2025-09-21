package Pattern_Builder;

public class Figure {
    private String name;
    private int square;

    private Figure(FigureBuilder figureBuilder){
        this.name = figureBuilder.name;
        this.square = figureBuilder.square;
    }

    public static class FigureBuilder{
        private String name;
        private int square;

        public FigureBuilder(String name){
            this.name = name;
        }

        public FigureBuilder setSquare(int square){
            this.square = square;
            return this;
        }

        public Figure build(){
            return new Figure(this);
        }
    }



}
