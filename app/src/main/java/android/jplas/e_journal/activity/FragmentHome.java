package android.jplas.e_journal.activity;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.jplas.e_journal.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    View home;
    Button ig, fb, tw, yt;
    ImageView menu1, menu2, th1, th2, th3, um, logo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        home = inflater.inflate(R.layout.activity_fragment_home, parent, false);

        menu1 = home.findViewById(R.id.iv_menu1);
        menu2 = home.findViewById(R.id.iv_menu2);
        ig = home.findViewById(R.id.btig);
        fb = home.findViewById(R.id.btfb);
        yt = home.findViewById(R.id.btyt);
        tw = home.findViewById(R.id.bttw);
        th1 = home.findViewById(R.id.th1);
        th2 = home.findViewById(R.id.th2);
        th3 = home.findViewById(R.id.th3);
        um = home.findViewById(R.id.lgduaa);
        logo = home.findViewById(R.id.lgsatuu);

        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://um.ac.id/")));
                } catch (Exception e) {
                }
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://lib.um.ac.id/")));
                } catch (Exception e) {
                }
            }
        });

        th1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=pXytTzm8apE")));
                } catch (Exception e) {
                }
            }
        });

        th2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                try {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=pXytTzm8apE")));
//                } catch (Exception e) {
//                }
            }
        });

        th3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AK26ueF07Y0")));
                } catch (Exception e) {
                }
            }
        });

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AlurAkses.class);
                startActivity(i);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AlertEjournal.class);
                startActivity(i);
            }
        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/perpustakaan.um/")));
                } catch (Exception e) {
                }
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/perpustakaan.um")));
                } catch (Exception e) {
                }
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/perpustakaan_um")));
                } catch (Exception e) {
                }
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCNimGXPRLHWyiK4yRbQW3ew")));
                } catch (Exception e) {
                }
            }
        });

        return home;
    }
}
