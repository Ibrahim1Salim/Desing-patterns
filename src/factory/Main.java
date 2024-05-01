package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type= scanner.next();
        VehicleFactory vehicleFactory=new VehicleFactory();
        Vehicle vehicle1=VehicleFactory.createVehicle("car");
        Vehicle vehicle2=VehicleFactory.createVehicle("motorcycle");
    }
}
