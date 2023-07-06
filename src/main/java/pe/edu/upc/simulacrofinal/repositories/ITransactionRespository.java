package pe.edu.upc.simulacrofinal.repositories;

import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.simulacrofinal.entities.Transactions;

import javax.persistence.criteria.From;
import java.time.LocalDate;
import java.util.List;

public interface ITransactionRespository extends JpaRepository<Transactions, Long> {

    @Query ("FROM Transactions t where t.account.nameCustomer = :name")
    List<Transactions> BuscarxNombreCliente (@Param("name")String name);

    @Query ("FROM Transactions t WHERE t.createDate > :fecha1 AND t.createDate < :fecha2")
    List<Transactions> BuscarxRangoFecha (LocalDate fecha1, LocalDate fecha2);
}
