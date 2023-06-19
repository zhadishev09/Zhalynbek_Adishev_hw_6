public class Boss extends GameEntity{

    private Weapon weapon;

    public Boss (String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;

    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss" +
                "Name: " + getName() + "\n" +
                "Health: " + getHealth() + "\n"+
                "Weapon Type: " + weapon.getWeaponType() + "\n" +
                "Weapon Name: " + weapon.getWeaponName()+ "\n"+
                "Damage: " + getDamage() + "\n";



    }

}
