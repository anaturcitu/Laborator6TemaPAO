package validation;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StudentValidation {

    public static boolean validateCnp(String cnp){
        if(!cnp.matches("[0-9]+"))
            return false;
        if(cnp.length() != 13)
            return false;
        return true;
    }

    public static boolean validateBirthYear(Date birthDate){
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.setTime(birthDate);
        if(LocalDate.now().getYear() - calendar.get(Calendar.YEAR) < 18)
            return false;
        return true;
    }

}
