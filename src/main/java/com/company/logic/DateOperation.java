package com.company.logic;

import com.company.tools.ConstantData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.LocalDate;
import org.joda.time.Period;

/**
 *
 * @author santiago.mamani
 */
public class DateOperation {

    public static int getYearCurrent() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }

    /*
    * This method must necessarily receive a valid formatted date.
    * Otherwise the "catch" must be implemented.
     */
    public static int diferenceYear(String date) {
        int year = -1;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(ConstantData.SIMPLE_DATE_FORMAT);
            Date dateO = dateFormat.parse(date);
            LocalDate pdate = LocalDate.fromDateFields(dateO);
            LocalDate now = LocalDate.now();
            Period diff = Period.fieldDifference(pdate, now);
            if (diff.getYears() > 0) {
                if (diff.getMonths() > 0) {
                    return diff.getYears();
                } else {
                    if (diff.getMonths() == 0) {
                        if (diff.getDays() > 0) {
                            return diff.getYears();
                        }
                    }
                    return diff.getYears() - 1;
                }
            }
        } catch (ParseException ex) {
            //Implement if the input date parameter is an invalid format
        }
        return year;
    }
}
