public class ExamenU4{
    
    private class Nodo{
        private ExamenU4 Izq;
        private ExamenU4 Der;
        private int Informacion;
    }
    
    public Nodo Raiz;
    
    public boolean EstaVacio(){
        return (Raiz==null);
    }
    
    public void InsertarNodo(int a){
        if (!(EstaVacio())){
            if (a > Raiz.Informacion){
                (Raiz.Izq).InsertarNodo(a);
            }
                if(a < Raiz.Informacion){
                    (Raiz.Der).InsertarNodo(a);
                }
            }else{
                Nodo NuevoNodo = new Nodo();
                NuevoNodo.Informacion = a;
                NuevoNodo.Izq = new ExamenU4();
                NuevoNodo.Der = new ExamenU4();
                Raiz = NuevoNodo;
            }
        }
    
        
        //Método para recorrer el árbol InOrden
    public void inOrden() {
        if(!EstaVacio()){
            Raiz.Der.inOrden();
            System.out.println(Raiz.Informacion + ", ");
            Raiz.Izq.inOrden();
        }
    }

    //Método para recorrer el árbol PreOrden
    public void preOrden(){
        if(!EstaVacio()){
            System.out.println(Raiz.Informacion + ", ");
            Raiz.Der.preOrden();
            Raiz.Izq.preOrden();
        }
        
    }

    //Método para recorrer el árbol PostOrden
    public void postOrden(){
        if(!EstaVacio()){
            Raiz.Der.postOrden();
            Raiz.Izq.postOrden();
            System.out.println(Raiz.Informacion + ", ");
        }
    }
    
    
}
