/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeventas;

/**
 *
 * @author tamar
 */
public class Factura {
    // Declaración de las variables para almacenar los datos de cada factura
    private String infoClienteNombre; //Información del nombre del cliente.
    private String infoClienteCedula; //Cedula del cliente para la identificación.
    private String detalleCodigoFactura; //código de la factura para su identificación.
    private double detalleMontoFactura; //Detalla el monto de la total de la compra realizada.
    private int detalleMesFactura; //Fecha en que se realiza la compra y factura.
    private int tipoProductoElectricos; //para todas las de tipo de producto, es para identificar la cantidad de productos comprados en esas areas.
    private int tipoProductoAutomotrices;
    private int tipoProductoConstruccion;

    //configuración de los datos de la factura solicitados al momento de crear el objeto
    public Factura(String infoClienteNombre, String infoClienteCedula, String detalleCodigoFactura, double detalleMontoFactura, int detalleMesFactura, int tipoProductoElectricos, int tipoProductoAutomotrices, int tipoProductoConstruccion) {
        this.infoClienteNombre = infoClienteNombre;
        this.infoClienteCedula = infoClienteCedula;
        this.detalleCodigoFactura = detalleCodigoFactura;
        this.detalleMontoFactura = detalleMontoFactura;
        this.detalleMesFactura = detalleMesFactura;
        this.tipoProductoElectricos = tipoProductoElectricos;
        this.tipoProductoAutomotrices = tipoProductoAutomotrices;
        this.tipoProductoConstruccion = tipoProductoConstruccion;
    }

    // Método que ayuda a obtener todos los valore de los atributos de la factura privados y así evitar la fuga de la misma
    public double getDetalleMontoFactura() 
    { return detalleMontoFactura; }
    public int getDetalleMesFactura() 
    { return detalleMesFactura; }
    public int getTipoProductoElectricos() 
    { return tipoProductoElectricos; }
    public int getTipoProductoAutomotrices() 
    { return tipoProductoAutomotrices; }
    public int getTipoProductoConstruccion() 
    { return tipoProductoConstruccion; }
}
