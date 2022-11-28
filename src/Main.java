public class Main {
    public static void main(String[] args) {

            task1to3();
            task4();
            task5();
            task6to7();
            task8();
        }

        public static void task1to3() {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
        }

        public static void task4() {
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 3;
            System.out.println(friend);

        }

        public static void task5() {
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);

        }
        public static void task6to7() {
            var boxer1 = 78.2;
            var boxer2 = 82.7;
            var massBoxers = boxer1 + boxer2;
            System.out.println("Общий вес боксеров " + massBoxers + " кг");
            var raznicaMassuMinus = boxer2 - boxer1;
            System.out.println("Разница массы " + raznicaMassuMinus + " кг");
            var raznicaMassuOstatoc = boxer2 % boxer1;
            System.out.println("Разница массы " + raznicaMassuOstatoc + " кг");

        }

        public static void task8() {
            var allWorkTime = 640;
            var workTimeOneEmployee= 8;
            var totalEmployees = allWorkTime / workTimeOneEmployee;
            System.out.println("Всего работников в компании " + totalEmployees + " человек");
            var newEmployee = totalEmployees + 94;
            var newWorkTime = allWorkTime / newEmployee;
            System.out.println("Если в компании работает " + newEmployee + " человек, то всего " + newWorkTime + " часа работы может быть поделено между сотрудниками");

        }


    }