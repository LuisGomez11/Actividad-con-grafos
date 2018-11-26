/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControlMatriz {

    public String mCoeficiente[][] = new String [51][51];
 
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
