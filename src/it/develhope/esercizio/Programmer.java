package it.develhope.esercizio;

public class Programmer {
    public String name;
    public int age;
    public boolean wearGlasses;
    public String toDrinkCoffee(){
        return "Espresso is the secret";
    }
public String printDetails(){
    return "mi chiamo  "+ this.name+" "+"e ho  "+this.age+ " "+"anni";

}
public String hasGlasses(){
        return this.name+" "+"porta gli occhiali?"+ " "+ this.wearGlasses;
}



}
