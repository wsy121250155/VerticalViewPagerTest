package com.example.verticalviewpagertest;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mobovip.views.DirectionalViewPager;

public class MainActivity extends FragmentActivity {

	private DirectionalViewPager viewPager;
	final ArrayList<Fragment> fragList = new ArrayList<Fragment>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewPager = (DirectionalViewPager) findViewById(R.id.viewPager);
		fragList.add(new Test1Fragment());
		fragList.add(new Test2Fragment());
		fragList.add(new Test3Fragment());
		viewPager.setAdapter(new MyFragmentPagerAdapter(
				getSupportFragmentManager(), fragList));
		viewPager
				.setOrientation(com.mobovip.views.DirectionalViewPager.VERTICAL);
		viewPager.setSaveEnabled(false);// else nullpoint when jump
	}

	public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

		public List<Fragment> mFraList;

		public MyFragmentPagerAdapter(FragmentManager fm,
				List<Fragment> mFraList) {
			super(fm);
			this.mFraList = mFraList;
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			return mFraList.get(arg0);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mFraList.size();
		}

	}
}
