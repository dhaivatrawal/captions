package com.zedrcap.dhaivat.caption;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8,cd9,cd10;
    final Context ctx = this;
    ImageView btninsta,btnrate,btnshare;

    private final String TAG = MainActivity.class.getSimpleName();
    public long backpresstime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allocatememory();
        setevents();


    }



    private void setevents() {

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Attitude.class);
                startActivity(intent);
            }
        });
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent2 = new Intent(getApplicationContext(),Love.class);
                startActivity(intent2);
            }
        });
        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent3 = new Intent(getApplicationContext(),Friends.class);
                startActivity(intent3);
            }
        });
        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent4 = new Intent(getApplicationContext(),Night.class);
                startActivity(intent4);
            }
        });
        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent5 = new Intent(getApplicationContext(),Emotion.class);
                startActivity(intent5);
            }
        });
        cd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent6 = new Intent(getApplicationContext(),Enemy.class);
                startActivity(intent6);
            }
        });
        cd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent7 = new Intent(getApplicationContext(),Travel.class);
                startActivity(intent7);
            }
        });
        cd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent8 = new Intent(getApplicationContext(),Photography.class);
                startActivity(intent8);
            }
        });
        cd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent9 = new Intent(getApplicationContext(),Nature.class);
                startActivity(intent9);
            }
        });
        cd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent10 = new Intent(getApplicationContext(),Random.class);
                startActivity(intent10);
            }
        });
        btninsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

               Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/dhaivatrawal" ));
                startActivity(myIntent);

            }
        });
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                Intent myintent = new Intent(Intent.ACTION_SEND);
                String AppShareText = "Captions -  For Every Mood, Here you will find best collection of good captions and lots of different categories of captions. " +
                        Uri.parse("https://play.google.com/store/apps/details?id=com.zedrcap.dhaivat.caption");
                myintent.setType("text/plain");
                myintent.putExtra(Intent.EXTRA_TEXT,AppShareText);
                startActivity(Intent.createChooser(myintent,"Share this"));

            }
        });
        btnrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {

                String AppId = "market://details?id=com.zedrcap.dhaivat.caption";
                Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(AppId));
                startActivity(myIntent);

            }
        });

    }

    private void allocatememory() {

        cd1= findViewById(R.id.cd1);
        cd2= findViewById(R.id.cd2);
        cd3= findViewById(R.id.cd3);
        cd4= findViewById(R.id.cd4);
        cd5= findViewById(R.id.cd5);
        cd6= findViewById(R.id.cd6);
        cd7= findViewById(R.id.cd7);
        cd8= findViewById(R.id.cd8);
        cd9= findViewById(R.id.cd9);
        cd10= findViewById(R.id.cd10);

        btninsta= findViewById(R.id.btninsta);
        btnrate= findViewById(R.id.btnrate);
        btnshare= findViewById(R.id.btnshare);

    }


    @Override
    public void onBackPressed() {
        //FullScreenADS();

        if (backpresstime + 2000 > System.currentTimeMillis()) {
            opendialogbox();
        } else {
            Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();
        }
        backpresstime = System.currentTimeMillis();

    }

    private android.app.AlertDialog opendialogbox() {
        ImageView imageView;
        //Button yes, no;

        final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
        ViewGroup viewGroup = findViewById(android.R.id.content);
        final View dialogView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dialogbox_file, viewGroup, false);

        builder.setView(dialogView);
        builder.setView(dialogView)
                .setCancelable(false)
                .setTitle("EXIT")
                .create();
        builder.setNegativeButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int i = 10;
                System.exit(i);
            }
        });

        builder.setPositiveButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        imageView = dialogView.findViewById(R.id.ads);
        //yes = dialogView.findViewById(R.id.yes);
        // no = dialogView.findViewById(R.id.no);

        //final AlertDialog alertDialog = builder.create();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AppUrl = "https://play.google.com/store/apps/details?id=com.ZeDRapps.granular&hl=en";
                Intent iq = new Intent(Intent.ACTION_VIEW, Uri.parse(AppUrl));
                startActivity(iq);
            }
        });


       /* yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 50;
                System.exit(i);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = builder.create();
                alertDialog.dismiss();

                Toast.makeText(ctx , "hi" , Toast.LENGTH_SHORT).show();
            }
        });

        */

        return builder.show();

    }

}
