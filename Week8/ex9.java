package Week8;

import java.util.ArrayList;
import java.util.HashMap;

public class ex9 {
    public static void main(String[] args) {
        RegistrationPlate plate1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate plate2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate plate3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> plates = new ArrayList<RegistrationPlate>();
        plates.add(plate1);
        plates.add(plate2);
        plates.add(plate3);

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(plate1, "Arto");
        owners.put(plate2, "Jukka");

        System.out.println("Owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-444")));
        System.out.println(owners.get(new RegistrationPlate("FI", "UXE-555")));
    }
}
