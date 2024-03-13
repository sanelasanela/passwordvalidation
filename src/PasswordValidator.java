public class PasswordValidator
{
    public static boolean isValidPassword(String password)
    {
        return password != null && lengthIsAtLeast8 (password)  && containsDigits(password) && containsUpperCase(password) && containsLowerCase(password) && containsCommonPasswords(password);
    }

    public static boolean lengthIsAtLeast8(String password)
    {
        //   for (char c : password.toCharArray()) {
            if (password.length() >= 8)
            {
                return true;
            }
        //}
        System.out.println("Password must be at least 8 character long");
        return false;
    }
    public static boolean containsDigits(String password)
    {
        for (char c : password.toCharArray())
        {
            if (Character.isDigit(c))
            {
                return true;
            }
        }
        System.out.println("Password must contain digits");
        return false;

    }
    public static boolean containsUpperCase(String password)
    {
        for (char c : password.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                return true;
            }
        }
        System.out.println("Password must contain uppercase letters");
        return false;
    }

    public static boolean containsLowerCase(String password)
    {
       for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        System.out.println("Password must contain LowerCase letters");
        return false;
    }

    public static boolean containsCommonPasswords(String password)
    {
        String commonPassword = ("Password1");
            if (!password.equals(commonPassword))
            {
                return true;
            }
        System.out.println("Password is weak, try something else!");
        return false;
    }

    public static void main(String[] args)
    {
        String password = "Password1";

        if (isValidPassword(password))
        {
            System.out.println("Password is valid.");
        } else
        {
            System.out.println("Password iS not valid!");
        }
    }

    }
