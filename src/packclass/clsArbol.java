/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packclass;

/**
 *
 * @author R
 */
public class clsArbol {
    private int altura = 0;
    private boolean afirmar = false;
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
     if(tmp==raiz){
         afirmar = true;
     }else if(tmp != null){
         if(tmp.getDer()!=null){
             encontrar(b, tmp.getDer());
         }
         if(tmp.getIzq()!=null){
             encontrar(b, tmp.getIzq());
         }
         afirmar = b == tmp.getNum();
     }
      
     }
 public boolean eliminar(int d, clasNodo tmp){
     clasNodo remplazo = raiz;
     boolean hijoIzq = true;
     if(tmp==null){
             return false;
         }else if(tmp!= null){
         if(tmp.getDer()!=null){
             hijoIzq = true;
             encontrar(d, tmp.getDer());
         }
         if(tmp.getIzq()!=null){
             hijoIzq = false;
             encontrar(d, tmp.getIzq());
         }
     }
     if(tmp.getDer()==null && tmp.getIzq()==null){
         if(tmp == raiz){
             raiz = null;
         }else if(hijoIzq){
             remplazo.setIzq(null);
         }else{
             remplazo.setDer(null);
         }
     }else if(tmp.getDer()==null){
         if(tmp == raiz){
             raiz = tmp.getIzq();
         }else if(hijoIzq){
             remplazo.setIzq(tmp.getIzq());
         }else{
             remplazo.setDer(tmp.getIzq());
         }
     }else if(tmp.getIzq()==null){
         if(tmp == raiz){
             raiz = tmp.getDer();
         }else if(hijoIzq){
             remplazo.setIzq(tmp.getDer());
         }else{
             remplazo.setDer(tmp.getIzq());
         }
     }else{
         clasNodo reemplazo = agregarremplazo(tmp);
          if(tmp == raiz){
              raiz = reemplazo;
          }else if(hijoIzq){
              remplazo.setIzq(reemplazo);
          }else{
             remplazo.setDer(reemplazo);
          }
          reemplazo.setIzq(tmp.getIzq());
     }return true;
 }
 public clasNodo agregarremplazo(clasNodo nodorem){
     clasNodo agregarreamplazo = nodorem;
     clasNodo reemplazo = nodorem;
     clasNodo tmp = nodorem.getDer();
     while(tmp !=null){
         agregarreamplazo = reemplazo;
         reemplazo = tmp;
         tmp = tmp.getIzq();
     }if(reemplazo!=nodorem.getDer()){
         agregarreamplazo.setIzq(reemplazo.getDer());
         reemplazo.setDer(nodorem.getDer());
     }System.out.println("se remplazo: "+reemplazo);
     return reemplazo;
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

    /**
     * @return the afirmar
     */
    public boolean isAfirmar() {
        return afirmar;
    }

    /**
     * @param afirmar the afirmar to set
     */
    public void setAfirmar(boolean afirmar) {
        this.afirmar = afirmar;
    }
}
