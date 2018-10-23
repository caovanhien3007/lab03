/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author user56
 */
public class Layer {
    private ArrayList<Shape> shape=new ArrayList<>();
    
    public Layer(){}
    
    public Layer(ArrayList<Shape> shape){
        this.shape = shape;
    }

    public ArrayList<Shape> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Shape> shape) {
        this.shape = shape;
    }
    public void add(Shape S ){
        shape.add(S);
    }
    public void deleteTriangle(){
        for(int i = 0; i < shape.size();i++){
            if(shape.get(i) instanceof  Triangle){
                shape.remove(i);
                i--;
            }
        }
    }
    private boolean  visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
}
