package day35_inheritance.Computer;

public class Computer {

    String os;
    int memory;

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer" +
                "\n\tOS:" + os +
                "\n\tMemory: " + memory;
    }
}
