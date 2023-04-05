import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terrarium {
    private static Scanner scanner = new Scanner(System.in);
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void ShowAnimal() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }


    public List<BodyLength> getBigBodyLength() {
        List<BodyLength> len = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof BodyLength)
                len.add((BodyLength) animal);
        }
        return len;
    }

    public Animal Big() {
        List<BodyLength> len = getBigBodyLength();
        BodyLength max = len.get(0);

        for (BodyLength body : len) {
            if (max.BodyLength() > body.BodyLength()) {
                max = body;

            }
        }
        return (Animal) max;
    }

    public List<BodyLength> getSmallBodyLength() {
        List<BodyLength> len = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof BodyLength)
                len.add((BodyLength) animal);
        }
        return len;
    }

    public Animal Small() {
        List<BodyLength> len = getSmallBodyLength();
        BodyLength max = len.get(0);

        for (BodyLength body : len) {
            if (max.BodyLength() < body.BodyLength()) {
                max = body;

            }
        }
        return (Animal) max;
    }


    public List<Eggs> getEggs() {
        List<Eggs> len = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Eggs)
                len.add((Eggs) animal);
        }
        return len;
    }

    public Spider Eggs() {
        List<Eggs> len = getEggs();
        Eggs max = len.get(0);

        for (Eggs egg : len) {
            if (max.eggs() < egg.eggs()) {
                max = egg;

            }
        }
        return (Spider) max;
    }


    public String getOperations() {

        String text = """
                Выберите опрерацию:\s
                 1. Вывести список\s
                 2. Самая маленькая рептилия\s
                 3. Самая большая рептилия\s
                 4. Многодетная мать\s
                 5. Завершить""";

        System.out.println(text);

        String answer = scanner.next();

        return answer;
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            String operation = getOperations();
            switch (operation) {
                case "5" -> {
                    flag = false;
                    scanner.close();
                }
                case "1" -> ShowAnimal();
                case "2" -> System.out.println(Big());
                case "3" -> System.out.println(Small());
                case "4" -> System.out.println(Eggs());

            }

        }
    }
}


