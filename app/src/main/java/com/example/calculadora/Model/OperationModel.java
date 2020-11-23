package com.example.calculadora.Model;

import com.example.calculadora.Contracts.OperationPresenter_interface;
import com.example.calculadora.Presenter.OperationPresenter;

public class OperationModel implements com.example.calculadora.Contracts.OperationModel_interface {

    private int result;
    private OperationPresenter presenter;

    /*
    * Constructor
    * Recibe como parametro la vista del presenter
    * */
    public OperationModel(OperationPresenter operationPresenter){
        this.presenter = operationPresenter;
    }


    @Override
    public void add(int num1, int num2) {
        result = num1 +num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
        presenter.showResult(Integer.toString(result));
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 != 0 && num1 != 0) {
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        } else {
            presenter.invalidOperation();
        }
    }
}
