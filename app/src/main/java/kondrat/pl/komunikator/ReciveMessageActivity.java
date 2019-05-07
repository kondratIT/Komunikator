package kondrat.pl.komunikator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReciveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);
    }
}
