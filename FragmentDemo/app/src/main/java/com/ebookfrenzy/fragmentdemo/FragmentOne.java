package com.ebookfrenzy.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // 이 프래그먼트의 레이아웃을 인플레이트(inflate)한다.
        return inflater.inflate(R.layout.fragment_one_layout,
                container, false);
    }
}
