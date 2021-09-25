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
					String opcion1 = lectorString.nextLine();
					if(opcion1=="a") {
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
						
						Poliza polizaIngreso = new Poliza();
						polizaIngreso.setNombre(nombre);
						polizaIngreso.setDescripcion(descripcion);
						polizaIngreso.setAnioVigencia(anioVigencia);
						polizaIngreso.setCodigoPoliza(codigo);
						polizaIngreso.setValorPoliza(valor);
						
						
						// rellenado del vector temporal
						listadoTemporal[posicion] = pacienteIngreso;
						// los valores del temporal van al original
						listadoPacientes = listadoTemporal;
						posicion++;

						System.out.println(Arrays.toString(listadoPacientes));
					}else if(opcion1=="b"){
						
					}
				}while(opcion=="a"||opcion=="b");
				System.out.println("***** Registro del paciente *****");
				System.out.print("Ingrese nombre del paciente: ");
				String nombre = lectorString.nextLine();
				System.out.print("Ingrese apellido del paciente: ");
				String apellido = lectorString.nextLine();
				System.out.print("Ingrese edad del paciente: ");
				int edad = lectorInt.nextInt();
				System.out.print("Ingrese síntoma del paciente: ");
				String sintoma = lectorString.nextLine();

				Paciente pacienteIngreso = new Paciente();
				pacienteIngreso.setNombre(nombre);
				pacienteIngreso.setApellido(apellido);
				pacienteIngreso.setEdad(edad);
				pacienteIngreso.setSintoma(sintoma);
				// rellenado del vector temporal
				listadoTemporal[posicion] = pacienteIngreso;
				// los valores del temporal van al original
				listadoPacientes = listadoTemporal;
				posicion++;

				System.out.println(Arrays.toString(listadoPacientes));
			}
			if (opcion == 2) {
				System.out.println("***** Reporte *****");
				Arrays.sort(listadoPacientes);
				for (int i = 0; i < listadoPacientes.length; i++) {

					System.out.println(listadoPacientes[i]);
				}
			}
		} while (opcion != 5);
		System.out.println("Gracias por usar el sistema");
		// System.out.println("listado final de estudiantes");
		// System.out.println(Arrays.toString(listadoPacientes));	
	}

}
