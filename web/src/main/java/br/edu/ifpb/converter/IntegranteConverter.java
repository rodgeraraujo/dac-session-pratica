package br.edu.ifpb.converter;

import br.edu.ifpb.domain.Integrante;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author rodger
 */
@FacesConverter(value = "IntegranteConverter")
public class IntegranteConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
       if (value == null) {
            return null;
        }
        return new Integrante(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }
        Integrante integrante = (Integrante) value;
        return integrante.getNome();
    }
    
}
