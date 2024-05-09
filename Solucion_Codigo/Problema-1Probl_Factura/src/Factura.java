
public class Factura {

    public int numProd;
    public double precioProd;  
    public double desc;
    public double precFinal;

    public Factura(int numProd, double precioProd) {
        this.numProd = numProd;
        this.precioProd = precioProd;
    }
    public void calcularDescuento(){
        
    this.desc= 0; 
    
    if(this.precioProd >= 1000 && this.numProd > 10){
        this.desc = (this.precioProd * this.numProd)*0.10;  
    }else if(this.precioProd < 1000){
        this.desc = (this.precioProd * this.numProd)*0.05; 
    }
      
} 
    
    public void calcularPrecioFinal(){
    this.precFinal =  this.precioProd * this.numProd - this.desc; 
} 

    @Override
    public String toString() {
        return "Factura{" + "numProd=" + numProd + ", precioProd=" + precioProd + ", precFinal=" + precFinal + '}';
    }
    
}
