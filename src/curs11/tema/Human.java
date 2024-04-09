package curs11.tema;

class Human extends Primate implements BasicNeeds {
    
    public String eat() {
        return "Omnivore";
    }

    public void sleep() {
        System.out.println("I need to sleep!");
    }

    public void drink() {
    }
}