    package com.example.indianrailwaycirculars;

    import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

    public class Tab2020 extends ListFragment implements SearchView.OnQueryTextListener, MenuItem.OnActionExpandListener {

        private static final String TAG = "Tab2020";
        View view;
        private Button btnTEST;
        ArrayList<String> players;


        private Context c;
        private ArrayAdapter<String> mAdapter;
     //   List<String> mAllValues;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            c = getActivity();
            setHasOptionsMenu(true);
            getPlayers();

        }


        @Override
        public void onListItemClick(ListView listView, View v, int position, long id) {
            String item = (String) listView.getAdapter().getItem(position);
            if (getActivity() instanceof OnItem1SelectedListener) {
                ((OnItem1SelectedListener) getActivity()).OnItem1SelectedListener(item);
            }
            getFragmentManager().popBackStack();
        }

        @Override
        public void onDetach() {
            super.onDetach();
        }


        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.activity_2020, container, false);
            RecyclerView rv = (RecyclerView) view.findViewById(R.id.reyView);
            //SET ITS PROPETRIES
            rv.setLayoutManager(new LinearLayoutManager(getActivity()));
            rv.setItemAnimator(new DefaultItemAnimator());


            //View layout = inflater.inflate(R.layout.search_fragment,container,false);

           // ListView listView = (ListView) layout.findViewById(android.R.id.list);
            //TextView emptyTextView = (TextView) layout.findViewById(android.R.id.empty);
            //listView.setEmptyView(emptyTextView);
            //return layout;



            //ADAPTER
            final MyAdapter adapter = new MyAdapter(getActivity(), getPlayers());
            rv.setAdapter(adapter);

            return view;
        }

        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
            inflater.inflate(R.menu.years_menu, menu);
            MenuItem searchItem = menu.findItem(R.id.action_search);
            SearchView searchView = (SearchView) searchItem.getActionView();
            searchView.setOnQueryTextListener(this);
            searchView.setQueryHint("Search");

            super.onCreateOptionsMenu(menu, inflater);

            super.onCreateOptionsMenu(menu, inflater);
        }

        @Override
        public boolean onQueryTextSubmit(String query) {
            return true;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            if (newText == null || newText.trim().isEmpty()) {
                resetSearch();
                return false;
            }

            List<String> filteredValues = new ArrayList<String>(players);
            for (String value : players) {
                if (!value.toLowerCase().contains(newText.toLowerCase())) {
                    filteredValues.remove(value);
                }
            }


            mAdapter = new ArrayAdapter<>(c, android.R.layout.simple_list_item_1, filteredValues);
            setListAdapter(mAdapter);

            return false;
        }

        public void resetSearch() {
            mAdapter = new ArrayAdapter<>(c, android.R.layout.simple_list_item_1, players);
            setListAdapter(mAdapter);
        }

        @Override
        public boolean onMenuItemActionExpand(MenuItem item) {
            return true;
        }

        @Override
        public boolean onMenuItemActionCollapse(MenuItem item) {
            return true;
        }

        public interface OnItem1SelectedListener {
            void OnItem1SelectedListener(String item);
        }

         /*void populateList(){

            mAllValues = new ArrayList<>();

            mAllValues.add("Afghanistan");
            mAllValues.add("Åland Islands");
            mAllValues.add("Albania");
            mAllValues.add("Algeria");
            mAllValues.add("American Samoa");
            mAllValues.add("AndorrA");
            mAllValues.add("Angola");

            mAdapter = new ArrayAdapter<>(c, android.R.layout.simple_list_item_1, players);
            setListAdapter(mAdapter);
        }*/

        //ADD PLAYERS TO ARRAYLIST
        private ArrayList<Player> getPlayers() {
                ArrayList<Player> players = new ArrayList<>();


                Player p = new Player();
                p.setcNum("CC-34");
                p.setcSubject("Review of charges realised by Indian Railways for verification of PNR details");
                p.setcDate("18.07.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_34_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-33");
                p.setcSubject("Review of the facilitator scheme");
                p.setcDate("15.07.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_33_15072019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-32");
                p.setcSubject("Re-entrusting of Bid Process Management of Content on Demand Policy Issued vide CC No. 01/2017 dated 10.01.2017 to RailTel");
                p.setcDate("11.07.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC-32_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-31");
                p.setcSubject("Revision of advance reservation period for running of Suvidha trains and special trains on special charges");
                p.setcDate("08.07.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_31_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-30");
                p.setcSubject("Levy of 1% Kerala Flood Cess (KFC) on tickets booked in AC & first class for B2C intra-state taxable supply");
                p.setcDate("26.06.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_30_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-28");
                p.setcSubject("Provision of 5% discount on the total value of basic fare of PRS(reserved) counter ticket on booking of reserved counter through UPI (Unified Payment Interface) including BHIM application");
                p.setcDate("31.05.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_28_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-27");
                p.setcSubject("Fare structure of AC EMU/DEMU/MEMU");
                p.setcDate("30.05.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_27_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-25");
                p.setcSubject("Replacement of printed card tickets (PCTs) with UTS tickets for use at halts.");
                p.setcDate("14.05.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_25_2019.pdf");
                players.add(p);


                p = new Player();
                p.setcNum("CC-24");
                p.setcSubject("Handing over of Retiring room/dormitory to IRCTC.");
                p.setcDate("02.05.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_24_02052019.pdf");
                players.add(p);


                p = new Player();
                p.setcNum("CC-23");
                p.setcSubject("Distribution Plan for Supply of Rail Neer on Mail/Exp. Trains and Stations.");
                p.setcDate("30.04.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC%20No_23%20of%202019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("Addendum to CC-12");
                p.setcSubject("Delegation of Power to Earmarks/Enhance Defence Department Quota (DDQ)");
                p.setcDate("31.01.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/Addendum%20to%20CC_12%20of%202015.pdf");
                players.add(p);


                p = new Player();
                p.setcNum("CC-19");
                p.setcSubject("Engagement of facilitators for issuing of unreserved tickets through ATVMS.");
                p.setcDate("05.04.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/cc%2019%20of%202019_R.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-18");
                p.setcSubject("Online booking of reserved tickets by foreign tourists.");
                p.setcDate("19.03.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_18%20of%202019.pdf");
                players.add(p);


                p = new Player();
                p.setcNum("CC-17");
                p.setcSubject("Change of boarding point");
                p.setcDate("15.03.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/cc%2017%20of%202019_R.pdf");
                players.add(p);


                p = new Player();
                p.setcNum("CC-16");
                p.setcSubject("Facilities for Sahayaks (Licensed Porters)-Uniforms");
                p.setcDate("07.03.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/Commerical%20Circular%20No_16.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-15");
                p.setcSubject("Facilities for Sahayaks (Licensed Porters)");
                p.setcDate("07.03.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/Rest%20Room%20Cooml_No%2015_07032019.pdf");
                players.add(p);


                p = new Player();
                p.setcNum("CC-12");
                p.setcSubject("Implementation of Multi Purpose Stall (MPS) Policy");
                p.setcDate("12.03.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/tourism/CC%20No_12_2019_MPS_Policy_Corrigendum.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-11");
                p.setcSubject("Promotion of unreserved ticket booking through mobile phone");
                p.setcDate("25.02.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/cc%2011%20of%202019_R.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-10");
                p.setcSubject("Rationalisation of menu on Rajdhani/Shatabdi/Duronto Trains.");
                p.setcDate("21.02.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_10_2019_TG_III.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-09");
                p.setcSubject("Revised travel entitlements on Duty Passes, Privilege Passes and Post Retirement Complimentary Passes(PRCPP)");
                p.setcDate("18.02.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/cc%2009%20of%202019_R.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-08");
                p.setcSubject("Fare structure of Train 18 (Vande Bharat Express)");
                p.setcDate("12.02.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC%2008%20of%202019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-06");
                p.setcSubject("Provision of linking of PNRs for two connecting Journeys and cancellation of such tickets and refund of fare rules in case of misconnection of trains");
                p.setcDate("07.02.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_06_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-05");
                p.setcSubject("Management of On-Board Catering Services on Train Set 18.");
                p.setcDate("05.02.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_05_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-04");
                p.setcSubject("Accounting and GST (Goods & Service Tax) process flow in respect of YTSK (Yatri Ticket Suvidha Kendra)");
                p.setcDate("29.01.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_04_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-03");
                p.setcSubject("Modifications in YTSK policy");
                p.setcDate("29.01.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_03_2019.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-02");
                p.setcSubject("Earmarking of accommodation for RPF in Rajdhani/Shatabdi Express Trains.");
                p.setcDate("28.01.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/cc%202%20of%202019_R.pdf");
                players.add(p);

                p = new Player();
                p.setcNum("CC-01");
                p.setcSubject("Discounted fare in Shatabdi trains from Ahmedabad to Vadodara");
                p.setcDate("07.01.2019");
                p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/CC-2019/CC_01_2019.pdf");
                players.add(p);


                /*mAdapter = new ArrayAdapter<>(c, android.R.layout.simple_list_item_1, players);
                setListAdapter(mAdapter);*/

                return players;

        }
    }
