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

public class Photography extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list8;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Photography.class.getSimpleName();

    String[] Photography = {
            "Your photography is a record of your living, for anyone who really sees.", "You don't take a photograph. You ask, quietly, to borrow it.", "You don't take a photograph, you make it.", "You don't take a photograph, you make it.", "खुशियाँ तकदीर में होना चाहिये, तस्वीर में तो हर कोई मुस्कराता है ।", "Which of my photographs is my favorite? The one I’m going to take tomorrow.", "Wherever there is light, one can photograph.", "When you photograph people in color you photograph their clothes. But when you photograph people in B&W, you photograph their souls!", "When you photograph a face…you photograph the soul behind it.", "When people ask me what equipment I use – I tell them my eyes.", "What can be proved by a photograph, can never be by a word.", "We are making photographs to understand what our lives mean to us.", "Today everything exists to end in a photograph.", "There is one thing the photograph must contain, the humanity of the moment.", "There is a vast difference between taking a picture and making a photograph.", "There are no rules for good photographs, there are only good photographs.", "There are no bad pictures; that’s just how your face looks sometimes.", "There are always two people in every picture: the photographer and the viewer.", "The world just does not fit conveniently into the format of a 35mm camera.", "The whole point of taking pictures is so that you don’t have to explain things with words.", " The subject matter is so much more important than the photographer.", "The subject matter is so much more important than the photographer.", "The pictures are there, and you just take them.", "The picture that you took with your camera is the image you want to create with reality.", "The photograph itself doesn't interest me. I want only to capture a minute part of reality.", "The negative is the equivalent of the composer's score, and the print the performance.", "The goal is not to change your subjects, but for the subject to change the photographer.", "The front door to springtime is a photographer's best friend.", "The eye should learn to listen before it looks.", "The camera sees more than the eye, so why not make use of it?", "The camera introduces us to unconscious optics as doe’s psychoanalysis to unconscious impulses.", "The camera cannot lie, but it can be an accessory to untruth. ", "The camera can photograph thought.", "The biggest cliche in photography is sunrise and sunset.", "The best thing about a picture is that it never changes, even when the people in it do.", "The art of photography is all about directing the attention of the viewer.", "Taking pictures is like tiptoeing into the kitchen late at night and stealing Oreo cookies.", "Taking an image, freezing a moment, reveals how rich reality truly is.", "Sometimes I do get to places just when God's ready to have somebody click the shutter.", "Skill in photography is acquired by practice and not by purchase.", "Photography to me is catching a moment which is passing, and which is true.", "Photography takes an instant out of time, altering life by holding it still.", "Photography is the story I fail to put into words.", "Photography is the simplest thing in the world, but it is incredibly complicated to make it really work.", "Photography is the beauty of life captured.", "Photography is my passion. Whenever I get time, I click.", "Photography is an immediate reaction, drawing is a meditation.", "Photography is austere and blazing poetry of the real.", "Photography is about capturing souls, not smiles.", "Photography is a tough life: you can be taken, framed, exposed, shot, captured, and hung all in the same day.", "Photography is a love affair with life.", "Photography has nothing to do with cameras.", "Photography has no rules, it is not a sport. It is the result which counts, no matter how it is achieved.", "Photography deals exquisitely with appearances, but nothing is what it appears to be.", "Photographs that transcend but do not deny their literal situation appeal to me.", "Photographs open doors into the past, but they also allow a look into the future.", "Photographs are just light and time. ", "Photographers don't take pictures. They create images.", "Photograph: a picture painted by the sun without instruction in art.", "No photographer is as good as the simplest camera.", "My portraits are more about me than they are about the people I photograph.", "My photography is the result of being there at the right moment.", "My life is shaped by the urgent need to wander and observe, and my camera is my passport.", "My best photo will be the last one that I want to be taken.", "Look and think before opening the shutter. The heart and mind are the true lenses of the camera.", "It is more important to click with people than to click the shutter.", "In the world of photography, you get to share a captured moment with other people.", "In photography, there is a reality so subtle that it becomes more real than reality.", "In photography, there are no shadows that cannot be illuminated.", "If your pictures aren’t good enough, you’re not close enough.", "If you want to be a better photographer, stand in front of more interesting stuff.", "If you see something that moves you and then snap it, you keep a moment.", "If I could tell the story in words, I wouldn't need to lug around a camera.", "I walk, I look, I see, I stop, I photograph.", "I think good dreaming is what leads to good photographs.", "I really believe there are things nobody would see if I didn’t photograph them.", "I like to photograph anyone before they know what their best angles are.", "I hate cameras. They are so much more sure than I am about everything.", "Great photography is about a depth of feeling, not depth of field.", "God creates beauty. My camera and I are a witness.", "For me, the camera is a sketch book, an instrument of intuition and spontaneity.", "Fear is a darkroom where negatives develop.", "Everyone has a photographic memory, but not everyone has film.", "Don’t pack up your camera until you’ve left the location.", "Character, like a photograph, develops in darkness.", "Buying a Nikon doesn't make you a photographer. It makes you a Nikon owner.", "Beauty can be seen in all things, seeing and composing the beauty is what separates the snapshot from the photograph.", "All photos are accurate. None of them is the truth.", "All photographs are accurate. None of them is the truth.", "A thing that you see in my pictures is that I was not afraid to fall in love with these people.", "A portrait is not made in the camera but on either side of it.", "A picture is worth a thousand words; a slide show is both.", "A photograph is usually looked at — seldom looked into.", "A photograph is like a recipe memory the finished dish.", "A photograph is a secret about a secret. The more it tells you the less you know.", "A photograph is a moral decision taken in one-eighth of a second.", "A photograph gives relief to the banished and absent lover."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography);


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



        for (int i=0;i<Photography.length;i++)
        {
            int index = (int)(Math.random() * Photography.length);
            String temp = Photography[i];
            Photography[i]= Photography[index];
            Photography[index]= temp;
        }

        list8 = findViewById(R.id.list8);

        ArrayAdapter adapter8 = new ArrayAdapter<>(this, R.layout.custom_listview8, R.id.textlist8, Photography);
        list8.setAdapter(adapter8);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin8 = position;
                String carvalue8 = (String) list8.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Photography",carvalue8);
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