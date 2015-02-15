package com.example.shivam.customlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shivam on 2/15/2015.
 */
public class CustomListAdapter extends BaseAdapter {
    /** The inflator used to inflate the XML layout */
    public LayoutInflater inflator;

    /** A list containing some sample data to show. */
    public ArrayList<SampleData> dataList;

    public CustomListAdapter(LayoutInflater inflator){
        super();
        this.inflator=inflator;

        dataList=new ArrayList<SampleData>();
        dataList.add(new SampleData(R.drawable.ic_launcher ,"Shivam", "Software Engg"));
        dataList.add(new SampleData(R.drawable.ic_launcher ,"Shubham", "Designer"));
        dataList.add(new SampleData(R.drawable.ic_launcher ,"Sachan", "Tech. Intern"));
        dataList.add(new SampleData(R.drawable.ic_launcher ,"Akku", "Marketing Head"));
        dataList.add(new SampleData(R.drawable.ic_launcher ,"Mansa", "Brand Ambssdr"));

    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public SampleData getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override

    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflator.inflate(R.layout.rowone, null);
             }

        SampleData data =  getItem(position);

        TextView tv1 = (TextView) view.findViewById(R.id.text1);
        tv1.setText(data.getName());
        ImageView img=(ImageView)view.findViewById(R.id.imageView);
        img.setImageResource(data.getId());
        TextView tv2 = (TextView) view.findViewById(R.id.text2);
        tv2.setText(data.getDetail());

        return view;
    }
}
