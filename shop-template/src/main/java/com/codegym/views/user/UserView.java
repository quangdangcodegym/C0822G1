package com.codegym.views.user;

import com.codegym.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UserView {
    private ArrayList<User> users;
    private static Scanner scanner = new Scanner(System.in);

    public void init() {
        users= new ArrayList<>();
        Date createAt = new Date();

        // public User(Long id, String name, String email, String address, String phone, Date createAt, int idRole) {
        users.add(new User(1667182235L, "Truong Van Phon", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182236L, "Tran Van Cu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182237L, "Le Anh Thu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182238L, "Phan Minh Tu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182239L, "Nguyen Anh Khoa", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));

    }

    public void addUserView() {
        System.out.println("--> ADD USER VIEW");
        Long idUser = System.currentTimeMillis()/1000;
        // public User(Long id, String name, String email, String address, String phone, Date createAt, int idRole)
        System.out.println("Input username:");
        String username = scanner.nextLine();

        System.out.println("Input email:");
        String email = scanner.nextLine();

        System.out.println("Input address:");
        String address = scanner.nextLine();

        System.out.println("Input phone:");
        String phone = scanner.nextLine();

        System.out.println("Input role 1/ADMIN 2/USER");
        int idRole = Integer.parseInt(scanner.nextLine());

        Date creatAtUser = new Date();

        User user = new User(idUser, username, email, address, phone, creatAtUser, idRole);
        users.add(user);


    }
    public void showUsersView() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
