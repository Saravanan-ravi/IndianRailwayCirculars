package com.example.indianrailwaycirculars;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Tab2015 extends Fragment {

    private static final String TAG = "Tab2015";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_2015, container, false);

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
        Player p = new Player();

        p = new Player();
        p.setcNum("CC 74");
        p.setcSubject("Booking of Retiring Rooms through IRCTC Website");
        p.setcDate("17.12.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_74_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-73");
        p.setcSubject("Booking of ticket by giving full name.");
        p.setcDate("17.12.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-No_73_Bilingual.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-72");
        p.setcSubject("Selection of Station as Adarsh Station.");
        p.setcDate("01.01.2016");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-72.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-71");
        p.setcSubject("Revision in the Rule 211 of IRCA Coaching Tariff No. 26 Part I (Vol. I): Fare for children.");
        p.setcDate("02.12.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_71_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-70");
        p.setcSubject("Enabling of one of the UTS counter into UTS cum PRS counter at stations only for refund of PRS tickets purchased from counters (PRS counter ticket).");
        p.setcDate("24.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_70_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Corrigendum to CC-04");
        p.setcSubject("Go India Smart Card Scheme");
        p.setcDate("19.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/Corri_CC-04.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-69");
        p.setcSubject("Revision of minimum chargeable passenger fare of second class (non-suburban) w.e.f 22.11.2015");
        p.setcDate("18.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_69_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-68");
        p.setcSubject("Levy of  Swachh Bharat cess on the service tax leviable on transportation");
        p.setcDate("13.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/cc no.68.pdf");
        players.add(p);


        p = new Player();
        p.setcNum("CC-67");
        p.setcSubject("Allotment of berths under physically handicapped quota.");
        p.setcDate("16.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_67_Bilingual.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-66");
        p.setcSubject("Rationalisation of computerised Passenger Reservation System (PRS).");
        p.setcDate("06.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_66_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-65");
        p.setcSubject("Gazette notification on amendments in the certain provisions of Refund Rules-Comprehensive Refund Rule.");
        p.setcDate("06.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_65_15.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-64");
        p.setcSubject("Draft Gazette Notification-Refund Rule");
        p.setcDate("05.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_64_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-63");
        p.setcSubject("Amendment in Note (2) of Rule no. 401.2 (a)  of IRCA Coaching Tariff No. 26 Part I (Volume I) under the head charges for running of special trains.");
        p.setcDate("05.11.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_63_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-62");
        p.setcSubject("Preparation of reservation charts.");
        p.setcDate("14.10.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_62_Bilingual.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-61");
        p.setcSubject("Introduction of Alternate Train Accomodation Scheme-VIKALP");
        p.setcDate("14.10.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-No_61_Bilingual.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-60");
        p.setcSubject("Introduction of unreserved ticketing through mobile phone including paperless ticketing.");
        p.setcDate("09.10.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-60_Bil.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-59");
        p.setcSubject("Clarification regarding Yatri Ticket Suvidha Kendra (YTSK)");
        p.setcDate("13.10.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_59_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-58");
        p.setcSubject("Change in timings for booking through internet");
        p.setcDate("18.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/58-2015-Bil.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-57");
        p.setcSubject("Instructions for implementation of 'Station Based E-Catering' on IR.");
        p.setcDate("16.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_57_20151.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-56");
        p.setcSubject("Harassment to ticket checking staff by authorities when theft/pilferage take place in running trains.");
        p.setcDate("11.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/56_2015_merged.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-55");
        p.setcSubject("Running of Special Trains");
        p.setcDate("10.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/cc 55.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-54");
        p.setcSubject("Earmarking of separate reservation counters for ladies.");
        p.setcDate("11.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_54_2016.pdf");
        players.add(p);


        p = new Player();
        p.setcNum("CC-53");
        p.setcSubject("Engagement of Station Ticket Booking Agents (STBAs) Scheme at 'E' Category Stations.");
        p.setcDate("03.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_53_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-52");
        p.setcSubject("Model Procedure order for the use and opeation of Cash-Coin operated ATVMs.");
        p.setcDate("02.09.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_52_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-51");
        p.setcSubject("Earmarking of reservation quota for women and senior citizens.");
        p.setcDate("31.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-51_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-50");
        p.setcSubject("Bharat Darshan Train");
        p.setcDate("27.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-50-2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-49");
        p.setcSubject("Allowing ticket checking staff to permit the passengers to board suvidha express in case vacant accommodation is still available after the stopping of booking  at current reservation counter.");
        p.setcDate("25.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_49_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-48");
        p.setcSubject("Allowing waitlisted passengers in Suvidha trains.");
        p.setcDate("26.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_48.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-47");
        p.setcSubject("Announcement to be made in the trains having public address system.");
        p.setcDate("31.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_47_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-46");
        p.setcSubject("Utilisation of station receipts for departmental expenditure");
        p.setcDate("20.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-46.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-45");
        p.setcSubject("Handball federation of India");
        p.setcDate("20.08.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_45_15.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-44A");
        p.setcSubject("Charges for Special Trains for shooting of films.");
        p.setcDate("23.07.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_44A_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-44");
        p.setcSubject("Charges for Special Trains for shooting of films");
        p.setcDate("42200");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-44.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-43");
        p.setcSubject("Acceptance of identity card for undertaking journey under Tatkal Scheme.");
        p.setcDate("14.07.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-43_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-42");
        p.setcSubject("Selection of Station as Adarsh Station.");
        p.setcDate("22.07.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-42.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-41");
        p.setcSubject("Re designing of UTS Tickets.");
        p.setcDate("01.07.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_41_2015_HINDI.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-40");
        p.setcSubject("Clarification on provisions of running of Suvidha trains");
        p.setcDate("01.07.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-40.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-39");
        p.setcSubject("Review of policy on ' Pay & Use' toilets.");
        p.setcDate("30.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_39_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-38");
        p.setcSubject("Automatic refund of Confirmed/RAC tkts e-tkts on cancellation of trains like waitlisted tkts.");
        p.setcDate("30.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_38_Rev.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-37");
        p.setcSubject("Serial Numbering of PRS ticket rolls.");
        p.setcDate("29.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-37_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-36");
        p.setcSubject("Policy for Installation of Water Vending Machines (WVMs) on IR.");
        p.setcDate("16.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_36_20151.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-35");
        p.setcSubject("Issue of tickets of higher classes through UTS, JTBS and YTSK.");
        p.setcDate("10.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/cc_35_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-34");
        p.setcSubject("Amendment in Tatkal Scheme.");
        p.setcDate("10.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/cc-34_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-33");
        p.setcSubject("Running of Suvidha trains");
        p.setcDate("02.06.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_33_15.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-32");
        p.setcSubject("Levy of Service Tax on transportation of passengers by Rail.");
        p.setcDate("29.05.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_32_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-31");
        p.setcSubject("Setting up Executive Lounge by IRCTC");
        p.setcDate("20.05.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_31.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-30");
        p.setcSubject("Running of special trains.");
        p.setcDate("21.05.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/30_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-29");
        p.setcSubject("Guidelines on Cycle/Motor Cycle/Scooter/Car Parking contracts etc.");
        p.setcDate("14.05.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_29_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-28");
        p.setcSubject("Extension of scheme of Station Ticket Booking Sewak(STBS)");
        p.setcDate("14.05.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_28_2015_HINDI.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-27");
        p.setcSubject("Extension of Magisterial Scheme for Check and Prevention of Ticketless travel.");
        p.setcDate("30.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_27_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-26");
        p.setcSubject("Running of 'Tatkal Special' Trains");
        p.setcDate("24.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_26_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-25");
        p.setcSubject("Shoe-Shine contracts at Railway Stations.");
        p.setcDate("24.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_25_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-24");
        p.setcSubject("Strengthening of Central Ticket Checking Squad of Railway Board");
        p.setcDate("21.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_24_2015_HINDI.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-23");
        p.setcSubject("Declaring Sleeper Class coaches as Sleeper Class Unreserved/Unreserved Second Class.");
        p.setcDate("16.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_23_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-22");
        p.setcSubject("Announcement regarding all helpline/complaint lodging system.");
        p.setcDate("15.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_22_2015_HINDI.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-21");
        p.setcSubject("Clarification regarding Yatri Ticket Suvidha Kendra (YTSK)");
        p.setcDate("07.04.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_21_2015_HINDI.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-20");
        p.setcSubject("Policy on Luxury Tourist Trains being operated or to be operated in association with State Tourism Corporations or IRCTC- Master circular");
        p.setcDate("30.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_20.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-19");
        p.setcSubject("Policy on Luxury Tourist Trains being operated or to be operated in association with State Tourism Departments or IRCTC");
        p.setcDate("27.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_19.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-18");
        p.setcSubject("Concession based ticketing including online ticketing for the physically challenged person using Photo Identity Card issued by Railways.");
        p.setcDate("19.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_18_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-17");
        p.setcSubject("Revision of Platform Ticket Rates.");
        p.setcDate("16.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_17_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-16");
        p.setcSubject("Appointment of facilitators for issuing of unreserved tickets through ATVMS");
        p.setcDate("17.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_16_2015_HINDI.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-15");
        p.setcSubject("Reservation facilities for Sr citizen and female passengers including pregnant women.");
        p.setcDate("13.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC-15_2015_H.pdf");
        players.add(p);


        p = new Player();
        p.setcNum("CC-14");
        p.setcSubject("Irregularity in booking - Modification of tickets on ARP date.");
        p.setcDate("10.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/14_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-13");
        p.setcSubject("Printing of All India helpline number 138 and Security Helpline No.182 on the ticket.");
        p.setcDate("09.03.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_13_2015 HINDI.pdf");
        players.add(p);


        p = new Player();
        p.setcNum("CC-11");
        p.setcSubject("Time limit for Advance Reservations");
        p.setcDate("27.02.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/11_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-10");
        p.setcSubject("Emergency quota for Railway Employees suffering from cancer.");
        p.setcDate("27.02.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/10_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-09");
        p.setcSubject("Bharat Darshan Trains");
        p.setcDate("27.02.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_09_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-08");
        p.setcSubject("Outsourcing of cleanliness at 50 major stations-Budget Abnnouncement 2014-15");
        p.setcDate("17.02.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_08_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-07");
        p.setcSubject("Increase in the size of PRS tickets");
        p.setcDate("11.02.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/cc-7_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-06");
        p.setcSubject("Service of branded Ready to Eat (RTE) meals on Trains");
        p.setcDate("30.01.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_06_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-04");
        p.setcSubject("GO India Smart Card Secheme.");
        p.setcDate("22.01.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_04_2015.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-03");
        p.setcSubject("Facility of free journey to SC/ST candidates appearing in exams conducted by RRB/RRC on the downloadable admit cards");
        p.setcDate("22.01.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/03_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-02");
        p.setcSubject("Requisitons for release of Emergency Quota");
        p.setcDate("21.01.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/02_2015_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-01");
        p.setcSubject("Senior Scale Officers Committee for assesment of need to appoint STBS");
        p.setcDate("15.01.2015");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir-2015/CC_01_2015_HINDI.pdf");
        players.add(p);

        return players;
    }


}
