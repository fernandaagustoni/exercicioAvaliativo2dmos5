package br.edu.ifsp.dmos5.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.superbancoimobiliariodmo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText inputEditTextReceive;
    private EditText inputEditTextPay;
    private EditText inputEditTextValue;
    private Button payButton;
    private Button loanButton;
    private Button transferButton;
    private Button resetButton;
    private Button rowButton;
    private TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditTextPay = findViewById(R.id.edittext_cardPay);
        inputEditTextReceive = findViewById(R.id.edittext_cardReceive);
        inputEditTextValue = findViewById(R.id.edittext_value);

        loanButton = findViewById(R.id.button_loan);
        payButton = findViewById(R.id.button_pay);
        transferButton = findViewById(R.id.button_transfer);
        resetButton = findViewById(R.id.button_reset);
        outputTextView = findViewById(R.id.textview_value);
        rowButton = findViewById(R.id.button_row);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_loan:
                break;
        }

    }

}