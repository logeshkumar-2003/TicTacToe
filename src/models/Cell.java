package models;


public class Cell {

    private int row;

    private int column;

    private Player player;

    private CellState cellState;

    Cell(int row,int column){
        this.row=row;
        this.column=column;
        this.cellState=CellState.EMPTY;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player=player;
    }
}
