package uvg.edu;

public class Blender implements IBlender {

    private byte powerStatus;
    private byte speed;
    private float capacity;
    private float actualCapacity;

    public Blender() {
        this.powerStatus = 0;
        this.speed = 0;
        this.capacity = 1000;
        this.actualCapacity = 0;
    }

    @Override
    public boolean isFull() {
        return this.actualCapacity == this.capacity;
    }

    @Override
    public byte checkPowerStatus() {
        return this.powerStatus;
    }

    @Override
    public byte switchPowerStatus() {
        this.powerStatus = (byte) (this.powerStatus == 0 ? 1 : 0);
        return this.powerStatus;
    }

    @Override
    public void fillBlender(String prod, float ml) {
        if (this.actualCapacity + ml <= this.capacity) {
            this.actualCapacity += ml;
        } else {
            System.out.println("No se puede llenar la licuadora con esa cantidad de producto.");
        }
    }

    @Override
    public float actualCapacity() {
        return this.actualCapacity;
    }

    @Override
    public void fillBlender(String prod) {
        this.fillBlender(prod, 100);
    }

    @Override
    public void increaseSpeed() {
        if (this.speed < 10) {
            this.speed++;
        } else {
            System.out.println("La licuadora ya está a máxima velocidad.");
        }
    }

    @Override
    public void decreaseSpeed() {
        if (this.speed > 0) {
            this.speed--;
        } else {
            System.out.println("La licuadora ya está a mínima velocidad.");
        }
    }

    @Override
    public byte checkSpeed() {
        return this.speed;
    }

    @Override
    public void emptyBlender() {
        this.actualCapacity = 0;
    }

    @Override
    public void emptyBlender(float ml) {
        if (this.actualCapacity - ml >= 0) {
            this.actualCapacity -= ml;
        } else {
            System.out.println("No se puede vaciar la licuadora con esa cantidad de producto.");
        }
    }


}

