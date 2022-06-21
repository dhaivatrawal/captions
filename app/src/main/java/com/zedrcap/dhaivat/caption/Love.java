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

public class Love extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list2;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Love.class.getSimpleName();

    String[] Love = {
            "Yours is the kind of love, I’ll never wake up from.", "Your love is all I need to feel complete.", "You were my cup of tea, but I drink champagne now!", "You can’t just come into someone’s life, make them special and then leave.", "Where there is love there is life.", "We loved with a love that was more than love.", "True love begins when nothing is looked for in return.", "There is only one kind of love, but there are thousands of different copies.", "There are only two times that I want to be with you. Now and Forever.", "The tantalizing rays of the setting sun, remind me that you’re my number one. I love you.", "Take my hand and we’ll make it – I swear!", "Someday all the love you’ve given away will find it’s way back to you and it will finally stay.", "Relationships and understanding are buried under the concept of self-respect and ego.", "One word frees us of all the weight and pain of life: that word is love.", "Loving you felt like leaving my apartment and not being able to remember if I locked the door.", "Like a warrior, my heart was meant to fight battles.", "I’ll hold you when things go wrong, I’ll be with you from dusk till dawn.", "I will love you until the stars go out, and the tides no longer turn.", "I want a second chance at falling in love with you for the first time.", "Caring too much about what people think of you is useless. Most people don’t even know what they think of themselves.", "A true relationship is two imperfect people refusing to give up on each other.", "What’s love? A feeling which either ruins a friendship or makes it stronger.", "Hello, I'm a thief, and I'm here to steal your love.", "Even the gloomiest day become sunny when you smile at me.", "I love that I don't have to bother about social norms and rules when I'm with you.", "I'm addicted to the feel of your hands on mine.", "Never love anyone who treats you like you're ordinary.", "गूगल मैप भी नहीं बता सकता की प्यार हमें किस मोड़ पर ले आया ।", "आँखों पर तेरी निगाहों ने दस्तख़त क्या किए, हमने साँसों की वसीयत तुम्हारे नाम कर दी ।", "अगर कोई आप से सच्चा प्यार करता हैं तो वो आप को किसी भी हाल में छोड़ता नहीं ।", "दिल किसी से तब ही लगाना जब दिलों को पढना सिखलो, वरना हरेक चेहरे की फितरत में वफादारी नही होती ।", "प्यार तो आज भी है, तूजसे है, यू ही नही रोज रोज तेरा DP देख लिया करते हे ।", "जब मेने आप को देखा तो मुझे पहली नज़र में हो प्यार होगा था, और आप मुस्कुरा रहे थे क्यों के आप को ये पता चल गया था ।", "कुछ अजीब सा रिश्ता है उसके और मेरे दरमियां, ना नफरत की वजह मिल रही है, ना मोहब्बत का सिला ।", "जब रिश्तों में ग़लतफहमी आ जाये तो सच्चा प्यार भी झूठा लगने लगता है |", "कई बार हमारे साथ कुछ ऐसे हादसे हो जाते हैं जिनके बारे में हम सोचते रहते हैं क़ि ये कब…कहाँ …कैसे और क्यों हुआ…और यकीन मानिये “प्यार” इनमे से सबसे खतरनाक है।", "चर्चा उसी की होती है, हर महफ़िल में… जिसके दिल में प्रेम की धारा बहती है।", "जब तक कोई किसी जानवर से प्यार नहीं करता तब तक उसकी आत्मा का एक हिस्सा सोया रहता है।", "एक बार फिर मोहब्बत करनी है तुमसे... लेकिन इस बार बेवफाई हम करेंगे |", "जख्म खरीद लाया हूँ इश्क ए बाजार से, दिल जिद कर रहा था मुझे मोहब्बत चाहिये…", "Loving you was just a fantasy until it became a dream come true ❤️", "Holding your hand, stealing a kiss, smuggling in a warm hug all these things make my day, and it is all because of you my love❤.", "इस जीवन में केवल एक ही खुशी है, प्रेम करना और प्रिय होना।", "One day someone will look at you the same way you look at the stars", "Three words.... Eight letters.... Simple thing I LOVE YOU", "जाने उस शख्स को कैसे ये हुनर आता है, रात होती है तो आँखों में उतर आता है, मैं उसके खयालो से बच के कहाँ जाऊं, वो मेरी सोच के हर रस्ते पे नजर आता है।", "भूखा पेट, खाली जेब, और झूठा प्रेम इंसान को जीवन में बहुत कुछ सिखा जाता है |", "बेमतलब होती है बचपन की मोहब्बत... न जिस्मो की चाहत, न दौलत का लालच. बस एक दूसरे के साथ की चाहत...!", "Love is the feeling you get when you like something as much as your motorcycle.", "Be someone’s sunshine when their skies are grey. ", "Even the sun is jealous of the way you shine", "Love – A form of amnesia when a girl forgets there are 1.2 billion other guys in the world.", "True love stands by each other’s side on good days and stands closer on bad days", "You two weirdo are perfect for together.", "Love doesn't make the world go round. Love is what makes the ride worthwhile.", "Love your spouse more than you love your career, hobbies, and money. That other stuff can’t love you back.", "You don’t love someone because they’re perfect, you love them in spite of the fact that they’re not.", "A list of reason why I love you. 1. You are you.", "The first time I saw you, my heart whispered.", "My so many of my smiles😄 begin with you. ", "You are the family👪 I choose.", "When I fall in love, it will be forever😍.", "Perhaps we were friends first and lovers second. But then perhaps this is what lovers are.", "When I look at you, I can feel it. I look at you and I'm home.", "Love itself is what is left over when being in love has burned away.", "When all my dreams come true, the one I want next to me, it's you.", "To be brave is to love unconditionally without expecting anything in return.", "Love yourself first and everything else falls into line.", "It is better to have loved and lost than never to have loved at all.", "I have found that if you love 💞 life, life will love you back 💝 .", "Someday all the love 😍 you’ve given away will find its way back to you and it will finally stay.", "The woman 💃 with the highest walls has the deepest love 💞 .", "I don't dream about you.  Because I can never fall asleep thinking about you tonight.", "No matter how far you are. You are always in my thoughts! Good Night.", "What is love? It is the morning and the evening star.", "Fire🔥 is the test of gold; adversity, of strong men.", "I don't need someone who only loves the good in me, I need someone who would love me after knowing my bad side too.", "There’s someone who has been lost, the one I loved the most 💞 , And the one is you.", "Trying to forget someone you loved is like trying to remember someone you never know.", "The saddest thing in the world is loving someone who used to love you.", "My life was going well but then I fell in love 💑 .", "I don’t need someone loving for my good. I need someone loving even after knowing my bad.", "I used to think love brings happiness. But then I hit the reality.", "I used to think love brings happiness. But then I hit the reality.", "You said “I love you.” I said it too. The only difference is I didn´t lie to you.", "Love 💞 sometimes comes like a dream & leaves like a nightmare.", "You know I was scared to fall in love but I took a chance for you. Still, I am scared.", "Love composed of fake promises, trash words isn’t a love 💞.", "I never stopped loving you, just stopped showing it.", "Don’t shut your doors just yet. Who knows? Lightning may strike.", "You know, when it works, love is pretty amazing. It’s not overrated. There’s a reason for all those songs.", "Stay with someone who sees you like the real treasure you are.", "Is it just me or am I so lucky to have met the girl of my dreams who accepts me for who I am and call her my own too?", "So, I love you because the entire universe conspired to help me find you.", "In case you ever foolishly forget: I am never not thinking of you.", "In love, if you fall easily on your knees, you will never win your happy ending.", "People call it jealousy I call it fear of losing you.", "And if love be madness, may I never find sanity again. ", "I cherish the strength, happiness, and protection that your love has given me.", "From the smallest of sparkles to the biggest of explosions, my love for you shines brightest.", "If you love someone set them free. If they come back, set them on fire."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);


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



        for (int i=0;i<Love.length;i++)
        {
            int index = (int)(Math.random() * Love.length);
            String temp = Love[i];
            Love[i]= Love[index];
            Love[index]= temp;
        }

        list2 = findViewById(R.id.list2);

        ArrayAdapter adapter2 = new ArrayAdapter<>(this, R.layout.custom_listview2, R.id.textlist2, Love);
        list2.setAdapter(adapter2);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin2 = position;
                String carvalue2 = (String) list2.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Love",carvalue2);
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