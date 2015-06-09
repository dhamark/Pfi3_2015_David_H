package se.mah.k3.lecture_4_examples_adapter_extra;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David on 15-05-12.
 */
public class Adapter extends ArrayAdapter<Planet> {

    ArrayList<Planet> planetsList;
    Context c;

    public Adapter(Context context, ArrayList<Planet> planetsList) {
        super(context, 0, planetsList);
        this.planetsList = planetsList;
        this.c = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("GridFragment", "Called for position: " + position);
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.grid_item,null);
        Planet b = planetsList.get(position);
        TextView tv = (TextView) convertView.findViewById(R.id.planetTitle);
        ImageView iv = (ImageView) convertView.findViewById(R.id.planetImage);
        tv.setText(b.getName());
        iv.setImageDrawable(b.getImage());
        return convertView;
    }
}
