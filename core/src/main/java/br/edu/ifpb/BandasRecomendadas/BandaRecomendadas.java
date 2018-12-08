/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.BandasRecomendadas;

import br.edu.ifpb.domain.Banda;
import br.edu.ifpb.intefaces.Recomendadas;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import javax.ejb.Singleton;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Lock(LockType.WRITE)
@Remote(Recomendadas.class)
public class BandaRecomendadas implements Recomendadas {

    private List<Banda> recomendadas = new CopyOnWriteArrayList<>();

    @Override
    public void recomendar(Banda banda) {
        this.recomendadas.add(banda);

    }

    @Override
    public void removerRecomendacao(Banda banda) {
        this.recomendadas.remove(banda);
    }

    @Lock(LockType.READ)
    @Override
    public List<Banda> listarRecomendacao() {
        return Collections.unmodifiableList(
                this.recomendadas
        );
    }

}
