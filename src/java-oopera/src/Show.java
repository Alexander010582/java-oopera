import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: актёр " + actor + " уже участвует в спектакле \"" + title + "\".");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актёр " + actor + " добавлен в спектакль \"" + title + "\".");
    }

    public void replaceActorByLastName(Actor newActor, String lastNameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.lastName.equals(lastNameToReplace)) {
                Actor removed = listOfActors.set(i, newActor);
                System.out.println("В спектакле \"" + title + "\" актёр " + removed + " заменён на " + newActor + ".");
                return;
            }
        }
        System.out.println("Предупреждение: в спектакле \"" + title + "\" нет актёра с фамилией \"" + lastNameToReplace + "\". Замена не выполнена.");
    }

    public void printActors() {
        System.out.println("Список актёров спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  (нет актёров)");
        } else {
            for (Actor a : listOfActors) {
                System.out.println("  - " + a);
            }
        }
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (" + duration + " мин), реж. " + director;
    }

}