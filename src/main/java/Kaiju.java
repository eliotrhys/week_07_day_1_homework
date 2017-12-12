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

    public int attackVehicle(Vehicle vehicle){
        int variable = vehicle.getHealthValue() - getAttackValue();
        int variable2 = vehicle.healthValue - variable;
        vehicle.setHealthValue(variable2);
        return vehicle.getHealthValue();
    }



}
