package entities;

public abstract class Vehicle {
    private String board;
    private String color;
    
    public Vehicle() {
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract String everyoneData();
}