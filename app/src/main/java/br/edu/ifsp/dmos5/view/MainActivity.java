package br.edu.ifsp.dmos5.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.superbancoimobiliariodmo.R;

import java.util.ArrayList;

import br.edu.ifsp.dmos5.model.CreditCard;
import br.edu.ifsp.dmos5.model.InsufficientMoney;
import br.edu.ifsp.dmos5.model.StarBank;

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

    private static ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
    private CreditCard card1 = new CreditCard();
    private CreditCard card2 = new CreditCard();
    private CreditCard card3 = new CreditCard();
    private CreditCard card4 = new CreditCard();
    private CreditCard card5 = new CreditCard();
    private CreditCard card6 = new CreditCard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startSuperBancoImobiliario();


        inputEditTextPay = findViewById(R.id.edittext_cardPay);
        inputEditTextReceive = findViewById(R.id.edittext_cardReceive);
        inputEditTextValue = findViewById(R.id.edittext_value);

        loanButton = findViewById(R.id.button_loan);
        payButton = findViewById(R.id.button_pay);
        transferButton = findViewById(R.id.button_transfer);
        resetButton = findViewById(R.id.button_reset);
        outputTextView = findViewById(R.id.textview_value);
        rowButton = findViewById(R.id.button_row);

        loanButton.setOnClickListener(this);
        payButton.setOnClickListener(this);
        transferButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
        rowButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == rowButton) {
            sendMoney();
        }
        if (v == resetButton) {
            initCards();
        }
        if (v == transferButton) {
            transferMoney();
        }
        if (v == payButton) {
            try {
                payBank();
            } catch (InsufficientMoney e) {
                Toast.makeText(this, "Saldo insuficiente.", Toast.LENGTH_SHORT).show();
            }
        }

        if (v == loanButton) {
            receiveBank();
        }

    }

    public void startSuperBancoImobiliario() {
        initCards();
    }

    private void initCards(){
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);

        for(CreditCard c : cards){
            StarBank.getInstance().startCreditCards(c);
        }
    }

    public CreditCard getCard(int cardCalculador){

    }

    public int getCardId(EditText editCard){
    }

    private double getValue() {
    }

    public void sendMoney(){

    }

    public void payBank() throws InsufficientMoney {

    }

    public void receiveBank(){
    }

    public void transferMoney(){

    }

}
