package com.example.myapp3;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    TextView six;
    TextView seven;
    TextView eight;
    TextView nine;
    TextView zero;
    TextView plus;
    TextView ca;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_01);

        one = findViewById(R.id.one);

        two = findViewById(R.id.two);

        three = findViewById(R.id.three);

        four = findViewById(R.id.four);

        five = findViewById(R.id.five);

        six = findViewById(R.id.six);

        seven = findViewById(R.id.seven);

        eight = findViewById(R.id.eight);

        nine = findViewById(R.id.nine);

        zero = findViewById(R.id.zero);

        plus = findViewById(R.id.plus);

        ca = findViewById(R.id.ca);

        // 이벤트 리스너 람다 표현식
        one.setOnClickListener(view -> Log.d("TAG","1번 버튼을 눌렀습니다."));

        two.setOnClickListener(view -> Log.d("TAG", "2번 버튼을 눌렀습니다."));

        three.setOnClickListener(view -> Log.d("TAG","3번 버튼을 눌렀습니다."));

        four.setOnClickListener(view -> Log.d("TAG","4번 버튼을 눌렀습니다."));

        five.setOnClickListener(view -> Log.d("TAG","5번 버튼을 눌렀습니다."));

        six.setOnClickListener(view -> Log.d("TAG","6번 버튼을 눌렀습니다."));

        seven.setOnClickListener(view -> Log.d("TAG","7번 버튼을 눌렀습니다."));

        eight.setOnClickListener(view -> Log.d("TAG","8번 버튼을 눌렀습니다."));

        nine.setOnClickListener(view -> Log.d("TAG","9번 버튼을 눌렀습니다."));

        zero.setOnClickListener(view -> Log.d("TAG","0번 버튼을 눌렀습니다."));

        plus.setOnClickListener(view -> Log.d("TAG","plus 버튼을 눌렀습니다."));

        ca.setOnClickListener(view -> Log.d("TAG","ca 버튼을 눌렀습니다."));
    }
}