public class ArbolBinario {

    Nodo root;

    ArbolBinario() {
        this.root = null;
    }

    /*
        método privado, para agregar nodo
     */
    private Nodo agregarNodo(Nodo actual, int valor) {
        if (actual == null) actual = new Nodo(valor); //agrega nodo cuando es hoja
        else if(valor < actual.valor) actual.nodoIzquierdo = agregarNodo(actual.nodoIzquierdo, valor); //recorre lado izquiero para agregar
        else if (valor > actual.valor) actual.nodoDerecho = agregarNodo(actual.nodoDerecho, valor); //recorre lado derecho para agregar
        return actual; //retorna el nodo
    }

    /*
        método público, para agregar nodo
     */
    public void agregar(int value) {
        root = agregarNodo(root,value); //empieza a recorrer desde la raiz del arbol para agregar nodo
    }

    /*
        método privado, para buscar nodo con cierto valor
     */
    private boolean buscarNodo(Nodo actual, int valor) {
        // completar método{
        if (actual==null) return false; //arbol vacio
        if (valor==actual.valor) return true; //está en la posición del valor
        else if (valor<actual.valor) return buscarNodo(actual.nodoIzquierdo,valor); //si valor es menor a valor actual busca en el nodo izquierdo
        else if (valor>actual.valor) return buscarNodo(actual.nodoDerecho,valor); //si valor es mayor a valor actual busca en el nodo derecho
        return false;
    }

    /*
        método público, para buscar nodo con cierto valor
     */
    public boolean buscar(int valor) {
        // empieza a recorrer desde la raiz del arbol
        return buscarNodo(root,valor);
    }

    /*
        método privado, para eliminar nodo
     */
    private Nodo eliminarNodo(Nodo actual, int valor) {
        if (valor < actual.valor) actual.nodoIzquierdo = eliminarNodo(actual.nodoIzquierdo, valor); //recorre nodo Izquierdo para eliminar
        else if (valor > actual.valor) actual.nodoDerecho = eliminarNodo(actual.nodoDerecho,valor); //recorre nodo derecho para eliminar
        else { //posicion nodo a eliminar: busca el nodo que esté mas a la izquierda del lado derecho
            if (actual.nodoDerecho == null) actual = actual.nodoIzquierdo;
            else if (actual.nodoIzquierdo==null) actual = actual.nodoDerecho;
            else {
                Nodo menorDer = actual.nodoDerecho;
                while (menorDer.nodoIzquierdo != null) menorDer = menorDer.nodoIzquierdo;
                actual.valor = menorDer.valor; //reemplaza el valor del menor de la derecha por la raiz
                menorDer = null; //elimina la hoja
            }
        }
        return actual;
    }

    /*
        método público, para eliminar nodo
     */
    public void eliminar(int valor) {
        root = eliminarNodo(root,valor); //comienza desde la raiz del arbol para eliminar el nodo que posea @valor
    }

    /*
     * Dado un árbol binario, imprime sus nodos en En Orden
     */
    void imprimirEnOrden(Nodo node) {
        if (node == null)
            return;

        /* primero el nodo izquierdo*/
        imprimirEnOrden(node.nodoIzquierdo);

        /* luego imprimir el valor del nodo*/
        System.out.print(node.valor + " ");

        /* luego el nodo  derecho */
        imprimirEnOrden(node.nodoDerecho);
    }

    /*
     * wrapper para el método imprimirEnOrden
     */
    void imprimirEnOrden() {
        imprimirEnOrden(root);
    }

    /*
     * Dado un árbol binario imprime sus nodos en Pre Orden
     */
    void imprimirEnPreOrden(Nodo node) {
        if (node == null)
            return;

        /* luego imprimir el valor del nodo*/
        System.out.print(node.valor + " ");

        /* primero el nodo izquierdo*/
        imprimirEnPreOrden(node.nodoIzquierdo);

        /* luego el nodo  derecho */
        imprimirEnPreOrden(node.nodoDerecho);
    }

    /*
     * wrapper para el método imprimirEnPreOrden
     */
    void imprimirEnPreOrden() {
        imprimirEnPreOrden(root);
    }

    /*
     * Dado un árbol binario, imprime sus nodos en Pos Orden
     */
    void imprimirEnPosOrden(Nodo node) {
        if (node == null)
            return;

        /* primero el nodo izquierdo*/
        imprimirEnPosOrden(node.nodoIzquierdo);

        /* luego el nodo  derecho */
        imprimirEnPosOrden(node.nodoDerecho);

        /* luego imprimir el valor del nodo*/
        System.out.print(node.valor + " ");
    }

    /*
     * wrapper para el método imprimirEnPosOrden
     */
    void imprimirEnPosOrden() {
        imprimirEnPosOrden(root);
    }
}
