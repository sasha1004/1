package ru.skypro;

public class Variable {

    public static void main(String[] args) {
        // Задание 1
        //На уроке мы проходили разные типы переменных.
        //
        //Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
        byte coat = 5;
        short dress = 10;
        int jacket = 1_300_000;
        long shoes = 15L;

        float bootsWeight = 5.5f;
        double sweaterWeight = 1.5;

        char a = 43;
        boolean coatIsAdult = false;

        // Задание 2
        //А теперь решите задание.
        //В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
        //Вес одного боксера – 78,2 кг
        //Вес второго боксера – 82,7 кг
        //Подсчитайте и выведите в консоль общий вес двух бойцов.
        //Подсчитайте и выведите в консоль разницу между весами бойцов.

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double totalWeight = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;

        if(boxer2>boxer1)
            weightDifference = boxer2 - boxer1;
        else
            weightDifference = boxer1 - boxer2;

        float difference = (float) (boxer2 % boxer1);

        System.out.println("Общий вес двух боксеров " + totalWeight);
        System.out.println("Разница между весом боксеров " + weightDifference);
        System.out.println("Новое решение "+ difference);

        // Задание 3
//За весом спортсмена следит не только сам спортсмен, но и его тренер.
//Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
//Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
//– Бананы – 5 штук (1 банан - 80 грамм);
//– Молоко – 200 мл (100 мл = 105 грамм);
//– Мороженое пломбир – 2 брикета по 100 грамм;
//– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
//Смешать всё в блендере и готово.
//Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
//Результат напечатайте в консоль.
//**Важное условие:** если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int totalWeightInGram = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес завтрака в граммах " + totalWeightInGram + " гр");
        int grToKilo = 1000;
        float totalWeightInKilo = (float) totalWeightInGram / grToKilo;
        System.out.println("Общий вес завтрака в килограммах " + totalWeightInKilo + " кг");

        // Задание 4
//Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
//Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
//Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
//Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
//Результаты подсчетов выведите в консоль.
        byte totalLoseWeight = 7;
        int gramToKilo = 1000;
        int totalLoseWeightInGram = totalLoseWeight * gramToKilo;
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        int daysToLoseWeight1 = totalLoseWeightInGram / loseWeight1;
        System.out.println(daysToLoseWeight1 + " дней нужно для похудения в первом варианте");
        int daysToLoseWeight2 = totalLoseWeightInGram / loseWeight2;
        System.out.println(daysToLoseWeight2 + " дней нужно для похудения во втором варианте");
        int mean = (daysToLoseWeight1 + daysToLoseWeight2) / 2;
        System.out.println(mean + " день в среднем нужен для похудения");

        // Задание 5
//Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
//К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//Маша получает 67 760 рублей в месяц
//Денис получает 83 690 рублей в месяц
//Кристина получает 76 230 рублей в месяц
//Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
//Выведите в консоль информацию по каждому сотруднику.
//Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;

        byte monthsAYear = 12;


        int annualIncomeM = salaryM * 12;
        int annualIncomeD = salaryD * monthsAYear;
        int annualIncomeK = salaryK * monthsAYear;
        double salaryIncrease = 0.1;
        double salaryMNow = salaryM + (salaryM * salaryIncrease);
        double salaryDNow = salaryD + (salaryD * salaryIncrease);
        double salaryKNow = salaryK + (salaryK * salaryIncrease);
        double annualIncomeMNow = salaryMNow * monthsAYear;
        double annualIncomeDNow = salaryDNow * monthsAYear;
        double annualIncomeKNow = salaryKNow * monthsAYear;
        double differenceM = annualIncomeMNow - annualIncomeM;
        double differenceD = annualIncomeDNow - annualIncomeD;
        double differenceK = annualIncomeKNow - annualIncomeK;
        System.out.println(salaryMNow + " зарплата Маши после повышения," + " годовой доход вырос на " + differenceM);
        System.out.println(salaryDNow + " зарплата Дениса после повышения" + " годовой доход вырос на " + differenceD);
        System.out.println(salaryKNow + " зарплата Кристины после повышения" + " годовой доход вырос на " + differenceK);



    }
}


