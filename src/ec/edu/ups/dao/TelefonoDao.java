
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefono;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Paul Idrovo
 */
public class TelefonoDao implements ITelefono{
    
    private List<Telefono> listTelefono;

    public TelefonoDao() {
        listTelefono=new ArrayList<Telefono>();
    }

    @Override
    public void create(Telefono telefono) {
        listTelefono.add(telefono);
    }

    @Override
    public Telefono read(int codigo) {
        Telefono tf = listTelefono.get(codigo);
        return tf;
    }

    @Override
    public void update(Telefono telefono) {
        
    }

    @Override
    public void delete(int codigo) {
        
    }

    @Override
    public List<Telefono> todosTelefonos() {
        return listTelefono;
    }
}
