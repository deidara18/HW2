public class GiantTarantula extends Spider implements Eggs {
    public GiantTarantula(String name) {
        super(name);
    }

    @Override
    public int eggs() {
        return 1500;
    }

    @Override
    public int BodyLength() {
        return 10;
    }


    @Override
    public String lifeexpectancy() {
        return "от 8 до 12 лет";
    }
}
