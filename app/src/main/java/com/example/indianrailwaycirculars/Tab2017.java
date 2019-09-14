package com.example.indianrailwaycirculars;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Tab2017 extends Fragment {

    private static final String TAG = "Tab2017";
    View view;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_2017,container,false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.reyView);
        //SET ITS PROPETRIES
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        final MyAdapter adapter = new MyAdapter(getActivity(), getPlayers());
        rv.setAdapter(adapter);

        return view;
    }

    private ArrayList<Player> getPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        Player  p = new Player();


        p.setcNum("CC-86");
        p.setcSubject("Discounted fare in Shatabdi trains from Ahmedabad to Vadodara");
        p.setcDate("05.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 86 of 2017.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-85");
        p.setcSubject("Fare structure of AC EMU");
        p.setcDate("22.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 85 of 2017.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-84");
        p.setcSubject("Fare structure of Anubhuti Coach");
        p.setcDate("22.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 84 of 2017.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-83");
        p.setcSubject("Revision of Cloak Room and Locker Charges");
        p.setcDate("21.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_83_2017.pdf");

 

        players.add(p);

        p = new Player();
        p.setcNum("CC-82");
        p.setcSubject("Review of Flexi Fare System in Rajdhani/Shatabdi/Duronto trains");
        p.setcDate("19.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 82.pdf");
        players.add(p);
        
        p = new Player();
        p.setcNum("CC-81");
        p.setcSubject("Clarification on Booking of YTSK tickets through telephone.");
        p.setcDate("07.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_81_2017.pdf");
        players.add(p);
        
        p = new Player();
        p.setcNum("CC-80");
        p.setcSubject("Enhancement of Mela surcharge for Mahamastakabhisheka. Mela and delegation of power to decide Mela Surcharge");
        p.setcDate("12.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 80 of 2017.pdf");

        players.add(p);
        p = new Player();
        p.setcNum("CC-79");
        p.setcSubject("Applicability of GST of static Catering Services.");
        p.setcDate("01.12.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_79_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-78");
        p.setcSubject("Fare structure of Special train run with the lieover of Humsafar Rake");
        p.setcDate("29.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 78 of 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-77");
        p.setcSubject("Restoration of Concession on the certificate issued by Basketball Federation of India");
        p.setcDate("28.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_77_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-76");
        p.setcSubject("provision of CUG facility to ticket checking staff.");
        p.setcDate("21.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_76_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-75");
        p.setcSubject("procedure for booking and refund of the UTS/PRS ticket booked using UPI and accountable of the revenue.");
        p.setcDate("17.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_75_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-74");
        p.setcSubject("Concession to sports persons");
        p.setcDate("10.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 74 of 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-73");
        p.setcSubject("Sportsmen participating in tournaments/Championships organised by Fencing Association of India");
        p.setcDate(" 07.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 73 of 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-72");
        p.setcSubject("provision of Seats for TTEs/Conductors");
        p.setcDate("02.11.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_72_2017_F.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-71");
        p.setcSubject("Allotment of Bookstalls to Philanthropic and Social Organizations.");
        p.setcDate("17.10.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC-71_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-70");
        p.setcSubject("Modification in reservation/cancellation requisition form.");
        p.setcDate("17.10.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/70_2017_R.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-69");
        p.setcSubject("Running of Hazrat Nizamuddin-Bandra Terminus Special Rajdhani Express");
        p.setcDate("43021");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_69_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-68");
        p.setcSubject("Discounted fare in Shatabdi trains from Ahmedabad to Vadodara and from New Jalpaiguri to Malda Town");
        p.setcDate("09.10.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 68 of 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-67");
        p.setcSubject("parameters of thermal stationery used in unreserved tickets");
        p.setcDate("11.10.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CCNo__67_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-66");
        p.setcSubject("Complementary Card Passes issued on gallantry account to receipients of Ashok Chakra and Kirti Chakra Awards");
        p.setcDate("13.10.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/cc 66 of 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-65");
        p.setcSubject("provision of discount of 0.5% to customers of suburban sections on booking of season tickets when payment is made through digital means");
        p.setcDate("29.09.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 65 of 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-64");
        p.setcSubject("Issue of photo ID card to persons with disabilities (Divyangjan)");
        p.setcDate("29.09.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_64_2017.pdf");


        players.add(p); p = new Player();
        p.setcNum("CC-63 ");
        p.setcSubject("printing of option of catering on Reservation Requisition Form for Rajdhani/Shatabdi/Duronto Trains");
        p.setcDate("05.10.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_63_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-62");
        p.setcSubject("Accepting m-Aadhaar as one of the prescribed proofs of identity.");
        p.setcDate("08.09.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/62_2017_R.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-61");
        p.setcSubject("Multi Purpose Stall (MPS) Policy");
        p.setcDate("05.09.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_61_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-60");
        p.setcSubject("provision of Sleeping accomodation in middle berths of 3 tier sleeper coaches- Amendments to para 652 of Indian Railway Commercial Mannual, Vol-I.");
        p.setcDate("31.08.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_60_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-59");
        p.setcSubject("Introduction of give up scheme for the concession to senior citizens and rationalization of scheme of senior citizen concession.");
        p.setcDate("09.08.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_59_2017.pdf");


        players.add(p); p = new Player();
        p.setcNum("CC-58");
        p.setcSubject("Concession to sports persons.");
        p.setcDate("01.08.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_58_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-57");
        p.setcSubject("Extension of Memorandum of Understanding )MoU) signed between Ministry of Railways and Department of Posts for issuing of reserved tickets through Computerized Passenger Reservation System (PRS) terminals provided in Post Offices.");
        p.setcDate("31.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_57_2017(1).pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-56");
        p.setcSubject("Levy of GST on charges for verification of journey details");
        p.setcDate("02.08.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_56_2017_Bi.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-55");
        p.setcSubject("Clarification regarding Yatri Ticket Suvidha Kendra (YTSK)s.");
        p.setcDate("21.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_55_2017_B.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-54");
        p.setcSubject("Booking of Reserved tickets by Foreign Tourists online");
        p.setcDate("19.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/cc 54 2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("Addendumdated 24.04.2018");
        p.setcSubject("");
        p.setcDate("");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/Addendum_CC_54_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-53");
        p.setcSubject("Earmarking of reservation quota for persons with disabilities in 3AC classes");
        p.setcDate("14.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/53_2017_R.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-52");
        p.setcSubject("Fare structure of Mahamana Express");
        p.setcDate("12.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 52.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-51");
        p.setcSubject("Introduction of give up scheme for Senior Citizens availing concession in passenger fare");
        p.setcDate("11.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 51.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-50");
        p.setcSubject("policy on Rail Display Network");
        p.setcDate("11.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_50_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-49");
        p.setcSubject("Implementation of Goods & Service Tax (GST) on transportation of passenger by rail.");
        p.setcDate("05.07.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_49_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-48");
        p.setcSubject("Applicabality of GST on Standard Items.");
        p.setcDate("30.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_48_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-47");
        p.setcSubject("provision of discount of 0.5% to customers of suburban sections on booking of season tickets when payment is made through digital means");
        p.setcDate("30.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 47.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-46");
        p.setcSubject("Realisation of Goods and Services Tax (GST) on Excess Fare Tickets (EFTs).");
        p.setcDate("30.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/46_30082017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-45");
        p.setcSubject("Implementation of GST on YTSK");
        p.setcDate("29.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_45_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-44");
        p.setcSubject("Applicability of GST on Catering Services");
        p.setcDate("29.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_44_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-42");
        p.setcSubject("Review of Flexi Fare System in Rajdhani/Shatabdi/Duronto trains");
        p.setcDate("28.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC 42.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-41");
        p.setcSubject("Implementation of Goods & Services Tax (GST) on transportation of passenger by rail.");
        p.setcDate("23.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_41_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-40");
        p.setcSubject("Earmarking of reservation quota for Physically Handicapped person in 3AC Classes.");
        p.setcDate("22.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_40_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-39");
        p.setcSubject("Revision of duty list of train conductors in 1AC, 2AC, 3AC and 1st Class");
        p.setcDate("08.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CCdutylist.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-38");
        p.setcSubject("Clarification on engaging Station Ticket Booking Agents(STBA)");
        p.setcDate("08.06.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CCno_38_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-37");
        p.setcSubject("Amendment in the para 2406(b) of chapter XXIV of IRCM Volume-II");
        p.setcDate("29.05.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_37_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-36");
        p.setcSubject("provision of bulk booking in Rajdhani, Shatabdi, Duronto and Humsafar trains");
        p.setcDate("26.05.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_36_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-35");
        p.setcSubject("Accepting e-aadhaar as one of the prescribed proofs of identity.");
        p.setcDate("23.05.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/35_2017_R.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-33");
        p.setcSubject("Fare structure of Tejas Express");
        p.setcDate("19.05.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_33_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-32");
        p.setcSubject("Declaration of Private cash by staff before taking up duty");
        p.setcDate("17.05.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_32_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-31");
        p.setcSubject("Applicability of rebate of 10% on cluster journey tickets after preparation of first chart");
        p.setcDate("09.05.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_31_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-30");
        p.setcSubject("No berth option for child passenger & minimum distance for charge in such cases");
        p.setcDate("24.04.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_30_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-29");
        p.setcSubject("provision of discount of 0.5% to customers of suburban sections on booking of season tickets when payment is made through digital means");
        p.setcDate("24.04.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_29_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-28");
        p.setcSubject("provision of travel Concession to Patients – when travelling in Jan Shatabdi Express trains");
        p.setcDate("21.04.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_ 28_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-27");
        p.setcSubject("promotion of Digital & Cashless Transaction-provision of 5% discount for digital payment of catering services on Indian Railways.");
        p.setcDate("21.04.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_27_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-26");
        p.setcSubject("Bharat Darshan Trains/Aastha Circuit Trains");
        p.setcDate("13.04.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_26_2017.pdf");


        players.add(p); p = new Player();
        p.setcNum("CC-25");
        p.setcSubject("Appointment of facilitators for issuring of unreserved tickets through ATVMs");
        p.setcDate("30.03.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CCno_25_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-24");
        p.setcSubject("Revision of Rate of Mela Surcharge");
        p.setcDate("24.03.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_24_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-23");
        p.setcSubject("Acceptance of Railway dues/receipts through RTGS/NEFT-Procedure regarding transfer of funds by YTSK to railway account.");
        p.setcDate("28.03.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CCno_23of2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-22");
        p.setcSubject("Judgement delivered by Hon'ble Supreme Court on 29/01/2016 in Civil Appeal No. 618-620/2016 { SLP (C) No. 9921-23/2014}- Sr. Divisional Commercial Manager & Ors. Vs SCR Caterers, Dry Fruits Juice Stalls Welfare Assn. & Anr.");
        p.setcDate("15.03.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_22_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-21");
        p.setcSubject("procedure regarding accounting of revenue of PRS and UTS tickets/parcel/goods for which payment has been made through POS.");
        p.setcDate("07.03.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_21_080317.pdf");


        players.add(p); p = new Player();
        p.setcNum("CC-20");
        p.setcSubject("Catering Policy 2017");
        p.setcDate("27.02.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/tourism/downloads/CC_20_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-19");
        p.setcSubject("Fare structure of Antyodaya Express");
        p.setcDate("24.02.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_19_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-18");
        p.setcSubject("Extension of Magisterial Scheme for check and prevention of ticketless travel");
        p.setcDate("17.02.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_18_05042017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-17");
        p.setcSubject("Concession to Bharat Scouts & Guides");
        p.setcDate("13.02.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_ 17_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-16");
        p.setcSubject("provision of discount of 0.5% to customers of suburban sections on booking of season tickets when payment is made through digital means");
        p.setcDate("07.02.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC-16_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-14");
        p.setcSubject("Facility of change of name on concessional tickets.");
        p.setcDate("31.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_14_2016.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-13");
        p.setcSubject("Revised specification (Jan 2017) for thermal paper for ATVM Printers.");
        p.setcDate("30.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_13_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-12");
        p.setcSubject("procedure regarding refund/Cancellation of PRS and UTS tickets booked through POS.");
        p.setcDate("19.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_12_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-11");
        p.setcSubject("Checking of tickets during night time in reserved coaches.");
        p.setcDate("27.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_11_05042017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-09");
        p.setcSubject("Holding of meeting ZRUCC/DRUCC or Divisional Committee in respect of States areas where model code of conduct is in vogue");
        p.setcDate("13.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_09_2017(1).pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-08");
        p.setcSubject("Steps to be taken to generate MIS reports for ticket booking through Point of Sale (POS) machine.");
        p.setcDate("12.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_08_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-07");
        p.setcSubject("Restoration of Concession on the certificate issued by Boxing Federation of India");
        p.setcDate("11.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_07_2016.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-06");
        p.setcSubject("Withdrawal of distance restrictions in mail/express trains for issue of tickets over Indian Railways");
        p.setcDate("05.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_06_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-05");
        p.setcSubject("policy on advertisement through Mobile Assets.");
        p.setcDate("10.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_05_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-04");
        p.setcSubject("policy on out of Home Advertising.");
        p.setcDate("10.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_04_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-03");
        p.setcSubject("policy on Automated Teller Machines (ATM) on Stations.");
        p.setcDate("10.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_03_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-02");
        p.setcSubject("policy on Unsolicited Non-Fare Revenue Proposals.");
        p.setcDate("10.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_02_2017.pdf");

        players.add(p); p = new Player();
        p.setcNum("CC-01");
        p.setcSubject("policy on Content on Demand");
        p.setcDate("10.01.2017");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/CC_01_2017.pdf");


        






        return players;
    }
}


