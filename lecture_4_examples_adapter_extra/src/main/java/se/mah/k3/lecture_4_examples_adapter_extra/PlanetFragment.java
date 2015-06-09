package se.mah.k3.lecture_4_examples_adapter_extra;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */

    public class PlanetFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_planet, container, false);

            Planet p = (Planet) getArguments().getSerializable("planet");
            TextView tv_title = (TextView) v.findViewById(R.id.tv_planet_title);
            tv_title.setText(p.getName());
            TextView tv_description = (TextView) v.findViewById(R.id.tv_planet_description);
            tv_description.setText(p.getDescription());
            TextView tv_data = (TextView) v.findViewById(R.id.tv_planet_data);
            tv_data.setText(p.getData());
            ImageView iv = (ImageView) v.findViewById(R.id.iv_planet);
            iv.setImageDrawable(p.getImage());

            return v;
        }
    }