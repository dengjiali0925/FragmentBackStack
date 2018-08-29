package com.example.administrator.fragmentbackstack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity
{

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        Fragment fragment1 = new FirstFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_layout, fragment1);
        transaction.commit();
    }

    /**
     * 从第一个Frament切换到第二个Fragment
     */
    public void switchFirstToSecond()
    {
        Fragment fragment2 = new SecondFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment2);
        // 将当前的事务添加到回退栈
        transaction.addToBackStack(null);
        transaction.commit();
    }

    /**
     * 从第二个回退到第一个Fragment
     */
    public void back()
    {
        FragmentManager manager = getSupportFragmentManager();
        // 将当前的事务退出回退栈
        manager.popBackStack();
    }

    /**
     * 从第二个Frament切换到第三个Fragment
     */
    public void switchSecondToThird()
    {
        Fragment fragment3 = new ThirdFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment3);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
