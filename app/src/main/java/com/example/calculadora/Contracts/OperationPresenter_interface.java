package com.example.calculadora.Contracts;

/*
* Intermediario entre modelo y vista
* Llama a los método correspondientes en las interfaces, por lo que tiene todas las funciones
* */
public interface OperationPresenter_interface {
    void showResult(String result);
    void invalidOperation();
    void add(int num1, int num2);
    void subtract(int num1, int num2);
    void multiply(int num1, int num2);
    void divide(int num1, int num2);
}
