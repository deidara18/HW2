public class Reptiles extends Animal {
    public Reptiles(String name) {
        super(name);
    }

    @Override
    public int BodyLength() {
        return 0;
    }

    @Override
    public String food() {
        return "Плотоядные";
    }

    @Override
    public String lifeexpectancy() {
        return "";
    }
}
