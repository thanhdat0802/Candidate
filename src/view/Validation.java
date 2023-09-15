package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validation {

    public Validation() {
    }
    final static String DATE_FORMAT = "dd/MM/yyyy";

    public String checkPhone(String input) throws Exception {
        while (true) {
            String temp = input.trim();
            if (temp == null || temp.length() != 10) {
                return null;
            }
            if (!temp.startsWith("09")) {
                return null;
            }

            for (int i = 2; i < temp.length(); i++) {
                if (((temp.charAt(i)) > '9') || ((temp.charAt(i)) < '0')) {
                    return null;
                }
            }

            return temp;
        }
    }

    public String checkID(String input) throws Exception {
        while (true) {
            String temp = input.trim();
            if (temp == null || temp.length() != 4) {
                return null;
            }
            for (int i = 2; i < 4; i++) {
                if (((temp.charAt(i)) > '9') || ((temp.charAt(i)) < '0')) {
                    return null;
                }
            }
            if (temp.substring(0, 2).equalsIgnoreCase("KH")) {
                return temp.toUpperCase();
            }
            return null;
        }

    }

    public Date checkValidDate(String msg) {
        while (true) {

            try {
                return validStringToDate(msg);
            } catch (ParseException ex) {
                System.out.println(msg + "Invalid date. Date format: dd/mm/yyyy");
                return null;
            }

        }

    }

    public Date validStringToDate(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        // df.setLenient(false);
        return df.parse(date);
    }

    public String showDate(Date date) {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        return df.format(date);
    }

    public int checkInt(String input) throws Exception {
        while (true) {
            String temp = input.trim();
            int rs = Integer.parseInt(temp);
            if ((rs >= 0) && (rs <= 100)) {
                return rs;
            }
            return -1;
        }
    }
}
