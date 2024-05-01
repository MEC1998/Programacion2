import java.util.ArrayList;
import java.util.List;

public class Proof {
    private int code;
    private String title;
    private Installation installation;
    private List<Athlete> athletes;

    public Proof(int code, String title, Installation installation){
        this.code=code;
        this.title=title;
        this.installation=installation;
        this.athletes= new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Installation getInstallation() {
        return installation;
    }

    public void setInstallation(Installation installation) {
        this.installation = installation;
    }

    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }

    public Athlete getAthleteByIndex(int index){
        if (index>=0 && index< athletes.size()){
            return athletes.get(index);
        }else{
            return null;
        }
    }
}
