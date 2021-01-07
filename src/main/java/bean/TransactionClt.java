package bean;

import java.util.Date;

public class TransactionClt {
    private int idTransaction;
    private int idCompte;
    private double montant;
    private Date dateTransaction;

    public TransactionClt() {
    }

    public TransactionClt(int idTransaction, int idCompte, double montant, Date dateTransaction) {
        this.idTransaction = idTransaction;
        this.idCompte = idCompte;
        this.montant = montant;
        this.dateTransaction = dateTransaction;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }
}
