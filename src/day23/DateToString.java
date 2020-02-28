package day23;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shirokansakai
 */
public class DateToString {
    public static String dateChangeFormat(Date date){
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sim.format(date);
    }
}
