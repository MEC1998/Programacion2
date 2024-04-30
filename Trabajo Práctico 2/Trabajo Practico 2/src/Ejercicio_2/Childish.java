package Ejercicio_2;

public class Childish extends Book{
    private int recommendedMinimunAge;

    public Childish(String title, String author, int yearOfPublication, boolean lended, int recommendedMinimunAge) {
        super(title, author, yearOfPublication, lended);
        this.recommendedMinimunAge = recommendedMinimunAge;
    }

    public int getRecommendedMinimunAge() {
        return recommendedMinimunAge;
    }

    public void setRecommendedMinimunAge(int recommendedMinimunAge) {
        this.recommendedMinimunAge = recommendedMinimunAge;
    }

    @Override
    public String toString(){
        return super.toString()+" , Infantil - Edad mínima recomendada: "+ recommendedMinimunAge;
    }
}
