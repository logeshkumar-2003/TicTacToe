package models;

public class Bot {
    private Long id;
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Bot(char symbol,PlayerType playerType){
        this.name="BOT";
        this.symbol=symbol;
        this.playerType=playerType;
    }

    public Character getSymbol(){
        return this.symbol;
    }

    public String getName() {
        return this.name;
    }
}
