package sg.edu.rp.c346.democustomlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intent extends AppCompatActivity {
TextView tvStar, tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        tvStar = (TextView)findViewById(R.id.tvBool);
        tvName = (TextView)findViewById(R.id.tvName);

        Intent intentReceived = getIntent();
        String strBool = intentReceived.getStringExtra("name");
        String strName = intentReceived.getStringExtra("bool");
    tvName.setText(strName);
        tvStar.setText(strBool);
    }
}
