package kr.hs.emirim.petto99.gongyoonogongyoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     EditText mName;
     Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_showme_gong);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        String name = mName.getText().toString();   //반드시 toString으로 반환해야돼!!!!!

        if (name.equals("")) {
            Toast.makeText(this, "이름을 입력해 주세요.", Toast.LENGTH_SHORT).show();        //꼭 show() 써주기
        }
        else {
            Toast.makeText(this, name + "씨, 공유잘생겼죠!!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
            //여기서 값을 읽어옴 -> 눌렀을때 가져와야 하기 때문에
        }

        try{
            Toast.makeText(this, name + "씨, 공유잘생겼죠!!!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra ("name",name);
            intent.putExtra("age",10);
            startActivity(intent);
        }catch(NullPointerException e){
            Toast.makeText(this, name + "이름을 입력하세요!", Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(this, name + "뭔지 모르지만 잘 안되네요!", Toast.LENGTH_LONG).show();
        }
    }
}