public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Antonio");
        NationalTeam nationalTeam1 = new NationalTeam("Rojo y blanco", "Japón");
        NationalTeam nationalTeam2 = new NationalTeam("Rojo", "Italia");
        NationalTeam nationalTeam3 = new NationalTeam("Plateado", "Alemania");
        Installation installation1 = new Installation("Circuito 1", "Mónaco", "Circuito Urbano de Mónaco", "Velocidad");
        Installation installation2 = new Installation("Circuito 2", "Italia", "Autodromo Nazionale Monza", "Velocidad");
        Campus campus = new Campus(1, "Primer fecha", "14:00hs");
        Proof proof1 = new Proof(1, "Gran Premio de Mónaco", installation1);
        Proof proof2 = new Proof(2, "Gran Premio de Italia", installation2);
        Athlete athlete1 = new Athlete(101, "Ayrthon", 1.8, 25, 70);
        Athlete athlete2 = new Athlete(102, "Michael", 1.75,30, 80);
        Athlete athlete3 = new Athlete(103, "Juan Manuel", 1.85,28,75);

        athlete1.setNationalTeam(nationalTeam1);
        athlete2.setNationalTeam(nationalTeam2);
        athlete3.setNationalTeam(nationalTeam3);
        proof1.addAthlete(athlete1);
        proof1.addAthlete(athlete2);
        proof1.addAthlete(athlete3);
        proof2.addAthlete(athlete1);
        proof2.addAthlete(athlete2);
        proof2.addAthlete(athlete3);

        System.out.println("Nombre del 3er atleta de la 2da prueba: "+proof2.getAthleteByIndex(2).getName());
        System.out.println("Código de la 2da prueba: "+proof2.getCode());


        System.out.println("\nALTURA DE TODOS LOS ATLETAS:\nAtleta 1: Altura= "+athlete1.getHeight()+"\nAtleta 2: Altura= "+athlete2.getHeight()+"\nAtleta 3: Altura= "+athlete3.getHeight()+"\n---------------------");
        System.out.println("\nPESO EXTRA DE CADA ATLETA\nAtleta 1: Peso extra= "+(athlete1.thereIsExtraWeight(athlete1.getWeight())? "Si":"No")+"\nAtleta 2: Peso extra= "+(athlete2.thereIsExtraWeight(athlete2.getWeight())? "Si":"No")+"\nAtleta 3: Peso extra= "+(athlete3.thereIsExtraWeight(athlete3.getWeight())? "Si":"No")+"\n---------------------");

    }
}