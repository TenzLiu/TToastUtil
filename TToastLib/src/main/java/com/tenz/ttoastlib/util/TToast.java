package com.tenz.ttoastlib.util;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tenz.ttoastlib.R;

/**
 * auth: TenzLiu
 * desc: 自定义toast
 */
public class TToast {

    private static TToast instance;
    private Toast mToast;
    private Context mContext;
    private TextView mTextView;

    //默认参数
    private int mBgColor = R.color.bgColor; //显示背景色
    private int mTextColor = R.color.textColor; //显示字体颜色
    private int mGravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL; //显示位置
    private int mDuration = Toast.LENGTH_SHORT; //显示时间
    private int mXOffset = 0; //x偏移
    private int mYOffset = 0; //y偏移

    public TToast withBgColor(int mBgColor) {
        this.mBgColor = mBgColor;
        return instance;
    }

    public TToast withTextColor(int mTextColor) {
        this.mTextColor = mTextColor;
        return instance;
    }

    public TToast withGravity(int mGravity) {
        this.mGravity = mGravity;
        return instance;
    }

    public TToast withDuration(int mDuration) {
        this.mDuration = mDuration;
        return instance;
    }

    public TToast withXOffset(int mXOffset) {
        this.mXOffset = mXOffset;
        return instance;
    }

    public TToast withYOffset(int mYOffset) {
        this.mYOffset = mYOffset;
        return instance;
    }

    private TToast(Context mContext) {
        this.mContext = mContext;
    }

    public static TToast newInstance(Context context){
        if(instance == null){
            synchronized (TToast.class){
                if(instance == null){
                    instance = new TToast(context);
                }
            }
        }
        return instance;
    }

    /**
     * show toast
     * @param message 显示内容
     */
    public void show(String message){
        //使用布局加载器，将编写的view_toast布局加载进来
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_toast, null);
        //获取TextView
        mTextView = view.findViewById(R.id.tv_toast_msg);
        mTextView.setBackgroundColor(mContext.getResources().getColor(mBgColor));
        mTextView.setTextColor(mContext.getResources().getColor(mTextColor));
        mTextView.setText(message);
        mToast = new Toast(mContext);
        mToast.setView(view);
        mToast.setGravity(mGravity,mXOffset,mYOffset);
        mToast.setDuration(mDuration);
        mToast.show();
    }

}
