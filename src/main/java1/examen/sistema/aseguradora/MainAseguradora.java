package examen.sistema.aseguradora;

import java.util.Arrays;
import java.util.Scanner;

public class MainAseguradora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectorString = new Scanner(System.in);
		Scanner lectorInt = new Scanner(System.in);
		int opcion;
		int posicion = 0;
		String opcion1;

		Poliza listadoPolizas[] = new Poliza[0];
		do {
			System.out.println();
			System.out.println("***********************");
			System.out.println("1. Ingresar Póliza ");
			System.out.println("2. Actualizar Valor ");
			System.out.println("3. Consultar Póliza ");
			System.out.println("4. Imprimir Reporte ");
			System.out.println("5. SALIR ");
			System.out.println("***********************");
			opcion = lectorInt.nextInt();

			if (opcion == 1) {
				// se crea array/vector temporal, con tamano +1 del original
				Poliza listadoTemporal[] = new Poliza[listadoPolizas.length + 1];
				// se establece el mismo tamano del temporal con el original
				for (int i = 0; i < listadoPolizas.length; i++) {
					listadoTemporal[i] = listadoPolizas[i];
				}
				
				do {
					System.out.println("a)PólizaGeneral");
					System.out.println("b)PólizaVip ");
					System.out.println("Regresar al Menú: digite cualquier carater diferente de a o b ");
					opcion1 = lectorString.nextLine();
					if (opcion1.equals("a")) {
						System.out.print("Nombre: ");
						String nombre = lectorString.nextLine();
						System.out.print("Descripcion: ");
						String descripcion = lectorString.nextLine();
						System.out.print("Año de vigencia: ");
						String anioVigencia = lectorString.nextLine();
						System.out.print("Codigo de poliza: ");
						String codigo = lectorString.nextLine();
						System.out.print("Valor de poliza: ");
						int valor = lectorInt.nextInt();
						System.out.print("Codigo de descuento: ");
						String codigoDescuento = lectorString.nextLine();
						System.out.print("Numero de seguro: ");
						String numeroSeguro = lectorString.nextLine();

						Poliza polizaIngreso = new Poliza();
						polizaIngreso.setNombre(nombre);
						polizaIngreso.setDescripcion(descripcion);
						polizaIngreso.setAnioVigencia(anioVigencia);
						polizaIngreso.setCodigoPoliza(codigo);
						polizaIngreso.setValorPoliza(valor);
						PolizaGeneral polizaGeneral1 = new PolizaGeneral();
						polizaGeneral1.setCodigoDescuento(codigoDescuento);
						polizaGeneral1.setNumeroSeguro(numeroSeguro);

						// rellenado del vector temporal
						listadoTemporal[posicion] = polizaIngreso;
						// los valores del temporal van al original
						listadoPolizas = listadoTemporal;
						posicion++;

						System.out.println(Arrays.toString(listadoPolizas));
					} else if (opcion1.equals("b")) {
						System.out.print("Nombre: ");
						String nombre = lectorString.nextLine();
						System.out.print("Descripcion: ");
						String descripcion = lectorString.nextLine();
						System.out.print("Año de vigencia: ");
						String anioVigencia = lectorString.nextLine();
						System.out.print("Codigo de poliza: ");
						String codigo = lectorString.nextLine();
						System.out.print("Valor de poliza: ");
						int valor = lectorInt.nextInt();
						System.out.print("Beneficio: ");
						String beneficio = lectorString.nextLine();

						Poliza polizaIngreso = new Poliza();
						polizaIngreso.setNombre(nombre);
						polizaIngreso.setDescripcion(descripcion);
						polizaIngreso.setAnioVigencia(anioVigencia);
						polizaIngreso.setCodigoPoliza(codigo);
						polizaIngreso.setValorPoliza(valor);
						PolizaVip polizaVip1 = new PolizaVip();
						polizaVip1.setBeneficio(beneficio);

						// rellenado del vector temporal
						listadoTemporal[posicion] = polizaIngreso;
						// los valores del temporal van al original
						listadoPolizas = listadoTemporal;
						posicion++;

						System.out.println(Arrays.toString(listadoPolizas));
					}
				} while (opcion1.equals("a")||opcion1.equals("b"));
			}
			if (opcion == 2) {
				System.out.print("Ingrese el Código de Póliza");
				String codigo = lectorString.nextLine();
				for (int i = 0; i < listadoPolizas.length; i++) {
					Poliza busquedaPoliza = listadoPolizas[i];
					boolean encontrar = busquedaPoliza.getCodigoPoliza().equals(codigo);
					if (encontrar == true) {
						System.out.println("Ingrese el nuevo valor de la poliza");
						int nuevoValor = lectorInt.nextInt();
						Poliza polizaIngreso2 = new Poliza();
						polizaIngreso2.setValorPoliza(nuevoValor);

					} else {
						System.out.println("Poliza no encontrada");
					}

				}
			}
			if (opcion == 3) {
				System.out.print("Ingrese el Código de Póliza");
				String codigo = lectorString.nextLine();
				for (int i = 0; i < listadoPolizas.length; i++) {
					Poliza busquedaPoliza = listadoPolizas[i];
					boolean encontrar = busquedaPoliza.getCodigoPoliza().equals(codigo);
					if (encontrar == true) {
						System.out.println("Nombre: " + listadoPolizas[i].getNombre() + " - Año Vigencia: "
								+ listadoPolizas[i].getAnioVigencia() + " - Código de Póliza: "
								+ listadoPolizas[i].getCodigoPoliza() + " - Valor: "
								+ listadoPolizas[i].getValorPoliza());
					} else {
						System.out.println("Poliza no encontrada");
					}

				}
			}

			if (opcion == 4) {
				System.out.println("***** Reporte *****");
				Arrays.sort(listadoPolizas);
				for (int i = 0; i < listadoPolizas.length; i++) {

					System.out.println(listadoPolizas[i]);
				}
			}
		} while (opcion != 5);
		System.out.println("Gracias por usar el sistema");
		// System.out.println("listado final de estudiantes");
		// System.out.println(Arrays.toString(listadoPacientes));
	}

}
