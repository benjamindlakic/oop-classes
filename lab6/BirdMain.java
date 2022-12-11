package lab6;

public class BirdMain {
    public static void main(String[] args) {
        BirdWatchers db = new BirdWatchers();
        loop: while(true) {
            System.out.print("? ");
            String option = db.input().toLowerCase().trim();
            switch (option) {
                case "add" -> db.addBird();
                case "observation" -> db.observe();
                case "statistics" -> db.statistics();
                case "show" -> db.show();
                case "quit" -> {break loop;}
            }
        }
    }
}
