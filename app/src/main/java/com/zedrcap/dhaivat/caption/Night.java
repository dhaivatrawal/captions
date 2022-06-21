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

public class Night extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list4;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Night.class.getSimpleName();
    String[] Night = {
            "You’ll be the last thing I think of before I fall asleep and the first thing I think of when I wake up.", "Her memories of him were like flowers in the morning and stars at night.", "Together, let’s disappear into this night like two shooting stars.", "Stars can’t shine without darkness...", "Think in the morning. Act in the noon. Eat-in the evening. Sleep in the night.", "Tonight, I would walk a thousand miles just to be with you. Missing you, my love.", "Night is made for rest not for text.", "One day someone will look at you the same way you look at the stars", "Music 🎵 is moonlight in the gloomy night of life.", "Black as night, sweet as sin.", "All I want is good music, great friends, bright lights and late nights.", "Some nights are made for torture, or reflection, or the savoring of loneliness ☹ .", "I want to be like a dream and fade in the morning, then by night, return new and fatal.", "I'm your worst nightmare. ", "Summer nights and city lights. ", "I don't dream about you.  Because I can never fall asleep thinking about you tonight.", "Sleep all day. Party all night. Never grow old. Never die.", "Sometimes, things may not go your way, but the effort should be there every single night.", "The darker the night, the brighter the stars 🌟 , the deeper the grief, the closer is God!", "The darkest nights🌑 produce the brightest stars🌟", "I promise to be the warrior who fights all your Nightmares and the messenger who brings all your Sweet Dreams in your this good night...", "Summer: Hair gets lighter. Skin gets darker. Water gets warmer. Drinks get colder. Music gets louder. Nights get longer. Life gets better.", "No matter how bad your day has been, the beauty of the setting sun will make everything serene.", "Last night was a blur. ", "People say that I am bad😈… but trust me, I can be your worst nightmare!", "No matter how far you are. You are always in my thoughts! Good Night.", "I like the night. Without the dark, we’d never see the stars.", "One night I burn in the fire of my own all thoughts…", "The night is longer than a day for those who DREAM, and a day is longer than night for those who make their DREAMS come true.", "Good night my dearest love and have pleasant dreams. Here’s to the hope that tomorrow will be as sunny and bright as you are.", "Each night, when I go to sleep, I die. And the next morning, when I wake up, I am reborn.", "Missing someone makes it harder to fall asleep at night.", "May your pockets are heavy and your heart is light. May Good luck pursue you each morning and night.", "There are a sunrise and sunset every single day, and they're absolutely free. Don't miss so many of them.", "Wearing sunglasses at night hurts your eyes after a while.", "I’m sorry I mistook all our laughs, long nights, sweet texts & inside jokes as you care. I’ll think twice before wasting my time again.", "Be de darkest of the night, deepest of the ocean, and the brightest of the stars✨", "If a fat man puts you in a bag at night, don’t worry. I told Santa I want you for Christmas.", "Here's to the nights we felt alive.", "A good husband is never the first to go to sleep at night or the last to awake in the morning.", "Happiness is..a cool breeze on a summer night. ", "Gonna go crazy tonight. ", "Maha Shivratri - A Night with Divine.", "Life begins at night  🏃 !!", "My idea of a good night has always been having a lovely meal and a proper conversation.", "Aim for the moon, if you miss you may hit a star.", "Don't lose hope. You never know what tomorrow will bring... So, Good night!", "Monsters don’t sleep under your bed, they scream inside of your head.", "If only some nights could last forever. ", "The moon looks upon many night flowers; the night flowers see but one moon.", "Disturb my sleep but darling don’t dare disturb my dreams!", "The night breeze is blowing through my hair and the soft touch reminds me of your kisses. I wish I didn’t have to miss you this much.", "Missing you comes in waves 🌊, Tonight I'm drowning.", "It’s too a.m. for me.", "रात नई हैं, यादें पुरानी!", "There was never a night or a problem that could defeat sunrise or hope.", "There’s no better sound🔉 to hear that the ocean🌊, the wind🎐, and the rain🌨 all at once, late at night.🌃", "Evenings are the beautifully sweet spot between the harsh light of the day and the dead darkness of night.", "Love 💞 sometimes comes like a dream & leaves like a nightmare.", "People drink democracy in a glass of tea, but night falls, again.", "Some memories make the nights darker.", "Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.", "Taking pictures is like tiptoeing into the kitchen late at night and stealing Oreo cookies.", "At night, I can’t sleep. In the morning, I can’t wake up.", "In the darkest nights, even I’m scared of my demons.", "I am a daydreamer and a night thinker.", "Dark night + Heavy rain + Coldness + Nice blanket = Perfect sleep", "I Love The Nights 🌃I Can’t Remember With The Friends I’ll Never Forget.", "Let’s celebrate🎉 with a toast and get lost in tonight. ", "The most efficient way to live reasonably is every morning to make a plan of one’s day and every night to examine the results obtained.", "Beauty is like Moon, looks much better at Night.", "The best nights are usually unplanned, random and spontaneous.", "In a real dark night of the soul, it is always three o'clock in the morning, day after day.", "Expressions of affection, like putting your arm around someone's shoulder, holding hands, or giving a kiss good night, involve the principle of honesty.", "When life knocks you down, roll over and look at the stars.", "Some of the happiest times I ever saw my dad was times when I was with him in the casinos, and he had a good night.", "Think of all the good moments of this day and keep a smile for tomorrow!!", "If someone wishes you good night every day. You're happier than so many people.", "Day is over, night has come. Today is gone, Embrace your dreams, through the night. Tomorrow comes with a whole new light!!", "Stars light Stars bright, you are the only Star I see tonight!!", "If I had a star for every time you made me smile🙂, I would be holding the night sky in my hand.", "Each night you sleep is a signal that a new beginning awaits you.", "One day, we will never have to say goodbye, the only goodnight.", "Touch your heart and shut your eyes, dream sweet dreams and sleep tight tonight.", "Loneliness adds beauty to life. It puts a special burn 🔥 on sunsets and makes night air smell better.", "Always kiss your dog goodnight. ", "Live for today, plan for tomorrow, party🎉 tonight.", "Love is one of the simplest feelings. All I dream about is capturing your heart each night. You already have my heart ❤ .", "Throw off your worries when you throw off your clothes at night; and sleep well.", "You’re my first thought in the morning and the last in the night.", "I wore sunglass in the night to hide my tears and they thought I’m blind!!", "Thank God for everything good that has happened during the day and wish everyone else a good night.", "I was walking along and this chair came flying past me, and another, and another, and I thought, man, is this gonna be a good night.", "The sky grew darker, painted blue on blue, one stroke at a time, into deeper and deeper shades of night.", "Nighttime can seem longer than the day when you dream big dreams. Daytime lasts longer for people who make their dreams come true.", "The stars and moon arrive just to wish you a good night. Let the light of the moon guide your dreams as you pass the night away.", "Melancholy were the sounds on a winter’s night.", "Those who dream by day are cognizant of many things which escape those who dream only by night.", "Each night, I hope that the moon is large and bright and you will be happy and right.", "Night comes to the desert all at once, as if someone turned off the light.", "Brings you dreams of castles in the air and big goals for the future. Rest tonight and allow dreams of the future to wash over your mind.", "As the moonlight dims and the world goes quite, give yourself some rest. Here’s to hoping that your sleep is as sweet as you are.", "Here is to wishing that your mind will rest in sweet serenity while the nighttime passes by.", "I never paint dreams or nightmares. I paint my own reality.", "May Good luck pursue you each morning and night.", "Light up the night, wild one. Your smile is going to save someone’s life.", "Your love is like the lamp 🛋 in the window that guides me home through the darkest night 🌃.", "One who marries for love alone will have bad days but good nights.", "I love snowy days, frosty nights and warm hearts.", "I don’t remember much from last night but the fact that I needed sunglasses to open the fridge this morning tells me it was awesome.", "Even if you don't have time for a big workout, stretching in the morning and night really changes your body.", "Do your legs hurt from running through my dreams all night?", "Sunset is the opening music of the night."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);


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



        for (int i=0;i<Night.length;i++)
        {
            int index = (int)(Math.random() * Night.length);
            String temp = Night[i];
            Night[i]= Night[index];
            Night[index]= temp;
        }

        list4 = findViewById(R.id.list4);

        ArrayAdapter adapter4 = new ArrayAdapter<>(this, R.layout.custom_listview4, R.id.textlist4, Night);
        list4.setAdapter(adapter4);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin4 = position;
                String carvalue4 = (String) list4.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Night",carvalue4);
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