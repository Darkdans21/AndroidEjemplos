package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
            view = inflater.inflate(R.layout.custom_childitem, null);
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
            ChildDetails1.add("M1 1101");
            ChildDetails1.add("M1 1102");
            ChildDetails1.add("M1 1103");
            ChildDetails1.add("M1 1104");
            ChildDetails1.add("M1 1105");
            ChildDetails1.add("M1 1106");
            ChildDetails1.add("M1 1107");
            ChildDetails1.add("M1 1107");
            ChildDetails1.add("M1 1201");
            ChildDetails1.add("M1 1202");
            ChildDetails1.add("M1 1203");
            ChildDetails1.add("M1 1204");
            ChildDetails1.add("M1 1205");
            ChildDetails1.add("M1 1206");
            ChildDetails1.add("M1 1207");
            ChildDetails1.add("M1 1301");
            ChildDetails1.add("M1 1302");
            ChildDetails1.add("M1 1303");
            ChildDetails1.add("M1 1304");
            ChildDetails1.add("M1 1305");
            ChildDetails1.add("M1 1306");
            ChildDetails1.add("M1 1307");



            List<String> ChildDetails2 = new ArrayList<String>();
            ChildDetails2.add("M2 1101");
            ChildDetails2.add("M2 1102");
            ChildDetails2.add("M2 1103");
            ChildDetails2.add("M2 1104");
            ChildDetails2.add("M2 1105");
            ChildDetails2.add("M2 1106");
            ChildDetails2.add("M2 1107");
            ChildDetails2.add("M2 1201");
            ChildDetails2.add("M2 1202");
            ChildDetails2.add("M2 1203");
            ChildDetails2.add("M2 1204");
            ChildDetails2.add("M2 1205");
            ChildDetails2.add("M2 1206");
            ChildDetails2.add("M2 1207");
            ChildDetails2.add("M2 1301");
            ChildDetails2.add("M2 1302");
            ChildDetails2.add("M2 1303");
            ChildDetails2.add("M2 1304");
            ChildDetails2.add("M2 1305");
            ChildDetails2.add("M2 1306");
            ChildDetails2.add("M2 1307");

            List<String> ChildDetails3 = new ArrayList<String>();
            ChildDetails3.add("M3 1101");
            ChildDetails3.add("M3 1102");
            ChildDetails3.add("M3 1103");
            ChildDetails3.add("M3 1104");
            ChildDetails3.add("M3 1105");
            ChildDetails3.add("M3 1106");
            ChildDetails3.add("M3 1107");
            ChildDetails3.add("M3 1201");
            ChildDetails3.add("M3 1202");
            ChildDetails3.add("M3 1203");
            ChildDetails3.add("M3 1204");
            ChildDetails3.add("M3 1205");
            ChildDetails3.add("M3 1206");
            ChildDetails3.add("M3 1207");
            ChildDetails3.add("M3 1301");
            ChildDetails3.add("M3 1302");
            ChildDetails3.add("M3 1303");
            ChildDetails3.add("M3 1304");
            ChildDetails3.add("M3 1305");
            ChildDetails3.add("M3 1306");
            ChildDetails3.add("M3 1307");

            List<String> ChildDetails4 = new ArrayList<String>();
            ChildDetails4.add("M4 1101");
            ChildDetails4.add("M4 1102");
            ChildDetails4.add("M4 1103");
            ChildDetails4.add("M4 1104");
            ChildDetails4.add("M4 1105");
            ChildDetails4.add("M4 1106");
            ChildDetails4.add("M4 1107");
            ChildDetails4.add("M4 1201");
            ChildDetails4.add("M4 1202");
            ChildDetails4.add("M4 1203");
            ChildDetails4.add("M4 1204");
            ChildDetails4.add("M4 1205");
            ChildDetails4.add("M4 1206");
            ChildDetails4.add("M4 1207");
            ChildDetails4.add("M4 1301");
            ChildDetails4.add("M4 1302");
            ChildDetails4.add("M4 1303");
            ChildDetails4.add("M4 1304");
            ChildDetails4.add("M4 1305");
            ChildDetails4.add("M4 1306");
            ChildDetails4.add("M4 1307");

            List<String> ChildDetails5 = new ArrayList<String>();
            ChildDetails5.add("M5 1101");
            ChildDetails5.add("M5 1102");
            ChildDetails5.add("M5 1103");
            ChildDetails5.add("M5 1104");
            ChildDetails5.add("M5 1105");
            ChildDetails5.add("M5 1106");
            ChildDetails5.add("M5 1107");
            ChildDetails5.add("M5 1201");
            ChildDetails5.add("M5 1202");
            ChildDetails5.add("M5 1203");
            ChildDetails5.add("M5 1204");
            ChildDetails5.add("M5 1205");
            ChildDetails5.add("M5 1206");
            ChildDetails5.add("M5 1207");
            ChildDetails5.add("M5 1301");
            ChildDetails5.add("M5 1302");
            ChildDetails5.add("M5 1303");
            ChildDetails5.add("M5 1304");
            ChildDetails5.add("M5 1305");
            ChildDetails5.add("M5 1306");
            ChildDetails5.add("M5 1307");

            List<String> ChildDetails6 = new ArrayList<String>();
            ChildDetails6.add("M6 1101");
            ChildDetails6.add("M6 1102");
            ChildDetails6.add("M6 1103");
            ChildDetails6.add("M6 1104");
            ChildDetails6.add("M6 1105");
            ChildDetails6.add("M6 1106");
            ChildDetails6.add("M6 1107");
            ChildDetails6.add("M6 1201");
            ChildDetails6.add("M6 1202");
            ChildDetails6.add("M6 1203");
            ChildDetails6.add("M6 1204");
            ChildDetails6.add("M6 1205");
            ChildDetails6.add("M6 1206");
            ChildDetails6.add("M6 1207");
            ChildDetails6.add("M6 1301");
            ChildDetails6.add("M6 1302");
            ChildDetails6.add("M6 1303");
            ChildDetails6.add("M6 1304");
            ChildDetails6.add("M6 1305");
            ChildDetails6.add("M6 1306");
            ChildDetails6.add("M6 1307");



            HeaderDetails.put(" M6", ChildDetails6);

            HeaderDetails.put(" M4", ChildDetails4);

            HeaderDetails.put(" M3", ChildDetails3);

            HeaderDetails.put(" M5", ChildDetails5);

            HeaderDetails.put(" M2", ChildDetails2);
            HeaderDetails.put(" M1", ChildDetails1);





            return HeaderDetails;
        }
    }
}