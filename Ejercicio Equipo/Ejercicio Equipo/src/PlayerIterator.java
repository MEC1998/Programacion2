import java.util.Iterator;
import java.util.List;

public class PlayerIterator implements Iterator<Player> {
    private List<Player> players;
    private int currentIndex;

    public PlayerIterator(List<Player> players){
        this.players = players;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext(){
        return currentIndex<players.size();
    }

    @Override
    public Player next(){
        return players.get(currentIndex++);
    }
}
