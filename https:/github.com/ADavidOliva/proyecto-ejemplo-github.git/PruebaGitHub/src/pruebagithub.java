
public class pruebagithub {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		final int PRESUPUESTO_TOTAL= 120000;
		final double PORCENTAJE_GINECOLOGIA= 0.4;
		final double PORCENTAJE_TRAUMATOLOGIA= 0.3;
		final double PORCENTAJE_PEDRIATIA= 0.3;
		
		//Operaciones
		double presupuestoGinecologia = PRESUPUESTO_TOTAL * PORCENTAJE_GINECOLOGIA;
		double presupuestoTraumatologia = PRESUPUESTO_TOTAL * PORCENTAJE_TRAUMATOLOGIA;
		double presupuestoPediatria = PRESUPUESTO_TOTAL * PORCENTAJE_PEDRIATIA;
		
		//Mostrar por pantalla
		System.out.println("El presupuesto de ginecologia es de " + presupuestoGinecologia + "€");
		System.out.println("El presupuesto de traumatologia es de " + presupuestoTraumatologia + "€");
		System.out.println("El presupuesto de pediatria es de " + presupuestoPediatria + "€");


	}

}
