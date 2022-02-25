package com.fundamentosplatzi.springboot.fundamentos.component;

public class ComponentTwoImplement implements ComponentDependency {

    @Override
    public void saludar() {
        System.out.println("Hola mundo desde el component 2");
    }
}
