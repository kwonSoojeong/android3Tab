package kr.cri.android3tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KSJ on 2016-10-03.
 */

public class Tab2Activity extends android.support.v4.app.Fragment {
    Context mContext;

    @SuppressLint("ValidFragment")
    public Tab2Activity(Context mContext) {
        this.mContext = mContext;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2layout, null);
        view.setBackgroundColor(Color.BLUE);
        //TODO 여기서 버튼이나 이미지 같은거 설정해주면 됨
        return view;
    }
}
