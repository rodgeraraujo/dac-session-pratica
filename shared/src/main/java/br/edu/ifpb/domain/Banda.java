package br.edu.ifpb.domain;

import java.util.Objects;

/**
 *
 * @author rodger
 */
public class Banda {
    private int id;
    private String nomeFantasia;
    private String localOrigem;

    public Banda() {
    }
    
    public Banda(int id, String nomeFantasia, String localOrigem) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.localOrigem = localOrigem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 37 * hash + Objects.hashCode(this.localOrigem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banda other = (Banda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.localOrigem, other.localOrigem)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nomeFantasia=" + nomeFantasia + ", "
                + "localOrigem=" + localOrigem + '}';
    } 
}
