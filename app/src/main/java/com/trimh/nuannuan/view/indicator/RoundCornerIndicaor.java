package com.trimh.nuannuan.view.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.trimh.nuannuan.utils.LogUtlis;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Project TrimphJuneFifty
 * Package_name com.trimh.nuannuan.view.indicator
 * Created by Trimph on 2016/7/16.
 */

public class RoundCornerIndicaor extends View implements IPageListener {

    public ViewPager viewPager;
    public int indicatorWidth;
    public int indicatorHight;
    //间隔
    public int indicatorGap;
    public Context context;

    public int count;
    public List<GradientDrawable> unGradientDrawables = new ArrayList<>();
    public List<Rect> unRect = new ArrayList<>();

    private GradientDrawable selectDrawable = new GradientDrawable();
    private Rect selectRect = new Rect();

    public RoundCornerIndicaor(Context context) {
        super(context);
    }

    public RoundCornerIndicaor(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RoundCornerIndicaor(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    public void setViewPager(ViewPager viewPager) {

        if (viewPager == null) {
            return;
        }


        count = viewPager.getAdapter().getCount();

        LogUtlis.e("count" + count);

        createdIndicator();
    }

    private void createdIndicator() {
        unGradientDrawables.clear();
        unRect.clear();
        for (int i = 0; i < count; i++) {
            unGradientDrawables.add(new GradientDrawable());
            unRect.add(new Rect());
        }
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        /**
         *水平 垂直位移   。。。。。。。
         */
        int verticalOffset = getPaddingTop() + (getHeight() - getPaddingTop() - getPaddingBottom()) / 2 - indicatorHight / 2;

        /**
         * 宽度
         */
        int indicatorLayoutWidth = indicatorWidth * count + indicatorGap * (count - 1);

        /**
         * 水平位移
         */
        int horizontalOffset = getPaddingLeft() + (getWidth() - getPaddingLeft() - getPaddingRight()) / 2 - indicatorLayoutWidth / 2;


        drawUnselect(canvas);


    }

    private void drawUnselect(Canvas canvas) {

        for (int i = 0; i < count; i++) {

            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(5);
            gradientDrawable.setColor(Color.BLUE);


        }


    }

    @Override
    public void setViewPager(ViewPager viewPager, int realCount) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
