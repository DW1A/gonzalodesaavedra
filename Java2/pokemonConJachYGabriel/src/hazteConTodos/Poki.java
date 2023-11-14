package hazteConTodos;
public class Poki {
    // math random para las estadisticas

    private String tipo;
    private int atk;
    private int dfn;
    private int hp;

    public String getTipo() {
        return tipo;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk; // this se refiere a "este objeto"
    }

    public int getDfn() {
        return dfn;
    }

    public int getHp() {
        return hp;
    }

    public Poki(String tipo, int atk, int dfn, int hp) {
        this.tipo = tipo;
        this.atk = atk;
        this.dfn = dfn;
        this.hp = hp;
    }

    double tiporandom;
    String nombreRandom;

    public Poki() {
        this.tipo = "Prueba";
        this.atk = (int) (Math.random() * 100);
        this.dfn = (int) (Math.random() * 100);
        this.hp = (int) (Math.random() * 100);
    }

    public String nombreRandom() {
        tiporandom = Math.random() * 100;

        if (tiporandom <= 33) {
            nombreRandom = "HierbaBuena";
        } else {
            if (tiporandom > 33 && tiporandom <= 66) {
                nombreRandom = "Bezolla";
            } else {
                nombreRandom = "Fuegoso";
            }

        }

        return nombreRandom;
    }

    public void setTipo() {
        this.nombreRandom();
        this.tipo = nombreRandom;
    }

    public void setDfn(int dfn) {
        this.dfn = dfn;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getTiporandom() {
        return tiporandom;
    }

    public String getNombreRandom() {
        return nombreRandom;
    }

    @Override
    public String toString() {
        return " [tipo=" + tipo + ", atk=" + atk + ", dfn=" + dfn + ", hp=" + hp + "]";
    }

    // teniendo los datos hasta aqui, tenemos un setup basico llamado POJO

    public void comerBaya() {
        this.hp += 5;
        // necesita el return para que no te de error si es int
    }

    public int ganador = 0;

    public void resetStat() {
        this.setTipo();
        this.atk = (int) (Math.random() * 100);
        this.dfn = (int) (Math.random() * 100);
        this.hp = (int) (Math.random() * 100);
    }

    public int lucha(Poki otherPoki) { // Poki <-- Clase otherPoki <-- Variable?
                                       // Poki contra el que va a luString

        while ((this.hp > 0) && (otherPoki.hp > 0)) { // si alguno muere termina
            this.hp -= (otherPoki.atk - this.dfn); // mi ataque - su defensa
            otherPoki.hp -= (this.atk - otherPoki.dfn); // su ataque - mi defensa
        }

        if (this.hp > otherPoki.hp) {
            this.ganador = 1;
        } else {
            if (otherPoki.hp > this.hp) {
                this.ganador = 2;
            } else {
                this.ganador = 3;
            }
        }

        // TODO completar como se elige ganador
        return ganador;
    }

    public int getGanador() {
        return ganador;
    }

}