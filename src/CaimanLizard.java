public class CaimanLizard extends Reptiles implements BodyLength {
    public CaimanLizard(String name) {
        super(name);
    }


    @Override
    public int BodyLength() {
        return 100;
    }

    @Override
    public String food() {
        return "Насекомые";
    }

    @Override
    public String lifeexpectancy() {
        return "В неволе живут около 2 лет";
    }
}
