public class Main {
    public static void main(String[] args) {
        // Crear un paciente utilizando el constructor con cédula, nombre y apellido
        Paciente paciente1 = new Paciente("123456789", "Juan", "Perez");

        // Imprimir la información del paciente creado
        System.out.println("\n\tInformación del paciente 1:");
        System.out.println(paciente1);

        // Crear más pacientes utilizando el constructor vacío
        Paciente paciente2 = new Paciente();
        Paciente paciente3 = new Paciente();

        // Imprimir la información de los pacientes creados con constructor vacío
        System.out.println("\n\tInformación del paciente 2 (constructor vacío):");
        System.out.println(paciente2);

        System.out.println("\n\tInformación del paciente 3 (constructor vacío):");
        System.out.println(paciente3);
    }
}
