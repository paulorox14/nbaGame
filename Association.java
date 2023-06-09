public class Association
{
    private Teams teams;
    private Season season;

    public Association()
    {
        teams = new Teams();
        season = new Season();
    }

    public static void main(String[] args) {
        Association myAssociation = new Association();
        myAssociation.use();
    }

    public void use() { 
        while (true) {
            helpMenu();
            char choice = readChoice();

            switch (choice) {
                case '1': teamsPage(); break;
                case '2': seasonsPage(this.teams); break;
                case 'X': System.out.println("Done"); return;
                default: System.out.println("Please enter a number 1 or 2, or press X to exit."); break;
            }
        }
    }

    public char readChoice() {
        System.out.print("Enter a choice: ");
        return In.nextChar();
    }

    public void teamsPage() {
        teams.use();
    }

    public void seasonsPage(Teams teams) {
        season.use(teams);
    }

    public void helpMenu() {
        System.out.println("Welcome to the Association! Please make a selection from the menu:");
        System.out.println("1. Explore the teams.");
        System.out.println("2. Arrange a new season.");
        System.out.println("X. Exit the system.");
    }


}
