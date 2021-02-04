package com.example;

import android.content.Context;
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

/*import com.example.pepperfry.R;*/


public class OrderRelatedFragment extends Fragment {
    private TextView mTvSignIn_Personal;
    private ImageView mIvNotificationHoldingHand;
    private Button mBtnSignIn;

    public OrderRelatedFragment() {
        // Required empty public constructor
    }

    public static OrderRelatedFragment newInstance() {
        OrderRelatedFragment fragment = new OrderRelatedFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_related, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        intViewsAndListeners(view);
    }

    private void intViewsAndListeners(View view) {
        mTvSignIn_Personal= view.findViewById(R.id.tvSign_inPersonal);
        mIvNotificationHoldingHand = view.findViewById(R.id.ivnotificationIconHoldingHand);
        mBtnSignIn = view.findViewById(R.id.btnSignIn);
        mBtnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Got To Sign In Page
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //ListenerContext
    }
}