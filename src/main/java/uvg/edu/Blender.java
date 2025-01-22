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

    @Override
    public void onOff() {
        this.on = !this.on;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public boolean isFull() {
        return this.full;
    }

    @Override
    public void addIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public void increaseSpeed() {
        if(this.speed <= 10){
            this.speed++;
        }
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed >= 0){
            this.speed--;
        }
    }

    @Override
    public void fill() {
        if(this.speed == 0){
            this.full = true;
        }else {
            this.full = false;
        }

    }

    @Override
    public boolean empty(){
        if(this.speed == 0){
            return this.full = false;
        }else{
            return this.full = true;
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public boolean getState() {
        return on;
    }
}