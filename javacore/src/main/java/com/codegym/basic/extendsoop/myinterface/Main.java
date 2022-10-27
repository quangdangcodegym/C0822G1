package com.codegym.basic.extendsoop.myinterface;

public class Main {
    public interface Flyable {
        public int NUMBER = 1;
        String howtoFly();
        /**
         - Chua cac hang so va phuong thuc abstract
         - Trong interface mac dinh dinh la public abstract
         - Khong the tao doi tuong tu interface
         - Khi tao interface thi dong thoi tao ra 1 kieu du lieu moi
         - Interface la gi: cau truc tuong tu lop
         - Khi nao su dung interface:
            + Ho tro da ke thua
            + Ap dung doi voi cac lop con khong lien quan den nhau
         */
    }

    public abstract static class Animal{
        public abstract String howtoSleep();
    }

    public static class Bird extends Animal implements Flyable{

        @Override
        public String howtoFly() {
            return "bird fly by bird's wings: " + NUMBER;
        }

        @Override
        public String howtoSleep() {

            return "Sleep";
        }
    }
    public static class Fly implements Flyable{

        @Override
        public String howtoFly() {
            return "Fly use engine and fly's wings";
        }
    }

    public static void main(String[] args) {
        Bird bird =new Bird();
        Fly fly = new Fly();
        System.out.println(fly.howtoFly());
        System.out.println(bird.howtoFly());
    }
}



