package Logica;

public class Pikachu extends Pokemon implements IElectrico {
    
    //Constructor
    public Pikachu() {
    }
    
    //Metodos de la clase Pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ataque Mordisco");
    }
    
    //Metodos de la interfaz IElectrico
    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataque Impactrueno");
    }

    @Override
    public void punioTrueno() {
        System.out.println("Pikachu ataque Trueno");
    }
    
}
