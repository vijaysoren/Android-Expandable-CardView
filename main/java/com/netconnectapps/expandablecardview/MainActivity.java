package com.netconnectapps.expandablecardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/********************
 * Vijay Soren      *
 * feb 19, 2022     *
 ********************/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton expandButton = findViewById(R.id.buttonExpand);
        LinearLayout hiddenLayout = findViewById(R.id.hiddenLayout);
        CardView cardView = findViewById(R.id.cardView);

        expandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenLayout.getVisibility() == View.VISIBLE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    hiddenLayout.setVisibility(View.GONE);
                    expandButton.setImageResource(R.drawable.ic_expand_more);

                }else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    hiddenLayout.setVisibility(View.VISIBLE);
                    expandButton.setImageResource(R.drawable.ic_hide);
                    
                }
            }
        });
    }
}