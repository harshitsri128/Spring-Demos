package com.upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    //@Autowired //Field based injection
    private AdditionService additionService;
    @Autowired //Constructor based injection
    public Calculator(AdditionService additionService) {
        this.additionService = additionService;
    }

    public AdditionService getAdditionService() {
        return additionService;
    }

    //@Autowired //Setter based injection
    public void setAdditionService(AdditionService additionService) {
        this.additionService = additionService;
    }



    public void compute(String op,int x, int y) throws Exception {
        if (op.equals("add"))
            additionService.operate(x,y);
        else
            throw new Exception("Invalid operator");
    }
}
