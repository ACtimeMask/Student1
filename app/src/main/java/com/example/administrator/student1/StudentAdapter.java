package com.example.administrator.student1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2015/12/11.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;
    public StudentAdapter(Context context,int textViewResourceId,List<Student>objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parents){
        Student student=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView studentImage=(ImageView)view.findViewById(R.id.student_image);
        TextView studentName=(TextView)view.findViewById(R.id.student_name);
        studentImage.setImageResource(student.getImageId());
        studentName.setText(student.getName());
        return view;
    }
}
