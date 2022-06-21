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

public class Enemy extends AppCompatActivity {

    private AdView mAdView;
    private InterstitialAd minterstitialAd;
    ListView list6;
    Context ctx = this;
    Vibrator vibrator;
    private final String TAG = Enemy.class.getSimpleName();

    String[] Enemy = {
            "Don't feel special, I only keep your number in my phone so I know not to answer when you call.", "Girls like shoes more than CLOTHES, Because No Matter How Much They Weigh, it still fits.", "Girls like shoes more than CLOTHES, Because No Matter How Much They Weigh, it still fits.", "The First Human Who Hurled An Insult Instead Of A Stone Was The Founder Of Civilization.", "I'm not here right now so cry me a river, build yourself a bridge, and Get Over it. ", "How do you keep an idiot in suspense? Leave a message and I'll get back to you.", "Anybody who told you to be yourself simply couldn't have given you worse advice.", "Oh you are dating my ex? Cool, Im eating a sandwich ... want those leftovers too?", "If I want your opinion, I'll ask you to fill out the necessary forms.", "90% of the time I say 'BRB' it just means I don't want to talk to you anymore..", "Brains aren't everything. In fact, in your case they're nothing.. ", "If you're going to be two-faced at least make one of them pretty.", "I'm not laughing at you, I'm laughing with you, you're just not laughing.", "If you liked my profile, Raise up ur hands. If not, raise your standard. ", "Are you always this stupid, or are you making a special effort today?", "Why are you so stupid today? Anyway, I think that's very typical of you.", "I don't even like the people you're trying to imitate, if you are at all. ", "Don't think of yourself as an ugly person, just a beautiful monkey :)", "If you're going to be two-faced at least make one of them pretty. ", "Careful now, don't let your brains go to your head..", "I like you. People say I've no taste, but I like you.", "Don't feel bad. A lot of people have no talent..", "Do u practice being this ugly?", "I don't know what makes you so stupid, but it really works..", "How would you like to feel the way you look?", "Don't think, it may sprain your brain!", "Why don't you understand me like my iPhone does??", "If you are shameless, you would do as you wish..", "Save your breath, you'll need it to blow up your date.", "Actually no, my status wasn't aimed at you, but hey, if the shoe fits, feel free to wear it.","People push you to your limits, but when you finally explode and fight back. You are the mean one!!", "You don’t have to attend every argument you are invited to.", "Don’t do something permanently stupid just because you’re temporary upset.", "If another can easily anger you, it is because you are off balance with yourself. – Scottie Waves", "Never trust your tongue when your heart is bitter.", "A quick temper will make a fool of you soon enough. – Bruce Lee", "Be careful with your words when you are angry, they can be only forgiven, not forgotten.", "A moment of patience in a moment of anger saves you a hundred moments of regret.", "The best remedy for a short temper is a long walk. – Joseph Joubert", "Control your anger, it’s only one letter away from danger.", "You will not be punished for your anger, you will be punished by your anger. – Buddha", "One that angers you controls you. Don’t give anyone that power! Especially the one who does it intentionally.", "Never underestimate the power of an extremely pissed off woman.", "If I’ve pissed you off already today, I’m sorry. If I haven’t, please take a number and I’ll be with you shortly.", "really hates it when , people who don’t have a freaking clue what your doing , decide to tell other people what your doing !", "Oh! Do I look like I care anymore? Because my “I care” left when the truth slapped me in the face!!!", "Don’t piss me off and then tell me to calm down!!!", "From this point on I’m going to treat people exactly how they treat me. Some should be glad. Others should be very scared. Karma’s here and they’s Pissed!", "Some people need a high five. in the face. with a chair.", "As I have grown older. I’ve learned that pleasing everyone is impossible. but pissing everyone off is a piece of cake.", "As I have grown older. I’ve learned that pleasing everyone is impossible. but pissing everyone off is a piece of cake.", "Sad, Hurt, Angry, Mad & Disappointed. But you know what? I will pull my boot straps up and will move on, it will hurt but i will survive.", "To win, you have to lose, and then get pissed off.", "Hate is baggage. Life’s too short to be pissed off all the time. It’s just not worth it.", "I told you I needed you, you told me the same. I wasn't lying, so why didn't you tell the truth? ", "I'm the person that the more you complain about me, the harder I'll try to annoy you.", "Anger makes you smaller, while forgiveness forces you to grow beyond what you were...", "For every minute you are angry. You lose sixty seconds of happiness. Think about It...", "To be angry is to let others mistakes punish yourself. To forgive others is to be good to yourself.", "Anger is our natural defense against pain. So when I say, I hate you - it really means you hurt me.", "If you want to hear the whole truth about yourself, make your neighbor angry.", "Feelings are much like waves, we can't stop them from coming but we can choose which ones to surf.", "Anger is a feeling that makes your mouth work faster than your mind.", "When you are angry, your text speed increases by a ridiculous amount.", "There are no words to describe the anger and frustration that I am feeling right now.", "sometimes hearing the music is just the best way to ignore the world.", "You have a problem with me. I'm pretty sure a status on Facebook won't fix it.", "For every minute you remain angry, you give up sixty seconds of peace of mind.", "Never forget what someone says to you when they are angry, because that's when the truth comes out. ", "Sometimes I'm not angry, I'm hurt and there's a big difference.", "Never make yourself feel like nothing to make someone else feel like everything.", "If you're going to talk about be behind my back, don't smile at me to my face!", "Everything is getting expensive except some people, they are getting cheaper.", "Never forget what someone says to you when they are angry, because that's when the truth comes out.", "Anger repressed can poison a relationship as surely as the cruelest words.", "The embarrassment after the anger is biggest humiliation a person can experience.", "Angry? Take a deep breath before you speak, because your mouth acts quicker than your brain.", "Never do anything when you are in a temper, for you will do everything wrong.", "A moment of patience in a moment of anger saves a thousand moments of regret.", "Nobody makes you angry, you decide to use anger as a response.", "I don't have a short temper I just have a low tolerance for stupidity, immaturity and ignorance.", "Anger is never without a Reason, but seldom with a good one.", "All angry persons are to be treated, by the prudent, as children.", "Speak when you are angry and you will make the best speech you will ever regret.", "Anger is a condition in which the tongue works faster than the mind.", "A fool gives full vent to his anger, but a wise man keeps himself under control.", "No matter how long you know someone, they eventually show their true colors. ", "Second chances are only meant for those who learned from the first time.", "If you're going to talk about me behind my back, don't smile at me to my face!", "Everyone has the right to be angry but that doesn't give them the right to be cruel.", "If you are patient in one moment of anger, you will escape a hundred days of sorrow.", "Two things a man should never be angry at...What he can help... and what he cannot help.", "I just don't care if anyone doesn't like me I wasn't put on earth to entertain everyone.", "The worst tempered people I've ever met were people who knew they were wrong.", "Do not teach your children never to be angry, teach them how to be angry.", "It's tough when the people you care about the most are the ones who make you feel the worst.", "Tired of waking up everyday and putting on a stupid fake smile and lying to the world.", "Anger makes you smaller, while forgiveness forces you to grow beyond what you were.", "Some people never realize the emotional and mental damage they do to others.", "It sucks when you realize you rejected other people for that one person who wasted your time.", "Some friends are like pennies. Two-faced and worthless.", "Don't make so many promises when you can't even keep one.", "Anger is only one letter short of Danger.", "A man is about as big as the things that make him angry.", "When you stopped believing in me, I did too.", "Your mistake is letting me go, my mistake was letting you in.", "Don't get mad, smile and creep them out instead.", "Just because I'm being quiet, that doesn't mean I'm mad.", "People change, things go wrong, shit happens, but life goes on.", "I may look calm, but in my head I've killed you about 5 times.", "Don't try to please other people if in the end, you know it wont work.", "If I delete your number, you're basically deleted from my life.", "Whatever is begun in anger ends in shame.", "Don't get mad - Just get even.", "Anger is fear in disguise.", "Anger as soon as fed is dead, 'Tis starving makes it fat'.", "Anger dwells only in the bosom of fools.", "Anger blows out the lamp of the mind.", "Anger always comes from frustrated expectations.", "Anger at lies lasts forever. Anger at truth can't last.", "Never go to bed angry, stay awake and plot your revenge!", "Silence is the best way to react while angry.", "Beware, I'm not in my greatest mood today.", "Sometimes I'm just not in the mood to talk.", "Sometimes you just wanna give people a high five to the face.", "Always write angry letters to your enemies. Never mail them.", "Telling someone to calm down just makes them so much more angry."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemy);


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



        for (int i=0;i<Enemy.length;i++)
        {
            int index = (int)(Math.random() * Enemy.length);
            String temp = Enemy[i];
            Enemy[i]= Enemy[index];
            Enemy[index]= temp;
        }

        list6 = findViewById(R.id.list6);

        ArrayAdapter adapter6 = new ArrayAdapter<>(this, R.layout.custom_listview6, R.id.textlist6, Enemy);
        list6.setAdapter(adapter6);
        vibrator=(Vibrator)getSystemService(VIBRATOR_SERVICE);
        list6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int carpositin6 = position;
                String carvalue6 = (String) list6.getItemAtPosition(position);
                ClipboardManager cp = (ClipboardManager)getSystemService(ctx.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Enemy",carvalue6);
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