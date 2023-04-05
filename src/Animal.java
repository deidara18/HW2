public abstract class Animal {
    private String name;


    public abstract String food();

    public abstract int BodyLength();

    public abstract String lifeexpectancy();

    public Animal(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Название вида: %s\n", this.name))
                .append(String.format("Продолжительность жизни: %s\n", this.lifeexpectancy()))
                .append(String.format("Длинна тела: %s\n", this.BodyLength()))
                .append(String.format("Чем питаются: %s\n", this.food()));
        return res.toString();
    }
}