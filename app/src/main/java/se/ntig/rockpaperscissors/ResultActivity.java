package se.ntig.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    TextView text;
    ImageView userImg, compImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text = findViewById(R.id.textView2);
        userImg = findViewById(R.id.imageView4);
        compImg = findViewById(R.id.imageView5);

        Intent intent = getIntent();
        String user = intent.getStringExtra("choice");
        String computer = "";
        String outcome = "";

        final int random = new Random().nextInt(3);
        switch(random) {
            case 0:
                computer = "Rock";
                break;
            case 1:
                computer = "Paper";
                break;
            case 2:
                computer = "Scissors";
                break;
        }

        if(user.equals("Rock")) {
            userImg.setImageResource(R.drawable.rock);
            if(computer.equals("Rock")) {
                compImg.setImageResource(R.drawable.rock);
                outcome = "tie";
            } else if(computer.equals("Paper")) {
                compImg.setImageResource(R.drawable.paper);
                outcome = "lose";
            } else if( computer.equals("Scissors")) {
                compImg.setImageResource(R.drawable.scissors);
                outcome = "win";
            }
        } else if(user.equals("Paper")) {
            userImg.setImageResource(R.drawable.paper);
            if(computer.equals("Rock")) {
                compImg.setImageResource(R.drawable.rock);
                outcome = "win";
            } else if(computer.equals("Paper")) {
                compImg.setImageResource(R.drawable.paper);
                outcome = "tie";
            } else if( computer.equals("Scissors")) {
                compImg.setImageResource(R.drawable.scissors);
                outcome = "lose";
            }
        } else if(user.equals("Scissors")) {
            userImg.setImageResource(R.drawable.scissors);
            if(computer.equals("Rock")) {
                compImg.setImageResource(R.drawable.rock);
                outcome = "lose";
            } else if(computer.equals("Paper")) {
                compImg.setImageResource(R.drawable.paper);
                outcome = "win";
            } else if( computer.equals("Scissors")) {
                compImg.setImageResource(R.drawable.scissors);
                outcome = "tie";
            }
        }

        text.setText(outcome);
    }

    public void playAgain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
