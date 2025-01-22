package uvg.edu;

public class Blender implements IBlender {
    private boolean on;
    private boolean full;
    private String ingredient;
    private int speed;

    public Blender() {
        this.on = false;
        this.full = false;
        this.ingredient = "";
        this.speed = 0;
    }

    public boolean isOn() {
        this.on = true;
        return on;
    }

    public boolean isOff(){
        this.on = false;
        return on;
    }
    public boolean isFull() {
        return this.full;
    }

    public void addIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void increaseSpeed() {
        this.speed++;
    }

    public void decreaseSpeed() {
        this.speed--;
    }

    public void fill() {
        this.full = true;
    }
    
    public boolean empty(){
        return this.full = false;
    }
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public boolean getState() {
        return on;
    }
}