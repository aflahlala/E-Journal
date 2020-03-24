package android.jplas.e_journal.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.jplas.e_journal.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class TentangAplikasi extends AppCompatActivity {

    Button backsubinfo;
    JustifiedTextView justifiedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);

        backsubinfo = (Button) findViewById(R.id.btbackinfo);
        justifiedTextView = (JustifiedTextView) findViewById(R.id.just);

        backsubinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
