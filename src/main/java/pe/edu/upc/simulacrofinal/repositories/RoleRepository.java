package pe.edu.upc.simulacrofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.simulacrofinal.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
