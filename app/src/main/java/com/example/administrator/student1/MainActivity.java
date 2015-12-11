package com.example.administrator.student1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> studentList = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudents();
        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.student_item, studentList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initStudents() {
        Student ssz = new Student("宋姝喆  15级", R.drawable.ssz);
        studentList.add(ssz);
        Student qs=new Student("邱实  15级",R.drawable.qs);
        studentList.add(qs);
        Student zxx=new Student("赵欣薪  15级",R.drawable.zxx);
        studentList.add(zxx);
        Student lhl=new Student("林翰雷  15级",R.drawable.lhl);
        studentList.add(lhl);
        Student sy=new Student("孙玉  15级",R.drawable.sy);
        studentList.add(sy);
        Student ds=new Student("丁森  15级",R.drawable.ds);
        studentList.add(ds);
        Student cy=new Student("陈阳  15级",R.drawable.cy);
        studentList.add(cy);
        Student zhj=new Student("张宏建  15级",R.drawable.zhj);
        studentList.add(zhj);
        Student plx=new Student("庞利雪  15级",R.drawable.plx);
        studentList.add(plx);
        Student ljj=new Student("李佳俊  15级",R.drawable.ljj);
        studentList.add(ljj);
        Student fkx=new Student("樊可欣  15级",R.drawable.fkx);
        studentList.add(fkx);
        Student dy=new Student("丁一  15级",R.drawable.dy);
        studentList.add(dy);
        Student dm=new Student("端木  15级",R.drawable.dm);
        studentList.add(dm);
        Student gzf=new Student("郭泽峰  15级",R.drawable.gzf);
        studentList.add(gzf);
    }
}