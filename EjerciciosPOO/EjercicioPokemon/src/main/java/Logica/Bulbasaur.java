package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {
    
    //Constructor
    public Bulbasaur() {
    }
    
    //Metodos de la clase Pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulba ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulba ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulba ataque Mordisco");
    }

    //Metodos de la interfaz IPlanta
    @Override
    public void atacarDrenaje() {
        System.out.println("Bulba ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulba ataque Paralizar");    
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulba ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulba ataque Latigo Cepa");
    }
    
}
