package uvg.edu;

public interface IBlender {
    public boolean isOn();
    public boolean isFull();
    public void addIngredient(String ingredient);
    public void increaseSpeed();
    public void decreaseSpeed();
    public  void fill();
    public int getSpeed();
}
