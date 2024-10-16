import java.util.Scanner;

public class Example {
    private static Scanner scanner = new Scanner(System.in);
    private static TrigReciprocal trigReciprocal = new TrigReciprocal();
    
    public static void main(String[] args) throws Exception {
        System.out.println("--- Please choose a trigonometric reciprocal identity ---");
        System.out.println("1 = Cosecant (csc)");
        System.out.println("2 = Secant (sec)");
        System.out.println("3 = Cotangent (cot)");
        
        System.out.print("Chosen identity: ");
        int choice = scanner.nextInt();

        System.out.print("Please enter a number: ");
        double solving = scanner.nextDouble();

        if (choice == 1) {
            double solved = trigReciprocal.cosecant(solving);
            
            System.out.println(String.format("csc(%s) = %s", solving, solved));
            System.out.println(String.format("Cosecant of %s is %s radians", solving, solved));
        } else if (choice == 2) {
            double solved = trigReciprocal.secant(solving);
            
            System.out.println(String.format("sec(%s) = %s", solving, solved));
            System.out.println(String.format("Secant of %s is %s radians", solving, solved));
        } else if (choice == 3) {
            double solved = trigReciprocal.cotangent(solving);
            
            System.out.println(String.format("cot(%s) = %s", solving, solved));
            System.out.println(String.format("Cotangent of %s is %s radians", solving, solved));
        }

        scanner.close();
    }
}
