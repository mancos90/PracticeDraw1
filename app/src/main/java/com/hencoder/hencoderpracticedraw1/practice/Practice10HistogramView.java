package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Path path = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.translate(100, 100);
        path.lineTo(0, 500);
        path.rLineTo(800, 0);
        canvas.drawPath(path, paint);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(50, 480, 150, 500, paint);
        canvas.drawRect(200, 350, 300, 500, paint);
        canvas.drawRect(350, 320, 450, 500, paint);
        canvas.drawRect(500, 200, 600, 500, paint);
        canvas.drawRect(650, 150, 750, 500, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(50);
        canvas.drawText("直方图", canvas.getWidth() / 2 -75 , 0, paint);
    }
}
