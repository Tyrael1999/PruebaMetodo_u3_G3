package Clases;

public class DetectaCasos {
    int[][] tablero;
    public DetectaCasos(int[][] tablero){
        this.tablero = tablero;
    }

    /**
     * Metodo que detecta los casos adyacentes de covid
     * @param i indice i(columnas)
     * @param j indice j(filas)
     * La casilla marcada en el tablero por ambos indices determinara si tiene un caso
     * si la casilla contiene un 1, marca un caso de covid
     * @return el numero de casos adyacente
     */
    public int adyacenteDetect(int i, int j){
        int cuentaCasos=0;
        //verifica si se encuentra en un borde, despues busca
        if (i-1>=0 && j-1>=0 && tablero[i-1][j-1]==1){
            cuentaCasos++;
        } else if (j-1>=0 && tablero[i][j-1]==1){
            cuentaCasos++;
        }else if (i+1<tablero.length && j-1>=0 && tablero[i+1][j-1]==1){
            cuentaCasos++;
        }else if (i+1<tablero.length && tablero[i+1][j]==1){
            cuentaCasos++;
        }else if (i+1<tablero.length && j+1<tablero[0].length && tablero[i+1][j+1]==1){
            cuentaCasos++;
        }else if (j+1<tablero[0].length && tablero[i][j+1]==1){
            cuentaCasos++;
        }else if (i-1>=0 && j-1>=0 && tablero[i-1][j-1]==1){
            cuentaCasos++;
        }else if (i-1>=0 && tablero[i-1][j]==1){
            cuentaCasos++;
        }
        return cuentaCasos;
    }
}
