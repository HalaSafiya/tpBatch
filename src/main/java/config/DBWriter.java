package config;

import bean.Compte;
import bean.Transaction;
import repo.CompteRepository;
import repo.TransactionRepository;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class DBWriter implements ItemWriter<Transaction> {
    private final TransactionRepository transactionRepository;
    private final CompteRepository compteRepository;

    public DBWriter(CompteRepository compteRepository, TransactionRepository transactionRepository) {
        this.compteRepository = compteRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void write(List<? extends Transaction> transactions) {
        System.out.println("Writing...");
        for(Transaction transaction:transactions){
            Compte compte=transaction.getCompte();
            compte.setSolde(compte.getSolde()-transaction.getMontant());
            compteRepository.save(compte);
            transaction.setCompte(compte);
            transactionRepository.save(transaction);
        }
        System.out.println("Finished Writing !");
    }
}
