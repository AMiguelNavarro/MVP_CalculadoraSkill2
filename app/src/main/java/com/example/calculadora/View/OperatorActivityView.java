package com.example.calculadora.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculadora.Contracts.OperationView_interface;
import com.example.calculadora.Presenter.OperationPresenter;
import com.example.calculadora.R;

public class OperatorActivityView extends AppCompatActivity implements OperationView_interface {

    private EditText etNum1, etNum2;
    private Button btAdd, btSubtract, btMultiply, btDivide;
    private TextView tvResult;
    private OperationPresenter operationPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);

        initComponents();
        operationPresenter = new OperationPresenter(this);
    }

    public void doAdd(View view) {
        try {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());

            operationPresenter.add(num1, num2);
        } catch (NumberFormatException e) {
            invalidOperation();
        }
    }

    public void doSubtract(View view) {
        try {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());

            operationPresenter.subtract(num1, num2);
        } catch (NumberFormatException e) {
            invalidOperation();
        }
    }

    public void doMultiply(View view) {
        try {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());

            operationPresenter.multiply(num1, num2);
        } catch (NumberFormatException e) {
            invalidOperation();
        }
    }

    public void doDivide(View view) {
        try {
            int num1 = Integer.parseInt(etNum1.getText().toString());
            int num2 = Integer.parseInt(etNum2.getText().toString());

            operationPresenter.divide(num1, num2);
        } catch (NumberFormatException e) {
            invalidOperation();
        }
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void invalidOperation() {
        Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show();
    }

    public void initComponents(){
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btAdd = findViewById(R.id.btAdd);
        btSubtract = findViewById(R.id.btSubtract);
        btMultiply = findViewById(R.id.btMultiply);
        btDivide = findViewById(R.id.btDivide);
        tvResult = findViewById(R.id.tvResult);
    }
}