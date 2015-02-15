package com.umpay.touchevent.conflict;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umpay.touchevent.R;

public class TwoFragment extends Fragment
{
  private static final String TAG = "TwoFragment";
  public ViewPager parent;
  
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
  }
  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
  {
    View view=inflater.inflate(R.layout.fragment_second, container,false);
    return view;
  }
}
