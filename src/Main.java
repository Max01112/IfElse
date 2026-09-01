//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Задача 1");
        short age = 11;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        System.out.println(" ");
        System.out.println("Задача 2");
        int warm = 5;
        if(warm >= 5){
            System.out.println("Сегодня тепло, можно идти без шапки");
        }else{
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        System.out.println(" ");
        System.out.println("Задача 3");
        int speed = 61;
        if(speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }else{
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        System.out.println(" ");
        System.out.println("Задача 4");
        int age2 = 13;
        if(age2 >= 2 && age2 <= 7){
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        }if(age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        }
        if(age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");
        }
        if(age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить на работу");
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        int age3 = 99;
        if(age3 <= 5){
            System.out.println("Если возраст человека равен " + age3 + " то ему нельзя кататься на аттракционе");
        }if(age3 > 5 && age3 <= 14) {
            System.out.println("Если возраст человека равен " + age3 + " то ему можно кататься на аттракционе в сопровождении");
        }
        if(age3 >= 15) {
            System.out.println("Если возраст человека равен " + age3 + " то ему кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println(" ");
        System.out.println("Задача 6");
        int seat = 77;
        if(seat >= 60 && seat <=102){
            System.out.println("Сидячих мест нет, вагон всё ещё может вместить пассажиров.");
        }else if(seat < 60){
            System.out.println("Есть сидячие места!");
        }else if(seat > 102){
            System.out.println("Мест не осталось..");
        }

        System.out.println(" ");
        System.out.println("Задача 7");
        int one = 4;
        int two = 2;
        int three = 111;
        if(one > two && one > three){
            System.out.println(one);
        }else if(two > one && two > three){
            System.out.println(two);
        }else {
            System.out.println(three);
        }

    }
}