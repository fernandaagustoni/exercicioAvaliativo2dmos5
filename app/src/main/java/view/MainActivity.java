package view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.superbancoimobiliariodmo.R;

import model.StarBank;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditTextCredit;
    private EditText inputEditTextDebit;
    private EditText inputEditTextValue;
    private Button creditButton;
    private Button debitButton;
    private Button payButton;
    private Button loanButton;
    private TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditTextDebit = findViewById(R.id.edittext_debit);
        inputEditTextCredit = findViewById(R.id.edittext_credit);
        inputEditTextValue = findViewById(R.id.edittext_value);

        creditButton = findViewById(R.id.button_credit);
        debitButton = findViewById(R.id.button_debit);
        loanButton = findViewById(R.id.button_loan);
        payButton = findViewById(R.id.button_pay);
        outputTextView = findViewById(R.id.textview_value);

    }



}