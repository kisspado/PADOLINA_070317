package padolina_070317;
public class Demo {
    
    public static void main(String[] args){
        FlyingSuperHero fsh = new FlyingSuperHero();
        Spiderman sh = new Spiderman();
        //fsh.displayPower();
        //sh.displayPower();
        fsh.setSuperPowers("new Power", 2);
        fsh.printSuperPowers();
    }
}
