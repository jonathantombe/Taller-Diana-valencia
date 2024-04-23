/*import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para la tabla de multiplicar:");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar usando ciclo for: ");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
*/

/*import java.util.Scanner;
public class TablaMultiplicar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para la tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar usando ciclo while: ");
        int i = 1;
        while (i <= 10){
            System.out.println(numero + "x" + i + "=" +(numero *i));
            i++;
        }
    }
}*/

import java.util.Scanner;
public class TablaMultiplicar{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para la tabla de multiplicar:");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar usando ciclo do-while: ");
        int i = 1;
        do{
            System.out.println(numero + "x" + i + "=" + (numero * i));
            i++;
        }while (i <=10);

    }
}