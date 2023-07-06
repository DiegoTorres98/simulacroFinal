package pe.edu.upc.simulacrofinal.services;

import pe.edu.upc.simulacrofinal.entities.Account;

import java.util.List;

public interface IAccountService {

    public void insert(Account account);

    List<Account> list();
    public Account listId(long idAccount);
}
