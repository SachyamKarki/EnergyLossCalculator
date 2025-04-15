package physics;


public class EnergyCalculator {
    private final double initialEnergy;  // in joules
    private final double frictionlessCompression;  // in meters
    private final double roughCompression;  // in meters
    
    public EnergyCalculator(double initialEnergy, 
                          double frictionlessCompression, 
                          double roughCompression) {
        this.initialEnergy = initialEnergy;
        this.frictionlessCompression = frictionlessCompression;
        this.roughCompression = roughCompression;
    }
 
    public double calculateSpringConstant() {
        return (2 * initialEnergy) / Math.pow(frictionlessCompression, 2);
    }
   
    public double calculateEnergyLost() {
        double k = calculateSpringConstant();
        double roughEnergy = 0.5 * k * Math.pow(roughCompression, 2);
        return initialEnergy - roughEnergy;
    }
    public double getInitialEnergy() { return initialEnergy; }
    public double getFrictionlessCompression() { return frictionlessCompression; }
    public double getRoughCompression() { return roughCompression; }
}
