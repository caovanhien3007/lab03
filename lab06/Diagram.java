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
public class Diagram{
     private ArrayList<Layer> layer;
    private Layer circle=new Layer();
    private Layer square=new Layer();
    public Diagram(ArrayList<Layer> layer){
        this.layer = layer;
    }
    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    
    public void deleteCircle(){
        for(int i = 0; i < layer.size();i++){
            for(int j = 0;j < layer.get(i).getShape().size();j++){
                if(layer.get(i).getShape().get(j) instanceof  Circle){
                layer.get(i).getShape().remove(j);
                
                }
            }
        }
    }
    public void layerCircle(){
        for(int i = 0; i < layer.size();i++){
            for(int j = 0;j < layer.get(i).getShape().size();j++){
                if(layer.get(i).getShape().get(j) instanceof  Circle){
                circle.add(layer.get(i).getShape().get(j));
                
                }
            }
        }
    }
    public void layerSquare(){
        for(int i = 0; i < layer.size();i++){
            for(int j = 0;j < layer.get(i).getShape().size();j++){
                if(layer.get(i).getShape().get(j) instanceof  Square){
                square.add(layer.get(i).getShape().get(j));
                
                }
            }
        }
    }

}
