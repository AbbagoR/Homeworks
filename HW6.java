/**
 * Java 1. Homework 6
 * 
 * @author Mikhail Dementev
 * @version 02.02.2022 - 03.02.2022
 */
 
class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat (200);
        Dog dog = new Dog (500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(290));
            System.out.println(animal.run(590));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(50));
        }
    }
}

class Cat extends Animal {
    Cat(int runlimit, int swimlimit) {
        super(runlimit, swimlimit);
    }

    Cat(int runlimit) {
        super(runlimit, -1);
    }
    @Override
    public String swim(int distance) {
        return getClassName() + " can't swim";
    }
}


class Dog extends Animal {
    Dog(int runlimit, int swimlimit) {
        super(runlimit, swimlimit);
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}

abstract class Animal implements IAnimal {
    protected String className;
    protected int runlimit;
    protected int swimlimit;

    Animal(int runlimit, int swimlimit) {
        this.runlimit = runlimit;
        this.swimlimit = swimlimit;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }
    

    @Override
    public String run(int distance) {
        if (distance > runlimit) {
            return className + " can't run " + distance;
        } else {
            return className + " run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimlimit) {
            return className + " can't swim " + distance;
        } else {
            return className + " swim " + distance;
        }
    }

    @Override 
    public String toString() {
        return className + " runlimit: " + runlimit + ", swimlimit: " + swimlimit;
    }
}