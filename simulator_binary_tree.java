
package paquete;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author ALEJANDRA TREJO
 */
public class simulator_binary_tree {

    Arbol Tree_arbol_2 = new Arbol();
    private ArrayList<String> lista_string = new ArrayList<String>();  
    int int_conta=0;

    public simulator_binary_tree() {
    }

    public boolean insertar(String dato) {      
            lista_string.add(dato);
            int_conta++;
            return Tree_arbol_2.agregar_al_arbol(int_conta,lista_string);       
    }

    public String borrar(String dato) {
        int iterador = 0;
        int eje_x = 0;
        while (iterador < lista_string.size()) {
            if(lista_string.get(iterador).equals(dato)){
                lista_string.remove(iterador);
                int_conta--;
                eje_x++;
            }            
            iterador++;
        }
        if(eje_x!=0){
            Tree_arbol_2.agregar_al_arbol(int_conta,lista_string);
            return ("Se elimino satisfactoriamente todos los "+dato+" encontradas");
        }else{
            return ("No se encontro: "+dato);
        }
    }      
    
    public String darHojas() {
        int i = 0;
        String r = "Participantes del Torneo:"+"\n";
        while (i < lista_string.size()) {
            r += "\t" + lista_string.get(i)+ "\n";
            i++;
        }
        return (r);
    }
    
    public void win(String w){
        Nodo s=this.Tree_arbol_2.padre(this.Tree_arbol_2.getRaiz(), w);
        s.setDato(w);
    }
    
    public ArrayList<String> getT(){
        return lista_string;
    }
    
    public void setT(ArrayList<String> L){
        lista_string.clear();
        int i=int_conta-1;
        while(i>=0){
            lista_string.add(L.get(i));
            i--;
        }
    }
    
    public void setN(int b){
        int_conta=b;
    }
    
    public String getWinner(){
        return Tree_arbol_2.getRaiz().getDato();
    }
    
    public int getN(){
        return int_conta;
    }
    
    public JPanel getDibujo() {
        return this.Tree_arbol_2.getDibujo();
    }
}
