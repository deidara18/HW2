public class Chameleon extends Reptiles implements BodyLength {
    public Chameleon(String name) {
        super(name);
    }

    @Override
    public int BodyLength() {
        return 85;
    }

    @Override
    public String food() {
        return "Беспозвоночными";
    }

    @Override
    public String lifeexpectancy() {
        return "от 8 до 12 лет";
    }
}
