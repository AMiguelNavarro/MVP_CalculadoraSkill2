package com.example.calculadora.Contracts;

/*
* Contiene las funciones para mostrar los resultados de la operacion
* Manda mensaje de error  en caso de que los datos sean incorrectos o se divida para 0
* */
public interface OperationView_interface {
    void showResult(String result);
    void invalidOperation();
}
