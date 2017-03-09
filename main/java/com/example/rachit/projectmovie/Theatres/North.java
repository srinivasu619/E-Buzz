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

public class North extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public North() {
    }

    public North(ExpandableListAdapter listAdapter) {
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
        listDataHeader.add("Amba Cinema");
        listDataHeader.add("Liberty Cinema");
        listDataHeader.add("Ritz Cinema");
        listDataHeader.add("DT Cinema");
        listDataHeader.add("Delite Cinema");
        listDataHeader.add("Inox Patel Nagar");
        listDataHeader.add("M2K Cinemas");
        listDataHeader.add("G3S Cinemas");
        listDataHeader.add("M2K");
        listDataHeader.add("PVR Prashant Vihar");


        // Adding child data
        List<String> ac = new ArrayList<String>();
        ac.add("Address: Ghanta Ghar, GT Rd, Block F, New Delhi, Delhi 110007");


        List<String> lc = new ArrayList<String>();
        lc.add("Address: 19-B, New Rohtak Road, Karol Bagh, New Delhi, Delhi 110005");


        List<String> rc = new ArrayList<String>();
        rc.add("Address: Lothian Rd, Inter State Bus Terminal, Kashmere Gate, New Delhi, Delhi 110006");

        List<String> dtc=new ArrayList<String>();
        dtc.add("Address: 4th floor, A-Block, Community Centre, Shalimar Bagh, New Delhi, Delhi 110088");

        List<String> dc=new ArrayList<String>();
        dc.add("Address: Gate No. 4/1, Asaf Ali Road, Delhi Gate, New Delhi, Delhi 110002");

        List<String> ipn=new ArrayList<String>();
        ipn.add("Address: Behind Shadipur Metro Station, Patel Nagar, New Delhi, Delhi 110008");

        List<String> m2k=new ArrayList<String>();
        m2k.add("Address: Road No.44, Community Centre, Rani Bagh, Pitampura, New Delhi, Delhi 110034");

        List<String> m2k1=new ArrayList<String>();
        m2k1.add("Address: 6, 2nd Floor, Garg Trade Centre, Sector 11, Near HDFC Bank, Rohini, New Delhi, Delhi 110085");

        List<String> m2k2=new ArrayList<String>();
        m2k2.add("Address: 16 Mangalam Place District Centre, Sector-3, Rohini, New Delhi, Delhi 110085");

        List<String> m2k3=new ArrayList<String>();
        m2k3.add("Address: Prashant Vihar, Funcity Mall, 2nd Floor, Sector 14, New Delhi, Delhi 110085");


        listDataChild.put(listDataHeader.get(0), ac); // Header, Child data
        listDataChild.put(listDataHeader.get(1), lc);
        listDataChild.put(listDataHeader.get(2), rc);
        listDataChild.put(listDataHeader.get(3), dtc);
        listDataChild.put(listDataHeader.get(4), dc);
        listDataChild.put(listDataHeader.get(5), ipn);
        listDataChild.put(listDataHeader.get(6), m2k);
        listDataChild.put(listDataHeader.get(7), m2k1);
        listDataChild.put(listDataHeader.get(8), m2k2);
        listDataChild.put(listDataHeader.get(9), m2k3);


    }
}
