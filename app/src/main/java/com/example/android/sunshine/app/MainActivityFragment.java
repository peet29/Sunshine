package com.example.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<String> foreCastData = new ArrayList<>();
        foreCastData.add("Today - Sunny - 88/63");
        foreCastData.add("Tomorrow - Foggy - 70/46");
        foreCastData.add("Weds - Cloudy - 72/63");
        foreCastData.add("Thurs - Rainy - 64/51");
        foreCastData.add("Fri - Foggy - 70/46");
        foreCastData.add("Sat - Sunny - 76/68");
        foreCastData.add("Sun - Sunny - 80/68");

        List<String> weekForecast = foreCastData;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                foreCastData);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView  = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
