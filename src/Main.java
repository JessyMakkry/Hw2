public class Main {
    public static void main(String[] args) {
        //Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задание 6
        var boxOne = 82.7;
        var boxTwo = 78.2;
        var Sum = boxOne + boxTwo;
        var Dif = boxOne - boxTwo;
        System.out.println("Общий вес "+Sum+" кг");
        System.out.println("Разница между бойцами "+Dif+" кг");
        //Задание 7
        var mod = boxOne % boxTwo;
        System.out.println(mod);
        //Задание 8
        var hours = 640;
        var workers = hours / 8;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        hours = workers * 8;
        System.out.println("Если в компании работает " + workers +
                " человек, то всего " + hours +
                " часов работы может быть поделено между сотрудниками");
    }
}