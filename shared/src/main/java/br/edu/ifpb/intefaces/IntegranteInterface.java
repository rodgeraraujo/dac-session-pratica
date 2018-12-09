package br.edu.ifpb.intefaces;

import br.edu.ifpb.domain.Integrante;
import java.util.List;

/**
 *
 * @author rodger
 */
public interface IntegranteInterface {
    
    boolean salvar(Integrante Integrantes);
    
    boolean deletar(int id);
    
    boolean atualizar(Integrante Integrante);
    
    List<Integrante> listarIntegrantes();
    
}
