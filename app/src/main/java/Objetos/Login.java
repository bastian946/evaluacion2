package Objetos;

import java.util.Objects;

public class Login {

    private int id;
    private String usuario;
    private String contra;


    public Login()
    {
        usuario ="Bastian";
        contra="1234";

    }

    public Login(int id, String usuario, String contra) {
        this.id = id;
        this.usuario = usuario;
        this.contra = contra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return id == login.id && Objects.equals(usuario, login.usuario) && Objects.equals(contra, login.contra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, contra);
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", contra='" + contra + '\'' +
                '}';
    }
}
