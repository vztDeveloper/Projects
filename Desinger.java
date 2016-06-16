class Desinger {

    private static int desingerHours = 0;
    private static int desingerWage = 100;

    static void drawMaket() {
        desingerHours++;
    }

    static int getDesingerWage() {
        return desingerWage;
    }

    static int getDesingerHours() {
        return desingerHours;
    }

    static void setDesingerHours(int desingerHours) {
        Desinger.desingerHours = desingerHours;
    }

    static void setDesingerWage(int desingerWage) {
        Desinger.desingerWage = desingerWage;
    }

    static int workingTime() {
        System.out.println("Дизайнер отработал " + desingerHours + " часов.");
        return desingerHours;
    }
}
