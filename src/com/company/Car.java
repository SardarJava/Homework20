package com.company;

public class Car implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Mashina jabylyp jatat");
            }
public void drive () {
    System.out.println("Mashina jurup jatat");
}
}
