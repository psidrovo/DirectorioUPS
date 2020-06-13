
package ec.edu.ups.controlador;

import ec.edu.ups.dao.TelefonoDao;
import ec.edu.ups.modelo.Telefono;
import java.util.List;

/**
 * Clase ControladorTelefono. 
 * 
 * Esta clase manejara toda la informacion de los telefonos y ademas tendra acceso
 * a la lista de Telefonos registrados que le pertenece a cada Usuario.
 * 
 * @author Paul Idrovo
 */
public class ControladorTelefono {

    private TelefonoDao TDao;
    private Telefono telefono;
    
    public ControladorTelefono() {
    }
    /**
     * Constructor.
     * 
     * Este constructor nos permite crear el controlador telefono y que disponga
     * de vistaTelefono y de TelefonoDao
     * 
     * @param vistaT
     * @param telefonoDao 
     */
    public ControladorTelefono(TelefonoDao telefonoDao) {
        this.TDao=telefonoDao;
    }
    
    /**
     * Metodo crearNuevoTelefono.
     * 
     * Este metodo nos ayuda a crear un nuevo telefono y agregarlo
     * a la lista general
     * 
     * @return 
     */
    public int crearNuevoTelefono(Telefono tlf) {
        telefono = tlf;
        TDao.create(telefono);
        return telefono.getCodigo();
    }

    /**
     * Metodo verTelefono.
     * 
     * Este metodo nos imprime el telefno con el codigo que le pasamos
     * 
     */
    public void verTelefono() {
        
    }

    /**
     * Metodo actualizar.
     * 
     * Este metodo lo que hace es actualizar nuestra lista de telefonos.
     * 
     * @return 
     */
    public int actualizar() {
        return 0;

    }

    /**
     * Metodo eliminar.
     * 
     * Este metodo es llamada para eliminar un telefono del directorio.
     * 
     * @return 
     */
    public int eliminar() {
        return 0;

    }

    /**
     * Metodo verTelefonos.
     * 
     * Este metodo nos ayuda a imprimir la lista de telefonos.
     */
    public List<Telefono> verTelefonos() {
        List<Telefono> telefonos;
        telefonos = TDao.todosTelefonos();
        return telefonos;
    }
}
