import java.util.*;

public class GrafoNoDirigido {
    private Map<Integer, List<Integer>> listaAdyacencia;

    public GrafoNoDirigido() {
        listaAdyacencia = new HashMap<>();
    }
    public void agregarNodo(int nodo) {
        if (!listaAdyacencia.containsKey(nodo)) {
         listaAdyacencia.put(nodo, new ArrayList<>());}
    }

    public void agregarArista(int nodoOrigen, int nodoDestino) {
        agregarNodo(nodoOrigen);
        agregarNodo(nodoDestino);
        listaAdyacencia.get(nodoOrigen).add(nodoDestino);
        listaAdyacencia.get(nodoDestino).add(nodoOrigen);
    }
    public void imprimirMatrizAdyacencia() {
    int numNodos = listaAdyacencia.size();
    int[][] matrizAdyacencia = new int[numNodos][numNodos];

    for (int i = 0; i < numNodos; i++) {
        for (int j = 0; j < numNodos; j++) {
         if (listaAdyacencia.get(i + 1).contains(j + 1)) {
                matrizAdyacencia[i][j] = 1;
} else {
                matrizAdyacencia[i][j] = 0;
                } }}
    for (int i = 0; i < numNodos; i++) {
        for (int j = 0; j < numNodos; j++) {
    System.out.print(matrizAdyacencia[i][j] + " ");
            }
    System.out.println();
        }
    }
    public static void main(String[] args) {
        GrafoNoDirigido grafo = new GrafoNoDirigido();
        System.out.println("Grafo 1:");
        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 4);
       
        
grafo.imprimirMatrizAdyacencia();

        System.out.println("");


        GrafoNoDirigido grafo2 = new GrafoNoDirigido();

        System.out.println("Grafo 2:");

        grafo2.agregarArista(1, 3);
        grafo2.agregarArista(3, 2);
        
        grafo2.imprimirMatrizAdyacencia();

        System.out.println("");

        GrafoNoDirigido grafo3 = new GrafoNoDirigido();

        System.out.println("Grafo 3:");

        grafo3.agregarArista(1, 3);
        grafo3.agregarArista(2, 3);
        grafo3.agregarArista(3, 4);

        
        grafo3.imprimirMatrizAdyacencia();
        System.out.println("");

        GrafoNoDirigido grafo4 = new GrafoNoDirigido();

        System.out.println("Grafo 4:");

        grafo4.agregarArista(1, 2);
        grafo4.agregarArista(1, 3);
        grafo4.agregarArista(2, 2);


        grafo4.imprimirMatrizAdyacencia();
        System.out.println("");
        GrafoNoDirigido grafo5 = new GrafoNoDirigido();

        System.out.println("Grafo 5:");

        grafo5.agregarArista(1, 1);
        grafo5.agregarArista(2, 2);
        grafo5.agregarArista(3, 3);
        

        grafo5.imprimirMatrizAdyacencia();
        System.out.println("");
    }

    }


    

