package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author MANUEL LOZA
 */
@Entity
@Table(name = "Grupo")
public class Grupo {

    @Id
    @Column(name = "cveGru", nullable = false, length = 15)
    private String cveGru;

    @Column(name = "nomGru", nullable = false, length = 15)
    private String nomGru;

    public Grupo() {
    }

    public Grupo(String cveGru, String nomGru) {
       this.cveGru = cveGru;
        this.nomGru = nomGru;
    }

    public String getCveGru() {
        return cveGru;
    }

    public void setCveGru(String cveGru) {
        this.cveGru = cveGru;
    }

    public String getNomGru() {
        return nomGru;
    }

    public void setNomGru(String nomGru) {
        this.nomGru = nomGru;
    }

    @Override
    public String toString() {
        return this.getNomGru();
    }

}