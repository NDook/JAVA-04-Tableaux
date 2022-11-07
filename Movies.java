import java.util.Arrays;

class Movies {

    public static void main(String...args) {
        String[] movies = {"Les aventuriers de l'arche perdue", "Indiana Jones et le temple maudit", "Indiana Jones et la dernière croisade"};
        String[] firstMovieACtors = {"Harrison Ford", "Karen Allen", "Paul Freeman"};
        String[] secondMovieACtors = {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"};
        String[] thirdMovieACtors = {"Harrison Ford", "Sean Connery", "Denholm Elliott"};
        String[][] movieActors;
        movieActors = new String[][]{firstMovieACtors, secondMovieACtors, thirdMovieACtors};

        for(int i = 0; i < movies.length; i++) {
            System.out.println("Dans le film " + movies [i]+ ", les principaux acteurs sont " + (Arrays.toString(movieActors[i]).replaceAll("\\[|]", "")));
        }
    }
}