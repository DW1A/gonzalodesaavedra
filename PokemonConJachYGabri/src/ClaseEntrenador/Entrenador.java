package ClaseEntrenador;

public class Entrenador {

    private int posX;
    private int posY;
    private int n;
    private int $;
    private int W;
    private int L;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setAtk(int atk) {
        this.atk = atk; // this se refiere a "este objeto"
    }

    public int getCasillas() {
        return n;
    }

    public int getDinero() {
        return $;
    }
    
    public int getVictorias() {
        return W;
    }

    public int getDerrotas() {
        return L;
    }


    public Entrenador(int n, int posX, int posY, int $, int W, int L) {
        this.n = n;
        this.$ = $;
        this.posX = posX;
        this.posY = posY;
        this.W = W;
        this.L=L;
    }

    @Override
    public String toString() {
        return "Pokemon [Posición:(" +posX+ "," +posY+").   Dinero=" +$+ ".   Casillas recorridas:" +n+ ".   Victorias:" +W+ ".   Derrotas:" +L+ "]";
    }

    public void MoveUp() {  		 	//Moverse 1 casilla hacia arriba
        if (posY>1)
        	this.posY ++;
        else 
        	System.out.println("Has llegado al límite del mapa en esta dirección");
        

    }
    
    public void MoveDown() {     		//Moverse una casilla hacia abajo
    	 if (posY<7)
    		this.posY --;
    	 else 
          	System.out.println("Has llegado al límite del mapa en esta dirección");
    }

    public void MoveRight() {       	//Moverse una casilla hacia la derecha
        if (posX<12)
        	this.posX ++;
        else 
        	System.out.println("Has llegado al límite del mapa en esta dirección");

    }
    
    public void MoveLeft() {			//Moverse una casilla hacia abajo
        if (posX>1)
        	this.posX --;
        else 
        	System.out.println("Has llegado al límite del mapa en esta dirección");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void zzz() {
        // TODO limitar veces de descanso
        this.dfn += 4;
    }

    public int ganador = 0;

    public int lucha(Pokemon otherPokemon) { // Pokemon <-- Clase otherPokemon <-- Variable?
                                             // pokemon contra el que va a luchar
        

        while ((this.hp > 0) && (otherPokemon.hp > 0)) { //si alguno muere termina
            this.hp -= (otherPokemon.atk - this.dfn); //mi ataque - su defensa
            otherPokemon.hp -= (this.atk - otherPokemon.dfn); //su ataque - mi defensa
        }

        if (this.hp > otherPokemon.hp) {
            this.ganador=1;
        } else {
            if (otherPokemon.hp > this.hp) {
                this.ganador=2;
            } else {
                this.ganador=3;
            }
        }

        

        //TODO completar como se elige ganador
        return ganador;
    }

    public int getGanador() {
        return ganador;
    }

}
