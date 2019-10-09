package com.example.bmapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClubsFragment extends Fragment {

    @Override
    public void onStop() {
        super.onStop();
    }

    public ClubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<LocationDetails> locations = new ArrayList<>();

        // todo: The images don't match the place. If you don't want to show an image, you should
        //  remove drawable.
        locations.add(new LocationDetails("Club Athos", "Bulevardul Independenței 2", "★★★☆☆", R.drawable.log_out));
        locations.add(new LocationDetails("La Moustache", "Piața Libertății 5", "★★★★★", R.drawable.bonissimo));
        locations.add(new LocationDetails("Mystique Pub", "Str. Școlii 1", "★★★★☆", R.drawable.padrino));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.word_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}