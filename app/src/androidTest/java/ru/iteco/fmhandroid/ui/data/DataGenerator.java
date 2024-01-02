package ru.iteco.fmhandroid.ui.data;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;

public class DataGenerator {
    private final String validLogin = "login2";
    private final String validPassword =  "password2";
    private final String invalidInput = "invalid";

    private String getValidLogin() {
        return validLogin;
    }

    private String getValidPassword() {
        return validPassword;
    }

    private String getInvalidInput() {
        return invalidInput;
    }

    public User getValidUser() {
        return new User(getValidLogin(), getValidPassword());
    }

    public User getInvalidUser() {
        return new User(getInvalidInput(), getInvalidInput());
    }

    public class User {
        private final String login;
        private final String password;

        public User (String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
         return login;
        }

        public String getPassword() {
            return password;
        }
    }

        public static String getCurrentDate() {
            return new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date());
        }

        public static String getCurrentTime() {
            return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
        }

        public  String currentDatePlusDays(int days) {
            return new DateTime(Locale.getDefault()).plusDays(days).toString("dd.MM.yyyy");
        }

        public  String currentDateMinusDays(int days) {
            return new DateTime(Locale.getDefault()).minusDays(days).toString("dd.MM.yyyy");
        }

    public static class RandomString {
        static final String en = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        static final String ru = "0123456789АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        static SecureRandom rnd = new SecureRandom();

        public static String getRandomEnString(int len){
            StringBuilder sb = new StringBuilder(len);
            for(int i = 0; i < len; i++)
                sb.append(en.charAt(rnd.nextInt(en.length())));
            return sb.toString();
        }

        public static String getRandomRuString(int len){
            StringBuilder sb = new StringBuilder(len);
            for(int i = 0; i < len; i++)
                sb.append(ru.charAt(rnd.nextInt(ru.length())));
            return sb.toString();
        }
    }
}
