package com.example.instafarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescribeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);

        Intent i = getIntent();
        String food = i.getStringExtra("food");

        ImageView image = (ImageView) findViewById(R.id.image);
        TextView foodtext = (TextView)findViewById(R.id.textdescription);
        if(food.equalsIgnoreCase("carrots")){
            image.setImageResource(R.drawable.carrot);
            foodtext.setText("Carrots were domesticated in the ancient empires located in today’s Iran and Afghanistan over 5000 years ago. From there, this great root vegetable spread across the known world.\n" +
                    "There are over 100 species of edible carrots today.\n" +
                    "Until 17th century, the only edible types of carrots had black, white, red and purple colors. The iconic orange carrots were created by selective breeding in Netherlands as a tribute to the ruling House of Orange.\n" +
                    "Since their arrival to ancient Greece and Rome to their expansion in medieval Europe, carrots were often used for their medicinal properties. Romans famously though that carrots are aphrodisiacs.\n" +
                    "87% of carrot is water.\n" +
                    "Carrots lost their bitterness, dryness of the core and gained sweetness only during 17th and 18th century.\n" +
                    "Carrot is one of the most sugary vegetables in the world. Only beet has it more.\n" +
                    "American cuisine did not approve of carrots for the longest time. They became fond of it only after their soldiers returned home from the World War I when they had constant contact with this great vegetable.");
        } else if(food.equalsIgnoreCase("brocolli")){
            image.setImageResource(R.drawable.broc);
            foodtext.setText("Broccoli (Brassica oleracea) is a cruciferous vegetable related to cabbage, kale, cauliflower, and Brussels sprouts.\n" +
                    "\n" +
                    "These vegetables are known for their beneficial health effects.\n" +
                    "\n" +
                    "Broccoli is high in many nutrients, including fiber, vitamin C, vitamin K, iron, and potassium. It also boasts more protein than most other vegetables.\n" +
                    "\n" +
                    "This green veggie can be enjoyed both raw and cooked, but recent research shows that gentle steaming provides the most health benefits (1Trusted Source, 2Trusted Source).\n" +
                    "\n" +
                    "This article tells you everything you need to know about broccoli.");
        } else if(food.equalsIgnoreCase("cauliflower")){
            image.setImageResource(R.drawable.cauli);
            foodtext.setText("Cauliflower belongs to the plant species called Brassica oleracea.\n" +
                    "\n" +
                    "This species includes other common vegetables like kale, broccoli, and Brussels sprouts.\n" +
                    "\n" +
                    "Believe it or not, all of these come from the cultivation of one single plant — the wild cabbage.\n" +
                    "\n" +
                    "\n" +
                    "Through the ages, farmers have selectively bred the plant for specific traits that they wanted to see more of.\n" +
                    "\n" +
                    "In the end, the wild cabbage split into the different varieties we enjoy today.\n" +
                    "\n" +
                    "This is how the artificial selection went down:\n" +
                    "\n" +
                    "A preference for larger leaves = kale\n" +
                    "More tightly bunched leaves = modern-day cabbage\n" +
                    "Thicker stems = kohlrabi\n" +
                    "Larger lateral buds = Brussels sprouts\n" +
                    "Larger immature buds = cauliflower (and later, broccoli)");
        }
    }
}
