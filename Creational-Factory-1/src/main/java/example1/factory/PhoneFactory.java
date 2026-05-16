package example1.factory;

import example1.models.IPhone;
import example1.models.Phone;
import example1.models.Samsung;

public class PhoneFactory {

    public Phone createPhone(String type) {

        //  There is not COP Solid !!!
        // Because If Else  in this Class
        // For repair Solid --> Abstract Factory Design

        if (type.equalsIgnoreCase("iphone")) {

            IPhone iphone = new IPhone("Intel", "Apple");
            // Set AnyThing You Want !
            iphone.setNumberOfCameras(4);
            return iphone;
        } else if (type.equalsIgnoreCase("samsung")) {
            Samsung samsung = new Samsung("AMD", "Samsung");
            // Set AnyThing You Want !
            return samsung;
        } else {
            System.out.println("\n\n        Invalid Phone Type");
            return null;
        }
    }


}
