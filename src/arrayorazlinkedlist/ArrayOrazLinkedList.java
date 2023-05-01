package arrayorazlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ArrayList - elementy występują jeden po drugim 
 * szybki dostęp do zawartosci, wolna przy dodawaniu nowych elementów
 * oraz usuwaniu (musi przepisać tablicę na nowo by uniknąć dziur)
 * 
 * ------
 * | 1  |
 * |    |
 * ------
 * ------
 * | 2  |
 * |    |
 * ------
 * ------
 * | 3  |
 * |    |
 * ------
 * ------
 * | 4  |
 * |    |
 * ------
 * 
 * LinkedList - każdy obiekt wskazuje na następny oraz poprzedni,a między
 * obiektami listy mogą znajdować się inne obiekty. LinkedList jest wolny
 * w przeszukiwaniu ale szybko dodaje się  i usuwa elementy
 * 
 * 
 * ------
 * | 1  |
 * |    |
 * ------
 * INNY OBIEKT
 * ------
 * | 1  |
 * |    |
 * ------
 * INNY OBIEKT INNY OBIEKT INNY OBIEKT
 * ------
 * | 1  |
 * |    |
 * ------
 * ...
 * ------
 * | 1  |
 * |    |
 * ------
 * 
 * @author PC
 */

class ListaPolaczona
{
    int wartosc;
    ListaPolaczona nastepna;
    ListaPolaczona poprzednia;
}

public class ArrayOrazLinkedList {

    public static void main(String[] args) 
    {
        ArrayList listaTablicowa = new ArrayList(3);
        listaTablicowa.add(new Object());
        
        //Jak działa LinkedList
        ListaPolaczona listaPolaczona = new ListaPolaczona();
        
        listaPolaczona.wartosc = 10;
        
        listaPolaczona.nastepna = new ListaPolaczona();
        listaPolaczona.nastepna.wartosc = 20;
        
        listaPolaczona.nastepna.nastepna = new ListaPolaczona();
        listaPolaczona.nastepna.nastepna.wartosc = 30;
        
        System.out.println(listaPolaczona.wartosc);
        System.out.println(listaPolaczona.nastepna.wartosc);
        System.out.println(listaPolaczona.nastepna.nastepna.wartosc);
    }
    
}
