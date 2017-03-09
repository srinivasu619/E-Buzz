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

public class West extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public West() {
    }

    public West(ExpandableListAdapter listAdapter) {
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
        listDataHeader.add("WAVE Cinemas");
        listDataHeader.add("Liberty Cinema");
        listDataHeader.add("Movie Time Multiplex");
        listDataHeader.add("Satyam Janak Place");
        listDataHeader.add("M2K Rohini");
        listDataHeader.add("G3S Cinemas");
        listDataHeader.add("Amba Cinema");
        listDataHeader.add("Miraj Cinemas");
        listDataHeader.add("Milan Cinema");
        listDataHeader.add("PVR Vikaspuri");



        // Adding child data
        List<String> ac = new ArrayList<String>();
        ac.add("Address: Wave Infratech Pvt. Ltd., TDI Paragon Mall, Plot No., 2, Raja Garden, Shivaji Place, New Delhi, Delhi 110027");

        List<String> lc = new ArrayList<String>();
        lc.add("Address: 19-B, New Rohtak Road, Karol Bagh, New Delhi, Delhi 110005");

        List<String> rc = new ArrayList<String>();
        rc.add("Address: WESTGATE MALL RAJOURI GARDEN, NEW DELHI, New Delhi, Delhi 110027");

        List<String> dtc=new ArrayList<String>();
        dtc.add("Address: Janakpuri District Center, Janakpuri, New Delhi, Delhi 110008");

        List<String> dc=new ArrayList<String>();
        dc.add("Address: 16 Mangalam Place District Centre, Sector-3, Rohini, New Delhi, Delhi 110085");

        List<String> ipn=new ArrayList<String>();
        ipn.add("Address: 6, 2nd Floor, Garg Trade Centre, Sector 11, Near HDFC Bank, Rohini, New Delhi, Delhi 110085");

        List<String> ipn1=new ArrayList<String>();
        ipn1.add("Address: Ghanta Ghar, GT Rd, Block F, New Delhi, Delhi 110007");

        List<String> ipn2=new ArrayList<String>();
        ipn2.add("Address: S26, Ajay Enclave, Meenakshi Garden, Subhash Nagar, New Delhi, Delhi 110018");

        List<String> ipn3=new ArrayList<String>();
        ipn3.add("Address: Plot No-1, Najafgarh Road, Karampura, Behind Police Station, New Delhi, Delhi 110015");

        List<String> ipn4 = new ArrayList<String>();
        ipn4.add("Address: G1 Community Centre, Vikaspuri, New Delhi, Delhi 110018");



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
