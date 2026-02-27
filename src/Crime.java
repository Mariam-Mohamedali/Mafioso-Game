
class Suspect {

    String name;
    String motive;
    String alibi;
    boolean isGuilty;

    Suspect(String name, String motive, String alibi, boolean isGuilty) {
        this.name = name;
        this.motive = motive;
        this.alibi = alibi;
        this.isGuilty = isGuilty;
    }

    void interrogate() {
        System.out.println("Name: " + name);
        System.out.println("Motive: " + motive);
        System.out.println("Alibi: " + alibi);

    }
}

class Crime {

    String title;
    String description;
    Suspect[] suspects;

    Crime(String title, String description, Suspect[] suspects) {
        this.title = title;
        this.description = description;
        this.suspects = suspects;
    }

    void showDetails() {
        System.out.println("\n=== " + title + " ===");
        System.out.println(description);
    }

    void showSuspects() {
        for (int i = 0; i < suspects.length; i++) {
            System.out.println((i + 1) + "- " + suspects[i].name);
        }
    }
}
