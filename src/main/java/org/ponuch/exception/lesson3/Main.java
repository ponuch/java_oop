package org.ponuch.exception.lesson3;

import java.util.Objects;
import java.util.regex.Pattern;

public class Main {
    private static Pattern pattern = Pattern.compile("[0-9a-zA-Z_]");
    public static void main(String[] args) {
        var result = checkRegisterInfo("12121", "pass1", "pass1");
        System.out.println(result);
    }

    public static boolean checkRegisterInfo(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || !pattern.matcher(login).find()) {
                throw new WrongLoginException("Wrong login");
            }
            if (!Objects.equals(password, confirmPassword) || password.length() > 20 || !pattern.matcher(password).find()) {
                throw new WrongPasswordException("Wrong password");
            }
        }
        catch (WrongLoginException | WrongPasswordException ex) {
            return false;
        }
        catch(Exception ex) {
            return false;
        }
        return true;
    }
}
