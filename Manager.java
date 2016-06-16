class Manager {

    private static int managerHours = 0;
    static int managerWage = 5000;

    static int getManagerWage() {
        return managerWage;
    }

    static void setManagerWage(int managerWage) {
        Manager.managerWage = managerWage;
    }

    static void doSomething() {
        managerHours++;
    }

    static void workingTime() {
        System.out.println("Менеджер отработал " + managerHours + " часов.");
    }
}
