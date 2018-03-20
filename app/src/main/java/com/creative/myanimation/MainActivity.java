package com.creative.myanimation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.transition.Fade.IN;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainActivity extends Activity {

    private TextView mLabelText;
    private Fade mFade;
    private ViewGroup mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLabelText = new TextView(this);
        mLabelText.setText("Label");
        //mLabelText.setId("@+id/textView");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(174, 122);
        layoutParams.width = WRAP_CONTENT;
        layoutParams.height = WRAP_CONTENT;
        mLabelText.setLayoutParams(layoutParams);

        mRootView = (ViewGroup) findViewById(R.id.mainLayout);
        mFade = new Fade(IN);

        TransitionManager.beginDelayedTransition(mRootView, mFade);

        mRootView.addView(mLabelText);
    }
}
