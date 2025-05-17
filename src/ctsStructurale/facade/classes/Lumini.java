package ctsStructurale.facade.classes;

public class Lumini {
    protected boolean suntAprinse=false;
    protected String culoare="Alb";

    public void aprinde()
    {
        suntAprinse=true;
        System.out.println("Aprinde lumini");
    }

    public void stinge()
    {
        suntAprinse=false;
        System.out.println("Stinge lumini");
    }

    public void seteazaCuloarea(String culoare)
    {
        this.culoare=culoare;
        System.out.println("Seteaza culoare lumini:"+culoare);
    }

}
