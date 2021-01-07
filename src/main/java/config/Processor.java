package config;

import bean.Compte;
import bean.Transaction;
import bean.TransactionClt;
import repo.CompteRepository;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Processor implements ItemProcessor<TransactionClt, Transaction> {
    @Autowired
    private CompteRepository compteRepo;
    @Override
    public Transaction process(TransactionClt transactionClient) throws Exception {
        Compte compteClient=this.compteRepo.findById(transactionClient.getIdCompte()).get();
        Transaction transaction=new Transaction(transactionClient);
        transaction.setCompte(compteClient);
        return transaction;
    }
}
