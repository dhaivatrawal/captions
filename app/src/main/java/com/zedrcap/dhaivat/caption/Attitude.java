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
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public class Attitude extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list1;
    Context ctx = this;
    ImageView copy_attitude;
    Vibrator vibrator;
    private final String TAG = Attitude.class.getSimpleName();

    LinearLayout banner_container1;

    String[] Attitude = {
            "You can watch me, mock me, block me or join me. What you can not do is stop me.", "The lower the latitude, the better the attitude.", "My style is the reflection of my attitude and my personality.", "I’m worth it. Always was, and always will be.", "I don’t have an attitude problem; I just carry a personality you can’t handle.", " For every action, I have a reserve clever caption. ", "Accept who you are unless you’re a serial killer.", "Soul on fleek. ", "So hot that I'll turn your winter into summer.", "I was born to stand out. ", "You definitely are a bad idea. But I'm a master of such ideas. ", "A year older, a year bolder. ", "Angel face, devil thoughts. ", "I'm not looking for my better half, coz I'm whole.", "I'm single like a dollar, but I ain't looking for any change.", "You don't deserve my tears. Guess, that's why there aren't any.", "Roses are red, pizza sauce is too. I ordered a large and none of it's for you.", "Adopting the right attitude can turn your negativity into positivity.", "Aside from gravity, nothing can keep me down.", "Personality cannot be photoshopped. Get your own.", "There's a million Fish in the sea, but I'm a Mermaid.", "A bad attitude is like a flat tire. You can't go anywhere until you change it.", "Wild things. ", "मुश्किल तो ये के अभी तक ठिकसे बिगड़ा नहीं और तुमने सुधर ने की बात कर दी.", "Attitude तो हम में बचपन से ही है.", "ज़िन्दगी rude हैं फिर भी हम dude हैं...!", "पैसा हैसियत बदल सकता है, औकात नहीं.", "शादी? अभी तो मेरी दिल तुड़वाने की उम्र है!😍", "I’ll be who I want to be,not who everyone wants me to be.", "I am stressed,I am depressed but still well dressed .🙋🙋👖👊👊", "When someone hates you for no reason… just give them one.”, " +
            "Silence is the best response when you are dealing with an idiot.”, " +
            "Look – I’m only responsible for the words that come out of my mouth. I’m not responsible for you not understanding them. ", "If you hate me – Log on to KISS-MY-ASS.com", "If you want to cry, use a tissue.. not your status!! 😀 ", "Hang out with people who fit your future, not your history.", "दुनियादारी की चादर ओढ़ी है। पर जिस दिन मेरा दिमाग सटका ना इतिहास तो इतिहास। भूगोल भी बदल देगा!", "मामला सारा इश्क़ का है, वरना किसी की इतनी औकात नहीं कि हमें बर्बाद कर सके...", "मेरी किस्मत को परखने की गुस्ताखी मत करना, पहेले भी कई तुफान का रुख मोड़ चुका हूँ…!", "ना पेशी होगी, न गवाह होगा, अब जो भी हमसे उलझेगा बस सीधा तबाह होगा", "भीड़ में खड़ा होना मकसद नहीं है मेरा बल्कि भीड़ जिसके लिए खड़ी है वह बनना है... मुझे…!", "भाई बोलने का हक़ मैंने सिर्फ दोस्तों को दिया है...! वरना दुश्मन तो आज भी हमें बाप के नाम से पहचानते हैं…!!", "हम आज भी शतरंज़ का खेल, अकेले ही खेलते हैं, क्यूंकि दोस्तों के खिलाफ चाल, चलना हमे आता नही!!", "हम तो इतने रोमान्टिक है की हम अगर थोड़ी देर मोबाइल हाथ मै लेले... तो वो भी गरम हो जाता है…!", "खून में उबाल आज भी खानदानी है ...दुनिया हमारे शौक की नहीं Attitude की दीवानी है…!", "कमियाँ तो बहुत हैं मुझमें… साला कोई निकाल के तो देखे।", "Arrey pagli Relationship मे रहना है तो आ ओर future सेट कर, तेरे लाख़ नखरे उठाऊंगा, वरना ये As a Friend वाले नखरे हमसे नही झेले जाते.", "Darling, shine that’s all. ", "Turn your face towards the sun and the shadows fall behind you.", "Be mindful. Be grateful. Be positive. Be true. Be kind.", "Why should I care what other people think of me? I am who I am. And who I wanna be.", "Boys make good pets, every girl should have one.", "You have to learn the rules of the game. And then you have to play better than anyone else.", "Anyone who has never made a mistake has never tried anything new.", "Dear God I don’t want anything from you just bless my mom-dad with hot son-in-law!", "It only takes one bad boyfriend to realize that you deserve so much more.", "There is no market for your emotions so never advertise your feelings just display your ATTITUDE.", "I keep ego and attitude always in my pockets so that I can use it when my self-respect and sentiments are being tested by people.", "What’s a queen without her king? Well, historically speaking, more powerful.", "I’m not mean, I’m brutally honest. It’s not my fault truth hurts. Here’s a band-aid.", "A fruit salad is delicious precisely because each fruit maintains it’s own flavor.", "It took me a long time not to judge myself through someone else’s eyes.", "The better you feel about yourself, the less you feel the need to show off.", "Do not compare yourself to others. If you do so, you are insulting yourself.", "I’m not what has happened to me. I am what I choose to become."


};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attitude);


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


        for (int i=0;i<Attitude.length;i++)
        {
            int index = (int)(Math.random() * Attitude.length);
            String temp = Attitude[i];
            Attitude[i]= Attitude[index];
            Attitude[index]= temp;
        }


        list1 = findViewById(R.id.list1);
        copy_attitude = findViewById(R.id.copy_attitude);

        ArrayAdapter adapter1 = new ArrayAdapter<>(this, R.layout.custom_listview, R.id.textlist, Attitude);
        list1.setAdapter(adapter1);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String carvalue = (String) list1.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Attitude",carvalue);
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