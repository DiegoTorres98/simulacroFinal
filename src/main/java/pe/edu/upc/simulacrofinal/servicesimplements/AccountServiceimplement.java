package pe.edu.upc.simulacrofinal.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.simulacrofinal.entities.Account;
import pe.edu.upc.simulacrofinal.repositories.IAccountRepository;
import pe.edu.upc.simulacrofinal.services.IAccountService;

import java.util.List;

@Service
public class AccountServiceimplement implements IAccountService {
    @Autowired
    private IAccountRepository aR;
    @Override
    public void insert(Account account) {
        aR.save(account);
    }

    @Override
    public List<Account> list() {
        return aR.findAll();
    }

    @Override
    public Account listId(long idAccount) {
        return aR.findById(idAccount).orElse(new Account());
    }


}
