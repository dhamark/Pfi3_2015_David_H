package se.mah.k3.lecture_4_examples_adapter_extra;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


public class GridFragment extends Fragment {
    public static ArrayList<Planet> planets_array = new ArrayList<Planet>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] planetName = getResources().getStringArray(R.array.planet_names_array);
        String[] planetData = getResources().getStringArray(R.array.planet_data_array);
        String[] planetDescription = getResources().getStringArray(R.array.planet_description_array);
        int[] planetImages = new int[]{R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupiter, R.drawable.saturn, R.drawable.uranus, R.drawable.neptune};


        planets_array.clear();
        Drawable d;

        for (int i = 0; i < planetImages.length; i++) {
            d = getResources().getDrawable(planetImages[i]);
            planets_array.add(new Planet(planetName[i], planetData[i], planetDescription[i], d));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.main_fragment_grid, container, false);
        Log.i("FragmentWithList","NumberOfPlanets: " + planets_array.size());
        Adapter la = new Adapter(getActivity(),planets_array);
        GridView gv = (GridView) v.findViewById(R.id.gridView);
        gv.setAdapter(la);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("FragmentWithGrid", "Clicked on planet: " + position);
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                PlanetFragment pf = new PlanetFragment();
                Bundle b = new Bundle();
                b.putSerializable("planet", planets_array.get(position));
                pf.setArguments(b);
                ft.replace(R.id.container, pf);
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return v;
    }
}
