/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padolina_070317;

abstract class SuperHero{
    String superPowers[];
    SuperHero(){
        this.superPowers = new String[5];
        this.superPowers[0] = "First Powers!";
        this.superPowers[1] = "Second Powers!";
        this.superPowers[2] = "Third Power!";
        this.superPowers[3] = "Fourth Power";
        this.superPowers[4] = "Fifth Power";
    }
    void setSuperPowers(String power, int elements){
        this.superPowers[elements] = power;
    }
    void setSuperPowers(String superPowers[]){
        this.superPowers = superPowers;
    }
    void printSuperPowers(){
        for(int i = 0; i < superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
    abstract void displayPower();
}