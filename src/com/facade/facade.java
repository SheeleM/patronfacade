package com.facade;
import com.servicios.api.bodega;
import com.servicios.api.despacho;
import com.servicios.api.devolucion;
import com.servicios.api.entrega;
import com.servicios.api.pago;

public class facade {
    private bodega bodegaApi;
    private  despacho despachoApi;
    private devolucion devolucionApi;
    private entrega entregaApi;
    private pago pagoApi;

    public facade() {
        bodegaApi = new bodega();
        despachoApi= new despacho();
        devolucionApi=new devolucion();
    }
    public void buscarServicio(){

    }
}
