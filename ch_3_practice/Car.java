

/**
 * A car class tracks fuel capacigy and consumption based on efficiency
 * 
 * @author Simar
 * @version 12 September 2014
 */
public class Car
{
    /**fuel efficiency of the car measured in miles per gallon (mpg)*/
    private double fuelEfficiency;
    
    /** amount of fuel in gas tank measured in gallons*/
    private double fuelInTank;

    /**
     * Constructor that specifies the fuel efficiency of this car
     */
    public Car(double efficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * The drive method resduces the fuel in the tank based on the specified miles and the
     * efficiency of this car.
     * @pre        preconditions for the method
     *            this method is never invoked with a value with a value for miles that 
     *            consumes more than the available gas in the tank.
     *            (what the method guarantees upon completion)
     * @param   miles number of miles driv
     * @return    description of the return value/**
 * An example of a method - replace this comment with your own
 *  that describes the operation of the method
 *
 * @pre     preconditions for the method
 *          (what the method assumes about the method's parameters and class's state)
 * @post    postconditions for the method
 *          (what the method guarantees upon completion)
 * @param   y   description of parameter y
 * @return  description of the return value
 */

    public void drive(int miles)
    {
        // put your code here
        double gallonsBurned = miles / this.fuelEfficiency; 
        this.fuelInTank = this.fuelInTank - gallonsBurned;
 }
       /**
     * adds the specified am\ount of gas in gallons to this car's tank
     * 
     * @pre     the specified amount of gas doesn't exceed the capackty of this car's tank
     * 
     * @param   gallons number of gallons of gas to add to this car's tank
 */
public void addGas(int gallons)
    {
        // put your code here
        this.fuelInTank = this.fuelInTank + gallons;
    }
           /**
     * Returns ht enumber of gallons of gas remaining in this car's tank
     *
     * @return   number of gallons remaining
 */
public double getGasInTank()
    {
        // put your code here
        return fuelInTank;
    }

}
