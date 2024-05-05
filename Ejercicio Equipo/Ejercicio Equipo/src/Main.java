public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        team.addPlayer(new Player("José", "Delantero", 10));
        team.addPlayer(new Player("Pedro", "Arquero", 1));
        team.addPlayer(new Player("Fabricio", "Defensor", 4));

        for (Player player: team){
            System.out.println("Nombre: "+player.getName()+"\nPosición: "+player.getPosition()+"\nNúmero de camiseta: "+player.getShirtNumber());
            System.out.println("---------------------------");
        }
    }
}