public class Movie implements Comparable<Movie> {
    private int rank;
    private String title;
    private int year;
    private double rating;

    public Movie() {

    }

    public Movie(int rank, String title, int year, double rating) {
        this.rank = rank;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public Movie(Movie other) {
        this.rank = other.rank;
        this.title = other.title;
        this.year = other.year;
        this.rating = other.rating;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return "#" + rank + " " + title + " " + year + ", IMBD Rating: " + rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Movie other = (Movie) obj;
        return this.rank == other.rank &&
                this.year == other.year &&
                Double.compare(this.rating, other.rating) == 0 &&
                this.title.equals(other.title);
    }

    public int compareTo(Movie other) {
        return Integer.compare(this.rank, other.rank);
    }
}
