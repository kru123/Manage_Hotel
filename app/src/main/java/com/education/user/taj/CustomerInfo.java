package com.education.user.taj;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerInfo extends Fragment {
    SqlHandler sqlHandler;
    View view;
    private static EditText name, mobile;
    private static String ename;
    private static Button submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_customer_info, container, false);
        sqlHandler = new SqlHandler(getContext());
        name = (EditText) view.findViewById(R.id.editText);
        ename=name.getText().toString();
        getActivity().setTitle("Customer Info");
      //  mobile = (EditText) view.findViewById(R.id.editText1);
       // final int emobile= Integer.parseInt(mobile.getText().toString().trim());
        submit = (Button) view.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlHandler.onInsert(ename);
                Toast.makeText(getContext(), " Successfully Saved ", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
