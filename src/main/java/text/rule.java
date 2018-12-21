package text;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rule {

    public static void main(String[] args) {
       /* System.out.println("start");

        Pattern pattern = Pattern.compile("(?<=\\[)(.+?)(?=\\])");
        String ex = "{\"isEligibleStudio\": {\"studioType_default\": {\"city_0\": {\"type_0\": \"#monthTurnover>=[targetValue_eligibleStudioTurnover]&&#validEmployees>=[targetValue_eligibleStudioEmployees]\"} } } }";
        String ex1 = "{\"coefficient\": {\"studioType_default\": {\"city_0\": {\"type_0\": \"#childStudioType==2?1:(#eligibleChildTotoal==0?0:(#eligibleChildTotoal==1?1:(#eligibleChildTotoal==2?1.1:(#eligibleChildTotoal==3?1.2:(#eligibleChildTotoal==4?1.3:(#eligibleChildTotoal==5?1.5:((#eligibleChildTotoal>=6&&#eligibleChildTotoal<=14)?1.7:((#eligibleChildTotoal>=15&&#eligibleChildTotoal<=19)?1.8:#eligibleChildTotoal>=20?2:0))))))))\"} } } }";
        Matcher m = pattern.matcher(ex1);
        ArrayList elements = new ArrayList();
        System.out.println("ex1");
        new BigDecimal("12.22").setScale(2,4);
        while(m.find()) {
            System.out.println(m.group());
            elements.add(m.group());
        }*/

        String path = String.format("bonusconf.%s.studioType_%d.city_%d.type_%d","ratio",111,11,22);
        System.out.println(path);

    }

}
