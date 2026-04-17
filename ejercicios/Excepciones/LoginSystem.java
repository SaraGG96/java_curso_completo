public class LoginSystem {

    String user = "Manolo";
    String password = "Manolo123";

    public void userLogin (String user, String password) throws LoginFailedException {
        if (user != this.user || password != this.password) {
            throw new LoginFailedException("Credenciales incorrectos.");
        } 
        else {
            System.out.println("Credenciales correctos, bienvenido Manolo");
        }
    }
    
}
