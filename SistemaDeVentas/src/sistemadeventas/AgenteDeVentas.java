/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeventas;

/**
 *
 * @author tamar
 */
public class AgenteDeVentas {
    // En esta clase se administrara la información del colaborador agente de ventas de la empresa
    // Atributos privados para almacenar detalles del agente de ventas
    private String nombreAgente; // Nombre completo de colaborador agente de ventas.
    private String idCedula; // Cédula de identidad del colaborador
    private String codigoAgente; // Codigo de empleado asignado al agente de ventas.
    private String nombreSucursal; // Nombre de la sucursal a la que pertenece
    private boolean poseeVehiculo; // Solicita información sobre si tiene vehiculo propio

    // Constructor para inicializar los datos personales del colaborador agente de ventas.
    public AgenteDeVentas(String nombreAgente, String idCedula, String codigoAgente, String nombreSucursal, boolean poseeVehiculo) {
        this.nombreAgente = nombreAgente;
        this.idCedula = idCedula;
        this.codigoAgente = codigoAgente;
        this.nombreSucursal = nombreSucursal;
        this.poseeVehiculo = poseeVehiculo;
    }

    // Métodos públicos que permiten recuperar los datos escritos del colaborador agente de ventas de la empresa
    public String getNombreAgente() 
    { return nombreAgente; }
    public String getIdCedula() 
    { return idCedula; }
    public String getCodigoAgente() 
    { return codigoAgente; }
    public String getNombreSucursal() 
    { return nombreSucursal; }
    public boolean tieneVehiculoPropio() 
    { return poseeVehiculo; }
}
