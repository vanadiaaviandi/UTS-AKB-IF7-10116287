package com.project.uts_akb_akb7_10116287;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/* 21 Mei 2019
    10116287
    Vanadia Aviandi
    AKB 7
 */
public class IntroViewPagerAdapter extends PagerAdapter {

    Context mContext;
    List<Model> mList;

    public IntroViewPagerAdapter(Context mContext, List<Model> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View screenLayout = inflater.inflate(R.layout.layout_screen,null);

        ImageView imgslide = screenLayout.findViewById(R.id.intro_img);
        TextView title = screenLayout.findViewById(R.id.intro_title);
        TextView description = screenLayout.findViewById(R.id.intro_description);

        title.setText(mList.get(position).getTitle());
        description.setText(mList.get(position).getDescription());
        imgslide.setImageResource(mList.get(position).getScreenImg());

        container.addView(screenLayout);
        return  screenLayout;

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }
}
