package models;

public class HumanPlayer implements Player {
    int id;

    String name;

    char symbol;

    PlayerType playerType ;

    public HumanPlayer(String name, char x, PlayerType playerType) {
        this.name=name;
        this.symbol=x;
        this.playerType=playerType;
    }

    @Override
    public Character getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }
}
