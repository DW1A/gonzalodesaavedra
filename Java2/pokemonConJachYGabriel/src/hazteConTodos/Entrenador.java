package hazteConTodos;

public class Entrenador {


    private int posX=0;
    private int posY=0;
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



    
    public Entrenador() {
        this.n = 1;
        this.$ = 60;
    //    this.posX = posX;
    //    this.posY = posY;
        this.W = 5;
        this.L=9;
    }

    @Override
    public String toString() {
        return "Entrenador: [Posición:(" +posX+ "," +posY+").   Dinero=" +$+ ".   Casillas recorridas:" +n+ ".   Victorias:" +W+ ".   Derrotas:" +L+ "]";
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

    
    }