public abstract class Spider extends Animal {
    public Spider(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "Беспозвоночными";
    }

    @Override
    public String lifeexpectancy() {
        return "";
    }

}
