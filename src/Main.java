import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;



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
            - preguntar modelo --> muestra el precio ✅
                               --> se añade a una variable gastoTotal (sum +=) ✅
            - se repite el bucle hasta que se escriba "salir" --> sout del gastoTotal ✅
                                                              --> sout "hasta la próxima" ✅
         */
        Zapatos newShoes = new Elegante( "Elegante","Pi Hy Pi", "Cayetano", "Cuero", 41.5, 189.50, true);
        Zapatos newShoes2 = new Elegante( "Elegante", "Oh Sea", "Cari", "Plástico", 38, 274.26, false);

        Zapatos newShoes3 = new Casual("Casual","Relax", "dontDoIt", "Algodón", 39.5, 157.69);
        Zapatos newShoes4 = new Casual("Casual", "Snoop", "doubleD", "Cáñamo", 42, 420);

        Zapatos newShoes5 = new Deporte( "Deporte", "Olympia", "Mercurio", "Divino", 45, 652.10);
        Zapatos newShoes6 = new Deporte("Deporte", "Ball of Foot", "Messy", "Hojas", 43.5, 896.87);


        ArrayList<Zapatos> zapateriasPaqui = new ArrayList<>();

        zapateriasPaqui.add(newShoes);
        zapateriasPaqui.add(newShoes2);
        zapateriasPaqui.add(newShoes3);
        zapateriasPaqui.add(newShoes4);
        zapateriasPaqui.add(newShoes5);
        zapateriasPaqui.add(newShoes6);

//        System.out.println(zapateriasPaqui);
        System.out.println("\n" + "Modelos disponibles:" + "\n");

//        for (int i = 0; i < zapateriasPaqui.size(); i++) {
//
//            System.out.println(zapateriasPaqui.get(i));
//        };
        for(Zapatos z: zapateriasPaqui){
            System.out.println(z);
        }


        Scanner sc = new Scanner(System.in);


        double gastoTotal = 0.0;
        String answer;

        System.out.println("¿Qué tipo de zapatos buscas? (E)legante, (C)asual, (D)eporte. Escribe 'salir' para abandonar la búsqueda.");
        answer = sc.nextLine();
do {

    if (answer.equalsIgnoreCase("E") || answer.equalsIgnoreCase("C") || answer.equalsIgnoreCase("D") ){

        System.out.println("¿Qué modelo?");
        String modelo = sc.nextLine();
        boolean found = false;

        for (Zapatos zapas : zapateriasPaqui){
        String modOk = zapas.getModelo();

         if(modOk.equalsIgnoreCase(modelo)){
            double preu = zapas.getPrecio();
             System.out.println("Agregado el modelo " + modelo + " por " + preu + "€" );
             found = true;
             gastoTotal += preu;

             System.out.println("El gasto total es de " + gastoTotal + "€");
            }
         }

          if(!found){
            System.out.println("No tenemos ese modelo aún");
            }
        }

}while(!answer.equalsIgnoreCase("salir"));

        System.out.println("El gasto total es de de " + gastoTotal + "€. ¡Hasta la Próxima!");

    }
}