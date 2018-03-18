package org.itstep;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private boolean win=false;

    // Constants

    // REGEX

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //Work method
    public void processUser(){
        model.rand(model.getMinBarrier(), model.getMaxBarrier());
        while(!win) {


            Scanner sc = new Scanner(System.in);




            model.setValue(inputIntValueWithScannerAndDiapason(sc));

            view.printMessage(View.OUR_INT + model.getValue());
        }

    }



    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int res=0;
        view.printMessage(view.INPUT_INT_DATA +
                model.getMinBarrier() + " " + model.getMaxBarrier());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_DATA
                        + view.INPUT_INT_DATA + model.getMinBarrier() + " " + model.getMaxBarrier());
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() ||
                    res >= model.getMaxBarrier()) {
                view.printMessage(view.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA + model.getMinBarrier() + " " + model.getMaxBarrier());
                continue ;
            }
            break;
        }
        if(res>model.getComputersNumber()){
            model.setMaxBarrier(res);
            model.incrementTrys();
        }

        if(res<model.getComputersNumber()){
            model.setMinBarrier(res);
            model.incrementTrys();
        }
        if(res==model.getComputersNumber()){

            view.printMessage(View.CONGRATULATIONS + model.getTrys());win=true;}
        return res;
    }



}
