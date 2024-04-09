package curs11.tema;

class Monkey extends Primate implements BasicNeeds {
    
    public String eat() {
        return "Mostly herbivore";
    }

    public void sleep() {
        System.out.println("I need to sleep!");
    }

    public void drink() {
    }

    void speak() {
        System.out.println("cannot speak");
    }
}