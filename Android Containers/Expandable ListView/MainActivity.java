package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //Declaración de las variables a usar.//
    HashMap<String, List<String>> myHeader;
    List<String> myChild;
    ExpandableListView expList;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expList = (ExpandableListView) findViewById(R.id.idListView);
        myHeader = MyAdapter.DataProvider.getInfo();
        myChild = new ArrayList<String>(myHeader.keySet());
        adapter = new MyAdapter(this, myHeader, myChild);
        expList.setAdapter(adapter);

    }//Final del primer proceso del ciclo de vida de Android, "OnCreate"//
} //Fin de la clase Main Activity//


class MyAdapter extends BaseExpandableListAdapter {
    private Context ctx;
    private HashMap<String, List<String>> ChildTitles;
    private List<String> HeaderTitles;

    MyAdapter(Context ctx, HashMap<String, List<String>> ChildTitles, List<String> HeaderTitles) {
        this.ctx = ctx;
        this.ChildTitles = ChildTitles;
        this.HeaderTitles = HeaderTitles;
    }

    @Override
    public int getGroupCount() {
        return HeaderTitles.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return ChildTitles.get(HeaderTitles.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return HeaderTitles.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return ChildTitles.get(HeaderTitles.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String title = (String) this.getGroup(i);
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_header, null);
        }
        TextView txt = (TextView) view.findViewById(R.id.idTitle);
        txt.setTypeface(null, Typeface.BOLD);
        txt.setText(title);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String title = (String) this.getChild(i, i1);
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_childitems, null);
        }
        TextView txt = (TextView) view.findViewById(R.id.idChild);
        txt.setText(title);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

    public static class DataProvider {
        public static HashMap<String, List<String>> getInfo() {
            HashMap<String, List<String>> HeaderDetails = new HashMap<String, List<String>>();
            List<String> ChildDetails1 = new ArrayList<String>();
            ChildDetails1.add("This is Children 11");
            ChildDetails1.add("This is Children 12");
            ChildDetails1.add("This is Children 13");
            ChildDetails1.add("This is Children 14");
            List<String> ChildDetails2 = new ArrayList<String>();
            ChildDetails2.add("This is Children 21");
            ChildDetails2.add("This is Children 22");
            ChildDetails2.add("This is Children 23");
            ChildDetails2.add("This is Children 24");
            List<String> ChildDetails3 = new ArrayList<String>();
            ChildDetails3.add("This is Children 31");
            ChildDetails3.add("This is Children 32");
            ChildDetails3.add("This is Children 33");
            ChildDetails3.add("This is Children 34");
            List<String> ChildDetails4 = new ArrayList<String>();
            ChildDetails4.add("This is Children 41");
            ChildDetails4.add("This is Children 42");
            ChildDetails4.add("This is Children 43");
            ChildDetails4.add("This is Children 44");
            HeaderDetails.put("Header 1", ChildDetails1);
            HeaderDetails.put("Header 2", ChildDetails2);
            HeaderDetails.put("Header 3", ChildDetails3);
            HeaderDetails.put("Header 4", ChildDetails4);
            return HeaderDetails;
        }
    }
}