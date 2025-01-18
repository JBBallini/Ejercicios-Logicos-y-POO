package Logica;

public class EjercicioPokemon {

    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle();
        Pikachu pika = new Pikachu();
        Bulbasaur bulba = new Bulbasaur();
        Charmander charmander = new Charmander();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulba.atacarHojaAfilada();
        pika.atacarImpactrueno();
    }
}
