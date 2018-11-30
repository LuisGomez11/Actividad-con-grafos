
package Controladores;


public class ControlMatriz {

    public String mCoeficiente[][] = new String [50][50];
 
    /**
     * @param i
     * @param j
     * @return the mCoeficiente
     */
   public String getmCoeficiente(int i, int j ) {
        return mCoeficiente[i][j];
    }

    /**
     * @param i
     * @param j
     * @param mCoeficiente the mCoeficiente to set
     */
    public void setmCoeficiente(int i,int j ,String mCoeficiente) {
        this.mCoeficiente[i][j] = mCoeficiente;
    }
   
    
}
