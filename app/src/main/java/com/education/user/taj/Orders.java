package com.education.user.taj;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Orders extends Fragment   {

    View view;
    private ImageButton  table1,table2,table3;
    public Orders() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_orders, container, false);
        table1=(ImageButton)view.findViewById(R.id.table1_order);
        table2=(ImageButton)view.findViewById(R.id.table2_order);
        table3=(ImageButton)view.findViewById(R.id.table3_order);
        getActivity().setTitle("Orders");
        onClick();
        return view;
    }
    public void onClick(){

        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neworder();
            }
        });
        table2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neworder();
            }
        });
        table3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neworder();
            }
        });


    }

    public void neworder(){

        Fragment Neworder = new Neworder();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container6,Neworder);
        fragmentTransaction.commit();


    }


}
