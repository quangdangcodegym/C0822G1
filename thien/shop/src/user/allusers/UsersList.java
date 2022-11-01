package user.allusers;

import user.User;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UsersList {
private static Scanner scanner = new Scanner(System.in);
    public UsersList(){init();}
    private static ArrayList<User> usersList;

    public static ArrayList<User> getUsersList() {
        return usersList;
    }

    public static void setUsersList(ArrayList<User> usersList) {
        UsersList.usersList = usersList;
    }

    public static void init(){
        Date createAt = new Date();
        Instant updateAt = Instant.now();
        usersList = new ArrayList<>();
        usersList.add(new User("Ronaldo", "ronaldo@gmail.com", "Portugal", 987654321, createAt,updateAt));
        usersList.add(new User("Messi", "messi@gmail.com", "Argentina", 987651234, createAt, updateAt));
        usersList.add(new User("Neymar", "neymar@gmail.com", "Brasil", 987612345, createAt, updateAt));
        usersList.add(new User("Ronaldo", "huda@gmail.com", "Hue", 252275, createAt, updateAt));
        usersList.add(new User("Heineken", "neymar@gmail.com", "SG", 275568, createAt, updateAt));
    }
//    static {
//        Date createAt = new Date();
//        Instant updateAt = Instant.now();
//        usersList = new ArrayList<>();
//        usersList.add(new User("Ronaldo", "ronaldo@gmail.com", "Portugal", 987654321, createAt, updateAt));
//        usersList.add(new User("Messi", "messi@gmail.com", "Argentina", 987651234, createAt, updateAt));
//        usersList.add(new User("Neyma", "neyma@gmail.com", "Brasil", 987612345, createAt, updateAt));
//    }
    public void addUser(User user){
        usersList.add(user);
    }
    public void addUser(){
        System.out.println("Add you user:");
        System.out.println("Add name");
        String name = scanner.nextLine();
        System.out.println("Add email");
        String email = scanner.nextLine();
        System.out.println("Add address");
        String address = scanner.nextLine();
        System.out.println("Add phone number");
        Long phone = Long.parseLong(scanner.nextLine());
        Date createAt = new Date();
        Instant updateAt = Instant.now();
        usersList.add(new User(name, email, address, phone, createAt, updateAt));
    }
    public void removeUser(int id){
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId() == id){
                usersList.remove(i);
            }
        }
    }
    public void removeUser(String name){
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getName() == name){
                usersList.remove(i);
            }
        }
    }
    public void fixUser(int id){
        for (User user : usersList) {
            if (user.getId() == id){
                System.out.println("Fix user here:");
                System.out.println("Enter new name: ");
                user.setName(scanner.nextLine());
                System.out.println("Enter new email:");
                user.setEmail(scanner.nextLine());
                System.out.println("Enter new address:");
                user.setAddress(scanner.nextLine());
                System.out.println("Enter new phone number:");
                user.setPhone(Long.parseLong(scanner.nextLine()));
                user.setUpdateAt(Instant.now());
            }
        }
    }
    public User findById(int id){
        User userId = new User();
        int count = 0;
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId() == id){
                userId = usersList.get(i);
                count++;
            } else if (i == usersList.size() - 1 && count ==0){
                userId = null;
            }
        }
        return userId;
    }
    public ArrayList findByName(String name){
        ArrayList<User> sameNameList = new ArrayList<>();
        for (User user : usersList) {
            if (user.getName() == name){
                sameNameList.add(user);
            }
        }
        return sameNameList;
    }
    public ArrayList findByEmail(String email){
        ArrayList<User> sameEmailList = new ArrayList<>();
        for (User user : usersList) {
            if (user.getEmail() == email){
                sameEmailList.add(user);
            }
        }
        return sameEmailList;
    }
    public ArrayList findByAddress(String address){
        ArrayList<User> sameAddressList = new ArrayList<>();
        for (User user : usersList) {
            if (user.getAddress() == address){
                sameAddressList.add(user);
            }
        }
        return sameAddressList;
    }
    public ArrayList findByPhone(long phone){
        ArrayList<User> samePhoneList = new ArrayList<>();
        for (User user : usersList) {
            if (user.getPhone() == phone){
                samePhoneList.add(user);
            }
        }
        return samePhoneList;
    }

    @Override
    public String toString() {
        String str = "";
        for (User user : usersList) {
            str += user;
        }
        return str;
    }
}
