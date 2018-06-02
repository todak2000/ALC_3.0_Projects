package com.example.dny1.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView teamAScore;
    private TextView teamBScore;

    private Button teamAScoreButton;
    private Button teamBScoreButton;

    private TextView teamAOffside;
    private TextView teamBOffside;

    private Button teamAOffsideButton;
    private Button teamBOffsideButton;

    private TextView teamAYellow;
    private TextView teamBYellow;

    private Button teamAYellowButton;
    private Button teamBYellowButton;

    private TextView teamAFoul;
    private TextView teamBFoul;

    private Button teamAFoulButton;
    private Button teamBFoulButton;

    private TextView teamARed;
    private TextView teamBRed;

    private Button teamARedButton;
    private Button teamBRedButton;

    private TextView teamAPossesion;
    private TextView teamBPossesion;

    private Button teamAPossesionButton;
    private Button teamBPossesionButton;

    private TextView teamACorner;
    private TextView teamBCorner;

    private Button teamACornerButton;
    private Button teamBCornerButton;

    private Button resetButton;

    public int posAPoint = 0;
    public int posBPoint = 0;
    public int posMaxPoint = 100;
    public int cornerAPoint = 0;
    public int cornerBPoint = 0;
    public int redAPoint = 0;
    public int redBPoint = 0;
    public int foulBPoint = 0;
    public int foulAPoint = 0;
    public int yellowAPoint = 0;
    public int yellowBPoint = 0;
    public int offsideBPoint = 0;
    public int offsideAPoint = 0;
    public int scoreB = 0;
    public int scoreA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = (TextView)findViewById(R.id.team_a_goal_text);
        teamBScore = (TextView)findViewById(R.id.team_b_goal_text);

        teamAScoreButton = (Button)findViewById(R.id.team_a_goal_button);
        teamBScoreButton = (Button)findViewById(R.id.team_b_goal_button);

        teamAOffside = (TextView)findViewById(R.id.team_a_offside_text);
        teamBOffside = (TextView)findViewById(R.id.team_b_offside_text);

        teamAOffsideButton = (Button)findViewById(R.id.team_a_offside_button);
        teamBOffsideButton = (Button)findViewById(R.id.team_b_offside_button);

        teamAYellow = (TextView)findViewById(R.id.team_a_yellow_text);
        teamBYellow = (TextView)findViewById(R.id.team_b_yellow_text);

        teamAYellowButton = (Button)findViewById(R.id.team_a_yellow_button);
        teamBYellowButton = (Button)findViewById(R.id.team_b_yellow_button);

        teamAFoul = (TextView)findViewById(R.id.team_a_foul_text);
        teamBFoul = (TextView)findViewById(R.id.team_b_foul_text);

        teamAFoulButton = (Button)findViewById(R.id.team_a_foul_button);
        teamBFoulButton = (Button)findViewById(R.id.team_b_foul_button);

        teamARed = (TextView)findViewById(R.id.team_a_red_text);
        teamBRed = (TextView)findViewById(R.id.team_b_red_text);

        teamARedButton = (Button)findViewById(R.id.team_a_red_button);
        teamBRedButton = (Button)findViewById(R.id.team_b_red_button);

        teamAPossesion = (TextView)findViewById(R.id.team_a_possesion_text);
        teamBPossesion = (TextView)findViewById(R.id.team_b_possesion_text);

        teamAPossesionButton = (Button)findViewById(R.id.team_a_possesion_button);
        teamBPossesionButton = (Button)findViewById(R.id.team_b_possesion_button);

        teamACorner = (TextView)findViewById(R.id.team_a_corner_text);
        teamBCorner = (TextView)findViewById(R.id.team_b_corner_text);

        teamACornerButton = (Button)findViewById(R.id.team_a_corner_button);
        teamBCornerButton = (Button)findViewById(R.id.team_b_corner_button);

        resetButton = (Button)findViewById(R.id.reset_button);
//    code for team A
//        method called when goal score button for team A is clicked
        teamAScoreButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                scoreA = scoreA + 1;
                teamAScore.setText(scoreA + "");
            }
        });
//        method called when offside button for team A is clicked
        teamAOffsideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                offsideAPoint = offsideAPoint + 1;
                teamAOffside.setText(offsideAPoint + "");
            }
        });
//        method called when yellow card button for team A is clicked
        teamAYellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowAPoint = yellowAPoint + 1;
                teamAYellow.setText(yellowAPoint + "");
            }
        });
//        method called when foul button for team A is clicked
        teamAFoulButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                foulAPoint = foulAPoint + 1;
                teamAFoul.setText(foulAPoint + "");
            }
        });
//        method called when red card button for team A is clicked
        teamARedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redAPoint = redAPoint + 1;
                teamARed.setText(redAPoint + "");
            }
        });
//        method called when possesion button for team A is clicked
        teamAPossesionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posAPoint = posAPoint +5;
                teamAPossesion.setText(posAPoint + "%");
                teamBPossesion.setText((posBPoint = posMaxPoint-posAPoint) + "%");
            }
        });
//        method called when corner button for team A is clicked
        teamACornerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cornerAPoint = cornerAPoint + 1;
                teamACorner.setText(cornerAPoint + "");
            }
        });

        //    code for team B
//        method called when goal score button for team B is clicked
        teamBScoreButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                scoreB = scoreB + 1;
                teamBScore.setText(scoreB + "");
            }
        });
//        method called when offside button for team B is clicked
        teamBOffsideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                offsideBPoint = offsideBPoint + 1;
                teamBOffside.setText(offsideBPoint + "");
            }
        });
//        method called when yellow card button for team B is clicked
        teamBYellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellowBPoint = yellowBPoint + 1;
                teamBYellow.setText(yellowBPoint + "");
            }
        });
//        method called when foul button for team B is clicked
        teamBFoulButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                foulBPoint = foulBPoint + 1;
                teamBFoul.setText(foulBPoint + "");
            }
        });
//        method called when red card button for team B is clicked
        teamBRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redBPoint = redBPoint + 1;
                teamBRed.setText(redBPoint + "");
            }
        });
//        method called when possesion button for team B is clicked
        teamBPossesionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posBPoint = posBPoint +5;
                teamBPossesion.setText(posBPoint + "%");
                teamAPossesion.setText((posAPoint = posMaxPoint-posBPoint) + "%");
            }
        });
//        method called when corner button for team B is clicked
        teamBCornerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cornerBPoint = cornerBPoint + 1;
                teamBCorner.setText(cornerBPoint + "");
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posBPoint = 0;
                teamBPossesion.setText(posBPoint + "");

                posAPoint = 0;
                teamAPossesion.setText(posAPoint + "");

                cornerAPoint = 0;
                teamACorner.setText(cornerAPoint + "");

                cornerBPoint = 0;
                teamBCorner.setText(cornerBPoint + "");

                redAPoint = 0;
                teamARed.setText(redAPoint + "");

                redBPoint = 0;
                teamBRed.setText(redBPoint + "");

                foulBPoint = 0;
                teamBFoul.setText(foulBPoint + "");

                foulAPoint = 0;
                teamAFoul.setText(foulAPoint + "");

                yellowAPoint = 0;
                teamAYellow.setText(yellowAPoint + "");

                yellowBPoint = 0;
                teamBYellow.setText(yellowBPoint + "");

                offsideBPoint = 0;
                teamBOffside.setText(offsideBPoint + "");

                offsideAPoint = 0;
                teamAOffside.setText(offsideAPoint + "");

                scoreB = 0;
                teamBScore.setText(scoreB + "");

                scoreA = 0;
                teamAScore.setText(scoreA + "");
            }
        });
    }


}
