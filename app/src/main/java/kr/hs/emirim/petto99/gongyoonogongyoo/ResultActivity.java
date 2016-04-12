package kr.hs.emirim.petto99.gongyoonogongyoo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

/**
 * Created by appcreate40 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {
    static String TAG="공유노공유:ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult = (TextView)findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView);
        Log.d(TAG, "텍스트뷰, 이미지뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(7);
        Log.d(TAG, "랜덤값 생성 : " + result);

//        if (result == 0){
//           mImageView.setImageResource(R.drawable.gongyoo2);
//        }
//        else if (result==1){
//            mImageView.setImageResource(R.drawable.gongyoo3);
//        }
//        else if (result==2){
//            mImageView.setImageResource(R.drawable.gongyoo4);
//        }

        mImageView.setImageResource(R.drawable.gongyoo + result);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG, "인텐트값 읽기<name> : " + name);

        int age = intent.getIntExtra("age", -1);
        Log.d(TAG, "인텐트값 읽기<age> : " + age );

        mResult.setText(name + "님, 안녕하세요!");
    }
}