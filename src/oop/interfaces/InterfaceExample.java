package oop.interfaces;

//Interface does not have a body
interface Bug{
    public void bugSound(); //we will need to create a method bugSound
    public void bugSize();
}

interface Location{
    public void location();
}

class Ant implements Bug,Location{
    // for interfaces needed "implements"; with "," can combine 2xinterfaces
    public void bugSound() {
            System.out.println("Tssss");
    }

    public void bugSize() {
        System.out.println("Small");
    }

    public void location() {
        System.out.println("Forest");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();
    }
}
