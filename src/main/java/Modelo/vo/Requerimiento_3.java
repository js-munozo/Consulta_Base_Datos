package Modelo.vo;

public class Requerimiento_3 {

    // Campos con su respectiva asignacion
    private String Proveedor;
    private String Pagado;
    private String Constructora;
    
    // Constructores
    public Requerimiento_3(){ }  
    
    public Requerimiento_3(String proveedor, String pagado, String constructora){
        this.Proveedor = proveedor;
        this.Pagado = pagado;
        this.Constructora = constructora;
        setProveedor(proveedor);
        setPagado(pagado);
        setConstructora(constructora);
    }

    // Getters y Setters
    public void setProveedor(String proveedor){
        Proveedor = proveedor;
    }
    
    public String getProveedor(){
        return Proveedor;
    }
    
    public void setPagado(String pagado){
        Pagado = pagado;
    }

    public String getPagado(){
        return Pagado;
    }
    
    public void setConstructora(String constructora){
        Constructora = constructora;
    }
    
    public String getConstructora(){
        return Constructora;
    }
}
