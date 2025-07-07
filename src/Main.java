import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
            qué necesito crear aparte:
            - clase abstracta zapatos --> base del resto madre suprema ✅
                                      --> marca modelo material talla precio ✅
            - tres clases que heredan de zapatos --> hijas: elegante, casual, deporte ✅


            dentro del ejecutable:
            - dos instancias por clase ✅
            - arrayList con todos los zapatos ✅

            scanner:
            - preguntar tipo de zapato (confirmación tipología con ifelseo ¿?)
            - preguntar modelo --> muestra el precio
                               --> se añade a una variable gastoTotal (sum +=)
            - se repite el bucle hasta que se escriba "salir" --> sout del gastoTotal
                                                              --> sout "hasta la próxima"
         */
        Zapatos newShoes = new Elegante("Pi Hy Pi", "Cayetano", "Cuero", 41.5, 189.50);
        Zapatos newShoes2 = new Elegante("Oh Sea", "Cari", "Plástico", 38, 274.26);

        Zapatos newShoes3 = new Casual("Relax", "dontDoIt", "Algodón", 39.5, 157.69);
        Zapatos newShoes4 = new Casual("Snoop", "doubleD", "Cáñamo", 42, 420);

        Zapatos newShoes5 = new Deporte("Olympia", "Mercurio", "Divino", 45, 652.10);
        Zapatos newShoes6 = new Deporte("Ball of Foot", "Messy", "Hojas", 43.5, 896.87);


        ArrayList<Object> zapateriasPaqui = new ArrayList<>();

        zapateriasPaqui.add(newShoes);
        zapateriasPaqui.add(newShoes2);
        zapateriasPaqui.add(newShoes3);
        zapateriasPaqui.add(newShoes4);
        zapateriasPaqui.add(newShoes5);
        zapateriasPaqui.add(newShoes6);

        System.out.println(zapateriasPaqui);
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué tipo de zapatos buscas? (E)legante, (C)asual, (D)eporte");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("C")) {
            System.out.println("Qué modelo?");
            String modelo = sc.nextLine();


            System.out.println("El modelo seleccionado tiene un precio de" + Casual.getPrecio(modelo));
        }






    }
}