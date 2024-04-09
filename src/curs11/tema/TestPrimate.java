package curs11.tema;

public class TestPrimate {
    public static void main(String[] args) {
        
        Human human = new Human();
        Monkey monkey = new Monkey();
        
        System.out.println("Primate dataType instance of Human:");
        System.out.println("-------------------------");
        human.walk();
        human.run();
        System.out.println(human.eat());
        human.speak();
        human.sleep();

        System.out.println("\nPrimate dataType instance of Monkey:");
        System.out.println("-------------------------");
        monkey.walk();
        monkey.run();
        monkey.sleep();
        System.out.println(monkey.eat());
        monkey.speak();
    }
}