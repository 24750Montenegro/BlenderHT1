package uvg.edu;

/**
 * Class representing a Blender that implements the IBlender interface.
 * Javier Alvarado - 24546
 * Jonathan Tubac - 24484
 * Juan Montenegro - 24750
 */
public class Blender implements IBlender {

    private byte powerStatus;
    private byte speed;
    private float capacity;
    private float actualCapacity;

    /**
     * Constructor for the Blender class.
     * Initializes the blender with default values.
     */
    public Blender() {
        this.powerStatus = 0;
        this.speed = 0;
        this.capacity = 1000;
        this.actualCapacity = 0;
    }

    /**
     * Checks if the blender is full.
     *
     * @return boolean True if the blender is full, false otherwise.
     */
    @Override
    public boolean isFull() {
        return this.actualCapacity == this.capacity;
    }

    /**
     * Checks the power status of the blender.
     *
     * @return byte 1 if the blender is on, 0 if it is off.
     */
    @Override
    public byte checkPowerStatus() {
        return this.powerStatus;
    }

    /**
     * Switches the power status of the blender.
     *
     * @return byte 1 if the blender is turned on, 0 if it is turned off.
     */
    @Override
    public byte switchPowerStatus() {
        this.powerStatus = (byte) (this.powerStatus == 0 ? 1 : 0);
        return this.powerStatus;
    }

    /**
     * Fills the blender with a specified product and amount.
     *
     * @param prod A string representing the product the user is filling the blender with.
     * @param ml A float representing the amount in milliliters to fill the blender with.
     */
    @Override
    public void fillBlender(String prod, float ml) {
        if (this.actualCapacity + ml <= this.capacity) {
            this.actualCapacity += ml;
        } else {
            System.out.println("No se puede llenar la licuadora con esa cantidad de producto.");
        }
    }

    /**
     * Gets the current capacity of the blender.
     *
     * @return float The current capacity of the blender in milliliters.
     */
    @Override
    public float actualCapacity() {
        return this.actualCapacity;
    }

    /**
     * Fills the blender with a specified product to its maximum capacity.
     *
     * @param prod A string representing the product the user is filling the blender with.
     */
    @Override
    public void fillBlender(String prod) {
        this.fillBlender(prod, 100);
    }

    /**
     * Increases the speed of the blender by one unit.
     */
    @Override
    public void increaseSpeed() {
        if (this.speed < 10) {
            this.speed++;
        } else {
            System.out.println("La licuadora ya está a máxima velocidad.");
        }
    }

    /**
     * Decreases the speed of the blender by one unit.
     */
    @Override
    public void decreaseSpeed() {
        if (this.speed > 0) {
            this.speed--;
        } else {
            System.out.println("La licuadora ya está a mínima velocidad.");
        }
    }

    /**
     * Checks the current speed of the blender.
     *
     * @return byte The current speed of the blender.
     */
    @Override
    public byte checkSpeed() {
        return this.speed;
    }

    /**
     * Empties the contents of the blender.
     */
    @Override
    public void emptyBlender() {
        this.actualCapacity = 0;
    }

    /**
     * Empties a specified amount from the blender.
     *
     * @param ml A float representing the amount in milliliters to empty from the blender.
     */
    @Override
    public void emptyBlender(float ml) {
        if (this.actualCapacity - ml >= 0) {
            this.actualCapacity -= ml;
        } else {
            System.out.println("No se puede vaciar la licuadora con esa cantidad de producto.");
        }
    }
}
