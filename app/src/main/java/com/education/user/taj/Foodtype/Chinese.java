package com.education.user.taj.Foodtype;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.education.user.taj.R;
import com.github.clans.fab.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Chinese extends Fragment {

    private CheckBox chinese_checkbox1,chinese_checkbox2,chinese_checkbox3,chinese_checkbox4,chinese_checkbox5;
    EditText chinese_edittext1,chinese_edittext2,chinese_edittext3,chinese_edittext4,chinese_edittext5;
    Button add_item1,add_item2, add_item3,add_item4,sub_item1,sub_item2,sub_item3,Confirm;
    int q1,q2,q3;
    View view;



    public Chinese() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_chinese, container, false);
        chinese_checkbox1=(CheckBox)view.findViewById(R.id.noodles_checkbox1);
        chinese_checkbox2=(CheckBox)view.findViewById(R.id.noodles_checkbox2);
        chinese_checkbox3=(CheckBox)view.findViewById(R.id.noodles_checkbox3);
        chinese_checkbox4=(CheckBox)view.findViewById(R.id.noodles_checkbox4);
        chinese_checkbox5=(CheckBox)view.findViewById(R.id.noodles_checkbox5);
        chinese_edittext1=(EditText)view.findViewById(R.id.noodles_edittext1);
        q1=chinese_edittext1.getInputType();
        chinese_edittext2=(EditText)view.findViewById(R.id.noodles_editext2);
        q2=chinese_edittext2.getInputType();
        chinese_edittext3=(EditText)view.findViewById(R.id.noodles_editext3);
        q3=chinese_edittext3.getInputType();
        add_item1=(Button)view.findViewById(R.id.add_item_1);
        add_item2=(Button)view.findViewById(R.id.add_item_2);
        add_item3=(Button)view.findViewById(R.id.add_item_3);
        sub_item1=(Button)view.findViewById(R.id.sub_item_1);
        sub_item2=(Button)view.findViewById(R.id.sub_item_2);
        sub_item3=(Button)view.findViewById(R.id.sub_item_3);
         Confirm=(Button)view.findViewById(R.id.confirm1);


        //Methods for performing addition and substraction are called here
        add_item1();
        sub_item1();
        add_item2();
        sub_item2();



        //Listener for confirm button in Chinese Menu

        Confirm.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                 int totalamount1=0;
                 int totalamount2=0;
                 int totalamount3=0;
                 int grandtotal=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(chinese_checkbox1.isChecked()){
                    {

                        result.append("\nNoodles = 100Rs/each");
                        totalamount1 += (100*q1);
                        grandtotal=totalamount1;

                    }
                }
                if(chinese_checkbox2.isChecked()){
                    result.append("\nNoodles 2 50Rs");
                    totalamount2+=(50*q2);
                    grandtotal=totalamount1+totalamount2;

                }
                if(chinese_checkbox3.isChecked()){
                    result.append("\nNoodles 3 120Rs");
                    totalamount3+=(120*q3);
                    grandtotal=totalamount1+totalamount2+totalamount3;

                }
                result.append("\nTotal: "+grandtotal+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getActivity(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
        return view;
    }




    //Method to add value i.e plus 1 when add button is pressed for menu 1
    public void add_item1() {
        add_item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                q1 += 1;
                chinese_edittext1.setText("" + (q1));

            }

        });
    }



    //Method to minus value i.e minus 1 when minus button is pressed for menu 1
    public void sub_item1(){
        sub_item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1 -= 1;
                chinese_edittext1.setText("" + (q1));
            }
        });


    }



    //Method to add value i.e plus 1 when add button is pressed for menu 2
     public void add_item2() {
        add_item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                q2+=1;
                chinese_edittext2.setText(""+(q2));


            }

        });


    }



    //Method to minus value i.e minus 1 when minus button is pressed for menu 2
    public void sub_item2(){
        sub_item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q2 -= 1;
                chinese_edittext2.setText("" + (q2));
            }
        });


    }

}
