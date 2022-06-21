package com.zedrcap.dhaivat.caption;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import androidx.appcompat.app.AppCompatActivity;

public class Emotion extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list5;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Emotion.class.getSimpleName();


    String[] Emotion = {
            "There's always a wild side to an innocent face.", "The most painful goodbyes are those which never said and never explained.", "I'm smiling. That alone should scare you.", "आज ईमान मेरा थोड़ा खराब है, आँखों में है वो और हाथों में शराब है ।", "You’ll just never know… so many emotions I choose not to show.", "Your intellect may be confused, but your emotions will never lie to you.", "Your emotions are the slaves to your thoughts, and you are the slave to your emotions.", "Where the heart lies, let the brain lie also.", "When dealing with people, remember you are not dealing with creatures of logic, but with creatures of emotion.", "Unleash in the right time and place before you explode at the wrong time and place.", "Unexpressed emotions will never die. They are buried alive and will come forth later in uglier ways.", "Too much emotion is like none at all. ", "To give vent now and then to his feelings, whether of pleasure or discontent, is a great ease to a man's heart.", "To balance and take control of our emotions is one of the most important tasks in life. emotion, feelings, balance, control, important, task, life. ", "There can be no transforming of darkness into light and of apathy into movement without emotion.", "The world is a tragedy to those who feel, but a comedy to those who think.", "The walls we build around us to keep sadness out also keeps out the joy.", "The sign of intelligent people is their ability to control emotions by the application of reason.", "The finest emotion of which we are capable of mystic emotion.", "The feeling is often the deeper truth, the opinion the more superficial one.", "The emotion that can break your heart is sometimes the very one that heals it…", "The deeper that sorrow carves into your being, the more joy you can contain.", "The advantage of the emotions is that they lead us astray.", "Sorrow like rain makes roses and mud.", "Sadness is almost never anything but a form of fatigue.", "Perhaps apathy is a wave of emotions too afraid to burst out of the darkness into the bright light of day.", "Pain is always emotional. Fear and depression keep constant company with chronic hurting.", "Our emotions are the driving powers of our lives.", "Our emotions are only incidents in the effort to keep day and night together.", "One who has control over their emotions has great power over those who don’t!", "One thing you can't hide - is when you're crippled inside.", "One ought to hold on to one's heart; for if one lets it go, one soon loses control of the head too.", "No one cares how much you know until they know how much you care.", "No one can make you feel inferior without your consent.", "No amount of makeup can hide a person’s real emotion.", "Never let your emotions rule, but always let them testify.", "Memory is always faulty. Emotions are always true.", "Let's not forget that the little emotions are the great captains of our lives and we obey them without realizing it.", "Let your sorrow smile once in a while.", "Just like children, emotions heal when they are heard and validated. ", "It is as healthy to enjoy sentiment as to enjoy jam.", "If you don't manage your emotions, then your emotions will manage you.", "I have a poisoned flower in my heart.",
            "I don't want to be at the mercy of my emotions. I want to use them, to enjoy them, and to dominate them.", "Guilt is always hungry — don't let it consume you.", "Emotions have taught mankind to reason.", "Emotions have no place in business unless you do business with them.", "Emotions can get in the way or get you on the way.", "Emotions are temporary states of mind. Don’t let them permanently destroy you!", "Emotion turning back on itself, and not leading on to thought or action, is the element of madness.", "Cherish your own emotions and never undervalue them.", "There is no market for your emotions. So never advertise your feelings, just display your attitude.", "One of the most beautiful qualities of true friendship is to understand and to be understood.", "I am better than my EX and also better than my NEXT............", "Traveling tends to magnify all human emotions.", "Her favorite song will say more about her than her mouth ever will.", "Pain is temporary, quitting is forever.", "Loving, caring daring, all together summed up as FAMILY.👪", "Memories are timeless treasures of the heart.❤","The happier you are, the more beautiful you become."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        minterstitialAd= new InterstitialAd(this);
        minterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
        AdRequest adRequesttwo = new AdRequest.Builder().build();
        minterstitialAd.loadAd(adRequesttwo);



        for (int i=0;i<Emotion.length;i++)
        {
            int index = (int)(Math.random() * Emotion.length);
            String temp = Emotion[i];
            Emotion[i]= Emotion[index];
            Emotion[index]= temp;
        }

        list5 = findViewById(R.id.list5);

        ArrayAdapter adapter4 = new ArrayAdapter<>(this, R.layout.custom_listview5, R.id.textlist5, Emotion);
        list5.setAdapter(adapter4);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin4 = position;
                String carvalue4 = (String) list5.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Emotions",carvalue4);
                cp.setPrimaryClip(clip);
                Toast.makeText(ctx,"Caption Copied",Toast.LENGTH_LONG).show();

                if(Build.VERSION.SDK_INT >= 26)
                {
                    vibrator.vibrate(VibrationEffect.createOneShot(200,VibrationEffect.DEFAULT_AMPLITUDE));
                } else {
                    vibrator.vibrate(200);
                }

            }
        });

    }

    @Override
    public void onBackPressed() {

        if (minterstitialAd.isLoaded()){
            minterstitialAd.show();
            minterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed(){
                    super.onAdClosed();
                    finish();
                }
            });
        }else{
            super.onBackPressed();
        }

        super.onBackPressed();
    }
}