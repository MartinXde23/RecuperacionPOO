import java.util.Scanner;
public class deportivoRecuperacion {
    private String nombre;
    public deportivoRecuperacion(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
class validaciones extends deportivoRecuperacion {
    private int edad;
    public validaciones(String nombre, int edad){
        super(nombre);
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void controlEdad(){
        if (edad>=18){
            System.out.println("Usted puede participar en la diciplina");
        } else {
            System.out.println("Usted no puede participar en la diciplina");
        }
    }
}
class sanciones extends deportivoRecuperacion {
    private String examenMedi;
    public sanciones(String nombre,String examenMedi) {
        super(nombre);
        this.examenMedi = examenMedi;
    }
    public String getExamenMedi() {
        return examenMedi;
    }
    public void setExamenMedi(String examenMedi) {
        this.examenMedi = examenMedi;
    }
    public void examenControl( String examenMedi){
        if (examenMedi == "Si"){
            System.out.println("Usted cuenta con examenes puede participar");
        } else if (examenMedi == "No") {
            System.out.println("Usted no cuenta con examenes no puede participar");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Registro competencia deportiva---");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese su edad: ");
        int edad = 0;
        try {
            edad = sc.nextInt();
            System.out.println("Tu edad es: "+edad);
        } catch (Exception e) {
            System.out.println("Error! Ingresa un valor numerico.");
        }finally {
        validaciones p1 = new validaciones(nombre,edad);
        p1.controlEdad();
        System.out.print("Cuenta con examenes medicos?(Si/No): ");
        String examenMedi = sc.next();
        sanciones p2 = new sanciones(nombre,examenMedi);
        p2.examenControl(examenMedi);
        }
    }
}