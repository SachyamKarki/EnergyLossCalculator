package physics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Spring Compression Energy Calculator");
        System.out.println("------------------------------------");
        
        System.out.print("Enter initial energy (J): ");
        double initialEnergy = scanner.nextDouble();
        
        System.out.print("Enter compression on frictionless surface (m): ");
        double frictionlessCompression = scanner.nextDouble();
        
        System.out.print("Enter compression on rough surface (m): ");
        double roughCompression = scanner.nextDouble();
        
        EnergyCalculator calculator = new EnergyCalculator(
            initialEnergy, 
            frictionlessCompression, 
            roughCompression
        );
        
        System.out.println("\nResults:");
        System.out.printf("Spring constant (k): %.2f N/m%n", calculator.calculateSpringConstant());
        System.out.printf("Energy lost to friction: %.2f J%n", calculator.calculateEnergyLost());
        
        scanner.close();
    }
}