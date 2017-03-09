package com.example.rachit.projectmovie.Theatres;

/**
 * Created by rachit on 12/7/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;


import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

import com.example.rachit.projectmovie.R;

public class East extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public East() {
    }

    public East(ExpandableListAdapter listAdapter) {
        this.listAdapter = listAdapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_expandable);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);


        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Cinepolis");
        listDataHeader.add("Cinepolis Fun Cinemas");
        listDataHeader.add("Big Cinema");
        listDataHeader.add("PVR Cinemas");
        listDataHeader.add("Wave Mall Kaushambi");
        listDataHeader.add("Samrat Cinema");
        listDataHeader.add("East Delhi Mall");
        listDataHeader.add("SRS Cinemas");
        listDataHeader.add("Galaxie Multiplex");
        listDataHeader.add("Eros One");



        // Adding child data
        List<String> ac = new ArrayList<String>();
        ac.add("Address: V3S Mall, District Centre, Vikas Marg, Laxmi Nagar, New Delhi, Delhi 110092");

        List<String> lc = new ArrayList<String>();
        lc.add("Address: Maharaja Surajmal Marg, Shahdara, New Delhi, Delhi 110032");

        List<String> rc = new ArrayList<String>();
        rc.add("Address: Plot No. 1, Pacific Mall, Dr Burman Road, Sahibabad, Ghaziabad, Uttar Pradesh 201010");

        List<String> dtc=new ArrayList<String>();
        dtc.add("Address: Plot No.1, EDM Mall, Ghazipur Road, Kaushambi, Ghaziabad, Uttar Pradesh 201010");

        List<String> dc=new ArrayList<String>();
        dc.add("Address: Kaushambi, Ghaziabad, Uttar Pradesh 201012");

        List<String> aca=new ArrayList<String>();
        aca.add("Address: E Block, JJ Colony, Shakurpur, New Delhi, Delhi 110034");

        List<String> acb=new ArrayList<String>();
        acb.add("Address: Plot No.1,Ghazipur Road,Kaushambi, Chaudhary Charan Singh Marg, Ghaziabad, Uttar Pradesh 201001");

        List<String> acc=new ArrayList<String>();
        acc.add("Address: 3rd Floor, Shipra Mall Underpass, Block A, Vaibhav Khand, Indirapuram, Ghaziabad, UP 201010");

        List<String> acd=new ArrayList<String>();
        acd.add("Address: Local Road for JILIT Ltd, Sahibabad Industrial Area Site 4, Sahibabad, Ghaziabad, Uttar Pradesh 201010");

        List<String> ace=new ArrayList<String>();
        ace.add("Address: Jangpura Extension, New Delhi, Delhi 110014");

        listDataChild.put(listDataHeader.get(0), ac); // Header, Child data
        listDataChild.put(listDataHeader.get(1), lc);
        listDataChild.put(listDataHeader.get(2), rc);
        listDataChild.put(listDataHeader.get(3), dtc);
        listDataChild.put(listDataHeader.get(4), dc);
        listDataChild.put(listDataHeader.get(5), aca);
        listDataChild.put(listDataHeader.get(6), acb);
        listDataChild.put(listDataHeader.get(7), acc);
        listDataChild.put(listDataHeader.get(8), acd);
        listDataChild.put(listDataHeader.get(9), ace);

    }
}
