package kr.hs.emirim.petto99.gongyoonogongyoo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by appcreate40 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult = (TextView)findViewById(R.id.result);
        mResult.setText("공유안해요");
    }
}