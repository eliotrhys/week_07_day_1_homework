public abstract class Kaiju {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return "ROAR!";
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attackVehicle(Vehicle vehicle){
        vehicle.getHealthValue() - getAttackValue();
    }

}
