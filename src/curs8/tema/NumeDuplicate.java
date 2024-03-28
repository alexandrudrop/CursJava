package curs8.tema;

public class NumeDuplicate {
    public static void main(String[] args) {
        
        String[] array = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};

        
        boolean avemDuplicate = false;

        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    avemDuplicate = true;
                    System.out.println("Nume duplicat: " + array[i]);
                }
            }
        }

        
        if (avemDuplicate) {
            System.out.println("Process finished with exit code 0.");
        } else {
            System.out.println("Nu avem duplicate.");
        }
    }
}
