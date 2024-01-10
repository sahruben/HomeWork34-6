public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[6];
        workers[0] = new Worker("Иван", 3000.0);
        workers[1] = new Worker("Мария", 2500.0);
        workers[2] = new Worker("Алексей", 4000.0);
        workers[3] = new Worker("Екатерина", 4500.0);
        workers[4] = new Worker("Дмитрий", 7000.0);
        workers[5] = new Worker("Анна", 5500.0);

        // Находим сотрудника с наибольшей зарплатой
        Worker maxSalaryWorker = workers[0];
        for (int i = 1; i < workers.length; i++) {
            if (workers[i].getSalary() > maxSalaryWorker.getSalary()) {
                maxSalaryWorker = workers[i];
            }
        }

        // Выводим информацию о сотруднике с наибольшей зарплатой
        System.out.println("Информация о сотруднике с наибольшей зарплатой:");
        System.out.println("Имя: " + maxSalaryWorker.getName());
        System.out.println("Зарплата: " + maxSalaryWorker.getSalary());
    }
}

