package by.tms.model;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Computer {
        public String CPU;
    public String RAM;
    public String HDD;
    public int cycle;
    private boolean isBurned;

    public Computer(){
        cycle = 10;
        isBurned = false;
    }

    public Computer(String CPU, String RAM, String HDD) {
        this();
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public Computer(String CPU, String RAM, String HDD, int cycle) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.cycle = cycle;
        this.isBurned = false;
    }

    public void outInfo(){
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("HDD: " + HDD);
        System.out.println("Cycles: "+cycle);
    }

    public void on(){
        if (!isBurned) {
            Random rnd = new Random();
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 0 or 1");
            if (scan.nextInt() == rnd.nextInt(0, 2)) {
                System.out.println("Computer launched");
            } else {
                System.out.println("Computer is burned :(");
                isBurned = true;
            }
        }
        else System.out.println("Computer is burned :(");
    }

    public void off(){
        if (!isBurned || cycle > 0){
            System.out.println("Computer off");
            cycle--;
        }
        else System.out.println("Computer burned :(");
    }
}
