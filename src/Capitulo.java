public class Capitulo{
    private byte numero;
    private String nombre;
    private short inicio;
    private short fin;

    public Capitulo (byte numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    public byte getNumero(){
        return this.numero;
    }

    public short getInicio(){
        return this.inicio;
    }

    public short getFin(){
        return this.fin;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNumero(byte numero){
        this.numero = numero;
    }

    public void fijarPaginas(short inicio, short fin){
        if((inicio > 0 && fin > 0) && (inicio < fin)){
            this.inicio = inicio;
            this.fin = fin;
        }else{
            System.out.println("No se cumplen las reglas...");
        }
    }

    public short cantidadPaginas(){
        short suma = 0; 
        suma = (short) ((this.fin - this.inicio) + 1);
        return suma;
    }
}
