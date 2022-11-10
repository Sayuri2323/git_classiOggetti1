package it.develhope.esercizio;


public class Main {
    public static void main(String[] args) {
  Programmer persona= new Programmer();
  persona.name="giulia";
  persona.age=26;
  persona.wearGlasses=true;
        System.out.println(persona.toDrinkCoffee());
        System.out.println("------------------------------");
        System.out.println(persona.printDetails());
        System.out.println("------------------------------");
        System.out.println(persona.hasGlasses());
        System.out.println("------------------------------");

        TestProgrammers javaTester1=new TestProgrammers();
        javaTester1.name="sayuri";
        javaTester1.age=23;
        javaTester1.wearGlasses=false;

        System.out.println(javaTester1.toDrinkCoffee());
        System.out.println("---------------------------");
        System.out.println(javaTester1.printDetails());
        System.out.println("---------------------------s,,");


        TestProgrammers javaTester2=new TestProgrammers();
        javaTester2.name="hatsumomo";
        javaTester2.age=18;
        javaTester2.wearGlasses=true;

        System.out.println(javaTester2.printDetails());
        System.out.println("------------------------");
        System.out.println(javaTester2.hasGlasses());
    }
    }


