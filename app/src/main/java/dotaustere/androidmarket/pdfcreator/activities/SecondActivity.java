package dotaustere.androidmarket.pdfcreator.activities;

import static dotaustere.androidmarket.pdfcreator.Constants.ADD_WATERMARK;
import static dotaustere.androidmarket.pdfcreator.Constants.BUNDLE_DATA;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import dotaustere.R;
import dotaustere.androidmarket.pdfcreator.fragment.ExceltoPdfFragment;
import dotaustere.androidmarket.pdfcreator.fragment.HistoryFragment;
import dotaustere.androidmarket.pdfcreator.fragment.ImageToPdfFragment;
import dotaustere.androidmarket.pdfcreator.fragment.QrBarcodeScanFragment;
import dotaustere.androidmarket.pdfcreator.fragment.SettingsFragment;
import dotaustere.androidmarket.pdfcreator.fragment.ViewFilesFragment;
import dotaustere.androidmarket.pdfcreator.fragment.texttopdf.TextToPdfFragment;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String fragment = intent.getStringExtra("fragment");


        if (fragment.equals("imgToPdf")) {
            ImageToPdfFragment recentFragment = new ImageToPdfFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("textToPdf")) {
            TextToPdfFragment recentFragment = new TextToPdfFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("qrToPdf")) {
            QrBarcodeScanFragment recentFragment = new QrBarcodeScanFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("excelToPdf")) {
            ExceltoPdfFragment recentFragment = new ExceltoPdfFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("watermark")) {
            Fragment fragmentWatermark;
            Bundle bundle = new Bundle();
            fragmentWatermark = new ViewFilesFragment();
            bundle.putInt(BUNDLE_DATA, ADD_WATERMARK);
            fragmentWatermark.setArguments(bundle);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, fragmentWatermark);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("view")) {
            ViewFilesFragment recentFragment = new ViewFilesFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("settings")) {
            SettingsFragment recentFragment = new SettingsFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        } else if (fragment.equals("history")) {
            HistoryFragment recentFragment = new HistoryFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayout, recentFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}