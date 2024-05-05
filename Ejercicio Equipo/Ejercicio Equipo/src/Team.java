import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable<Player> {
    private List<Player> players;

    public Team(){
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    @Override
    public Iterator<Player> iterator(){
        return  new PlayerIterator(players);
    }
}
