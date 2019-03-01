package com.example.animtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class ToastAnim extends Toast {


    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public ToastAnim(Context context) {
        super(context);
    }

   

    public static Toast makeText(Context context, String message, int duration, int animation, int background)
    {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.toasts, null, false);
        LinearLayout layout1 = layout.findViewById(R.id.toast_type);

        TextView textView = layout.findViewById(R.id.toast_text);
        LottieAnimationView animationView = layout.findViewById(R.id.anim);

        textView.setText(message);

            layout1.setBackgroundResource(background);
            animationView.setAnimation(animation);
            animationView.playAnimation();

        toast.setView(layout);



        return toast;
    }




}
