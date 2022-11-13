import java.util.ArrayList;
import java.util.Arrays;

public class Libro {
    private String titulo;
    private short cantidadCapitulos;
    private ArrayList<Capitulo> capitulos;

    public Libro (String titulo, short cantidad){
        this.capitulos = new ArrayList<>(Arrays.asList(null,null,null,null));
        this.titulo = titulo;
        if(cantidad > 0){
            this.cantidadCapitulos = cantidad;
        }else{
            System.out.println("Se requiere capitulos...");
        }     
    }

    public short getCantidadCapitulos(){ 
        return this.cantidadCapitulos; 
    }

    public int totalPaginas(){
        int suma = 0;
        for (int i = 0; i < this.capitulos.size(); i++) {
            suma = suma + this.capitulos.get(i).cantidadPaginas();     
        }
        return suma;
    }

    public boolean registrarCapitulo(int numero, Capitulo c){
        if(numero >= 1 && numero <= getCantidadCapitulos()){
            this.capitulos.set(numero - 1, c);
            return true;
        }else{
            return false;
        }
    }

    public boolean anularCapitulo(byte numero){   
        if(numero >= 1 && numero <= getCantidadCapitulos()){
            this.capitulos.remove(numero);
            this.capitulos.add(numero,null);
            return true;
        }else{
            return false;
        }      
    }

    public int capitulosFaltantes(){
        int contador = 0;
        for (int i = 0; i < this.capitulos.size(); i++) {
            if(this.capitulos.get(i) == null){
                contador += 1;
            }   
        }
        return contador;
    }
    
    public boolean estaCorrecto(){ 
        for (int capitulo = 0; capitulo < this.capitulos.size() - 1; capitulo++) {
            short C = this.capitulos.get(capitulo + 1).getInicio();
            short P = this.capitulos.get(capitulo).getFin();
            if( C != (P + 1)){
                return false;    
            }else if(this.capitulos.contains(null)){
                return false;
            }
        }
        return true;
        
    }
}
