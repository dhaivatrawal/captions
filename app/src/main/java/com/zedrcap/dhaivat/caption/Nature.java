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

public class Nature extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list9;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Nature.class.getSimpleName();
    String[] Nature = {
            "Nature's little secret of joy, discovered. ", "This family tree is full of NUTS. ", "Nature - cheaper than therapy. ", "The bird is powered by its own life and by its motivation. ", "Every flower is a soul blossoming in nature.", "Aim for the moon, if you miss you may hit a star.", "In every walk with nature, one receives far more than he seeks.", "Study nature, love nature, and stay close to nature. It will never fail you.", "One touch of nature makes the whole world kin.", "Sometimes you have to shut your eyes, so you can see the real beauties.", "Everything just feels better with the sun above your head.", "Dear sun, how about chilling up a bit?", "Sun and sand - two of the best ingredients to create dreams. ", "Roses are red, I'm going to bed.", "जब तक कोई किसी जानवर से प्यार नहीं करता तब तक उसकी आत्मा का एक हिस्सा सोया रहता है।", "There’s no time to be bored in a world as beautiful as this. ", "Peace is seeing the sunrise or a sunset. ", "Wherever you go, no matter what the weather, always bring your own sunshine. ", "I am more myself in a garden than anywhere else on earth. ", "The moon looks upon many night flowers; the night flowers see but one moon.", "Day and night cannot dwell together. The Red Man has ever fled the approach of the White Man, as the morning mist flees before the morning sun.", "The sun just touched the morning; the morning, happy thing, supposed that he had come to dwell, and life would be all spring.", "Every morning was a cheerful invitation to make my life of equal simplicity, and I may say innocence, with Nature herself.", "There is intelligent life on Earth, but I’m just visiting.", "There is intelligent life on Earth, but I’m just visiting.", "Fire, water, and government know nothing of mercy.", "The real voyage of discovery consists not in seeking new landscapes, but in having new eyes.", "A traveler without observation is a bird without wings.", "Wander often, wonder always.", "Colours🌈 are the smiles😊 of nature 🍃🌿...", "Definition of a human being: a creature that cuts trees,🌳 makes paper & write SAVE TREES on the same paper.", "Human nature is like water. It takes the shape of its container.", "Nicest of the soul, dwell in purest of places.", "Explore the nature and you will explore the God.", "Do you what nature🌳🌳 is, it is your inner self.", "Nature is the ultimate beauty you would see.", "Observe the nature, it will give you the lessons.", "People say nature🌳 is complex, I see it as simple pie.", "Study nature🌴, love nature🌲, stay close to nature🌿. It will never fail you.", "Spring🌼 is nature’s way of saying, ‘Let’s party!’.💃", "Nature🌳 is painting🖌 for us, day after day, the picture of infinite beauty.🖼", "Nature is not a place to visit. IT IS HOME.🏨", "Nature🌳 does not hurry🏃, yet everything is accomplished.", "Nature always wears the colors🌈 of the spirit.", "Love the earth🌏 as you would love yourself😍.", "Lose yourself in nature🌳 and find peace🕊🕊.", "Look deep into nature🌳 and then you will understand everything better.😀", "Let us give nature🌳 a chance; She knows her business better than we do.😊", "In nature, light✨ creates the color🎨. In the picture, color creates the light.🔦", "Ignore the rain🌨 look for the rainbow.🌈", "If you truly love nature🌷, you will find beauty everywhere.🏝", "Cheerfulness is the atmosphere🏖 in which all things thrive.", "You are the most beautiful flower🌼..in my garden of friendship👬, remain the same forever.", "The best friends like a four🌿 leaf clover hard to find and lucky to have.", "Friendship is a Flower that blooms🌻 in all Seasons.", "There is a girl👧 out there with love in her eyes and flowers 🌻in her", "Personality is to a man what perfume is to a flower.💐🌺"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);


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




        for (int i=0;i<Nature.length;i++)
        {
            int index = (int)(Math.random() * Nature.length);
            String temp = Nature[i];
            Nature[i]= Nature[index];
            Nature[index]= temp;
        }

        list9 = findViewById(R.id.list9);

        ArrayAdapter adapter9 = new ArrayAdapter<>(this, R.layout.custom_listview9, R.id.textlist9, Nature);
        list9.setAdapter(adapter9);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin9 = position;
                String carvalue9 = (String) list9.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Nature",carvalue9);
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