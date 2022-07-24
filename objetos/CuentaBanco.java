package objetos;
import java.text.DecimalFormat;

public class CuentaBanco {
    private long correlativo = 100000;
    private static long cuentaObjeto;
    //Este llevara el conteo de objetos creados para asignar numero de cuenta, es static para que no se reinicie cada vez que se crea un nuevo objeto
    private String DPI;
    private double SaldoActual, InteresAnual, intereses;

    //Creando el constructor por defecto
    public CuentaBanco(String Ide, double SaldoInicial){
        DPI = Ide;
        cuentaObjeto ++;
        correlativo = correlativo + cuentaObjeto;
        SaldoActual = SaldoInicial;
        InteresAnual = 5;//Sera el valor por defecto
    }

    public void consultaEstado(){
        DecimalFormat df = new DecimalFormat("0.00");//Para que el double no se vea tan feo xd
        System.out.println("\nNumero de cuuenta: " + correlativo);
        System.out.println("Identificacion: " + DPI);
        System.out.println("Interes anual: " + InteresAnual*100);
        System.out.println("Intereses al dia de hoy: " + df.format(intereses));
        System.out.println("Saldo disponible: " + df.format(SaldoActual));
    }

    public void depositoCuenta(double monto){
        //Suma el valor del deposito
        SaldoActual += monto;
    }

    public void retiroCuenta(double monto){
        //resta el valor del retiro
        SaldoActual -= monto;

    }
    public void actualizarSalzdo(){//Calcula los intereses
        InteresAnual = InteresAnual/100;//convierte a porcentaje
        intereses = SaldoActual *(InteresAnual/365);
        SaldoActual += intereses;

    }

    public void setInteresAnual(double interesAnual) {
        InteresAnual = interesAnual;
    }
}
