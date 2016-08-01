package com.example.saket.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saket on 07-Jul-16.
 */
public class Model {
    public static ArrayList<Question> getModel()
    {
    HashMap<String,Integer> ans=new HashMap<String,Integer>();

        ArrayList<Question> ques = new ArrayList<Question>();



        Question q1 = new Question();
        Question q2 = new Question();
        Question q3 = new Question();
        Question q4 = new Question();


        q1.setQues("India's capital");
        q1.setOp1("delhi");
        q1.setOp2("himachal");
        q1.setOp3("jammu");
        q1.setOp4("shimla");
        ans.put("delhi",1);

        q2.setQues("goa's capital");
        q2.setOp1("delhi");
        q2.setOp2("himachal");
        q2.setOp3("panji");
        q2.setOp4("shimla");
        ans.put("panji",2);

        q3.setQues("Bihar's capital");
        q3.setOp1("delhi");
        q3.setOp2("patna");
        q3.setOp3("jammu");
        q3.setOp4("shimla");
        ans.put("patna",3);

        q4.setQues("jammu capital");
        q4.setOp1("delhi");
        q4.setOp2("himachal");
        q4.setOp3("kashmir");
        q4.setOp4("lucknow");
        ans.put("kashmir",4);

        ques.add(q1);
        ques.add(q2);
        ques.add(q3);
        ques.add(q4);
        return  ques;


    }
}

