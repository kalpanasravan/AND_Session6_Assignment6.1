package com.kalpana.user.and_session6_assignment61;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleAddition#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleAddition extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public SimpleAddition() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SimpleAddition.
     */
    // TODO: Rename and change types and number of parameters
    public static SimpleAddition newInstance() {
        SimpleAddition fragment = new SimpleAddition();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View view=inflater.inflate(R.layout.simpleaddition, container, false);

        final EditText editText= (EditText) view.findViewById(R.id.editText1);
        final TextView textView=(TextView) view.findViewById(R.id.textView1);

        Button button=(Button) view.findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });

            return view;
        }
    }