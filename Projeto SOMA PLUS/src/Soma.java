/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Soma {
    //Atributos
    private double v1, v2; 
    private double total;
        
        //Getter
        public double GetTotal(){
            return total;
        }
        //setter
        public void setV1(double v1) {
        this.v1 = v1;
        }
        //setter
        public void setV2(double v2) {
        this.v2 = v2;
        }
        
    
    //Metodos
    public void calcularSoma(){
    
    total = v1 + v2;
}
            
    
    
}
