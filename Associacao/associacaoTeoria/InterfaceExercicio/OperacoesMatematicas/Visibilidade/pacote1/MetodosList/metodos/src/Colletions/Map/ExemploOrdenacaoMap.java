package Colletions.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOdem aleatória \t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256)); 
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 400)); 
            put(" Harari, Yuvel Noah", new Livro("21 Lições Para o Século 21", 432)); 
        }};

        for (Map.Entry<String, Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(meusLivros){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Hawking, Stephen", new Livro("O Poder do Hábito", 254));
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 258));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabetica nome dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);
        for (Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem número de página\t--"); 
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> pagina: meusLivros4)
            System.out.println(pagina.getKey() + " - " + pagina.getValue().getPaginas() + " - " + pagina.getValue().getNome());


    }

    
    
}


class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}  

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> p1, Map.Entry<String, Livro> p2) {
        return p1.getValue().getPaginas().compareTo(p2.getValue().getPaginas());
    }
}