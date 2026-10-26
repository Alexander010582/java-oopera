import java.util.Arrays;

public class Theatre {

    public static void main (String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Побединская", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Алексей", "Алексеев", Gender.MALE, 177);

        Director director1 = new Director("Даниил", "Данилов", Gender.MALE, 8);
        Director director2 = new Director("Илона", "Давыдова", Gender.FEMALE, 3);

        String musicAuthor = "Петр Ильич Чайковский";
        String choreographer = "Алла Духова";

        Show show = new Show("Человек дождя", 180, director1);
        Opera opera = new Opera("Онегин", 120, director1,
                musicAuthor, "Либретто", 40);
        Ballet ballet = new Ballet("Щелкунчик", 140, director2, musicAuthor,
                "Не знаю что писать в либретто", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        show.addActor(new Actor("Петр", "Петров", Gender.MALE, 175));

        System.out.println();
        ballet.replaceActorByLastName(actor2, "Алексеев");

        System.out.println("После замены в балете:");
        ballet.printActors();

        System.out.println();
        show.replaceActorByLastName(actor3, "Полднев");

        System.out.println();
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }

}