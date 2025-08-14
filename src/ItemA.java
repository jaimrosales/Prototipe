//Cada item o prototipo concreto debe de extender del prototipo general o del Item prototipo
//Esta seria la definicion de un item, aunque se podrian agregar cuantas cosas se deseen
public class ItemA  extends PrototypeItem{
    public ItemA(String x, String y, String z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    @Override
    public PrototypeItem clone() {
        return new ItemA(this.x, this.y, this.z);
    }
    
}
