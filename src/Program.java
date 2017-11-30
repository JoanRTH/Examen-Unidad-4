public class Program {
    public static void main(String[] NOc) {
        ExamenU4 Rec = new ExamenU4();
        System.out.println(Rec.EstaVacio() ? "El arbol esta vacio" : "el Arbol Contiene elementos");
        System.out.println("==========================");
        System.out.println("Agregamos datos");
        Rec.InsertarNodo(4);
        Rec.InsertarNodo(8);
        Rec.InsertarNodo(7);
        Rec.InsertarNodo(26);
        Rec.InsertarNodo(5);
        
        System.out.println(Rec.EstaVacio() ? "El arbol esta vacio" : "el Arbol Contiene elementos");
        System.out.println("==========================");
        System.out.println("El Recorrido en inOrden es: ");
        Rec.inOrden();
        System.out.println("==========================");
        
    }
}
