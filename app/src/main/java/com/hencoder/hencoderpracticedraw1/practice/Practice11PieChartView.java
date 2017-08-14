package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.translate(canvas.getWidth() / 2, canvas.getHeight() / 2);
        RectF rectF = new RectF(-300, -300, 300, 300);

        paint.setColor(Color.WHITE);
        canvas.drawArc(rectF, 1, 10, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 12, 40, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 53, 120, true, paint);

        canvas.translate(-10, -10);
        paint.setColor(Color.RED);
        canvas.drawArc(rectF, 174, 100, true, paint);

        canvas.translate(10, 10);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, 275, 60, true, paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(rectF, 336, 24, true, paint);


    }
}
