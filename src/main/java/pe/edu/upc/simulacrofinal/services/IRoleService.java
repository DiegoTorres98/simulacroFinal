package pe.edu.upc.simulacrofinal.services;

import pe.edu.upc.simulacrofinal.entities.Role;

import java.util.List;

public interface IRoleService {

    public void insert(Role role);

    List<Role> list();
}
