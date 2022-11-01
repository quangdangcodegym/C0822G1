package com.codegym.views;

import com.codegym.model.Product;
import com.codegym.model.User;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public abstract class ViewTemplate {
    protected Scanner scanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Wellcome to TanDung Company");
    }

    public void showFooter() {
        System.out.println("...@Design by TanDung");
    }

    public abstract void showBody();

    public void showPage() {
        showMenu();
        showBody();
        showFooter();
    }




}
