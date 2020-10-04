public class Main {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();

        arbolBinario.agregar(5);
        arbolBinario.agregar(30);
        arbolBinario.agregar(2);
        arbolBinario.agregar(40);
        arbolBinario.agregar(25);
        arbolBinario.agregar(4);

        //               5
        //             /   \
        //            2     30
        //            \    /  \
        //             4  25  40

        System.out.println("Recorrido del árbol binario en En Orden");
        arbolBinario.imprimirEnOrden();

        System.out.println("\nRecorrido del árbol binario en Pre Orden");
        arbolBinario.imprimirEnPreOrden();

        System.out.println("\nRecorrido del árbol binario en Pos Orden");
        arbolBinario.imprimirEnPosOrden();

        System.out.println("\n==========================================");

        //               5
        //             /   \
        //            2     30
        //          /  \    /  \
        //         1    4  25  40

        arbolBinario.agregar(1);
        System.out.println("Recorrido del árbol binario en En Orden");
        arbolBinario.imprimirEnOrden();

        System.out.println("\nRecorrido del árbol binario en Pre Orden");
        arbolBinario.imprimirEnPreOrden();

        System.out.println("\nRecorrido del árbol binario en Pos Orden");
        arbolBinario.imprimirEnPosOrden();

        System.out.println("\n==========================================");

        //               5
        //             /   \
        //            2     30
        //          /  \    /
        //         1    4  25
        arbolBinario.eliminar(40);
        System.out.println("\nRecorrido del árbol binario en En Orden");
        arbolBinario.imprimirEnOrden();

        System.out.println("\nRecorrido del árbol binario en Pre Orden");
        arbolBinario.imprimirEnPreOrden();

        System.out.println("\nRecorrido del árbol binario en Pos Orden");
        arbolBinario.imprimirEnPosOrden();
    }
}
