import objetos.CuentaBanco;

public class Test {
    public static void main(String[] args){
        CuentaBanco cuenta1 = new CuentaBanco("2706972840116", 350.25);
        cuenta1.depositoCuenta(125.5);
        cuenta1.retiroCuenta(75.25);
        cuenta1.setInteresAnual(10);
        cuenta1.actualizarSalzdo();
        cuenta1.consultaEstado();

        CuentaBanco cuenta2 = new CuentaBanco("4465203980512", 750.00);
        cuenta2.depositoCuenta(512.66);
        cuenta2.retiroCuenta(244.33);
        cuenta2.setInteresAnual(15);
        cuenta2.actualizarSalzdo();
        cuenta2.consultaEstado();

        CuentaBanco cuenta3 = new CuentaBanco("4412654230101", 1500.45);
        cuenta3.depositoCuenta(899.50);
        cuenta3.retiroCuenta(1200.00);
        cuenta3.setInteresAnual(12);
        cuenta3.actualizarSalzdo();
        cuenta3.consultaEstado();

    }
}
