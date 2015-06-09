package se.mah.k3.lecture_4_examples_adapter_extra;

import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentDialog extends DialogFragment {

    public FragmentDialog(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, //Vad som sker när fragmentet skapas.
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog, container, false);

        getDialog().setTitle(getResources().getString(R.string.dialog_title));
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.material_blue_grey_800)));

        return v;
    }

}