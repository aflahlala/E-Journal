package android.jplas.e_journal.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.jplas.e_journal.R;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlertEjournal extends AppCompatActivity {

    Button ig5, fb5, tw5, yt5, backk;
    ImageView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_ejournal);

        ig5 = (Button) findViewById(R.id.btig5);
        fb5 = (Button) findViewById(R.id.btfb5);
        yt5 = (Button) findViewById(R.id.btyt5);
        tw5 = (Button) findViewById(R.id.bttw5);
        backk = (Button) findViewById(R.id.btbackal);
        vid = (ImageView) findViewById(R.id.vid);

        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/tfKqLGNVOvA")));
                } catch (Exception e) {
                }
            }
        });

        backk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AlertEjournal.this, FragmentLayout.class);
                startActivity(i);
            }
        });

        ig5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/perpustakaan.um/")));
                } catch (Exception e) {
                }
            }
        });

        fb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/perpustakaan.um")));
                } catch (Exception e) {
                }
            }
        });

        tw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/perpustakaan_um")));
                } catch (Exception e) {
                }
            }
        });

        yt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCNimGXPRLHWyiK4yRbQW3ew")));
                } catch (Exception e) {
                }
            }
        });
    }
}
