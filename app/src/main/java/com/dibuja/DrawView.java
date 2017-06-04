package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {


        paint.setColor(Color.CYAN);
        canvas.drawLine(60,150,80,100,paint);
        canvas.drawLine(80,100,125,100,paint);
        canvas.drawLine(125,100,150,150,paint);
        canvas.drawLine(60,150,80,200,paint);
        canvas.drawLine(80,200,125,200,paint);
        canvas.drawLine(125,200,150,150,paint);

        paint.setColor(Color.BLACK);
        canvas.drawLine(300,200,275,140,paint);
        canvas.drawLine(275,140,350,150,paint);//picos  1-2
        canvas.drawLine(350,150,425,140,paint);
        canvas.drawLine(425,140,400,200,paint);//picos  2-3
        canvas.drawLine(300,200,265,250,paint);
        canvas.drawLine(265,250,325,250,paint);//picos 3-4
        canvas.drawLine(325,250,350,300,paint);
        canvas.drawLine(350,300,375,250,paint);//picos  4-5
        canvas.drawLine(375,250,435,250,paint);
        canvas.drawLine(435,250,400,200,paint);//picos  5-1

	}

}
