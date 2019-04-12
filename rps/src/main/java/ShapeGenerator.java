public class ShapeGenerator {
    private Shapes generatedShape;

    public ShapeGenerator() {
    }

    public Shapes generateShape(Shapes userShape) {
        switch(userShape) {
            case STONE:
                this.generatedShape = Math.random() < 0.33D ? Shapes.PAPER : (Math.random() >= 0.33D && Math.random() < 0.5D ? Shapes.SCISSORS : Shapes.STONE);
                break;
            case PAPER:
                this.generatedShape = Math.random() < 0.33D ? Shapes.PAPER : (Math.random() >= 0.33D && Math.random() < 0.5D ? Shapes.SCISSORS : Shapes.STONE);
                break;
            case SCISSORS:
                this.generatedShape = Math.random() < 0.33D ? Shapes.PAPER : (Math.random() >= 0.33D && Math.random() < 0.5D ? Shapes.SCISSORS : Shapes.STONE);
        }

        return this.generatedShape;
    }
}


