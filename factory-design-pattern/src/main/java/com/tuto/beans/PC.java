package com.tuto.beans;

public class PC implements Computer{

    private String RAM;
    private String CPU;
    private String HDD;


    public PC(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    public String getRam() {
        return this.RAM;
    }

    public String getCPU() {
        return this.CPU;
    }

    public String getHDD() {
        return this.HDD;
    }
}
