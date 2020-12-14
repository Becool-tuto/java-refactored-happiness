package com.tuto.factory;

import com.tuto.beans.Computer;
import com.tuto.beans.PC;
import com.tuto.beans.Server;
import com.tuto.beans.SuperComputer;

public class ComputerFactory {
    public static Computer createComputer(ComputerType type,String ram, String cpu,String hdd){
        Computer computer = null;
        switch (type){
            case PC:  computer = new PC(ram,cpu,hdd);
            break;
            case SERVER: computer = new Server(ram,cpu,hdd);
            break;
            case SUPER_COMPUTER: computer = new SuperComputer(ram,cpu,hdd);
            break;
        }
        return computer;
    }
}
