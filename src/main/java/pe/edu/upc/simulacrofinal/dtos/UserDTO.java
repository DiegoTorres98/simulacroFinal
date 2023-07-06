package pe.edu.upc.simulacrofinal.dtos;

import pe.edu.upc.simulacrofinal.entities.Role;

import java.util.List;

public class UserDTO {

    private Long id;

    private String username;

    private String password;
    private Boolean enabled;

    private List<Role> roles;
}
