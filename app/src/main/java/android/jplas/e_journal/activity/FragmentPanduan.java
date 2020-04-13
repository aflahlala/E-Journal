package android.jplas.e_journal.activity;

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
import android.widget.ImageView;

public class FragmentPanduan extends Fragment {

    View view;
    ImageView img;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    Button ig2, fb2, yt2, tw2, backpanduan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_panduan, parent, false);

        img = view.findViewById(R.id.lgpanduan);
        ig2 = view.findViewById(R.id.btig2);
        fb2 = view.findViewById(R.id.btfb2);
        yt2 = view.findViewById(R.id.btyt2);
        tw2 = view.findViewById(R.id.bttw2);
        backpanduan = view.findViewById(R.id.btbackpanduan);

        backpanduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentHome hm = new FragmentHome();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_container, hm);
                ft.commit();
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), FragmentPanduanDua.class);
                startActivity(i);
            }
        });

        ig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/perpustakaan.um/")));
                } catch (Exception e) {
                }
            }
        });

        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/perpustakaan.um")));
                } catch (Exception e) {
                }
            }
        });

        tw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/perpustakaan_um")));
                } catch (Exception e) {
                }
            }
        });

        yt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCNimGXPRLHWyiK4yRbQW3ew")));
                } catch (Exception e) {
                }
            }
        });

        return view;
    }
}
