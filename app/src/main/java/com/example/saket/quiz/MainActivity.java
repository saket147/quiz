package com.example.saket.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    int a,b,c,d,e,f;
    ArrayList<Question> list;
    Iterator<Question> itr;
    String delhi;

HashMap<String,Integer> hs=new HashMap<String, Integer>();
    HashMap<String,Integer> hs1=new HashMap<String, Integer>();
    TextView tv,tv2;
    Button btn;
    RadioButton op1,op2,op3,op4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //e=hs.put("delhi",1);
        //f=hs.put("panji",2);

        tv=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.txtv3);
        op1=(RadioButton)findViewById(R.id.rbtn1);
        op2=(RadioButton)findViewById(R.id.rbtn2);
        op3=(RadioButton)findViewById(R.id.rbtn3);
        op4=(RadioButton)findViewById(R.id.rbtn4);
        btn=(Button)findViewById(R.id.btn1);



        list=Model.getModel();
        itr=list.iterator();
        if(itr.hasNext())
        {
            Question q= itr.next();
            tv.setText(q.getQues());
            op1.setText(q.getOp1());

           /* op2.setText(q.getOp2());
            op3.setText(q.getOp3());
           */
           // op4.setText(q.getOp4());
        }

    }
    public void status(View v) {


        ToggleButton tb = (ToggleButton) v;
        if (tb.isChecked()) {
            Toast.makeText(getBaseContext(), "ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getBaseContext(), "OFF", Toast.LENGTH_SHORT).show();
        }
        RadioButton rg1 = (RadioButton) findViewById(R.id.rbtn1);
        RadioButton rg2 = (RadioButton) findViewById(R.id.rbtn2);
        RadioButton rg3 = (RadioButton) findViewById(R.id.rbtn3);
        RadioButton rg4 = (RadioButton) findViewById(R.id.rbtn4);


        /*if (rg1.isSelected())
        {
            rg2.isEnabled(false);
            rg3.isEnabled(false);
            rg4.isEnabled(false);


        }*/
    }

    public void next(View view)
    {
        if (itr.hasNext())
        {
            Question q = itr.next();
            tv.setText(q.getQues());
            op1.setText(q.getOp1());
            op2.setText(q.getOp2());
            op3.setText(q.getOp3());
            op4.setText(q.getOp1());
        }
        //* a=hs1.get(op1.getText().toString());
        // b=hs1.get(op2.getText().toString());
        //c=hs1.get(op3.getText().toString());
        //*d=hs1.get(op4.getText().toString());

    }

}

