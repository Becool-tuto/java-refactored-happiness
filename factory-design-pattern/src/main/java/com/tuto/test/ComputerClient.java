package com.tuto.test;

import com.tuto.beans.Computer;
import com.tuto.factory.ComputerFactory;
import com.tuto.factory.ComputerType;

public class ComputerClient {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.createComputer(ComputerType.PC,"1GB","intel core 2","250GB");
        Computer server = ComputerFactory.createComputer(ComputerType.SERVER,"2GB","AMD ryzen 5","500GB");
        Computer superComputer = ComputerFactory.createComputer(ComputerType.SUPER_COMPUTER,"32GB","intel core i9-10900k","10TB");
    }
}
