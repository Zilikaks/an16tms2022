package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Some CPU","Some RAM", "Some HDD",3);
        comp.outInfo();
        comp.on();
        comp.outInfo();
        comp.off();
        comp.outInfo();
        comp.on();
        comp.outInfo();
        comp.off();
        comp.outInfo();
        comp.on();
        comp.outInfo();
        comp.off();
        comp.outInfo();
        comp.on();
        comp.outInfo();
        comp.off();

    }
}
