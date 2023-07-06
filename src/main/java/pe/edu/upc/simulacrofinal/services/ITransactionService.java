package pe.edu.upc.simulacrofinal.services;

import pe.edu.upc.simulacrofinal.entities.Account;
import pe.edu.upc.simulacrofinal.entities.Transactions;

import java.time.LocalDate;
import java.util.List;

public interface ITransactionService {

    public void insert(Transactions transactions);
    List<Transactions> list();
    public Transactions listId(long idtransactions);

    public List<Transactions> BuscarxNombreCliente(String name);

    public List<Transactions> BuscarxRangoFecha (LocalDate f1, LocalDate f2);
}
