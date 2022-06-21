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

public class Friends extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list3;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Friends.class.getSimpleName();

    String[] Friends = {
            "The language is of friendship is not words but the meaning. ", "Life is an awful, ugly place to not have a friend. ", "A snowball in the face is surely the perfect beginning to a lasting friendship. ", "They make me stronger, they make me braver. ", "Love is blind, friendship closes its eyes. ", "A single rose can be my garden…a single friend, my world. ", "There’s not a word yet for old friends who have just met. ", "I would rather walk with a friend in the dark, than alone in the light. ", "When I say ‘My Army’ I mean You & Me. Happy friendship day.", "Real friendship like real poetry is extremely rare – and precious as a pearl. ", "There’s not a word yet, for old friends who’ve just met. ", "Friends are best to turn to when you’re having a rough day. ", "A real friend is one who walks in when the rest of the world walks out. ", "When worst comes to worst, the squad comes first.", "When the teacher says “group”, I automatically look over to my best friend.", "When a group of best friends meets…the humor is higher than a comedy show.", "We’re like super friends. We’re a highly animated group.", "True friends don’t judge each other. They judge other people together.", "The only way to have a friend is to be one.", "People are weird. When we find someone with the weirdness that is compatible with ours, we team up and call it love.", "It is one of the blessings of old friends that you can afford to be stupid with them.", "In the cookie of life, friends are the chocolate chips.", "I am lucky to have a bunch of crazy friends like you!", "Good friends are like stars. You don’t always see them, but you know they’re always there.", "Giggles, secrets, tears, and friends – through the years.", "Friendship is the shadow of the evening, which increases with the setting sun of life.", "Friendship is the golden thread that ties the heart of all the world.", "Friends are people who know you really well and like you anyway.", "Finding friends with the same mental disorder is priceless!", "F.R.I.E.N.D.S Fight for you. Respect you. Include you. Encourage you. Need you. Deserve you. Stand by you.", "Chillin’ with my brother from another mother.", "All you need is someone that joins in on your weirdness.", "A good friend knows all your best stories, but a best friend has lived them with you.", "A friend will always make you Smile, specially when you don’t want to…", "Friends are like reference book, they say they don't need you but they do.", "Don't know what's tighter, our jeans or our friendship!", "Friendship criteria - You gotta match my craziness.", "Don't let your friends feel lonely - keep on disturbing them.", "True friends don't judge each other. They judge other people... together.", "जो सभी का मित्र होता है वो किसी का मित्र नहीं होता है|", "मित्र और चित्र दिल से बनाओगे तो उनके रंग ज़रूर निखर कर आएंगे।", "दोस्ती पर कुर्बान मेरी जान ऐ रब मेरे दोस्त से पहले तू ले ले मेरी जान.", "दोस्ती और इश्क में बस इतना फर्क है, जितना चाय और कॉफ़ी में!", "दोस्ती और इश्क में बस इतना फर्क है, जितना चाय और कॉफ़ी में!", "I have the craziest friends, so don't judge me😜", "मित्र का हर तोहफा ख़ुशी देने के उद्देश्य से दिया गया होता है।", "Black and White are friends in front of the people but in reality, they hated this 🎈🎈", "Making memories with you is the best thing to do 😌💯", "एक अच्छे और सच्चे दोस्त वाली ख़ुशी नसीब वालों को मिलती हैं.", "थप्पड़ मार कर तू गले लगाना जानती है, जिंदगी,तेरी हरक़तें मेरे यारों सी है!!", "we all have that one कमीना friend! जिसे हमारे parents सबसे शरीफ समझते है.", "हम वक्त गुजारने के लिए दोस्तों को नही रखते, दोस्तों के साथ रहने केलिए वक्त रखते है.", "वो दोस्त ही क्या? जो दो वक़्त की गाली भी ना सुन सके.", "सादगी अगर हो लफ्जो मे, यकीन मानो, प्यार बेपनाह, और दोस्त बेमिसाल मिल ही जाते हैं !!", "एक अच्छा दोस्त अगर 100 बार रूठे तो उसे 100 बार मनाओ, क्यूंकि कीमती मोतियों की माला जितनी बार भी टूटे उसे पिरोना ही पड़ता है!", "अपनी दोस्ती का बस इतना सा उसूल है, ज़ब तू कुबूल है तो तेरा सब कुछ कुबूल है.", "कुछ मीठी सी ठंडक है आज इन हवाओं में, शायद दोस्तो की यादों का कमरा खुला रह गया है.", "Suno मेरे प्यारे दोस्त#दोस्ती छाया देने वाले,#एक पेड़ की तरह होती है।", "Mausam Bahut Thanda Hai,Chal Ae Dost, Galat famiyo Ko Aag Lagate Hai.", "Always smile and be happy especially when your friends are always there for you.", "The greatest gift of life is friendship, and I have received it.", "The best memories come from bad ideas 😂😜 done with best friends 👱 .", "We’ll remain friends for life because you already know too much shit about me.", "We’ll remain friends for life because you already know too much shit about me.", "I don’t like to commit myself about heaven and hell-you see, I have friends in both places.", "My friends are the weirdest, craziest people I know but I love them.", "Good friends will share the umbrella. Best friends will steal it and yell: Run loser Run!", "Friends pick us up when we fall down and if they can’t, they lie down with us and listen for a while.", "Me and my best friend can communicate just with face expressions.", "Best friends: they know how crazy you are and still choose to be seen with you in public.", "If I have to clean my house before you come over, then we’re not real friends.", "Everyone has that one annoying friend if you don’t have one then it’s probably you.", "Life tasteless without that one annoying friend.", "Friendship is born at that moment when one person says to another, What! You Too? - I thought I was the only one.","You and I are more than friends. We’re like a really small gang.", "I will slap you so hard even Google won’t be able to find you.", "If camera lenses are round, why is the picture square?", "No matter how serious life get, you still got to have that one person who is your friend.", "Sitting silently beside a friend who is hurting may be the best gift we can give them.", "Strangers know my innocent side of my personality…Best friends know my dirty Insane side of my personality!", "When you forget to love you, even when your friend always loves.","You’re one of those people who make my life better just by being in it.", "I may not always be there with you, but I will always be there for you.", "If you have crazy friends you have everything you’ll ever need. ", "Nothing makes the earth seem as spacious as to have friends at a distance; they make the latitudes and longitudes.", "Girlfriends come and go, like the waves of the ocean but the true friend stays with you forever.", "Nothing compares to the stomach ache you get from laughing with your best friends. ", "Friendship is born at that moment when one person says to another: ‘What! You too? I thought I was the only one.", "I will always have this piece of my heart that smiles whenever I think about you.", "Friendship isn’t about whom you have known the longest it is who came and never left your side.", "It is easy to find a friend, but difficult to find true friendship.", "The most discovery true friends make is that they can’t grow separately until they grow apart.", "In the end, we will not remember the words of our enemies. But we remember the silence of our friends.", "Rain or Shine. I will always be here for you.", "Sometimes, being silly with a friend is the best therapy!", "I like you because you join in on my weirdness. ", "I can send my ugly selfies to my real friends.", "Strangers think I’m quiet, my friends know that I’m completely Insane.", "For your true friends, no need to think twice.", "The great thing about new friends is that they bring new energy to your soul."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);


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



        for (int i=0;i<Friends.length;i++)
        {
            int index = (int)(Math.random() * Friends.length);
            String temp = Friends[i];
            Friends[i]= Friends[index];
            Friends[index]= temp;
        }

        list3 = findViewById(R.id.list3);

        ArrayAdapter adapter3 = new ArrayAdapter<>(this, R.layout.custom_listview3, R.id.textlist3, Friends);
        list3.setAdapter(adapter3);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin3 = position;
                String carvalue3 = (String) list3.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Friends",carvalue3);
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