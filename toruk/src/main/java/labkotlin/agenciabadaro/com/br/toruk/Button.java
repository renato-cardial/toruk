package labkotlin.agenciabadaro.com.br.toruk;


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;


class Button extends AppCompatButton {


    public Button(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.RED);
        setTextColor(Color.WHITE);
    }

    public Button(Context context) {
        super(context);

        setBackgroundColor(Color.RED);
        setTextColor(Color.WHITE);
    }
}

