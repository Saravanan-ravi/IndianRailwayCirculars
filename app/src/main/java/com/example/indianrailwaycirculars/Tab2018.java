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

public class Tab2018 extends Fragment {

    private static final String TAG = "Tab2018";
    View view;
    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_2018, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.reyView);
        //SET ITS PROPETRIES
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setItemAnimator(new DefaultItemAnimator());

        //ADAPTER
        final MyAdapter adapter = new MyAdapter(getActivity(), getPlayers());
        rv.setAdapter(adapter);

        return view;
    }
    //ADD PLAYERS TO ARRAYLIST
    private ArrayList<Player> getPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        Player p = new Player();

        p.setcNum("CC-80");
        p.setcSubject("Post facto sanction for withdrawal of Mela Surcharge Circulars");
        p.setcDate("27.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 80_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-79");
        p.setcSubject("Charges for haulage of empty coaches on private account");
        p.setcDate("27.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 79_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-78");
        p.setcSubject("Enhancement of combined Reservation Quota of lower berths for Senior Citizens and female passengers.");
        p.setcDate("27.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_78_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-77");
        p.setcSubject("Fare structure of AC EMU/DEMU");
        p.setcDate("21.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 77_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-76");
        p.setcSubject("Charging of fare against LWCBAC (AC Hot Buffet Car) LHB EOG coach");
        p.setcDate("17.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 76_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-75");
        p.setcSubject("Extension of Magisterial Scheme for check and prevention of ticketless travel.");
        p.setcDate("19.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_75_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-74");
        p.setcSubject("40% concession in passenger fare to Transgender Senior Citizens whose age are 60 and above.");
        p.setcDate("14.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 74_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-73");
        p.setcSubject("Modification in the YTSK Scheme.");
        p.setcDate("13.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_73_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-72");
        p.setcSubject("Deployment of ECRC staff in Ticket Checking activities.");
        p.setcDate("12.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_72_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-71");
        p.setcSubject("Provision of facilities in TTE rest house at par with that of running rooms of drivers/guards.");
        p.setcDate("10.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_71_2018_B.PDF");
        players.add(p);

        p = new Player();
        p.setcNum("CC-70");
        p.setcSubject("Exemptions in issuance of season tickets beyond 150 kms");
        p.setcDate("06.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 70_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-69");
        p.setcSubject("Revision in Sale Price of Water Vending Machines (WVMs) on IR.");
        p.setcDate("04.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_69_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-68");
        p.setcSubject("Procedure Order for Hand Held Terminals for TTEs.");
        p.setcDate("11.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_68_2018_Rev_15032019.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-67");
        p.setcSubject("Earmarking of reserved accomodation in trains for female passengers");
        p.setcDate("04.12.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_67_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-66");
        p.setcSubject("Modification in para No. 3.1 of Commercial Circular No. 50 of 2018 dated 12.09.2018.");
        p.setcDate("28.11.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_66_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-65");
        p.setcSubject("Rationalisation of Flexi fare scheme in Rajdhani, Shatabdi and Duronto trains.");
        p.setcDate("06.11.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_65_18.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-64");
        p.setcSubject("Discounted fare in Shatabdi trains from New Jalpaiguri to Malda Town");
        p.setcDate("06.11.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 64_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-63");
        p.setcSubject("Clarification on para No.3.2 of Commercial Circular No. 50 of 2018 dated 12.09.2018");
        p.setcDate("01.11.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_63_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-62");
        p.setcSubject("Provision for earmarking of accommodation for OBHS staff.");
        p.setcDate("06.11.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_62_18.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-61");
        p.setcSubject("Tax deducted at source on GST transactions");
        p.setcDate("22.10.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 61_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-60");
        p.setcSubject("Issue of reserved ticket for single child or group of children between the age of 5 years and below 12 years with no berth option");
        p.setcDate("23.10.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 60_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-59");
        p.setcSubject("Booking of special services/charter services in Hill Railways and special steam services in various divisions of Indian Railways- regarding grant of                         exemptions from online booking through single window booking system by IRCTC");
        p.setcDate("18.10.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 59_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-58");
        p.setcSubject("Enhancement of period for purchasing unreserved reserse tickets during Mahakumbh Mela.");
        p.setcDate("11.10.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_58_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-57");
        p.setcSubject("Acceptance of Identity cards issued to Advocates by the Bar Councils of India as proof of identity of passengers for undertaking journey by Train.");
        p.setcDate("08.10.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_57_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-56");
        p.setcSubject("Applicability of GST on Annual System Access Charges, Annual License Fees of YTSK and Penalties imposed upon YTSKLs.");
        p.setcDate("25.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_56_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-55");
        p.setcSubject("Parameters of thermal stationary used in unreserved tickets.");
        p.setcDate("25.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_55_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-54");
        p.setcSubject("Discounted fare in Shatabdi train 12243/12244 from Salem to Coimbatore and Coimbatore to Salem sections");
        p.setcDate("24.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-54_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-53");
        p.setcSubject("Revision in Tariff of Tea/Coffee.");
        p.setcDate("18.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_53_2018.pdf");
        players.add(p);


        p = new Player();
        p.setcNum("CC-52");
        p.setcSubject("Platform vending permission to Static Units on Indian Railways.");
        p.setcDate("18.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_52_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-51");
        p.setcSubject("Restoration of Concession on the certificate to be issued by Judo Federation of India and Cycle Polo Federation of India");
        p.setcDate("12.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-51_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-50");
        p.setcSubject("Clarification and Modifictions to NOn-Fare Revenue (NFR) policies issued vide CC Nos. 01,04,05 and 50 of 2017 dated 10.01.2017 and 11.07.2017 respectively.");
        p.setcDate("12.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_50_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-49");
        p.setcSubject("Provision of 5% discount on the total value of basic fare of PRS (reserved) counter ticket on booking of reserved counter through UPI (Unified Payment Interface) including BHIM application.");
        p.setcDate("10.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-49_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-48");
        p.setcSubject("Provision of discount of 0.5% to customers of suburban sections on booking of season tickets when payment is made through digital means.");
        p.setcDate("06.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-48_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-47");
        p.setcSubject("Fare structure of AC DEMU");
        p.setcDate("05.09.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-47_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-46");
        p.setcSubject("Promotion of unreserved ticket booking through mobile phone.");
        p.setcDate("27.08.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_46_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-45");
        p.setcSubject("Implementation of Goods & Services (GST) on transportation of passenger by Rail");
        p.setcDate("24.08.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_45_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-44");
        p.setcSubject("Discontinuation of pasting of reservation charts on train coaches.");
        p.setcDate("23082018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_44_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-43");
        p.setcSubject("Extension of Memorandum pf Understanding (MoU) signed between Ministry of Railways and Department of Posts for issuing of reserved tickets through computerized Passenger Reservation System (PRS) terminals provided in Post Offices.");
        p.setcDate("23.08.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_43_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-42");
        p.setcSubject("Modification in the Jan Sadharan Ticket Booking Sewak (JTBS) policy.");
        p.setcDate("13.08.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_42_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-41");
        p.setcSubject("Modification in the Yatri Ticket Suvidha Kendra (YTSK) policy.");
        p.setcDate("09.08.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_41_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Corrigendumdated 13.08.2018");
        p.setcSubject("");
        p.setcDate("");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/Corri_CC_41_2018_B.pdf");
        players.add(p);


        p = new Player();
        p.setcNum("TC II/2910/99/SL/Policy/AC-3 tier");
        p.setcSubject("Declaration of AC-3 tier Coaches in identified trains as AC Chair Car (TC II/2910/99/SL/Policy)");
        p.setcDate("23.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/Declaration%20of%20AC-%203%20tier%20coaches.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-40");
        p.setcSubject("Withdrawal of Commercial Circular No.3 of 2017 issued vide Railway Board's letter No.2017/NFR/20/1 dated 10.1.2017");
        p.setcDate("18.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC NO_ 40 of 2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Corrigendumdated 13.08.2018");
        p.setcSubject("");
        p.setcDate("13.08.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/Corri_CC_41_2018_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-39");
        p.setcSubject("Battery Operated Vehicles (BOVs) for Divyangjan, old aged and sick passengers.");
        p.setcDate("20.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_39_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-38");
        p.setcSubject("Discounted fare in Shatabdi trains from Ahmedabad to Vadodara");
        p.setcDate("13.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_38_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-37");
        p.setcSubject("Revision of advance reservation period for running of Suvidha trains and special trains on special charges");
        p.setcDate("10.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_37_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-36");
        p.setcSubject("Booking of FTR trains/coaches online through single window booking system by IRCTC");
        p.setcDate("05.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_36_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-35");
        p.setcSubject("Earmarking of accomodation in pantry car of Rajdhani Express trains for different category of staff.");
        p.setcDate("02.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-35_2015_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-34");
        p.setcSubject("Earmarking of dedicated berth/seat for IRCTC Manager in trains.");
        p.setcDate("02.07.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_34_2015_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-33");
        p.setcSubject("Acceptance of digital Aadhaar and Driving Licence from Digital Locker as proof of identity of passengers for undertaking journey by train.");
        p.setcDate("28.06.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_33_2015_B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-32");
        p.setcSubject("Revalidation of Photo identity cards of Accredited Press Correspondents.");
        p.setcDate("18.06.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_32_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-31");
        p.setcSubject("Train Captain as overall leader and in charge of all on board railway personnel and outsoruced staff.");
        p.setcDate("15.06.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC 31_06092018_F.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-30");
        p.setcSubject("Fare structure of AC EMU.");
        p.setcDate("15.06.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-30_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-29");
        p.setcSubject("Reduction in the tatkal quota in Rajdhani/Duronto/Shatabdi trains.");
        p.setcDate("21.05.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-29_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-28");
        p.setcSubject("Implementation of booking of FTR trains/coaches online through single window booking system by IRCTC");
        p.setcDate("43236");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_28_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-27");
        p.setcSubject("Discounted fare in Shatabdi trains from New Jalpaiguri to Malda Town");
        p.setcDate("09.05.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 27.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-26");
        p.setcSubject("Booking of FTR trains/coaches online through single window booking system by IRCTC");
        p.setcDate("43227");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_26_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Addendum to CC-54 of 2017");
        p.setcSubject("Revised scheme for booking of reserved tickets by foreign trourists online.");
        p.setcDate("24.04.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2017/Addendum_CC_54_2017.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("2014/TG-I/23/PRS Terminal/Pt.2");
        p.setcSubject("Implementation of Goods and Services Tax on Yatri Ticket Subidha kendra");
        p.setcDate("16.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_05_2018_R.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("2013/TG-I/20/P/VAt");
        p.setcSubject("Policy on earmarking of berths on demand from IRCTC for value added tour packages");
        p.setcDate("05.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_09_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-25");
        p.setcSubject("Promotion if unreserved ticket booking through mobile phone.");
        p.setcDate("03.05.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_25_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-24");
        p.setcSubject("Concession to sports persons");
        p.setcDate("19.04.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 24.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-23");
        p.setcSubject("Supply of 1000 ML Rail Neer PDW during late running of Rajdhani/Duronto Trains");
        p.setcDate("18.04.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_23_18042018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Addendum to RC-24 of 2014");
        p.setcSubject("Ticket Checking by TTE Squad of Zonal Railways in Rajdhani, Duranto, Premium and Sampark Kranti Express within Zonal Durisdiction.");
        p.setcDate("09.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/Addendum_CC_24_2014.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-21");
        p.setcSubject("Incidence of Goods and Service Tax (GST) on provision of Catering Services over IR.");
        p.setcDate("09.04.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC__21_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-20");
        p.setcSubject("Distribution Plan for Supply of Rail Neer on Mail/Exp. Trains and Static Units on Stations.");
        p.setcDate("04.04.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_20_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-19");
        p.setcSubject("Provision of discount of 0.5% to customers of suburban sections on booking of season tickets when payment is made through digital means");
        p.setcDate("28.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 19.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-18");
        p.setcSubject("Appointment of facilitators for issuing of unreserved tickets through ATVMS.");
        p.setcDate("26.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_18_2018_H.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-17");
        p.setcSubject("Bharat Darshan Trains/Aastha Circuit Trains.");
        p.setcDate("16.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_17_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-16B");
        p.setcSubject("Provision of 5% discount on the total value of basic fare of PRS (reserved) counter ticket on booking of reserved counter through UPI (Unified Payment Interface) including BHIM application");
        p.setcDate("18.04.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 16B.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-16A");
        p.setcSubject("Provision of 5% discount on the total value of basic fare of PRS (reserved) counter ticket on booking of reserved counter through UPI (Unified Payment Interface) including BHIM application");
        p.setcDate("16.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 16A.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-16");
        p.setcSubject("Provision of 5% discount on the total value of basic fare of PRS (reserved) counter ticket on booking of reserved counter through UPI (Unified Payment Interface) including BHIM application");
        p.setcDate("09.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 16.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-15");
        p.setcSubject("Policy on Luxury Tourist Trains being operated or to be operated in association with State Tourism Departments or IRCTC-Master Circular");
        p.setcDate("01.03.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_15_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-14");
        p.setcSubject("Booking of FTR Trains/Coaches online through single window booking system by IRCTC");
        p.setcDate("15.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 14.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-13");
        p.setcSubject("Earmarking of reservation quota for women.");
        p.setcDate("15.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_13_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-12");
        p.setcSubject("Parameters of thermal stationery used in unreserved tickets.");
        p.setcDate("11.05.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_12_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-11");
        p.setcSubject("Updation of Reservation/Cancellation Requisition Form.");
        p.setcDate("28.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-11_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Corrigendumdated 11.05.2018");
        p.setcSubject("Corrigendumdated 11.05.2018");
        p.setcDate("11.05.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/Corrigendum_CC_11_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("Corrigendum dated 30.05.2018");
        p.setcSubject("Corrigendum");
        p.setcDate("30.05.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/Corrigendum_CC-11_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-10");
        p.setcSubject("Discountinuation of pasting of reservation charts on train coaches.");
        p.setcDate("13.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC-10_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-09");
        p.setcSubject("POlicy on earmarking of berths on demand from IRCTC for value added tour packages.");
        p.setcDate("05.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_09_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-08");
        p.setcSubject("Booking of FTR trains/coaches online through single window booking system by IRCTC");
        p.setcDate("05.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC 08.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-07");
        p.setcSubject("Defining of changing the code of Executive Class of Shatabdi Trains as EC.");
        p.setcDate("09.02.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_07_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-06");
        p.setcSubject("Fare structure of AC EMU");
        p.setcDate("19.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 06.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-05");
        p.setcSubject("Implementation of Goods and Service Tax (GST) on Yatri Ticket Suvidha Kendra (YTSK).");
        p.setcDate("16.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_05_2018_R.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-04");
        p.setcSubject("Replacement of the words Blind, Deaf and Dumb");
        p.setcDate("12.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC 04 of 2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-03");
        p.setcSubject("Revision of advance reservation period for running of Suvidha trains and special trains on special charges");
        p.setcDate("12.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC 03 of 2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-02");
        p.setcSubject("Delegation of Powers to DRM for fixation/revision of Retiring Rooms tariffs-reg.");
        p.setcDate("12.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/CC_02_2018.pdf");
        players.add(p);

        p = new Player();
        p.setcNum("CC-01");
        p.setcSubject("Restoration of Concession on the certificate issued by Netball Federation of India.");
        p.setcDate("08.01.2018");
        p.setcLink("http://www.indianrailways.gov.in/railwayboard/uploads/directorate/traffic_comm/Comm_Cir_2018/cc 01.pdf");
        players.add(p);

       return players;
    }
}
