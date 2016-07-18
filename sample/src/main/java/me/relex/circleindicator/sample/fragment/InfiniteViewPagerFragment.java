package me.relex.circleindicator.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.InfinitePagerAdapter;
import me.relex.circleindicator.InfiniteViewPager;
import me.relex.circleindicator.sample.DemoPagerAdapter;
import me.relex.circleindicator.sample.R;

/**
 * Created by Hani on 3/6/16.
 * http://oostaa.com
 */
public class InfiniteViewPagerFragment extends Fragment {

    InfinitePagerAdapter wrappedAdapter;
    InfiniteViewPager viewpager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_default_demo, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        viewpager = (InfiniteViewPager) view.findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        wrappedAdapter = new InfinitePagerAdapter(new DemoPagerAdapter());
        viewpager.setAdapter(wrappedAdapter);
        indicator.setViewPager(viewpager);
    }
}