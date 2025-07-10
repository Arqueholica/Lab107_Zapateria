public class Elegante extends Zapatos{

    private boolean tieneHebilla;


    public Elegante(String type, String marca, String modelo, String material, double talla, double precio, boolean tieneHebilla) {
        super(type, marca, modelo, material, talla, precio);
        this.tieneHebilla = tieneHebilla;
    }


   public boolean isTieneHebilla() {
        return tieneHebilla;
    }

    public void setTieneHebilla(boolean tieneHebilla) {
        this.tieneHebilla = tieneHebilla;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Hebilla: " + (tieneHebilla?"Sí":"No") + '\n' ;

    }
}
