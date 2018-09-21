package com.andi;

public class Main {

    public static void main(String[] args) {

        CPU cpu = new CPU();
        HardDrive hd =new HardDrive();
        Memory memory = new Memory();

        ComputerFacade computerFacade = new ComputerFacade(cpu, hd, memory);
        computerFacade.start();
    }
}
