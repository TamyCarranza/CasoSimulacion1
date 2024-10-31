/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeventas;

/**
 *
 * @author tamar
 */
public class CalculadoraComisiones {
    // Variables que acumulan el total de beneficios generados a través de puntos y comisiones
    private double totalComisionesAcumuladas; // Acumulado de comisiones calculadas para todas las facturas
    private int totalPuntosAcumulados; // Acumulado de puntos obtenidos

    // Evalúa una factura y agrega sus puntos y comisiones correspondientes al total acumulado
    public void evaluarFactura(Factura factura) {
        double montoComisionFactura = 0;
        int puntosFactura = 0;

        // Verifica si la factura tiene todos los tipos de productos para aplicar una bonificación del 10% sobre el monto total
        if (factura.getTipoProductoElectricos() > 0 && factura.getTipoProductoAutomotrices() > 0 && factura.getTipoProductoConstruccion() > 0) {
            montoComisionFactura += factura.getDetalleMontoFactura() * 0.10;
            puntosFactura += 3;
        } else {
            // Aplica bonificación entre 4% y 2% según la cantidad de productos eléctricos
            if (factura.getTipoProductoElectricos() >= 3) {
                montoComisionFactura += factura.getDetalleMontoFactura() * 0.04;
                puntosFactura += 1;
            } else {
                montoComisionFactura += factura.getDetalleMontoFactura() * 0.02;
            }

            // Aplica bonificación entre 4% y 2% para productos automotrices
            if (factura.getTipoProductoAutomotrices() >= 4) {
                montoComisionFactura += factura.getDetalleMontoFactura() * 0.04;
                puntosFactura += 1;
            } else {
                montoComisionFactura += factura.getDetalleMontoFactura() * 0.02;
            }

            // Agrega un 8% adicional si hay productos de construcción en la factura
            if (factura.getTipoProductoConstruccion() > 0) {
                montoComisionFactura += factura.getDetalleMontoFactura() * 0.08;
                puntosFactura += 2;
            }
        }

        // Aplica un 5% extra al monto total si este es superior a 50000
        if (factura.getDetalleMontoFactura() > 50000) {
            montoComisionFactura += factura.getDetalleMontoFactura() * 0.05;
            puntosFactura += 1;
        }

        // Suma el monto y los puntos calculados de esta factura al total acumulado de comisiones y puntos
        totalComisionesAcumuladas += montoComisionFactura;
        totalPuntosAcumulados += puntosFactura;
    }

    // Método para obtener el total acumulado de comisiones generadas por todas las facturas evaluadas
    public double obtenerTotalComisiones() { return totalComisionesAcumuladas; }

    // Método para obtener el total acumulado de puntos obtenidos por todas las facturas evaluadas
    public int obtenerTotalPuntos() { return totalPuntosAcumulados; }
}

