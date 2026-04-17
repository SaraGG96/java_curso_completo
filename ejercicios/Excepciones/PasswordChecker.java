public class PasswordChecker {

    public void checkPassword(String pass) throws PasswordisTooShort {
        if (pass.length() < 5) {
            throw new PasswordisTooShort("Contraseña demasiado corta");
        } else {
            System.out.println("Contraseña adecuada");
        }
    }

}
