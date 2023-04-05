public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new CaimanLizard("Кайман"));
        terrarium.addAnimal(new Chameleon("Хамелеон"));
        terrarium.addAnimal(new Axolotl("Аксолотль"));
        terrarium.addAnimal(new GiantTarantula("Гигантский птицеед"));
        terrarium.addAnimal(new BlueTarantula("Синий птицеед"));
        terrarium.addAnimal(new ChileanPinkTarantula("Чилийский розовый птицеед"));

        terrarium.ShowAnimal();
        terrarium.start();

    }
}