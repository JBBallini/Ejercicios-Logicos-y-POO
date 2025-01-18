package Logica;

public class Charmander extends Pokemon implements IFuego {

    //Constructor
    public Charmander() {
    }
    
    //Metodos de la clase Pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander ataque Mordisco");
    }
    
    //Metodos de la interfaz IFuego
    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander ataque Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataque Ascuas");
    }
    
}
