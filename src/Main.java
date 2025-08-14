import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Se crea un clon de un objeto
        ItemA uno = new ItemA("bdApp", "jaimeRosales", "usuarios");

        //El siguiente array no es parte como tal del prototipo pero sirve para validar que se esta construyendo el clon
        //Dentro del array list se guardan cada uno de los clones del objeto
        ArrayList items = new ArrayList();
        for (int i = 0; i < 10; i++) {
            PrototypeItem item = uno.clone();
            //
            uno.setX(uno.getX()+String.valueOf(i));
            System.out.println(item.getX());
            items.add(item);

        }
        int t = items.size();
        for (int i = 0; i < t; i++) {
            System.out.println(items.get(i));
        }


    }
}
