/**
 * Uriel Henrique Marques Farias Mishima RA: 81717300
 */

package br.usjt.ciclodevidagpsemapas;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/*Lucas Do Vale Conceição
RA:817116816
 */

public class Localizacao implements Serializable {

    private int id;
    private Double latitude;
    private Double longitude;
    private Date data;

    public Localizacao(int id, double latitude, double longitude, Date data){
        this(latitude, longitude, data);
        this.id = id;
    }

    public Localizacao(double latitude, double longitude, Date data){
        this.latitude = latitude;
        this.longitude = longitude;
        this.data = data;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Lat: " + latitude + ", Long: " + longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
