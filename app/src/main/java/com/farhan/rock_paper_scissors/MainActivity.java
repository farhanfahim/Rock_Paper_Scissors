package com.farhan.rock_paper_scissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_rock,btn_paper,btn_sci;
    ImageView iv_cpu,iv_me;
    Random r;
    String result,choice,cpuChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_rock = (Button) findViewById(R.id.btn_rock);
        btn_paper = (Button) findViewById(R.id.btn_paper);
        btn_sci = (Button) findViewById(R.id.btn_sci);

        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_me = (ImageView) findViewById(R.id.iv_me);

        btn_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice ="Rock";
                iv_me.setImageResource(R.drawable.b);
                calc();
            }
        });
        btn_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice ="Paper";
                iv_me.setImageResource(R.drawable.a);
                calc();
            }
        });
        btn_sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice ="Scissors";
                iv_me.setImageResource(R.drawable.c);
                calc();
            }
        });
    }
    public void calc(){
        r = new Random();
        int randomNumber = r.nextInt(3)+1;

        if (randomNumber == 1){
            cpuChoice ="Rock";
            iv_cpu.setImageResource(R.drawable.b);
        }else if (randomNumber == 2){
            cpuChoice ="Paper";
            iv_cpu.setImageResource(R.drawable.a);
        }
        else if (randomNumber == 3){
            cpuChoice ="Scissors";
            iv_cpu.setImageResource(R.drawable.c);
        }

        if (choice.equals("Rock") && cpuChoice.equals("Rock")){
            result = "Draw";
        }else if (choice.equals("Scissors") && cpuChoice.equals("Scissors")){
            result = "Draw";
        }else if (choice.equals("Paper") && cpuChoice.equals("paper")){
            result = "Draw";
        }else if (choice.equals("Rock") && cpuChoice.equals("Scissors")){
            result = "YOU WIN";
        }else if (choice.equals("Rock") && cpuChoice.equals("Paper")){
            result = "CPU WIN";
        }else if (choice.equals("Scissors") && cpuChoice.equals("Rock")){
            result = "CPU WIN";
        }else if (choice.equals("Scissors") && cpuChoice.equals("Paper")){
            result = "YOU WIN";
        }else if (choice.equals("Paper") && cpuChoice.equals("Scissors")){
            result = "CPU WIN";
        }else if (choice.equals("Paper") && cpuChoice.equals("Rock")){
            result = "YOU WIN";
        }

        Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();

    }
}
