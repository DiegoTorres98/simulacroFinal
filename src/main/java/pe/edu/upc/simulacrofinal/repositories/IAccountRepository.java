package pe.edu.upc.simulacrofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simulacrofinal.entities.Account;

@Repository

public interface IAccountRepository extends JpaRepository<Account, Long> {
}
