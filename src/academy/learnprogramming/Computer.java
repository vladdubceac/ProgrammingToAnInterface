package academy.learnprogramming;

interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule{

    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements DisplayModule{

    @Override
    public void display() {
        System.out.println("Display through projector");
    }
}

public class Computer{
    DisplayModule displayModule;

    public void setDisplayModule(DisplayModule dm) {
        this.displayModule = dm;
    }

    public void display(){
        displayModule.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        DisplayModule dm = new Monitor();
        DisplayModule dm1 = new Projector();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm1);
        cm.display();
    }
}