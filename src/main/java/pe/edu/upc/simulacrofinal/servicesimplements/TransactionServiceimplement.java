package pe.edu.upc.simulacrofinal.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simulacrofinal.entities.Transactions;
import pe.edu.upc.simulacrofinal.repositories.ITransactionRespository;
import pe.edu.upc.simulacrofinal.services.ITransactionService;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionServiceimplement implements ITransactionService {

    @Autowired

    private ITransactionRespository aR;
    @Override
    public void insert(Transactions transactions) {
        aR.save(transactions);
    }

    @Override
    public List<Transactions> list() {
        return aR.findAll();
    }

    @Override
    public Transactions listId(long idtransactions) {
        return aR.findById(idtransactions).orElse(new Transactions());
    }

    @Override
    public List<Transactions> BuscarxNombreCliente(String name) {
        return aR.BuscarxNombreCliente(name);
    }

    @Override
    public List<Transactions> BuscarxRangoFecha(LocalDate f1, LocalDate f2) {
        return aR.BuscarxRangoFecha(f1,f2);
    }
}
