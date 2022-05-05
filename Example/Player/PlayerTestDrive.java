public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player one = new Player("Tiger Woods");
        System.out.println(Player.playerCount);   
        Player two = new Player("Robert Regalado");
        System.out.println(Player.playerCount);   
    }
}
