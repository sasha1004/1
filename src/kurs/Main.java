package kurs;


//1. Создать класс Employee, который содержит информацию о Ф. И. О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//    2. Посчитать сумму затрат на зарплаты в месяц.
//    3. Найти сотрудника с минимальной зарплатой.
//    4. Найти сотрудника с максимальной зарплатой.
//    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//    6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
public class Main {

    public static void countMinSalary(Employee[] employees) {

        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees
            ) {
                if (emp.getSalaryStaff() > employee.getSalaryStaff())
                emp = employee;

            }

            System.out.println("Cотрудник с минимальной зарплатой:" + emp.getSalaryStaff() + emp.getStaff() + emp.getId());
        } else
            System.out.println("Массив пустой");
    }

    public static void countMaxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees
            ) {
                if (emp.getSalaryStaff() < employee.getSalaryStaff())
                emp = employee;

            }

            System.out.println("Cотрудник с максимальной зарплатой:" + emp.getSalaryStaff() + emp.getStaff() + emp.getId());
        } else
            System.out.println("Массив пустой");
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void typeAllStaffFIO(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getStaff());
        }
    }

    public static int countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        return sum;
    }

    public static void averageSalary(Employee[] employees) {


        int sum = countStaffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Средняя зарплата: " + average);
    }

    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Cотрудники компании: " + employee.getStaff());
        }

    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Ivanov Ivan Ivanovich ", 55000, 1);
        employee[1] = new Employee(" Makarov Makar Makarovich ", 65000, 2);
        employee[2] = new Employee(" Maksimov Maksim Maksimovich ", 99000, 3);
        employee[3] = new Employee(" Vasilkov Visaliy Vasilylievich ", 98000, 4);
        employee[4] = new Employee(" Bykin Gennadi Gennadievich ", 120000, 5);
        employee[5] = new Employee(" Galkin Maksim Maksimovich ", 130000, 1);
        employee[6] = new Employee(" Pygacheva Nadezda Valerievna ", 200000, 2);
        employee[7] = new Employee(" Kirkorov Vladimir Ostapovich ", 33000, 3);
        employee[8] = new Employee(" Kirienko Viktor Viktorovich ", 78000, 4);
        employee[9] = new Employee(" Medvedev Dmitriy Ivanovich ", 140000, 5);

        typeAllStaff(employee);
        countMinSalary(employee);
        countMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        countAllStaff(employee);
    }
}







