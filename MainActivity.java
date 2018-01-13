package com.example.android.tictactoeapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private Button btnBox1;
    private Button btnBox2;
    private Button btnBox3;
    private Button btnBox4;
    private Button btnBox5;
    private Button btnBox6;
    private Button btnBox7;
    private Button btnBox8;
    private Button btnBox9;

    private TextView txtDisplay;

    private SecureRandom mSecureRandom = new SecureRandom();

    private enum Status{ NOTSTARTED, CONTINUING, ENDED}
    private enum PlayerTurn{ PLAYER1_TURN, PLAYER2_TURN}

    private Status gameStatus = Status.NOTSTARTED;
    private PlayerTurn mTurn = PlayerTurn.PLAYER1_TURN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnStart = (Button)findViewById(R.id.btnStart);
        btnBox1 = (Button)findViewById(R.id.btnBox1);
        btnBox2 = (Button)findViewById(R.id.btnBox2);
        btnBox3 = (Button)findViewById(R.id.btnBox3);
        btnBox4 = (Button)findViewById(R.id.btnBox4);
        btnBox5 = (Button)findViewById(R.id.btnBox5);
        btnBox6 = (Button)findViewById(R.id.btnBox6);
        btnBox7 = (Button)findViewById(R.id.btnBox7);
        btnBox8 = (Button)findViewById(R.id.btnBox8);
        btnBox9 = (Button)findViewById(R.id.btnBox9);


        txtDisplay = (TextView)findViewById(R.id.txtDisplay);

        /*
        This is to choose who goes first.
         */
        final String decision = whoGoesFirst();

        if(gameStatus == Status.NOTSTARTED){
            makeAllInvis();
        }
        /*
        This is to begin the game.
         */
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameStatus = Status.CONTINUING;
                makeAllVis();
                makeStartInvis();
                txtDisplay.setText(decision);
            }
        });
        /*
        This is to set the player status.
         */
        if(decision.equals("Player 1")){
            mTurn = PlayerTurn.PLAYER1_TURN;
        }else{
            mTurn = PlayerTurn.PLAYER2_TURN;
        }

        /*
        These buttons is for when the player
        chooses their mark.
         */
            btnBox1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox1.getText() == ""){

                        btnBox1.setText("X");
                        switchToPlayer2();
                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox1.getText() == ""){

                        btnBox1.setText("O");
                        switchToPlayer1();

                    }else if(btnBox1.getText() != ""){

                        String store = btnBox1.getText() + "";
                        btnBox1.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox2.getText() == ""){

                        btnBox2.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox2.getText() == ""){

                        btnBox2.setText("O");
                        switchToPlayer1();

                    }else if(btnBox2.getText() != ""){

                        String store = btnBox1.getText() + "";
                        btnBox2.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox3.getText() == ""){

                        btnBox3.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox3.getText() == ""){

                        btnBox3.setText("O");
                        switchToPlayer1();

                    }else if(btnBox3.getText() != ""){

                        String store = btnBox3.getText() + "";
                        btnBox3.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox4.getText() == ""){

                        btnBox4.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox4.getText() == ""){

                        btnBox4.setText("O");
                        switchToPlayer1();

                    }else if(btnBox4.getText() != ""){

                        String store = btnBox4.getText() + "";
                        btnBox4.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox5.getText() == ""){

                        btnBox5.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox5.getText() == ""){

                        btnBox5.setText("O");
                        switchToPlayer1();

                    }else if(btnBox5.getText() != ""){

                        String store = btnBox5.getText() + "";
                        btnBox5.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox6.getText() == ""){

                        btnBox6.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox6.getText() == ""){

                        btnBox6.setText("O");
                        switchToPlayer1();

                    }else if(btnBox6.getText() != ""){

                        String store = btnBox6.getText() + "";
                        btnBox6.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox7.getText() == ""){

                        btnBox7.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox7.getText() == ""){

                        btnBox7.setText("O");
                        switchToPlayer1();

                    }else if(btnBox7.getText() == ""){

                        String store = btnBox7.getText() + "";
                        btnBox7.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox8.getText() == ""){

                        btnBox8.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox8.getText() == ""){

                        btnBox8.setText("O");
                        switchToPlayer1();

                    }else if(btnBox8.getText() != ""){

                        String store = btnBox8.getText() + "";
                        btnBox8.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnBox9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(mTurn == PlayerTurn.PLAYER1_TURN && btnBox9.getText() == ""){

                        btnBox9.setText("X");
                        switchToPlayer2();

                    }else if(mTurn == PlayerTurn.PLAYER2_TURN && btnBox9.getText() == ""){

                        btnBox9.setText("O");
                        switchToPlayer1();

                    } else if (btnBox9.getText() != "") {

                        String store = btnBox9.getText() + "";
                        btnBox9.setText(store);

                    }
                    if(checkIfPlayerOneWon()){
                        txtDisplay.setText("Player 1 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(checkIfPlayerTwoWon()){
                        txtDisplay.setText("Player 2 has won!!!");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                    if(fullBoard()){
                        txtDisplay.setText("No one won.");
                        makeAllInvis();
                        makeStartVis();
                        clearBoard();
                        txtDisplay.setVisibility(View.VISIBLE);
                    }
                }
            });
    }

    /*
    Makes all the components except for the start button invisible to the user.
     */
    public void makeAllInvis(){

        btnBox1.setVisibility(View.INVISIBLE);
        btnBox2.setVisibility(View.INVISIBLE);
        btnBox3.setVisibility(View.INVISIBLE);
        btnBox4.setVisibility(View.INVISIBLE);
        btnBox5.setVisibility(View.INVISIBLE);
        btnBox6.setVisibility(View.INVISIBLE);
        btnBox7.setVisibility(View.INVISIBLE);
        btnBox8.setVisibility(View.INVISIBLE);
        btnBox9.setVisibility(View.INVISIBLE);
        txtDisplay.setVisibility(View.INVISIBLE);

    }

    /*
    Makes all the components except for the start button visible to the user.
     */
    public void makeAllVis(){

        btnBox1.setVisibility(View.VISIBLE);
        btnBox2.setVisibility(View.VISIBLE);
        btnBox3.setVisibility(View.VISIBLE);
        btnBox4.setVisibility(View.VISIBLE);
        btnBox5.setVisibility(View.VISIBLE);
        btnBox6.setVisibility(View.VISIBLE);
        btnBox7.setVisibility(View.VISIBLE);
        btnBox8.setVisibility(View.VISIBLE);
        btnBox9.setVisibility(View.VISIBLE);
        txtDisplay.setVisibility(View.VISIBLE);

    }

    /*
    Makes the start button invisible.
     */
    public void makeStartInvis(){
        btnStart.setVisibility(View.INVISIBLE);
    }

    /*
    Makes the start button visible.
     */

    public void makeStartVis(){
        btnStart.setVisibility(View.VISIBLE);
    }

    /*
    This method determines which player goes first.
     */

    public String whoGoesFirst(){
        int player1 = 1 + mSecureRandom.nextInt(100);
        int player2 = 1 + mSecureRandom.nextInt(100);
        String choice = "";
        if(player1 == player2) {
            while (player1 == player2) {
                player1 = 1 + mSecureRandom.nextInt(100);
                player2 = 1 + mSecureRandom.nextInt(100);
            }
        }else{
            if(player1 > player2){
                choice = "Player 1";
            }else{
                choice = "Player 2";
            }
        }
        return choice;
    }

    /*
    The algorithm to check whether player 1 or player 2 won.
     */

    public boolean checkIfPlayerOneWon(){

        if(("" + btnBox1.getText() + btnBox2.getText() + btnBox3.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox4.getText() + btnBox5.getText() + btnBox6.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox7.getText() + btnBox8.getText() + btnBox9.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox1.getText() + btnBox4.getText() + btnBox7.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox2.getText() + btnBox5.getText() + btnBox8.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox3.getText() + btnBox6.getText() + btnBox9.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox1.getText() + btnBox5.getText() + btnBox9.getText()).equals("XXX")){
            return true;
        }else if(("" + btnBox3.getText() + btnBox5.getText() + btnBox7.getText()).equals("XXX")){
            return true;
        }
        return false;

    }

    public boolean checkIfPlayerTwoWon(){
        if(("" + btnBox1.getText() + btnBox2.getText() + btnBox3.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox4.getText() + btnBox5.getText() + btnBox6.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox7.getText() + btnBox8.getText() + btnBox9.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox1.getText() + btnBox4.getText() + btnBox7.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox2.getText() + btnBox5.getText() + btnBox8.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox3.getText() + btnBox6.getText() + btnBox9.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox1.getText() + btnBox5.getText() + btnBox9.getText()).equals("OOO")){
            return true;
        }else if(("" + btnBox3.getText() + btnBox5.getText() + btnBox7.getText()).equals("OOO")){
            return true;
        }
        return false;

    }

    /*
    The method to switch the players. From player 1 to player 2 or player 2 to player 1.
     */

    public void switchToPlayer1(){
        mTurn = PlayerTurn.PLAYER1_TURN;
        txtDisplay.setText("Player 1");
    }

    public void switchToPlayer2(){
        mTurn = PlayerTurn.PLAYER2_TURN;
        txtDisplay.setText("Player 2");
    }

    /*
    The method to clear the board.
     */
    public void clearBoard(){

        btnBox1.setText("");
        btnBox2.setText("");
        btnBox3.setText("");
        btnBox4.setText("");
        btnBox5.setText("");
        btnBox6.setText("");
        btnBox7.setText("");
        btnBox8.setText("");
        btnBox9.setText("");

    }

    /*
    Method to check if the board is full and if no one has won.
     */
    public boolean fullBoard(){
        if(("" + btnBox1.getText() + btnBox2.getText() + btnBox3.getText() + btnBox4.getText()
                + btnBox5.getText() + btnBox6.getText() + btnBox7.getText() + btnBox8.getText()
                + btnBox9.getText()).length() == 9){
            return true;
        }else{
            return false;
        }
    }

}
