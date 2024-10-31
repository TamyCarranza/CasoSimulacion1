/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeventas;

/**
 *
 * @author tamar
 */
public class SistemaDeVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creación y asignación de datos para el colaborador de ventas.
        AgenteDeVentas agente = new AgenteDeVentas("Juan Perez", "12345678", "A001", "Sucursal Central", true);

        // Creación de facturas de clientes asociadas al agente para simular las ventas realizadas
        Factura facturaCliente1 = new Factura("Aaron Flores", "87654321", "F000", 75000, 5, 3, 1, 2);
        Factura facturaCliente2 = new Factura("Tamara Morales ", "34567890", "F001", 150000, 5, 4, 2, 3);
        Factura facturaCliente3 = new Factura("Jimena Leon", "23456789", "F002", 35000, 5, 2, 5, 1);

        // Inicialización de la calculadora de beneficios para procesar las comisiones y puntos de ventas
        CalculadoraComisiones calculadoraComisiones = new CalculadoraComisiones();

        // Evaluación las facturas de venta generada para el colaborador agente de ventas
        Factura[] listaFacturas = { facturaCliente1, facturaCliente2, facturaCliente3 };
        for (Factura factura : listaFacturas) {
            calculadoraComisiones.evaluarFactura(factura);
        }

        // Presentación final de cada uno de los resultados con los datos del agente y el resumen de comisiones y puntos obtenidos en la venta realizada.
	System.out.println("----------------------------------------------");
        System.out.println("Resumen de Ventas para el Agente de Ventas:");
        System.out.println("------------------------------------------");
        System.out.println("Nombre del Agente de ventas: " + agente.getNombreAgente());
        System.out.println("Identificacion de Agente: " + agente.getCodigoAgente());
        System.out.println("Sucursal del agente de ventas: " + agente.getNombreSucursal());
        System.out.println("Vehiculo propio para trabajo: " + (agente.tieneVehiculoPropio() ? "Sí" : "No"));

        System.out.println("Beneficios Obtenidos:");
        System.out.println("--------------------------------");
        System.out.printf("Total de Comisiones: %.2f\n", calculadoraComisiones.obtenerTotalComisiones());
        System.out.println("Total de Puntos Acumulados: " + calculadoraComisiones.obtenerTotalPuntos());
	System.out.println("----------------------------------------------");
    }
}
