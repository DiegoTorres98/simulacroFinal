package pe.edu.upc.simulacrofinal.services;

import pe.edu.upc.simulacrofinal.entities.Users;

import java.util.List;

public interface IUserService {

    public Integer insert(Users user);

    List<Users> list();
}
