class Cleaner {

    private static int cleanerHours = 0;
    private static int cleanerWage = 100; // почасовая ставка уборщика.

    static void cleanOffice() {
        cleanerHours++;
    }

    static int getCleanerWage() {
        return cleanerWage;
    }

    static int getCleanerHours() {
        return cleanerHours;
    }

    static void setCleanerHours(int cleanerHours) {
        Cleaner.cleanerHours = cleanerHours;
    }

    static void setCleanerWage(int cleanerWage) {
        Cleaner.cleanerWage = cleanerWage;
    }

    static int workingTime() {
        System.out.println("Уборщик отработал " + cleanerHours + " часов.");
        return cleanerHours;

    }
}
