package se.ntig.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Rock(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "Rock");
        startActivity(intent);
    }

    public void Paper(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "Paper");
        startActivity(intent);
    }

    public void Scissors(View v) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("choice", "Scissors");
        startActivity(intent);
    }
}
