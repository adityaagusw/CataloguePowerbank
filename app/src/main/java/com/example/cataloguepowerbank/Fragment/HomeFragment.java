package com.example.cataloguepowerbank.Fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cataloguepowerbank.Adapter.PbAdapter;
import com.example.cataloguepowerbank.Data.PowerbankData;
import com.example.cataloguepowerbank.Model.Powerbank;
import com.example.cataloguepowerbank.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Powerbank> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list.addAll(PowerbankData.getListData());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        PbAdapter pbAdapter = new PbAdapter(list);
        recyclerView.setAdapter(pbAdapter);
    }
}
