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

public class Travel extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list7;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Travel.class.getSimpleName();

    String[] Travel = {
            "I don’t want a vacation. I want a lifestyle.", "Just another day in paradise", "Everybody's blind when the views amazing. ", "This heart of mine was made to travel the world. ", "दुनिया है छोटी, हम है मुसाफ़िर, कहीं न कहीं तो फिर से मुलाकात होगी ।", "Do not look back you are not going that way.", "The lure of the open road never goes out of style.", "Take the journey soar like an eagle there are so many roads to explore so little time.", "Sometimes you find yourself in the middle of nowhere, and sometimes in the middle of nowhere, you find yourself.", "No road is too long when you have good company.", "A mile of road will take you a mile. A mile of runway will take you anywhere.", "It’s Friday, remember those bad decisions = the best stories.", "A journey is best measured in friends, rather than miles.", "People don’t take trips. Trips take people.", "Quit your job, buy a ticket, get a tan, fall in love, never return.", "There should be sympathy cards for having to go back to work after vacation.", "Travelling is like flirting with life. It’s like saying, ‘I would stay and love you, but I have to go; this is my station.'", "Bizarre travel plans are dancing lessons from God.", "Wanderlust: A desire to travel, to understand one’s very existence.", "I don’t know where I am going, but I’m on my way.", "Once you have traveled, the voyage never ends. The mind can never break off from the journey.", "Everyone wants to live on top of the mountain, but all the happiness and growth occurs while you’re climbing it.", "It isn’t the mountains ahead to climb that wear you out; it’s the pebble in your shoe.", "Men go abroad to wonder at the heights of mountains, at the huge waves of the sea, at the long courses of the rivers, at the vast compass of the ocean, at the circular motions of the stars, and they pass by themselves without wondering.", "Travel is like love, mostly because it’s a heightened state of awareness, in which we are mindful, receptive, undimmed by familiarity and ready to be transformed. That is why the best trips, like the best love affairs, never really end.", "Spontaneous is the best kind of adventure.", "In life, it’s not where you go, but it’s who you travel with.", "A spontaneous road trip with no destination!", "Happiness is... not having to set the alarm for the next day.", "I don’t know where I’m going but I am going.", "Road trips aren’t measured by mile markers, but by moments.", "The only trip you will regret is the one you don’t take.", "I don’t care how long it takes me, but I’m going somewhere beautiful", "A good traveler has no fixed plans and is not intent on arriving.", "Guys, Guys you gotta let me nap. I’m gonna get cranky.", "Warm tea, good books, soft pillows, and fine company.", "What is life but one Grand Adventure?", "I love those random memories that make me smile. ", "There’s no time to be bored in a world as beautiful as this. ", "Peace is seeing the sunrise or a sunset. ", "Go outside and get some sunshine ☀", "Good things come to those who swim 🏊. ", "I prefer my footprints in the sand to the snow ❄⛄. ","My family never took vacations; we never traveled together. We never did anything. My spring breaks were going home to help my dad at the restaurant.", "The journey of a thousand miles begins with one step.", "When traveling with someone, take large dose of patience and tolerance with your morning coffee.", "Go out and chase your dreams no matter how crazy it looks.", "While everyone else is dreaming of snow, I’m dreaming of many more holidays with you.", "Water is the most perfect traveler because when it travels it becomes the path itself!", "Every season is a journey. Every journey is a lifetime.", "All I need are palm trees and a cool breeze.", "Life’s a beach enjoy the waves.", "🌴 Beachaholic. 🌴", "I am happy anywhere I can see the ocean.", "Let the countdown to the beach time begin.", "All I need is a few days at the beach.", "The sun and the sand and a drink in my hand.", "There's no place like home. Except for the beach.", "The road to a friend's house is never long.", "The longest journey begins with the first step.", "The only journey is the one within.", "You can shake the sand from your shoes, but it will never leave your soul.", "To take travel is to take a journey into yourself.", "You can't control the past but you can control where you go next. ✈✈", "Travelling allows you to become so many different versions of yourself.", "Focus on the journey, not the destination. joy is found not in finishing an activity but in doing it.", "If traveling was free you'd never see me again.", "There are no foreign lands. it is the traveler only who is foreign.", "A traveler without observation is a bird without wings.", "There is no greater education than travel.", "Travel expands the mind and fills the gap.", "I won't stop traveling until I have seen the sunset 🌄 from every coast.", "Overpack. It’s why suitcases have wheels now.", "If traveling was free, BYE!", "If you don’t belong, don’t be too long.", "I'd rather have a passport full of stamps than a house full of stuff.", "You can't buy happiness but you can buy a plane ticket and that's kind of the same thing.", "I want to see the world with my own eyes.", "Happiness is looking down for the next destination from your plane 🛬 window.", "Let's pack our bags 👜 and travel the world.", "Happiness is a plane ✈ ticket 🎫 to somewhere.", "One day you will be at the place you always wanted to be.", "Travel has a way of stretching the mind.", "We wander for distraction, but we travel for fulfillment.", "You can shake the sand from your shoes, but not from your soul.", "If your ship doesn't come in, swim out to it.", "There are a sunrise and sunset every single day, and they're absolutely free. Don't miss so many of them.", "Live with no excuses and travel with no regrets.", "Of all the books in the world, the best stories are found between the pages of a passport.", "I have an insane calling to be where I'm not.", "It's your road and yours alone. Others may walk it with you, but no one can walk it for you.", "The world 🌏 is a book 📕 and those who do not travel read only a page.", "You don't need magic to disappear, all you need is a destination.", "In the end, we only regret the chances we didn't take.", "I must be a mermaid... I have no fear of depths and a great fear of shallow living.", "Wherever you go becomes a part of you somehow.", "It is not down in any map; true places never are.", "Because when you stop and look around, this life is pretty amazing.", "Stop worrying about the potholes in the road and enjoy the journey.", "Traveling tends to magnify all human emotions.", "Travel and change of place impart new vigor to the mind.", "Travel makes one modest. You see what a tiny place you occupy in the world.", "No place is ever as bad as they tell you it’s going to be.", "A journey is best measured in friends 👫, rather than miles.", "The tans will fade, but the memories will last forever.", "We have nothing to lose, and a world to see.", "I'm in love with cities I've never been to and people I've never met.", "Journey to the top is easier with the right attitude.", "No matter how long you have traveled in the wrong direction, you can always turn around.", "Focus on the journey, 🚌not the destination. Joy is found not in finishing an activity but in doing it", "Count your trips, not your calories!", "Friends are those, who travel ✈with me.", "We travel🚅 not to escape life, but for life not to escape us.", "Don't forget to pay a visit to the lake while outing.", "It’s the friends we meet along the way that help us appreciate the journey.", "Wherever you go, go with all your heart💙", "Traveling 🚄is my form of self - Education.", "Traveling is my drug of choice🚲", "Travel. It leaves you speechless😐😶, Then turns you into a storyteller.", "Travel✈ brings power and loves ❤back to your life.", "Some beautiful paths 🛣 can't be discovered without getting lost."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);


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



        for (int i=0;i<Travel.length;i++)
        {
            int index = (int)(Math.random() * Travel.length);
            String temp = Travel[i];
            Travel[i]= Travel[index];
            Travel[index]= temp;
        }

        list7 = findViewById(R.id.list7);

        ArrayAdapter adapter7 = new ArrayAdapter<>(this, R.layout.custom_listview7, R.id.textlist7, Travel);
        list7.setAdapter(adapter7);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin7 = position;
                String carvalue7 = (String) list7.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Travel",carvalue7);
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