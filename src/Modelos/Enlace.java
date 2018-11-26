
package Modelos;


public class Enlace {

    private double distancia;
    private double velocidadMax;
    private String estado;
    private int tiempoPare;
    private String unicacion1;
    private String ubicacion2;

    public Enlace() {
    }

    public Enlace(double distancia, double velocidadMax, String estado, int tiempoPare, String unicacion1, String ubicacion2) {
        this.distancia = distancia;
        this.velocidadMax = velocidadMax;
        this.estado = estado.toUpperCase();
        this.tiempoPare = tiempoPare;
        this.unicacion1 = unicacion1;
        this.ubicacion2 = ubicacion2;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the velocidadMax
     */
    public double getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * @param velocidadMax the velocidadMax to set
     */
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the tiempoPare
     */
    public int getTiempoPare() {
        return tiempoPare;
    }

    /**
     * @param tiempoPare the tiempoPare to set
     */
    public void setTiempoPare(int tiempoPare) {
        this.tiempoPare = tiempoPare;
    }

    /**
     * @return the unicacion1
     */
    public String getUnicacion1() {
        return unicacion1;
    }

    /**
     * @param unicacion1 the unicacion1 to set
     */
    public void setUnicacion1(String unicacion1) {
        this.unicacion1 = unicacion1;
    }

    /**
     * @return the ubicacion2
     */
    public String getUbicacion2() {
        return ubicacion2;
    }

    /**
     * @param ubicacion2 the ubicacion2 to set
     */
    public void setUbicacion2(String ubicacion2) {
        this.ubicacion2 = ubicacion2;
    }

    
    
}
