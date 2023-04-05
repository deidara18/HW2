public class ChileanPinkTarantula extends Spider implements Eggs {
    public ChileanPinkTarantula(String name) {
        super(name);
    }

    @Override
    public int eggs() {
        return 2000;
    }


    @Override
    public String lifeexpectancy() {
        return "от 15 до 20 лет";
    }

    @Override
    public int BodyLength() {
        return 10;
    }
}
