public class App {
    public static void main(String[] args) throws Exception {
        Libro libro = new Libro("Yo, robot", (byte) 4);

        Capitulo cp1 = new Capitulo((byte)1, "Robbie");
        Capitulo cp2 = new Capitulo((byte)2, "Runaround");
        Capitulo cp3 = new Capitulo((byte)3, "Reason");
        Capitulo cp4 = new Capitulo((byte)4, "Catch that Rabbit");

        cp1.fijarPaginas((short)1, (short)12);
        cp2.fijarPaginas((short)13, (short)25);
        cp3.fijarPaginas((short)26, (short)55);
        cp4.fijarPaginas((short)56, (short)95);

        System.out.println("** Registro de capitulos **");

        if(libro.registrarCapitulo(1, cp1) == true){
            System.out.println("Registro capitulo # "+ cp1.getNumero() + " - "+ cp1.getNombre() + " con exito? SI");
        }else{
            System.out.println("No se registro");
        }

        if(libro.registrarCapitulo(2, cp2) == true){
            System.out.println("Registro capitulo # "+ cp2.getNumero() + " - "+ cp2.getNombre() + " con exito? SI");
        }else{
            System.out.println("No se registro");
        }

        if(libro.registrarCapitulo(3, cp3) == true){
            System.out.println("Registro capitulo # "+ cp3.getNumero() + " - "+ cp3.getNombre() + " con exito? SI");
        }else{
            System.out.println("No se registrolibro.leer();");
        }

        if(libro.registrarCapitulo(4, cp4) == true){
            System.out.println("Registro capitulo # "+ cp4.getNumero() + " - "+ cp4.getNombre() + " con exito? SI");
        }else{
            System.out.println("No se registro");
        }

         
        System.out.println("----------------------------------------------------------");
        System.out.println("Total paginas de Yo, robot = " + libro.totalPaginas());
        System.out.println("Cantidad de capitulos INICIAL = " + libro.getCantidadCapitulos());
        System.out.println("Cantidad de capitulos faltantes INICIAL = " + libro.capitulosFaltantes());
        if(libro.estaCorrecto() == true){
            System.out.println("Esta correcto ? SI");
        }else{
            System.out.println("Esta correcto ? NO");
        }
        
        System.out.println("** Anula capitulo **");
        System.out.println("Pudo eliminar el capitulo 3 ? SI" + libro.anularCapitulo((byte)2));
        System.out.println("Cantidad de capitulos FINAL = " + libro.getCantidadCapitulos());
        System.out.println("Cantidad de capitulos faltantes INICIAL = " + libro.capitulosFaltantes());
        if(libro.estaCorrecto() == true){
            System.out.println("Esta correcto ? SI");
        }else{
            System.out.println("Esta correcto ? NO");
        }
    }
}

