public class Axolotl extends Reptiles implements BodyLength {
    public Axolotl(String name) {
        super(name);
    }

    @Override
    public int BodyLength() {
        return 23;
    }

    @Override
    public String food() {
        return "Трубочник, мотыль";
    }

    @Override
    public String lifeexpectancy() {
        return "от 10 до 12 лет";
    }
}
