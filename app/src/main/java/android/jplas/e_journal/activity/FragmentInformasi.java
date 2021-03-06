package android.jplas.e_journal.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.jplas.e_journal.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentInformasi extends Fragment {

    View info;
    Button infr, web, share, rate, ig3, fb3, yt3, tw3, backinfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        info = inflater.inflate(R.layout.activity_fragment_informasi, parent, false);

        infr = info.findViewById(R.id.bInformasi);
        web = info.findViewById(R.id.bWeb);
        share = info.findViewById(R.id.bShare);
        rate = info.findViewById(R.id.bRate);
        ig3 = info.findViewById(R.id.btig3);
        fb3 = info.findViewById(R.id.btfb3);
        yt3 = info.findViewById(R.id.btyt3);
        tw3 = info.findViewById(R.id.bttw3);
        backinfo = info.findViewById(R.id.btbackinformasi);

        backinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentHome hm = new FragmentHome();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_container, hm);
                ft.commit();
            }
        });

        infr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), TentangAplikasi.class);
                startActivity(i);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://lib.um.ac.id/")));
                } catch (Exception e) {
                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Rating.class);
                startActivity(i);
            }
        });
        ig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/perpustakaan.um/")));
                } catch (Exception e) {
                }
            }
        });

        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/perpustakaan.um")));
                } catch (Exception e) {
                }
            }
        });

        tw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/perpustakaan_um")));
                } catch (Exception e) {
                }
            }
        });

        yt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCNimGXPRLHWyiK4yRbQW3ew")));
                } catch (Exception e) {
                }
            }
        });

        return info;
    }
}
