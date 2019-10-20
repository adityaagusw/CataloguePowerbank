package com.example.cataloguepowerbank.Fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cataloguepowerbank.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private ImageView imgProfile;
    private TextView nameProfile, emailProfile;

    private Animation packageImage, packageText;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgProfile = view.findViewById(R.id.imageProfile);
        nameProfile = view.findViewById(R.id.nameProfile);
        emailProfile = view.findViewById(R.id.emailProfile);

        packageImage = AnimationUtils.loadAnimation(getActivity(),R.anim.packageimage);
        packageText = AnimationUtils.loadAnimation(getActivity(),R.anim.text);

        imgProfile.startAnimation(packageImage);
        nameProfile.startAnimation(packageText);
        emailProfile.startAnimation(packageText);

    }
}
