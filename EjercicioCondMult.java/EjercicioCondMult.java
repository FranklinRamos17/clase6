import java.util.Scanner;

public class EjercicioCondMult {

    public static void profesor() {
         System.out.println("La funcion del docente es enseñar");   
    }

    public static void estudiante() {
        System.out.println("La funcion del estudiante es aprender");
    }  

    public void maquinapc() {
        System.out.println("La funcion de la pc es procesar informacion");
    }

    public void proyector() {
        System.out.println("La funcion del proyector es proyectar informacion");    
    }

    public static void main(String[] args) {
           EjercicioCondMult objx=new EjercicioCondMult();

           Scanner lt=new Scanner(System.in);  
           System.out.println("Ingrese el algoritmo que desea probar\n1=profesor"+
           "\n2=estudiante\n3=maquinapc\n4=proyector");
           int opcMet=lt.nextInt();
            switch (opcMet) {
                case 1:{profesor(); } break;
                case 2: estudiante(); break;
                case 3: objx.maquinapc(); break;
                case 4: objx.proyector(); break;

                default: System.err.println("Opcion no existe"); break;
            }

    }

}
