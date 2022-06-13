package ArtGallery;

abstract class Customers {
    String name;
    int budget;
    int age;
    int number; // how many pieces the customer wants to buy
    String favor; // modern abstract sculpture

    public Customers(String name, int budget, int age, int number, String favor){
        this.name = name;
        this.budget = budget;
        this.age = age;
        this.number = number;
        this.favor = favor;
    }

    abstract boolean isOldEnough();
    abstract boolean isBuyingAnything();

    void getCustomerInfo() {
        System.out.println("customer name: " + name);
        System.out.println("customer budget: " + budget);
        System.out.println("customer age: " + age);
        System.out.println("customer favor: " + age);
    }

    static class HumanBuyAnything extends Customers{
        public HumanBuyAnything(String name, int budget, int age, int number, String favor) {
            super(name, budget, age, number, favor);
        }
        @Override
        boolean isOldEnough() {
            return age>18;
        }

        @Override
        boolean isBuyingAnything() {
            return true;
        }
    }

    static class HumanCareful extends Customers{
        public HumanCareful(String name, int budget, int age, int number, String favor) {
            super(name, budget, age, number, favor);
        }

        @Override
        //Human that is careful when buying arts are always old enough
        boolean isOldEnough() {
            return true;
        }

        @Override
        boolean isBuyingAnything() {
            return false;
        }
    }
}
