import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
            qué necesito crear aparte:
            - clase abstracta zapatos --> base del resto madre suprema
                                      --> marca modelo material talla precio
            - tres clases que heredan de zapatos --> hijas: elegante, casual, deporte


            dentro del ejecutable:
            - dos instancias por clase
            - arrayList con todos los zapatos

            scanner:
            - preguntar tipo de zapato
            - preguntar modelo --> muestra el precio
                               --> se añade a una variable gastoTotal (sum +=)
            - se repite el bucle hasta que se escriba "salir" --> sout del gastoTotal
                                                              --> sout "hasta la próxima"
         */
        Zapatos newShoes = new Elegante("Pi Hy Pi", "Cayetano", "Cuero", 41.5, 189.5);
        Zapatos newShoes2 = new Elegante("Oh Sea", "Cari", "Plástico", 38, 274.26);



        ArrayList<Object> zapateriasPaqui = new ArrayList<>();

        zapateriasPaqui.add(newShoes);
        zapateriasPaqui.add(newShoes2);

        System.out.println(zapateriasPaqui);


    }
}