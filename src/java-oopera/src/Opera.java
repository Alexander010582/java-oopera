public class Opera extends MusicalShow {
    private int choirSize; // количество человек в хоре

    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера: " + getTitle() + " (хор: " + choirSize + " человек)";
    }
}