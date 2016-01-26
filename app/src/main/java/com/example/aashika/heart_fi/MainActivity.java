package com.example.aashika.heart_fi;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void playalive(View view)
{
    Intent i;
    PackageManager manager = getPackageManager();
    try {
        i = manager.getLaunchIntentForPackage("com.alivecor.aliveecg");
        if (i == null)
            throw new PackageManager.NameNotFoundException();
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);
    } catch (PackageManager.NameNotFoundException e) {

    }
    



}
    @Override
    public void onBackPressed()
    {
        Toast t=Toast.makeText(this,"App launched",Toast.LENGTH_SHORT);
        t.show();

        // super.onBackPressed(); // Comment this super call to avoid calling finish()
    }
}
