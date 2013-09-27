package tk.liosha.triviaquiz;

import android.os.Bundle;
import android.view.Menu;

/**
 * Created by work on 26.09.13.
 */
public class QuizGameActivity extends QuizActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_layout);
    }
}
