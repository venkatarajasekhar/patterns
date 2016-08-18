package creational.factory;

import java.util.Date;

/**
 * Created by roman on 8/17/16.
 */
public class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
