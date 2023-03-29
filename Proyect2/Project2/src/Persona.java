import java.util.Scanner;

// Creamos la clase Persona con sus atributos
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    //Declaramos un constructor vacio
    public Persona() {

    }

    //Declaramos un constructor con todos sus parametros
    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad = edad;
    }


    //Declaramos el metodo ingresarDatos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();

        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
    }
    //Declaramos el metodo mostrarDatos
    public void mostrarDatos() {
        System.out.println("Su nombre completo es: " + nombre + " " + apellido + " y su edad es: " + edad + " años");
    }
    //Declaramos el metodo verificarEdad
    public void verificarEdad(){
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("Usted es menor de edad!!!!");
        }

    }

}


