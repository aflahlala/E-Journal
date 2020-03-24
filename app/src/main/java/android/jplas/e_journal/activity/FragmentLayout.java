package android.jplas.e_journal.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.jplas.e_journal.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentLayout extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_layout);

        bottomNavigation = (BottomNavigationView) findViewById(R.id.btn_nav);
        fragmentManager = getSupportFragmentManager();

        //Untuk inisialisasi fragment pertama kali
        fragmentManager.beginTransaction().replace(R.id.main_container, new FragmentHome()).commit();

        //Memberikan listener saat menu item di bottom navigation diklik
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home_menu :
                        fragment = new FragmentHome();
                        break;
                    case R.id.panduan_menu :
                        fragment = new FragmentPanduan();
                        break;
                    case R.id.sipadu_menu:
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://auth.um.ac.id/auth/core/service.php?AuthState=_f605b6ec1297e441814a2f1db91fb29ba93af91510%3Ahttps%3A%2F%2Fauth.um.ac.id%2Fsaml2%2Fidp%2FSSOService.php%3Fspentityid%3Dhttps%253A%252F%252Fsipadu.um.ac.id%252Fsirkulasi%26cookieTime%3D1584887288%26RelayState%3Dhttp%253A%252F%252Fsipadu.um.ac.id%252Fsirkulasi%252F")));
                        } catch (Exception e) {
                        }
                        break;
                    case R.id.info_menu:
                        fragment = new FragmentInformasi();
                        break;
                    case R.id.translate_menu:

                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://translate.google.co.id/")));
                        } catch (Exception e) {
                        }
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}
