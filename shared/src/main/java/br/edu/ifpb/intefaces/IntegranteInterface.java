package br.edu.ifpb.intefaces;

import java.util.List;
import br.edu.ifpb.domain.Integrante;

/**
 *
 * @author rodger
 */
public interface IntegranteInterface {
    
    boolean salvar(Integrante integrante);
    
    boolean deletar(int id);
    
    boolean atualizar(Integrante integrante);
    
    List<Integrante> listarIntegrantes();
    
}
