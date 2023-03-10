import java.util.List;
public interface InstitutoDao {
    public abstract boolean altaPersona(Persona persona);
    public abstract Persona buscarPersona(String nif);
    public abstract List<Persona> buscarTodas();
    public abstract boolean eliminarPersona(Persona persona);
    public abstract List<Persona> buscarPersonaPorTipo(String tipoPersona);
}
