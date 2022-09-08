public class Main {
    public static void main(String[] args) {
        //Задание 1,2,3

        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat+4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper+4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        //Задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //Задание 6
        var boxerWeight1 = 78.2;
        System.out.println(boxerWeight1);
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight2);
        var totalboxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalboxerWeight);
        var differenceBoxerWeight =  boxerWeight2 - boxerWeight1;
        System.out.println(differenceBoxerWeight);
        //Задание 7
        differenceBoxerWeight = boxerWeight2 - boxerWeight1;
        System.out.println(differenceBoxerWeight);
        differenceBoxerWeight = boxerWeight2%boxerWeight1;
        System.out.println(differenceBoxerWeight);

        //Задание 8
        var totalWorkHours = 640;
        System.out.println(totalWorkHours);
        var hours= 8;
        System.out.println(hours);
        var employees = totalWorkHours/hours;
        System.out.println(employees);
        var workEmployees = employees + 94;
        System.out.println(employees);
        var hoursForAll = hours*workEmployees;
        System.out.println("Если в компании работает " + workEmployees + " человек, то всего " + hoursForAll + " часов работы может быть поделено между сотрудниками");

    }
}