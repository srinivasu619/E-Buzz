package com.example.rachit.projectmovie.Theatres;

/**
 * Created by rachit on 12/7/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;

import android.widget.ExpandableListView;


import com.example.rachit.projectmovie.R;

public class South extends Activity {


    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public South() {
    }

    public South(ExpandableListAdapter listAdapter) {
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
        listDataHeader.add("PVR 3C's");
        listDataHeader.add("PVR Cinemas");
        listDataHeader.add("DT Cinemas");
        listDataHeader.add("Eros One");
        listDataHeader.add("PVR Ambience");
        listDataHeader.add("M Cinemas");
        listDataHeader.add("Sapna Cinema hall");
        listDataHeader.add("PVR Ltd");
        listDataHeader.add("PVR Sangam");
        listDataHeader.add("PVR Select CityWalk");


        // Adding child data
        List<String> ac = new ArrayList<String>();
        ac.add("Address: Lajpat Nagar, New Delhi, Delhi 110024");


        List<String> lc = new ArrayList<String>();
        lc.add("Address: 1, Community Center, Saket, New Delhi, Delhi 110017");


        List<String> rc = new ArrayList<String>();
        rc.add("Address: Part, Greater Kailash Hotel and Lounge, 514, Outer Ring Rd, Block E, Greater Kailash II, Greater Kailash, New Delhi, Delhi 110048");

        List<String> dtc=new ArrayList<String>();
        dtc.add("Address: Jangpura Extension, New Delhi, Delhi 110014");

        List<String> dc=new ArrayList<String>();
        dc.add("Address: 3rd Floor, Ambience Mall, N H-8, DLF City Phase 3, Gurgaon, Haryana 122002");

        List<String> ipn=new ArrayList<String>();
        ipn.add("Address: 54, Community Center, East of kailash, New Delhi, Delhi 110065");

        List<String> ipn1=new ArrayList<String>();
        ipn1.add("Address: Community Center, East Of Kailash, New Delhi, Delhi, D Block, East of Kailash, New Delhi, Delhi 110048");

        List<String> ipn2=new ArrayList<String>();
        ipn2.add("Address: Building No.9, Block A, 4th Floor, DLF Phase 3, Gurgaon, Haryana 122002");

        List<String> ipn3=new ArrayList<String>();
        ipn3.add("Address: Major Somnath Marg, Sector 9, R K Puram, New Delhi, Delhi 110022");

        List<String> ipn4=new ArrayList<String>();
        ipn4.add("Address: Select Citywalk Mall, District Centre, Saket, New Delhi, Delhi 110017");





        listDataChild.put(listDataHeader.get(0), ac); // Header, Child data
        listDataChild.put(listDataHeader.get(1), lc);
        listDataChild.put(listDataHeader.get(2), rc);
        listDataChild.put(listDataHeader.get(3), dtc);
        listDataChild.put(listDataHeader.get(4), dc);
        listDataChild.put(listDataHeader.get(5), ipn);
        listDataChild.put(listDataHeader.get(6), ipn1);
        listDataChild.put(listDataHeader.get(7), ipn2);
        listDataChild.put(listDataHeader.get(8), ipn3);
        listDataChild.put(listDataHeader.get(9), ipn4);


    }
}