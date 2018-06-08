package com.todak2000.simplequizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//        Question 1
    RadioButton q1option1;
    RadioButton q1option2;
    RadioButton q1option3;
    RadioButton q1option4;

//        Question 2
    CheckBox q2option1;
    CheckBox q2option2;
    CheckBox q2option3;
    CheckBox q2option4;

//        Question 3
    EditText answer3;

    //        Question 4
    RadioButton q4option1;
    RadioButton q4option2;
    RadioButton q4option3;
    RadioButton q4option4;

    //        Question 5
    CheckBox q5option1;
    CheckBox q5option2;
    CheckBox q5option3;
    CheckBox q5option4;

    //        Question 6
    RadioButton q6option1;
    RadioButton q6option2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){

        int score;
        int score_one = 0;
        int score_two = 0;
        int score_three ;
        int score_four = 0;
        int score_five = 0;
        int score_six = 0;
//            ANSWER FOR QUESTION ONE
        Boolean ans_one1;
        Boolean ans_one2;
        Boolean ans_one3;
        Boolean ans_one4;
        q1option1 = findViewById(R.id.q1option1);
        q1option2 = findViewById(R.id.q1option2);
        q1option3 = findViewById(R.id.q1option3);
        q1option4 = findViewById(R.id.q1option4);
        ans_one1 = q1option1.isChecked();
        ans_one2 = q1option2.isChecked();
        ans_one3 = q1option3.isChecked();
        ans_one4 = q1option4.isChecked();
        if (ans_one3){
            score_one = 5;
        } else if (ans_one1|| ans_one2 || ans_one4){
            score_one = 0;
        }
//        ANSWER FOR QUESTION TWO
        Boolean ans_two1;
        Boolean ans_two2;
        Boolean ans_two3;
        Boolean ans_two4;
        q2option1 = findViewById(R.id.q2option1);
        q2option2 = findViewById(R.id.q2option2);
        q2option3 = findViewById(R.id.q2option3);
        q2option4 = findViewById(R.id.q2option4);
        ans_two1 = q2option1.isChecked();
        ans_two2 = q2option2.isChecked();
        ans_two3 = q2option3.isChecked();
        ans_two4 = q2option4.isChecked();

        if (ans_two3){
            score_two = 5;
        } else if (ans_two1|| ans_two2 || ans_two4){
            score_two = 0;
        }
        //        ANSWER FOR QUESTION THREE
        String ans_three;
        answer3 = findViewById(R.id.answer3);
        ans_three = answer3.getText().toString().toUpperCase();
        if (ans_three.equals("RUSSIA")){
            score_three = 5;
        } else{
            score_three = 0;
        }
        //            ANSWER FOR QUESTION FOUR
        Boolean ans_four1;
        Boolean ans_four2;
        Boolean ans_four3;
        Boolean ans_four4;

        q4option1 = findViewById(R.id.q4option1);
        q4option2 = findViewById(R.id.q4option2);
        q4option3 = findViewById(R.id.q4option3);
        q4option4 = findViewById(R.id.q4option4);
        ans_four1 = q4option1.isChecked();
        ans_four2 = q4option2.isChecked();
        ans_four3 = q4option3.isChecked();
        ans_four4 = q4option4.isChecked();
        if (ans_four1){
            score_four = 5;
        } else if (ans_four3|| ans_four2 || ans_four4){
            score_four = 0;
        }
//        ANSWER FOR QUESTION FIVE
        Boolean ans_five1;
        Boolean ans_five2;
        Boolean ans_five3;
        Boolean ans_five4;
        q5option1 = findViewById(R.id.q5option1);
        q5option2 = findViewById(R.id.q5option2);
        q5option3 = findViewById(R.id.q5option3);
        q5option4 = findViewById(R.id.q5option4);
        ans_five1 = q5option1.isChecked();
        ans_five2 = q5option2.isChecked();
        ans_five3 = q5option3.isChecked();
        ans_five4 = q5option4.isChecked();
        if (ans_five4){
            score_five = 5;
        } else if(ans_five1||ans_five2||ans_five3){
            score_five = 0;
        }
//        ANSWER FOR QUESTION SIX
        Boolean ans_six1;
        Boolean ans_six2;
        q6option1 = findViewById(R.id.q6option1);
        q6option2 = findViewById(R.id.q6option2);
        ans_six1 = q6option1.isChecked();
        ans_six2 = q6option2.isChecked();
        if (ans_six1){
            score_six = 5;
        } else if(ans_six2){
            score_six = 0;
        }
        score = (score_one + score_two + score_three + score_four + score_five + score_six);


        if (score == 30){
            Toast.makeText(this, "Congratulations! You Scored "+score+" out of 30.", Toast.LENGTH_LONG).show();
        }
        else if (score == 25){
            Toast.makeText(this, "Well Done! You Scored "+score+" out of 30. You can do better!", Toast.LENGTH_LONG).show();
        }
        else if (score == 20){
            Toast.makeText(this, "Good! You Scored "+score+" out of 30. You can do better!", Toast.LENGTH_LONG).show();
        }
        else if (score == 15){
            Toast.makeText(this, "Not Bad! You Scored "+score+" out of 30. You can Improve next time!", Toast.LENGTH_LONG).show();
        }
        else if (score == 10){
            Toast.makeText(this, "Try again Man! You Scored "+score+" out of 30. You can Improve next time!", Toast.LENGTH_LONG).show();
        }
        else if (score == 5){
            Toast.makeText(this, "You suck Man! You Scored "+score+" out of 30. You need to work on yourself!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Are you trying to be smart! You have not attempted the Questions.", Toast.LENGTH_SHORT).show();

        }
    }
}
