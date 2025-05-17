package ctsStructurale.proxy.classes;

public class Login implements AbstractLogin{

    private String username;
    private String parola;

    public Login(String username, String parola) {
        this.username = username;
        this.parola = parola;
    }

    @Override
    public boolean login(String username, String parola) {
        if(this.username.equals(username) && this.parola.equals(parola))
        {
            return true;
        }else{
            return false;
        }
    }
}
