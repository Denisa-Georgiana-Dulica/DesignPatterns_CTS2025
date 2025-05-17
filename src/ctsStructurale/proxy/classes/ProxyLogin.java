package ctsStructurale.proxy.classes;

public class ProxyLogin implements AbstractLogin{
    private AbstractLogin login;
    private int nrIncercari=0;

    public ProxyLogin(AbstractLogin login) {
        this.login = login;
    }

    @Override
    public boolean login(String username, String parola) {
       if(nrIncercari>2)
       {
           System.out.println("Cont blocat");
           return false;
       }else{
           if(login.login(username,parola))
           {
               nrIncercari=0;
               System.out.println("Bun venit in cont");
               return true;
           }else{
               nrIncercari++;
               System.out.println("Username/parola gresite. Mai aveti "+(3-nrIncercari)+" incercari");
               return false;
           }
       }
    }
}
