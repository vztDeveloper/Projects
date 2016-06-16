class Tester {

    private static int testerHours = 0;
    private static int testerWage = 100;

    static void testPrograms() {
        testerHours++;
    }

    static int getTesterWage() {
        return testerWage;
    }

    static int getTesterHours() {
        return testerHours;
    }

    static void setTesterHours(int testerHours) {
        Tester.testerHours = testerHours;
    }

    static void setTesterWage(int testerWage) {
        Tester.testerWage = testerWage;
    }

    static int workingTime() {
        System.out.println("Тестировщик отработал " + testerHours + " часов.");
        return testerHours;
    }
}