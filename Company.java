import java.io.IOException;

public class Company {

    private static int hours = 0, days = 1;

    public static void main(String[] args) throws IOException {

        /*
        Директор вырабатывает 160 часов в месяц. Каждый час он выдает одно задание одному из сотрудников,
        который его выполняет в течении часа.
         */

        for (int i = 0; i < 160 ; i++) {
            Programmer.workingTime();
            Desinger.workingTime();
            Manager.workingTime();
            Tester.workingTime();
            Cleaner.workingTime();
            System.out.println();

            Director.chooseTask();

            System.out.println("Часы " + hours);
            System.out.println("Дни " + days);
            System.out.println();
        }
    }

    static class Director extends Manager {

       private static int dirWage = 10000;

        static int getDirWage() {
            return dirWage;
        }

        static void setDirWage(int dirWage) {
            Director.dirWage = dirWage;
        }

        static void giveTaskToProgrammer() {
            Programmer.writeCode();
        }

        static void giveTaskToTester() {
            Tester.testPrograms();
        }

        static void giveTaskToDesinger() {
            Desinger.drawMaket();
        }

        static void giveTaskToAccountant() throws IOException {
            Accountant.makeCounts();
        }

        static void giveTaskToCleaner() {
            Cleaner.cleanOffice();
        }

        static void giveTaskToManager() {
            Manager.doSomething();
        }

        static void chooseTask() throws IOException {  // метод рандомно генерирует задание для работников
            int chance = 0;
            chance = (int) (Math.random()*100);
            if (chance >= 0 && chance < 20)     Director.giveTaskToProgrammer();
            if (chance >= 20 && chance < 40)    Director.giveTaskToTester();
            if (chance >= 40 && chance < 60)    Director.giveTaskToDesinger();
            if (chance >= 60 && chance < 80)    Director.giveTaskToManager();
            if (chance >= 80 && chance < 100)    Director.giveTaskToCleaner();
            hours++;
            if (hours > 8) {
                days++;
                hours = 1;
            }
            // в конце каждой недели директор дает задание бухгалтеру о составление отсчетов.
            if ((days == 5 && hours == 8) || (days == 10 && hours == 8) || (days == 15 && hours == 8) || (days == 20 && hours == 8)) {
                Director.giveTaskToAccountant();
            }
        }
    }
}
