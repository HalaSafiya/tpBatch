package bean;

public class Compte {

    private int idCompte;
    private double solde;

    public Compte() {
    }

    public Compte(int idCompte, double solde) {
        this.idCompte = idCompte;
        this.solde = solde;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
