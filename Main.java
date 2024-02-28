package cuentas;

/**
 * @author      Luis Andrés Piñero Diez <andres.lapd07@gmail.com>
 * @version     1.0
 * @since       1.0
 */

/**
 * Clase principal del programa que gestiona una cuenta bancaria.
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        operativa_cuenta(cuenta1, 2300);

        operativa_cuenta(cuenta1, 695);
    }

    /**
     * Método que encapsula las operaciones con la cuenta.
     * @param cuenta Cuenta bancaria sobre la que realizar operaciones.
     * @param cantidad Cantidad a operar (ingresar o retirar).
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}