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

public class Tab2016 extends Fragment {

    private static final String TAG = "Tab2016";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_2016, container, false);


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

            p.setcNum("CC-80");
            p.setcSubject("Provision of 5% discount in online payment of booking of retiring rooms.");
            p.setcDate("29.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/discount_RR_Booking_291216.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-79");
            p.setcSubject("10% rebate in the basic fare on the vacant berths/seats after preparation of first chart");
            p.setcDate("28.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_79_28122016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-78");
            p.setcSubject("Introduction of digital payments at Railway Tickets point of sale (POS) like YTSKs/TBSs in Zonal Railways");
            p.setcDate("27.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_78_06012017.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-77");
            p.setcSubject("Promotion of cashless/digital modes of payment for booking reserved and unreserved tickets.");
            p.setcDate("23.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_77_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-76");
            p.setcSubject("Accounting procedure for remittance of Traffic Earnings of Parcel/UTS Earnings, received through Point of Sale (PoS) Machine, installed by SBI.");
            p.setcDate("23.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_76_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-75");
            p.setcSubject("Provision of discount of 0.5% to customers of suburban sections on booking of season tickets if payment is made through digital means");
            p.setcDate("23.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_75_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-74");
            p.setcSubject("Withdrawal of service charge of '30/- applicable on transactions against Credit and Debit cards for purchasing journey tickets.");
            p.setcDate("22.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/comm_Cir_2k6/CC 74 of 2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-73");
            p.setcSubject("Introduction of Alternate Train Accomodation Scheme (VIKALP)");
            p.setcDate("14.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC-73_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-72");
            p.setcSubject("Fare structure of Humsafar train.");
            p.setcDate("14.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_72_15122016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("Cor.-CC-71");
            p.setcSubject("Allotment of RAC Berths to Passengers");
            p.setcDate("20.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/corrigendum to CC 71 of 2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-71");
            p.setcSubject("Allotment of RAC Berths to Passengers");
            p.setcDate("14.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc 71 of 2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-70");
            p.setcSubject("Accounting procedure for remittance of Traffic Earnings of PRS, received through Point of Sale (PoS) Machine, installed by SBI");
            p.setcDate("10.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_70_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-69");
            p.setcSubject("Installation of POS machines at various locations of Indian Railways");
            p.setcDate("10.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_69_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-68");
            p.setcSubject("Review of Flexi Fare System in Rajdhani/Shatabdi/Duronto trains and discounted fare in Shatabdi Trains on Jaipur-Ajmer and Mysore-Bangalore sections.");
            p.setcDate("16.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_68_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-67");
            p.setcSubject("Remittance of cash collected by TTEs and its correct accountal.");
            p.setcDate("07.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_67_2016_H.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-66");
            p.setcSubject("Review of Flexi Fare System in Rajdhani/Shatabdi/Duronto trains and discounted fare in Shatabdi Trains on Jaipur-Ajmer and Mysore-Bangalore sections.");
            p.setcDate("16.12.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_66_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-64");
            p.setcSubject("Delegation of power to earmark Defence Department Quota");
            p.setcDate("30.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_64_06012017.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-63");
            p.setcSubject("Carrying of proof of identity by defence personnel during journey by train.");
            p.setcDate("28.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_63_2016_H.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-62");
            p.setcSubject("Revision in the procedure of cancellation and refund of ticket of total value of Rs. 5,000/- and above for the PRS counter tickets booked from 09.11.2016 to 24.11.2016.");
            p.setcDate("17.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_62_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-61");
            p.setcSubject("Revision in the procedure of cancellation and refund of value of Rs. 5,000/- and above for the PRS counter tickets booked from 16.11.2016 to 24.11.2016.");
            p.setcDate("15.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC 61.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-60");
            p.setcSubject("Bharat Darshan Trains/Aastha Circuit Trains.");
            p.setcDate("10.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_60_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-59");
            p.setcSubject("Revision in the procedure of cancellation and refund of value of Rs.10,000/- and above for the PRS counter tickets booked from 09.11.2016 to 11.11.2016");
            p.setcDate("10.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_59_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-58");
            p.setcSubject("Revision of Duty List of Ticket Checking Staff");
            p.setcDate("04.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_58_16.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-57");
            p.setcSubject("Submission of reservation/cancellation requisition form.");
            p.setcDate("04.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_57_2016_H.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-56");
            p.setcSubject("Revalidation of Photo Identity Cards of Accredited Press Correspondents.");
            p.setcDate("03.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_56_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-55 ");
            p.setcSubject("Provision of separate dustbin for bio degradable (wet) and non-biodegradable (dry) waste at major railway stations.");
            p.setcDate("02.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC55_17112016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-54");
            p.setcSubject("Establishment and Operation of Yatri Ticket Suvidha Kendra (YTSK)-Service Tax");
            p.setcDate("02.11.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_54_27122016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-53");
            p.setcSubject("Nominating Nodal Officer on each division to co-ordinate with Hon’ble Members of Parliament for their railway journey related issues.");
            p.setcDate("07.10.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_53_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-52");
            p.setcSubject("System improvement for Foreign Tourist Quota in respect of Foreign Senior Citizens");
            p.setcDate("29.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC 52_300916.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-51");
            p.setcSubject("Introduction of sub-quota of 33% for women in allotment of each of the reserved category of minor catering units and weightage to domicile holders for commercial licenses.");
            p.setcDate("28.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_51_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-50");
            p.setcSubject("Handing over of Retiring Rooms and doritories to IRCTC.");
            p.setcDate("23.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/handing_over_RR_IRCTC260916.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-49");
            p.setcSubject("Concession to sports persons");
            p.setcDate("23.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc 49.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-48");
            p.setcSubject("Gomti Nagar Station as an Adarsh Station");
            p.setcDate("28.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/gomti_ngr_stn_29112016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-47");
            p.setcSubject("Provision of Yatri Mitra Sewa at Railway Stations.");
            p.setcDate("14.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_47_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-46");
            p.setcSubject("Introduction of Flexi Fare system for Rajdhani/Duronto and Shatabdi trains");
            p.setcDate("07.09.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_46_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-45");
            p.setcSubject("Amendments in working procedure for sale of unreserved tickets/platform tickets through mobile phone.");
            p.setcDate("22.08.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc_45_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-43");
            p.setcSubject("Concession to sports persons.");
            p.setcDate("19.08.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_43_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-42");
            p.setcSubject("Battery Operated Vehicles for Disabled, Old aged and Sick Passengers");
            p.setcDate("05.08.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_42_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-41");
            p.setcSubject("Charges for Special Trains for shooting of films with Goods stock");
            p.setcDate("27.07.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc no 41.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-40");
            p.setcSubject("Nominating Train Superintendent responsible for all facilities on trains.");
            p.setcDate("04.08.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_40_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-39");
            p.setcSubject("Charges for GS coaches and sitting accommodation of SLR for running of Special trains and Suvidha trains.");
            p.setcDate("12.07.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC-39_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-38");
            p.setcSubject("Provision of Battery Operated Cars (BOC) for carrying passengers at Railway Stations.");
            p.setcDate("06.07.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_38_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-37");
            p.setcSubject("Shortlisting of Firms/Companies for 'Ready to Eat Meals' on Trains.");
            p.setcDate("06.07.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC-37_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-36");
            p.setcSubject("Cancellation of PRS counter ticket for Confirmed/RAC/Waitlisted tickets through IRCTC website or through 139 and collection of refundable amount across the PRS counter within the prescribed time limit.");
            p.setcDate("30.06.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_36_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("Corrigendum of CC-08 ");
            p.setcSubject("Charges for GS coaches and sitting accommodation of SLR for running of special trains and Suvidha trains.");
            p.setcDate("29.06.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/Corri_CC-08_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-35");
            p.setcSubject("Concession certificates to patients.");
            p.setcDate("22.06.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_35.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-33");
            p.setcSubject("Installation of ATMs at Railway Station");
            p.setcDate("17.06.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc no 33 of 2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-32");
            p.setcSubject("Provision of Wheelchairs at Railway Stations");
            p.setcDate("16.06.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc no32 0f 2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-31");
            p.setcSubject("Concession to Divyang Passengers (Orthopaedically handicapped/Paraplegic and Mentally retarded persons)- when travelling alone also.");
            p.setcDate("42535");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_31_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-30");
            p.setcSubject("Engagement of Station Ticket Booking Agents(STBAs) Scheme at 'E' Categary Stations.");
            p.setcDate("27.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/302016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-29");
            p.setcSubject("Levy of Krishi Kalyan Cess on the service tax leviable on transportation of passengers by rail");
            p.setcDate("31.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_29_2016.pdf");
            players.add(p);


            p = new Player();
            p.setcNum("CC-27");
            p.setcSubject("Cancellation of PRS counter tickets through IRCTC website and through 139 and collection of refundable amount across the PRS counter within the prescribed time limit");
            p.setcDate("20.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_27_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-26");
            p.setcSubject("Withdrawal of service charge of Rs. 30/- applicable on transactions against Credit and Debit Cards for purchasing journey tickets at PRS counter");
            p.setcDate("18.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_26_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-25");
            p.setcSubject("MR's Budget Announcement 2016-17- imparting behavioural training to licensed porters.");
            p.setcDate("12.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/Coml_25.PDF");
            players.add(p);

            p = new Player();
            p.setcNum("CC-24");
            p.setcSubject("Increase in size of PRS tickets.");
            p.setcDate("04.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/commercial-circulars2k5/CC_24of2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-23");
            p.setcSubject("Policy of earmarking berths on demand from IRCTC for Value Added Tour package.");
            p.setcDate("06.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_23of2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("Corrigendum-I dated 08.06.2016");
            p.setcSubject("");
            p.setcDate("");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/Corrigendum_CC23of2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("Corrigendum-II dated 30.06.2016 ");
            p.setcSubject("");
            p.setcDate("");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/Corrigendum-II_CC_23_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-22");
            p.setcSubject("Permitting MP Passes/MLA Coupons in Special trains and Suvidha trains");
            p.setcDate("21.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc_no_22.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-21");
            p.setcSubject("Amendment in RTSA Rules.");
            p.setcDate("21.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_21_2016(1).pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-20A");
            p.setcSubject("Cancellation of PRS counter tickets through IRCTC website or through 139 and collection of refundable amount across the PRS counter within the prescribed time limit.");
            p.setcDate("04.05.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_20_A_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-20");
            p.setcSubject("Cancellation of PRS counter tickets through IRCTC website or through 139 and collection of refundable amount across the PRS counter within the prescribed time limit.");
            p.setcDate("19.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_20_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-19");
            p.setcSubject("Earmarking of accommodation for On-board Housekeeping Staff (OBHS).");
            p.setcDate("19.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_19_2016_B.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-18");
            p.setcSubject("Establishment and Operation of Yatri Ticket Suvidha Kendra (YTSK)");
            p.setcDate("07.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_18_2016(1).pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-17");
            p.setcSubject("Introduction of Alternate Train Accomodation Scheme (VIKALP)");
            p.setcDate("11.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc17 of 2016 bilingual.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-16");
            p.setcSubject("Earmarking of accommodation for women passengers in all Passenger and Local trains in the middle of the train.");
            p.setcDate("07.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/16 of 2016 bilingual.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-15");
            p.setcSubject("Introduction of Hazrat Nizamuddin-Agra Cantt. Gatimaan Express");
            p.setcDate("01.04.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc no 15.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-14");
            p.setcSubject("Earmarking of Reservation Quota for Women and Senior Citizens.");
            p.setcDate("23.03.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc14 of 2016 bilingual.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-13");
            p.setcSubject("Issuing of tickets to foreign tourists against Foreign Tourist Quota");
            p.setcDate("42467");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_13_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-12");
            p.setcSubject("Charge for haulage of empty coaches on private account");
            p.setcDate("17.03.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc_12.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-11");
            p.setcSubject("Amendment in condition 11 of Rule 313 and Rule 401.8 of IRCA Coaching Tariff No. 26 Part I (Volume I) under head Refund");
            p.setcDate("15.03.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/cc no 11.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-10");
            p.setcSubject("Appointment of facilitators for issuing of unreserved tickets through ATVMS");
            p.setcDate("10.03.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/commercial-circulars2k5/CC_10of2016.pdf");
            players.add(p);


            p = new Player();
            p.setcNum("CC-08");
            p.setcSubject("Charges for GS coaches and sitting accommodation of SLR for running of special trains and Suvidha trains");
            p.setcDate("42403");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_08_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("Corrigendum dated 29.06.2016");
            p.setcSubject("");
            p.setcDate("");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/Corri_CC-08_2016.pdf");
            players.add(p);


            p = new Player();
            p.setcNum("CC-07");
            p.setcSubject("Reservation on internet through IRCTC");
            p.setcDate("25.01.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_07_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-06");
            p.setcSubject("Fare structure of Varanasi-New Delhi Mahamana Express");
            p.setcDate("42391");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC-6.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-05");
            p.setcSubject("Validity of unreserved tickets over Non-suburban sections");
            p.setcDate("42391");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC-5.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-04");
            p.setcSubject("Fare Structure of Varanasi-New Delhi  Mahamana Express");
            p.setcDate("42389");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_04_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-03");
            p.setcSubject("Corrigendum to Commercial Circular No. 42 of 2015 vide Board's letter No. 2014/TG-IV/10/PA/99/Adarsh Stations dated 22.07.2015");
            p.setcDate("15.01.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_03_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-02");
            p.setcSubject("Conversion of regular Premium Trains into Suvidha Trains.");
            p.setcDate("12.01.2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/CC_02_2016.pdf");
            players.add(p);

            p = new Player();
            p.setcNum("CC-01");
            p.setcSubject("Misuse of Senior Citizen Concession as well as Senior Citizen Quota.");
            p.setcDate("07-01-2016");
            p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm-Cir_2016/01_2016_merged.pdf");
            players.add(p);



        return players;
    }


}
