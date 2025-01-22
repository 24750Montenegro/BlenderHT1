package uvg.edu;

/**
 * Interface representing a Blender with various functionalities.
 * Javier Alvarado - 24546
 * Jonathan Tubac - 24484
 * Juan Montenegro - 24750
 */
public interface IBlender {

    /**
     * Checks the power status of the blender.
     *
     * @return byte 1 if the blender is on, 0 if it is off.
     */
    public byte checkPowerStatus();

    /**
     * Switches the power status of the blender.
     *
     * @return byte 1 if the blender is turned on, 0 if it is turned off.
     */
    public byte switchPowerStatus();

    /**
     * Fills the blender with a specified product and amount.
     *
     * @param prod A string representing the product the user is filling the blender with.
     * @param ml A float representing the amount in milliliters to fill the blender with.
     */
    public void fillBlender(String prod, float ml);

    /**
     * Gets the current capacity of the blender.
     *
     * @return float The current capacity of the blender in milliliters.
     */
    public float actualCapacity();

    /**
     * Fills the blender with a specified product to its maximum capacity.
     *
     * @param prod A string representing the product the user is filling the blender with.
     */
    public void fillBlender(String prod);

    /**
     * Increases the speed of the blender by one unit.
     */
    public void increaseSpeed();

    /**
     * Decreases the speed of the blender by one unit.
     */
    public void decreaseSpeed();

    /**
     * Checks the current speed of the blender.
     *
     * @return byte The current speed of the blender.
     */
    public byte checkSpeed();

    /**
     * Checks if the blender is full.
     *
     * @return boolean True if the blender is full, false otherwise.
     */
    public boolean isFull();

    /**
     * Empties the contents of the blender.
     */
    public void emptyBlender();

    /**
     * Empties a specified amount from the blender.
     *
     * @param ml A float representing the amount in milliliters to empty from the blender.
     */
    public void emptyBlender(float ml);
}