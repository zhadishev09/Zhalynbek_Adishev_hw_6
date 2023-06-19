public class Sceleton extends Boss {
    private int arrowCount;

    public Sceleton(String name, int health, int damage, Weapon weapon, int arrowCount) {
        super(name, health, damage, weapon);
        this.arrowCount = arrowCount;


    }

    public int getArrowCount() {
        return arrowCount;

    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public String printInfo() {
        return "Sceleton " +
                "Name: " + getName() + "\n" +
                "Health: " + getHealth() + "\n" +
                "Weapon Type: " + getWeapon().getWeaponType() + "\n" +
                "Weapon Name: " + getWeapon().getWeaponName() + "\n" +
                "Damage: " + getDamage() + "\n" +
                "Arrow count: " + arrowCount;


    }
}

