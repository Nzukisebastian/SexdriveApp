package com.example.sexdriveapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class SexDrive extends AppCompatActivity {
    RecyclerView mRecyclerview;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mManager;
    List<Details> mListitems;
    ProgressBar progressBar;
    public SexDrive(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sex_drive);
        mRecyclerview=(RecyclerView)findViewById(R.id.recyclerTemp);
        progressBar=(ProgressBar)findViewById(R.id.pb);
        mListitems=new ArrayList<>();
        mManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerview.setLayoutManager(mManager);
        mAdapter=new AdapterListdetails(mListitems,this);
        mRecyclerview.setAdapter(mAdapter);
        request();
    }

    private void request(){
        progressBar.setVisibility(View.VISIBLE);
        String anxietys="Having high levels of anxiety is a common barrier to sexual functioning and libido for both males and females. This may be anxiety due to life stress or specific sex-related anxiety.\n" +
                "\n" +
                "People with an intense work schedule, caring responsibilities, or other life stresses may feel fatigued and, as a result, have a low sexual desire.\n" +
                "\n" +
                "Anxiety and stress can also make it more difficult for someone to get or maintain an erection, which can put a person off having sex. A 2017 review of erectile dysfunction in young men has suggested that depression and anxiety can result in a reduced libido and increased sexual dysfunction.\n" +
                "\n" +
                "There are many things that people can do to manage their anxiety and boost their mental health, including:\n" +
                "\n" +
                "    practicing good sleep hygiene\n" +
                "    making time for a favorite hobby\n" +
                "    exercising regularly\n" +
                "    eating a nutritious diet\n" +
                "    working to improve relationships\n" +
                "    talking to a therapist\n";
       String foreplay="Having better sexual experiences may increase a person's desire for sex, thereby boosting their libido. In many cases, people can enhance their sexual experiences by spending more time on touching, kissing, using sex toys, and performing oral sex. Some people call these actions outercourse.\n" +
               "\n" +
               "For women, foreplay may be especially important. According to some 2017 research, only around 18 percent of women orgasm from intercourse alone, while 33.6 percent of women report that stimulation of the clitoris is necessary for them to orgasm.";

       String food="Following a nutritious diet can benefit people's sex drive by promoting good circulation and heart health, and by removing specific foods that can decrease libido. Below are 10 best and impressive foods that act like viagra and boost sex drive! ";

      String asparagus="Asparagus is rich in vitamin B6, as well as folate, both of which have properties that boost arousal in both men and women. There’s also vitamin E in asparagus that helps to stimulate men and women’s sex hormones as well.";
      String pumpkin="Pumpkin seeds are rich in Zinc, which helps in increased sperm production and also in preventing testosterone deficiency in men. Alternatively, roast pumpkin seeds to get same benefit.";

      String chiaseed="This is for all you long distance relationship folks out there. If you’re looking to go all day, simply sprinkle these seeds into your yogurt or smoothies and you’ll feed yourself the energy you need to fuel your lustful day. Thanks to their prime ratio of protein, healthy fats, and fiber, chia seeds give you stable energy since they won’t cause spikes and drops in blood sugar or insulin levels, which would otherwise cause for a distracting rumbling tummy while your romping around in bed.";

      String ginger="If you like your food like you like your lovers—sweet and spicy—you’re in luck. Ginger is another food that can improve your sex life by aiding blood flow and improving artery health. According to a study in the International Journal of Cardiology, consuming a mere teaspoon of the stuff a few times a week is all you need to reap the heart-healthy benefits. So, go ahead and place that second order of sushi this week—just don’t leave the ginger on your plate.";
      //mListitems=new ArrayList<>();
        // model.setTitle(data.getString("title"));
        mListitems.add(new Details("1. Manage anxiety",anxietys,R.drawable.anxiety));
        mListitems.add(new Details("2. Focus on foreplay",foreplay,R.drawable.c4));
        mListitems.add(new Details("3. Eat a nutritious diet",food,R.drawable.anxiety));
        mListitems.add(new Details("a). Pumpkin Seeds",pumpkin,R.drawable.pumpkin));
        mListitems.add(new Details("b). Chia Seeds",food,R.drawable.chiaseed));
        mListitems.add(new Details("c). Pomegranate","Pomegranate help in regulating blood flow and directing blood flow towards genitals.\n" +
                "They are wonderful foods to enjoy a steamy time.\n",R.drawable.pomegranate));
        mListitems.add(new Details("d). Asparagus","Asparagus rich in folate and vitamin E, asparagus is a wonderful food that helps to boost fertility in women besides acting as excellent natural Viagra.",R.drawable.asparagus));
        mListitems.add(new Details("e). Cardamom","Cardamom contains a crucial compound called cineole which enhances blood flow to the sex organ. It is a brilliant food that promotes stronger erections.",R.drawable.cardamom));
        mListitems.add(new Details("f). Avocados","Avocados contain healthy fats and vitamin B6 besides other nutrients that boost energy. \n" +
                "Avocado’s nutrients composition helps to increase sperm count in men.\n",R.drawable.avacodo));
        mListitems.add(new Details("f). Banana","Banana contain an enzyme called bromelain that is known to naturally boost one’s sex drive.\n" +
                "Bananas are rich in many other nutrients including potassium and magnesium.\n",R.drawable.banana));
        mListitems.add(new Details("h). Dark Chocolate","Dark Chocolate boosts mood and helps to reduce stress.\n" +
                "It is a feel good food that also enhances sensuality.\n",R.drawable.chocolate));
        mListitems.add(new Details("i). Spinach","Spinach known to be one of the healthiest foods in the world due to its supremely rich vitamin composition. ",R.drawable.spinach));
        mListitems.add(new Details("j). Eggs","Eggs contain Vitamins D, B5 and B6. All these impressively work to boost sex drive and relax blood vessels in the body, giving you an erotic time with your partner.",R.drawable.eggs));
        mListitems.add(new Details("k). Walnuts","Walnuts contain omega-3 fatty acids and vitamin B3 which improve the quality of sperm and increase blood flow to the male sex organ.",R.drawable.walnuts));
        mListitems.add(new Details("l). Watermelon","Watermelon is rich in citrulline and it helps to produce Arginine and Nitric acid in the body.\n" +
                "Nitric acid is a proven compound that boosts sex drive in men and promotes stronger erections.\n",R.drawable.watermelon));

        mListitems.add(new Details("m. Ginger","If you like your food like you like your lovers—sweet and spicy—you’re in luck. Ginger is another food that can improve your sex life by aiding blood flow and improving artery health. According to a study in the International Journal of Cardiology, consuming a mere teaspoon of the stuff a few times a week is all you need to reap the heart-healthy benefits. So, go ahead and place that second order of sushi this week—just don’t leave the ginger on your plate.",R.drawable.ginger));
        mListitems.add(new Details("4. Get regular exercise","Exercise increases blood flow both short- and long-term to your sexual organs (and the rest of the body), as well as increases lubrication. Second, exercise is the best way to slash stress- which is the number one libido killer for women. Third, as you exercise, both your strength and endurance will increase, opening the possibility for more varied sexual positions that require greater physical control. Lastly, working out makes one feel sexy.",R.drawable.c));

        mListitems.add(new Details("5. Improve relationship quality","Many people experience a lull in sexual desire and frequency at certain points in a relationship. This may occur after being with someone for a long time, or if a person perceives that things are not going well in their intimate relationships.\n" +
                "\n" +
                "Focusing on improving the relationship can increase each partner's sex drive. This might involve:\n" +
                "\n" +
                "   a) planning date nights\n" +
                "   b) doing activities together outside of the bedroom\n" +
                "   c) practicing open communication\n" +
                "   d) setting time aside for quality time with each other\n",R.drawable.anxiety));
        mListitems.add(new Details("Boosting libido in males","Libido in men is often related to testosterone levels, which will naturally decline as men age. Testosterone replacement therapy can help some men.\n" +
                "\n" +
                "In men with testosterone deficiency, or hypogonadism, testosterone replacement therapy can result in improved libido, reduced depression, and improved erectile function, according to one 2017 review.\n" +
                "\n" +
                "There is little evidence to suggest that certain foods or supplements increase a person's testosterone levels and sexual function. Some research suggests that zinc, vitamin D, and omega-3 fatty acids may be important dietary components for testosterone.",R.drawable.c4));
        mListitems.add(new Details("Boosting libido in females","Sex-related hormones, such as estrogen and estrogen-like compounds, can also affect sexual desire in females.\n" +
                "\n" +
                "Many women experience a dip in libido and sexual functioning at menopause, when estrogen levels drop. Estrogen replacement therapy may help some women.\n" +
                "\n" +
                "Vaginal dryness is another symptom of menopause. Using lubricants during sexual activity can increase people's enjoyment.\n" +
                "\n" +
                "Women also produce testosterone. Doctors once believed that testosterone might affect women's sex drive, but to date, research has not found a strong link.\n" +
                "\n" +
                "Certain birth control pills may also decrease libido. If a person suspects that their hormonal contraception is affecting their sex drive, they can speak with a doctor about changing pill type.",R.drawable.anxiety));
        mListitems.add(new Details("When to see a doctor","If a person is concerned about having a decrease in libido, a doctor can offer advice and information about potential causes and treatments. Doctors who are knowledgeable about alternative and complementary remedies may also help a person choose natural remedies.\n" +
                "\n" +
                "A person may wish to see a doctor for low libido when:\n" +
                "\n" +
                "    it appears suddenly or without explanation\n" +
                "    additional symptoms appear, such as high blood pressure or pain\n" +
                "    it occurs after starting a new medication or having surgery\n" +
                "    it causes serious relationship problems or psychological distress\n" +
                "    sex is painful\n",R.drawable.anxiety));
        mListitems.add(new Details("Conclusion","There is a wide natural variation in people's sexual desires and libido. It is important to note that having a lower libido than other people is not necessarily a bad thing.\n" +
                "\n" +
                "However, if a person wants to increase their libido, there are many methods to try. These include eating a nutritious diet, getting regular exercise, reducing anxiety, and focusing on improving intimate relationships.\n" +
                "\n" +
                "Low libido is a complex issue, with relationship, psychological, and physical components. Knowing the cause can help a person find the best treatment.\n" +
                "\n" +
                "Because low libido, or a sudden shift in libido, can be a sign of a health condition, it is safest to talk to a doctor before trying libido boosters.",R.drawable.anxiety));


        progressBar.setVisibility(View.GONE);

    }
}
