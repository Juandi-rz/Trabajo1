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
public class clsArbol {
    private int altura = 0;
    private clasNodo raiz;

    public clsArbol() {
        this.raiz=null;
    }
    public void insert(clasNodo dato, clasNodo raiztmp){
        if(this.getRaiz()==null){//el arbol está vacio
            this.setRaiz(dato);
        }else{//el arbol no está vacio
            if(dato.getNum()>raiztmp.getNum()){
                //lo insertaré por derecha
                if(raiztmp.getDer()==null){
                    raiztmp.setDer(dato);
                }else{
                    insert(dato, raiztmp.getDer());
                }
                
            }else{
                if(dato.getNum()<= raiztmp.getNum()){
                    if(raiztmp.getIzq()==null){
                        raiztmp.setIzq(dato);
                    }else{
                        insert(dato, raiztmp.getIzq());
                    }
                }
            }
        }
    }
    public void listar(clasNodo raiztmp){
        if(raiztmp!=null){
            if(raiztmp.getIzq()!=null){
                listar(raiztmp.getIzq());
            }
            
            if(raiztmp.getDer()!=null){
                listar(raiztmp.getDer());
            }
            System.out.println(+raiztmp.getNum());
        }
    }
    public void listar1(clasNodo raiztmp){
        if(raiztmp!=null){
            System.out.println(+raiztmp.getNum());
            if(raiztmp.getIzq()!=null){
                listar1(raiztmp.getIzq());
            }
            
            if(raiztmp.getDer()!=null){
                listar1(raiztmp.getDer());
            }
        }
    }
    public void listar2(clasNodo raiztmp){
        if(raiztmp!=null){
            if(raiztmp.getIzq()!=null){
                listar2(raiztmp.getIzq());
            }
            System.out.println(+raiztmp.getNum());
            
            if(raiztmp.getDer()!=null){
                listar2(raiztmp.getDer());
            }
        }
    }
 public void encontrar(int b, clasNodo tmp){
     tmp=raiz;
     if(tmp.getNum()!=b){
         if(b<=tmp.getNum()){
             encontrar(b, tmp.getIzq());
         }if(tmp.getNum()>b){
             encontrar(b, tmp.getDer());
         }if(tmp==null){
             System.out.println("no existe el número");
         }else{
             System.out.println("si existe el número");
         }
     }
    }
private void retornarAltura (clasNodo reco,int nivel)    {
        if (reco != null) {
            retornarAltura (reco.getIzq(),nivel+1);
            if (nivel>getAltura())
                setAltura(nivel);
            retornarAltura (reco.getDer(),nivel+1);
        }
    }

    public  int retornarAltura () {
        setAltura(0);
        retornarAltura (raiz,1);
        System.out.println(getAltura());
        return getAltura();
    }
    /**
     * @return the raiz
     */
    public clasNodo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(clasNodo raiz) {
        this.raiz = raiz;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
