public class BlueTarantula extends Spider implements Eggs {


    public BlueTarantula(String name) {
        super(name);
    }

    @Override
    public int eggs() {
        return 1750;
    }

    @Override
    public int BodyLength() {
        return 9;
    }

    @Override
    public String lifeexpectancy() {
        return "20 лет самки, 4 года самцы";
    }
}
