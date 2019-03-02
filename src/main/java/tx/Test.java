package tx;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        boolean isRankingShow = false;
        try {

            Date date1 = format.parse("2019-01-02 21:00:00");
            Date date2 = format.parse("2019-03-03 21:00:00");

            boolean a = date1.after(date2);
            boolean b = date2.after(date1);
            boolean c =  date1.before(date2);
            boolean d =  date2.before(date1);


            boolean e = date1.before(new Date());
            boolean f = date2.before(new Date());
            System.out.println(isRankingShow);
        } catch (ParseException e) {
            isRankingShow = false;
        }
    }

}
