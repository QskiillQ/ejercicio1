import java.util.Scanner;

public class metodo {
    Scanner sc=new Scanner(System.in);
    
    
    Objproducto[][] Llenarmatriz(Objproducto[][]m){
        Objproducto o=new Objproducto();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Cual es el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Cual es el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Cuanta cantidad de producto tiene");
                o.setCantidad(sc.nextInt());
                
                m[i][j]=o;
            }
        }
        return m;
    }


    Objproducto[][] BuscarNombre(Objproducto[][]m){
        String NombreBuscar;
        System.out.println("Cual es el nombre que desea buscar");
        NombreBuscar=sc.next();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNombre().equals(NombreBuscar)) {
                    System.out.println("El nombre a buscar( "+NombreBuscar+" ) esta en la posición i "+i+" j "+j);
                }
            }
        }
        return m;
    }
    

    public void MostrarMatriz(Objproducto[][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("*******************************************************");
                System.out.println("Nombre del producto: "+m[i][j].getNombre());
                System.out.println("El precio del producto es: "+m[i][j].getPrecio());
                System.out.println("La cantidad de ese producto es: "+m[i][j].getCantidad());
                System.out.println("_______________________________________________________");
            }
        }
    }



}



