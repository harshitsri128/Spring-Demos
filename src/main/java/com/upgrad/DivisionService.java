package com.upgrad;

import org.springframework.stereotype.Component;

@Component
public class DivisionService implements MathService {
    @Override
    public void operate(int x, int y) {
        System.out.println(x/y);
    }
}
