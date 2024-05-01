public class Athlete extends Person implements Math, Contract{
    private double height;
    private int age;
    private double weight;
    private NationalTeam nationalTeam;
    private Proof proof;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public NationalTeam getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(NationalTeam nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public Proof getProof() {
        return proof;
    }

    public void setProof(Proof proof) {
        this.proof = proof;
    }

    @Override
    public double calculateBMI(){
        return weight/(height*height);
    }

    @Override
    public boolean thereIsExtraWeight(double weight){
        double bmi = calculateBMI();
        return bmi>25;
    }

    @Override
    public double takePulses(){
        return 0;
    }
}
