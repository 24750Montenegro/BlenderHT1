package uvg.edu;

/**
 * Interface representing a Blender with various functionalities.
 */
public interface IBlender {

    /**
     * Checks if the blender is on.
     *
     * @return true if the blender is on, false otherwise.
     */
    public boolean isOn();

    
    public boolean empty();

    public boolean isOff();
    /**
     * Checks if the blender is full.
     *
     * @return true if the blender is full, false otherwise.
     */
    public boolean isFull();

    /**
     * Adds an ingredient to the blender.
     *
     * @param ingredient the ingredient to be added.
     */
    public void addIngredient(String ingredient);

    /**
     * Increases the speed of the blender.
     */
    public void increaseSpeed();

    /**
     * Decreases the speed of the blender.
     */
    public void decreaseSpeed();

    /**
     * Fills the blender to its maximum capacity.
     */
    public void fill();

    /**
     * Gets the current speed of the blender.
     *
     * @return the current speed of the blender.
     */
    public int getSpeed();

    public boolean getState();
}