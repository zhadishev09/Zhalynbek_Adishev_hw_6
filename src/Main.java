public class Main {
    public static void main(String[] args) {

       Weapon bossWeapon = new Weapon(WeaponType.COLD_WEAPONS, "Axe");
       Boss boss = new Boss("Roshan", 5000, 160, bossWeapon);
        System.out.println(boss.printInfo());


        Weapon sceletonWeapon1 = new Weapon(WeaponType.FIREARMS, "Fire arrows");
        Sceleton sceleton1 = new Sceleton("Clinks ", 100, 15, sceletonWeapon1, 25);


        Weapon sceletonWeapon2 = new Weapon(WeaponType.CHEMICAL_WEAPONS, "Fire arrows");
        Sceleton sceleton2 = new Sceleton("Clinks 2 ", 100, 15, sceletonWeapon2, 3);

        System.out.println(sceleton1.printInfo());

        System.out.println(sceleton2.printInfo());














    }
}