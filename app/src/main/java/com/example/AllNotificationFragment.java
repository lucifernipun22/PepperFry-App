package com.example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pepperfry.R;

/*import com.example.pepperfry;*/


public class AllNotificationFragment extends Fragment {
    private TextView mTvNo_Notification, mTvyourNotification;
    private ImageView mIvNotificationIcon;
    private Button mBtnStartShop;

    public AllNotificationFragment() {
        // Required empty public constructor
    }

    public static AllNotificationFragment newInstance() {
        AllNotificationFragment fragment = new AllNotificationFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewsAndListeners(view);
    }

    private void initViewsAndListeners(View view) {
        mTvNo_Notification = view.findViewById(R.id.tvNo_Notification);
        mTvyourNotification = view.findViewById(R.id.tvyourNotification);
        mIvNotificationIcon = view.findViewById(R.id.ivnotificationIcon);
        mBtnStartShop = view.findViewById(R.id.btnStartShop);
        mBtnStartShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeScreen.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //ListenerContext
    }
}