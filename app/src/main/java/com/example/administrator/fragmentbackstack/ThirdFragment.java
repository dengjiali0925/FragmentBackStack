package com.example.administrator.fragmentbackstack;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * @author dengjiali
 */
public class ThirdFragment extends Fragment implements View.OnClickListener
{
    private static final String TAG = "FragmentTag";
    private static final String THIRD_FRAGMENT = "thirdFragment--";

    private Button button;

    @Override
    public void onAttach(Context context)
    {
        Log.i(TAG, THIRD_FRAGMENT + "onAttach: ");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        Log.i(TAG, THIRD_FRAGMENT + "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        Log.i(TAG, THIRD_FRAGMENT + "onCreateView: ");
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        initView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        Log.i(TAG, THIRD_FRAGMENT + "onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onStart: ");
        super.onStart();
    }

    @Override
    public void onResume()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onResume: ");
        super.onResume();
    }

    @Override
    public void onPause()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onPause: ");
        super.onPause();
    }

    @Override
    public void onStop()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onStop: ");
        super.onStop();
    }

    @Override
    public void onDestroyView()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onDestroyView: ");
        super.onDestroyView();
    }

    @Override
    public void onDestroy()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onDestroy: ");
        super.onDestroy();
    }

    @Override
    public void onDetach()
    {
        Log.i(TAG, THIRD_FRAGMENT + "onDetach: ");
        super.onDetach();
    }

    private void initView(View view)
    {
        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
            {
                ((MainActivity) getActivity()).back();
                break;
            }

            default:
                break;
        }
    }
}
