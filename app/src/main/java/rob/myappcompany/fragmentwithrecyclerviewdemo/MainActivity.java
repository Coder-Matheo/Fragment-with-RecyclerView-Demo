package rob.myappcompany.fragmentwithrecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnopen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnopen = findViewById(R.id.btnOpenFrag);



        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.MainContainer, new NewFragment()).commit();
                //getSupportFragmentManager().beginTransaction().replace(R.id.MainContainer, new NewFragment()).commit();


            }
        });

    }
}