class Programmer {

    private static int progHours = 0;
    private static int progWage = 100;

    static void writeCode() {
        progHours++;
    }

    static int getProgWage() {
        return progWage;
    }

    static int getProgHours() {
        return progHours;
    }

    static void setProgHours(int progHours) {
        Programmer.progHours = progHours;
    }

    static void setProgWage(int progWage) {
        Programmer.progWage = progWage;
    }

    static int workingTime() {
        System.out.println("Програмист отработал " + progHours + " часов.");
        return progHours;
    }
}