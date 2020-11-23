package com.example.calculadora.Presenter;

import com.example.calculadora.Contracts.OperationPresenter_interface;
import com.example.calculadora.Model.OperationModel;
import com.example.calculadora.View.OperatorActivityView;

public class OperationPresenter implements OperationPresenter_interface {

    private OperatorActivityView operatorActivityView;
    private OperationModel operationModel;

    public OperationPresenter(OperatorActivityView operatorActivityView) {
        this.operatorActivityView = operatorActivityView;
        this.operationModel = new OperationModel(this);
    }

    @Override
    public void showResult(String result) {
        if (operatorActivityView != null){
            operatorActivityView.showResult(result);
        }
    }

    @Override
    public void invalidOperation() {
        if (operatorActivityView != null) {
            operatorActivityView.invalidOperation();
        }
    }

    @Override
    public void add(int num1, int num2) {
        if (operationModel != null) {
            operationModel.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (operationModel != null) {
            operationModel.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (operationModel != null) {
            operationModel.multiply(num1, num2);
        }
    }

    @Override
    public void divide(int num1, int num2) {
        if (operationModel != null) {
            operationModel.divide(num1, num2);
        }
    }
}
