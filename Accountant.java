import java.io.*;

class Accountant extends Manager {

    private static int accHours = 0;
    private static int accWage = 5000;  // ставка за месяц бухгалтера
    private static String fileName = "D:\\WeeklyReport.txt", fileName2 = "D:\\MonthlyReport.txt"; //путь где сохраняются отсчеты.
    private static FileWriter w, m;
    private static int counter = 1;

    private static int getAccWage() {
        return accWage;
    }

    static void setAccWage(int accWage) {
        Accountant.accWage = accWage;
    }

    static void workingTime() {
        System.out.println("Бугалтер отработал " + accHours + " часов.");
    }


    static void makeCounts() throws IOException { //метод описывает сколько получит каждый работник по недельно, и в целом за месяц

        w = new FileWriter(fileName, true);
        m = new FileWriter(fileName2, true);

        w.write("За " + counter + " недели каждый работник получит:" + "\n");

        int menSalary = Manager.getManagerWage();   //ставка менеджера
        int dirSalary = Company.Director.getDirWage();  //ставка директора
        int accSalary = Accountant.getAccWage();    //ставка бухгалтера

        System.out.println("Cчитаем сколько получит за неделю программист...");
        int progSalary = Programmer.workingTime() * Programmer.getProgWage();
        int progWorkedHours = Programmer.getProgHours();
        System.out.println("Программист получит " + progSalary + "$");
        w.write("Программист отработал " + progWorkedHours + " часов. ");
        w.write("Программист получит " + progSalary + "$" + "\n");
        System.out.println();

        System.out.println("Cчитаем сколько получит за неделю дизайнер...");
        int desSalary = Desinger.workingTime() * Desinger.getDesingerWage();
        int desWorkedHours = Desinger.getDesingerHours();
        System.out.println("Дизайнер получит " + desSalary + "$");
        w.write("Дизайнер отработал " + desWorkedHours + " часов. ");
        w.write("Дизайнер получит " + desSalary + "$" + "\n");
        System.out.println();

        System.out.println("Cчитаем сколько получит за неделю тестировщик...");
        int testSalary = Tester.workingTime() * Tester.getTesterWage();
        int testWorkedHours = Tester.getTesterHours();
        System.out.println("Тестировщик получит " + testSalary + "$");
        w.write("Тестировщик отработал " + testWorkedHours + " часов. ");
        w.write("Тестировщик получит " + testSalary + "$" + "\n");
        System.out.println();

        System.out.println("Cчитаем сколько получит за неделю уборщик...");
        int cleanSalary = Cleaner.workingTime() * Cleaner.getCleanerWage();
        int cleanWorkedHours = Cleaner.getCleanerHours();
        System.out.println("Уборщик получит " + cleanSalary + "$");
        w.write("Уборщик отработал " + cleanWorkedHours + " часов. ");
        w.write("Уборщик получит " + cleanSalary + "$" + "\n");
        w.write("\n");
        System.out.println();
        counter++;
        if (counter == 5) {
            m.write("За месяц каждый работник получит:" + "\n");
            m.write("Программист получит " + progSalary + "$. " + "Отработал " + progWorkedHours + " часов" + "\n");
            m.write("Дизайнер получит " + desSalary + "$. " + "Отработал " + desWorkedHours + " часов" + "\n");
            m.write("Тестировщик получит " + testSalary + "$. " + "Отработал " + testWorkedHours + " часов" + "\n");
            m.write("Уборщик получит " + cleanSalary + "$." + "Отработал " + cleanWorkedHours + " часов" + "\n");
            m.write("Менеджер получит " + menSalary + "$." + "\n");
            m.write("Бухгалтер получит " + accSalary + "$" + "\n");
            m.write("Директор получит " + dirSalary + "$" + "\n");
        }

        w.close();
        m.close();
    }
}

