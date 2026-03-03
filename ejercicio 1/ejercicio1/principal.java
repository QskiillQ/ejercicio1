import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        metodo m=new metodo();
        int n;
        System.out.println("Cual es la dimencion de la matriz");
        n=sc.nextInt();
        Objproducto[][] producto=new Objproducto[n][n];
        producto= (Objproducto[][])m.Llenarmatriz(producto);
        producto= (Objproducto[][])m.BuscarNombre(producto);
        m.MostrarMatriz(producto);
    }
}
