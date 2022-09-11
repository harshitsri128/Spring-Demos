package com.upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    //@Autowired //Field based injection
    private MathService additionService;
    private MathService subtractionService;
    private MathService multiplicationService;
    private MathService divisionService;

    @Autowired //Constructor based
    public Calculator(@Qualifier("additionService") MathService additionService,@Qualifier("subtractionService") MathService subtractionService,
                     @Qualifier("multiplicationService") MathService multiplicationService,
                     @Qualifier("divisionService") MathService divisionService) {
        this.additionService = additionService;
        this.subtractionService = subtractionService;
        this.multiplicationService = multiplicationService;
        this.divisionService = divisionService;
    }


//    public Calculator(@Qualifier("additionService") MathService additionService) {
//        this.additionService = additionService;
//    }

    public MathService getAdditionService() {
        return additionService;
    }

    //@Autowired //Setter based injection
    public void setAdditionService(MathService additionService) {
        this.additionService = additionService;
    }



    public void compute(String op,int x, int y) throws Exception {
        if (op.equals("add"))
            additionService.operate(x,y);
        else if (op.equals("subtract"))
            subtractionService.operate(x,y);
        else if (op.equals("multiply"))
            multiplicationService.operate(x,y);
        else if (op.equals("divide"))
            divisionService.operate(x,y);
        else
            throw new Exception("Invalid operator");
    }
}
