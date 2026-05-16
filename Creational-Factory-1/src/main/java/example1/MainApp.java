package example1;

import example1.factory.PhoneFactory;
import example1.models.IPhone;
import example1.models.Phone;
import example1.models.Samsung;

public class MainApp {


    public static void main(String[] args) {

//    Wrong Code !!!
//        Phone iPhone14 = new IPhone();
//        iPhone14.manufacture();
//
//        Phone s22 = new Samsung();
//        s22.manufacture();


        //  Correct Code ☻
        PhoneFactory phoneFactory = new PhoneFactory();

        Phone iPhone14 = phoneFactory.createPhone("iphone");
        iPhone14.manufacture();
        Phone s22 = phoneFactory.createPhone("samsung");
        s22.manufacture();
    }


}
