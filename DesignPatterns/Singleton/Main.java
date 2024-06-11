package DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection dbc1=DataBaseConnection.getInstance();
        DataBaseConnection dbc2=DataBaseConnection.getInstance();
    }
}
