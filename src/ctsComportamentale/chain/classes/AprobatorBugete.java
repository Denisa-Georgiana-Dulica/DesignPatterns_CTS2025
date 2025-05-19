package ctsComportamentale.chain.classes;

public abstract class AprobatorBugete {
    protected AprobatorBugete urmatorulAprobator;

    public void seteazaUrmatorulAprobator(AprobatorBugete aprobatorBugete)
    {
        this.urmatorulAprobator=aprobatorBugete;
    }

    public abstract void aprobaBuget(float suma);
}
