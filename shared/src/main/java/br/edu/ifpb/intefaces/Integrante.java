package br.edu.ifpb.intefaces;

import java.util.List;

/**
 *
 * @author rodger
 */
public interface Integrante {
    
    boolean salvar(Integrante Integrantes);
    
    boolean deletar(int id);
    
    boolean atualizar(Integrante Integrante);
    
    List<Integrante> listarIntegrantes();
    
}
