/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packclass;

/**
 *
 * @author DANIEL
 */
public class clasNodo {
    private clasNodo izq;
    private clasNodo der;
    private int num;

    public clasNodo() {
    }

    public clasNodo(int num,clasNodo izq, clasNodo der) {
        this.izq = izq;
        this.der = der;
        this.num = num;
    }

    public clasNodo(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the izq
     */
    public clasNodo getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(clasNodo izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public clasNodo getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(clasNodo der) {
        this.der = der;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    
}
