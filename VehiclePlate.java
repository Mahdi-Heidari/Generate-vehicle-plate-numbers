package vehicleplate;

import java.util.Random;

public class VehiclePlate {

    public static void main(String[] args) {
        generatePlate(10);

    }

    //       A vehicle plate number consists of three uppercase letters followed by four digits
    public static void generatePlate(int num) {

        Random random = new Random();
        String plate = "";
        for (int i = 0; i < num; i++, plate = "") {

            for (int j = 0; j < 3; j++) {
                plate += (char) ('A' + Math.random() * 26);
//            plate = plate.concat((char) ('A' + Math.random() * 26) + "");
            }
            /*
             for (int i = 0; i < 4; i++) {
             plate += (int) (Math.random() * 10);
             //            plate = plate.concat((Math.random() * 10) + "");
             }
             */
            plate += (int) (1000 + Math.random() * 9000);
            System.out.println(plate);
        }

    }

}
