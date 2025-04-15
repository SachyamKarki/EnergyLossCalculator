package physics;

/**
 * Calculates energy loss when an object compresses a spring on different surfaces
 */
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
    
    /**
     * Calculates the spring constant based on frictionless compression
     */
    public double calculateSpringConstant() {
        return (2 * initialEnergy) / Math.pow(frictionlessCompression, 2);
    }
    
    /**
     * Calculates energy lost due to friction on rough surface
     */
    public double calculateEnergyLost() {
        double k = calculateSpringConstant();
        double roughEnergy = 0.5 * k * Math.pow(roughCompression, 2);
        return initialEnergy - roughEnergy;
    }
    
    // Getters
    public double getInitialEnergy() { return initialEnergy; }
    public double getFrictionlessCompression() { return frictionlessCompression; }
    public double getRoughCompression() { return roughCompression; }
}