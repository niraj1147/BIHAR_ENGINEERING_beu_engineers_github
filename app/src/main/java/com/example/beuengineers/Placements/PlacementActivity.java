package com.example.beuengineers.Placements;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;
import com.example.beuengineers.Syllabus.Branch;
import com.example.beuengineers.Syllabus.BranchAdapter;
import com.example.beuengineers.Syllabus.Semester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlacementActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 MIT Muzaffarpur
        List<String> mittwentyfour = Arrays.asList("S.No\t\t:\t\tName\t\t:\t\tBranch\t\t:\t\tCompanyName\t\t:\t\tPackage",
                "1. Gautam Kumar Pandey \t\t:\t\t IT \t\t:\t\t Mewurk Technologies Pvt. Ltd. \t\t:\t\t 4 LPA",
                "2. Abhishek Kumar \t\t:\t\t IT \t\t:\t\t Mewurk Technologies Pvt. Ltd. \t\t:\t\t 4 LPA",
                "3. Shiv kumar \t\t:\t\t IT \t\t:\t\t Mewurk Technologies Pvt. Ltd. \t\t:\t\t 4 LPA",
                "4. Sudhir Kumar  \t\t:\t\t IT  \t\t:\t\t MANTRA  \t\t:\t\t 6.5 LPA",
                "5. Rani Kumari  \t\t:\t\t IT  \t\t:\t\t MANTRA  \t\t:\t\t 6.5 LPA",
                "6\tAniket Rathore \t\t:\t\t IT \t\t:\t\tMANTRA (Computer Vission Engineer) \t\t:\t\t7.5 LPA",
                "7\tAditya Singh\t\t\t:\t\tIT\t\t\t:\t\tMANTRA (Computer Vission Engineer)\t\t\t:\t\t7.5 LPA",
                "8\tAyush Raj\tIT\tMANTRA (Computer Vission Engineer)\t7.5LPA",
                "9\tShalini Kumari\t\t\t:\t\tIT\t\t\t:\t\tACEDMORE\t\t\t:\t\t4-6 LPA",
                "10\tVikas Kumar Yadav\t\t\t:\t\tIT\t\t\t:\t\tACEDMORE\t\t\t:\t\t4-6 LPA\t",
                "11\tRavi Ranjan Kumar\t\t\t:\t\tECE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "12\tAyush kumar\t\t\t:\t\tECE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "13\tAyush Kumar\t\t\t:\t\tECE\t\t\t:\t\tICON POWER SOLUTIONS (P) LTD.\t\t\t:\t\t4.5 LPA",
                "14\tRaj Aryan\t\t\t:\t\tECE\t\t\t:\t\tYukinova Battery\t\t\t:\t\t5LPA",
                "15\tSahil Kumar\t\t\t:\t\tECE\t\t\t:\t\tYukinova Battery\t\t\t:\t\t5LPA",
                "16\tTanya Rani\t\t\t:\t\tECE\t\t\t:\t\tYukinova Battery\t\t\t:\t\t5LPA",
                "17\tRavi Ranjan Kumar\t\t\t:\t\tECE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "18\tShiwani Kumari\t\t\t:\t\tECE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "19\tAditya Kumar\t\t\t:\t\tECE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "20\tSachin Kumar\t\t\t:\t\tEE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "21\tPrabhat Prakash\t\t\t:\t\tEE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "22\tSagar Kumar\t\t\t:\t\tEE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "23\tAnandita\t\t\t:\t\tEE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "24\tRavi prakash\t\t\t:\t\tCE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "25\tTripti Surbhi\t\t\t:\t\tCE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "26\tPiyush Raj\t\t\t:\t\tCE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "27\tNavneet Sinha\t\t\t:\t\tCE\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "28\tRishabh Kumar\t\t\t:\t\tMECH\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "29\tAMIT KUMAR\t\t\t:\t\tMECH\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "30\tRohit kumar\t\t\t:\t\tMECH\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "31\tAditya kumar singh\t\t\t:\t\tMECH\t\t\t:\t\tAcademor\t\t:\t\t\t4-6 LPA",
                "32\tRohit Raj\t\t\t:\t\tMECH\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "33\tNIRBHAY RAJ\t\t\t:\t\tMECH\t\t\t:\t\tAcademor\t\t\t:\t\t4-6 LPA",
                "34\tRavi Raj\t\t\t:\t\tCE\t\t\t:\t\tEcospace Infrastructures Pvt. Ltd\t\t:\t\t\t3LPA",
                "35\tNavneet Sinha\t\t:\t\t\tCE\t\t\t:\t\tEcospace Infrastructures Pvt. Ltd\t\t:\t\t\t3LPA",
                "36\tPiyush Raj\t\t:\t\t\tCE\t\t:\t\t\tEcospace Infrastructures Pvt. Ltd\t\t:\t\t\t3LPA",
                "37\tNishant Kumar\t\t\t:\t\tM.tech.(Geotech)\t\t\t:\t\tCEG Test House & Research Centre Pvt. Ltd.\t\t:\t\t\t3 LPA",
                "38\tRajvanshi Kumar Singh\t\t:\t\t\tM.tech.(Geotech)\t\t:\t\t\tCEG Test House & Research Centre Pvt. Ltd.\t\t:\t\t\t3 LPA",
                "39\tPiyush Raj\t\t\t:\t\tCE\t\t\t:\t\tCEG Test House & Research Centre Pvt. Ltd.\t\t:\t\t\t2.16 LPA",
                "40\tRavi Prakash\t\t\t:\t\tCE\t\t\t:\t\tCEG Test House & Research Centre Pvt. Ltd.\t\t:\t\t\t2.16 LPA",
                "41\tRavi Raj\t\t\t:\t\tCE\t\t\t:\t\tCEG Test House & Research Centre Pvt. Ltd.\t\t:\t\t\t2.16 LPA",
                "42\tBashar Alam\t\t\t:\t\tMECH\t\t\t:\t\tNeometrix Engineering Pvt. Ltd.\t\t:\t\t\t2.4 LPA",
                "43\tSurbhi Singh\t\t\t:\t\tMECH\t\t\t:\t\tNeometrix Engineering Pvt. Ltd.\t\t\t:\t\t2.4 LPA",
                "44\tRaushan Kumar\t\t\t:\t\tMECH\t\t\t:\t\tNeometrix Engineering Pvt. Ltd.\t\t:\t\t\t2.4 LPA",
                "45\tBashar Alam\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "46\tBrij Narayan Chaudhary\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "47\tRohit Raj\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5 LPA",
                "48\tRishabh Kumar\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA\t",
                "49\tRavikant Kumar\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "50\tCHANDAN KUMAR YADAV\t\t:\t\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "51\tSinku Kumar\t\t\t:\t\tMECH\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "52\tRohit kumar\tMECH\tHigh Technext Engineering & Telecom Pvt Ltd\tUp to 5 LPA",
                "53\tDevesh Kumar\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "54\tUttam\t\t\t:\t\tMECH\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "55\tKrishna Raj\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "56\tSachin Kumar\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "57\tDeekshant Goyal\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "58\tSagar Kumar\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "59\tRavi Ranjan\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "60\tAbhishek Kumar\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA\t\t\t:\t\t",
                "61\tPintu Kumar\t\t\t:\t\tEE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "62\tAbhishek Kumar Mishra\t\t:\t\t\tEE\t\t:\t\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "63\tTony Arya\t\t:\t\t\tECE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "64\tVivek Kumar Gupta\t\t\t:\t\tECE\t\t:\t\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "65\tRavi Ranjan Kumar\t\t\t:\t\tECE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "66\tManjeet kumar\t\t\t:\t\tECE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "67\tSahil Kumar\t\t\t:\t\tECE\t\t:\t\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "68\tPratyush karn\t\t\t:\t\tECE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t:\t\t\tUp to 5LPA",
                "69\tRaj Aryan\t\t\t:\t\tECE\t\t\t:\t\tHigh Technext Engineering & Telecom Pvt Ltd\t\t\t:\t\tUp to 5LPA",
                "70\tArpit Raj\tECE\tHigh Technext Engineering & Telecom Pvt Ltd\tUp to 5LPA",
                "71\tHari Om\t\t\t:\t\tCIVIL\t\t\t:\t\tShriram Finance Limited\t\t\t:\t\t3.18 LPA",
                "72\tAyush Kumar\t\t\t:\t\tIT\t\t:\t\t\tShriram Finance Limited\t\t:\t\t\t3.18 LPA",
                "73\tRavi Raj\t\t\t:\t\tCIVIL\t\t:\t\t\tShriram Finance Limited\t\t:\t\t\t3.16 LPA",
                "74\tRahul Kumar\t\t\t:\t\tCIVIL\t\t\t:\t\tShriram Finance Limited\t\t:\t\t\t3.18 LPA",
                "75\tPrince Pandey\t\t\t:\t\tECE\t\t\t:\t\tShriram Finance Limited\t\t\t:\t\t3.18 LPA",
                "76\tAbhishek Kumar\t\t\t:\t\tEE\t\t\t:\t\tShriram Finance Limited\t\t:\t\t\t3.18 LPA",
                "77\tSujit Kumar\t\t\t:\t\tME\t\t\t:\t\tShriram Finance Limited\t\t\t:\t\t3.18 LPA",
                "78\tRohit Raj\t\t\t:\t\tME\t\t:\t\t\tShriram Finance Limited\t\t:\t\t\t3.18 LPA",
                "79\tSagar Kumar\t\t\t:\t\tEE\t\t\t:\t\tShriram Finance Limited\t\t\t:\t\t3.18 LPA",
                "80\tChandan Kumar Yadav\t\t\t:\t\tME\t\t\t:\t\tShriram Finance Limited\t\t\t:\t\t3.18 LPA",
                "81\tAditya Prakash Giri\t\t\t:\t\tIT\t\t:\t\t\tShriram Finance Limited\t\t\t:\t\t3.18 LPA",
                "82\tLaltu Kumar\t\t\t:\t\tME\t\t\t:\t\tShriram Finance Limited\t\t:\t\t\t3.18 LPA",
                "83\tAbhimanyu Kumar Mishra\t\t\t:\t\tME\t\t:\t\t\tShriram Finance Limited\t\t:\t\t\t3.18 LPA",
                "84\tRohit Raj\t\t\t:\t\tME\t\t\t:\t\tTeachnook\t\t\t:\t\t4-6 LPA",
                "85\tRishabh Kumar\t\t:\t\t\tME\t\t\t:\t\tTeachnook\t\t:\t\t\t4-6 LPA",
                "86\tArpit Raj\t\t\t:\t\tECE\t\t\t:\t\tTeachnook\t\t\t:\t\t4-6 LPA",
                "87\tGautam Kumar Pandey\t\t:\t\t\tIT\t\t\t:\t\tTeachnook\t\t\t:\t\t4-6 LPA",
                "88\tRani Kumari\t\t\t:\t\tIT\t\t\t:\t\tTeachnook\t\t\t:\t\t4-6 LPA",
                "89\tBharati Kumari\t\t\t:\t\tME\t\t\t:\t\tGulati Auto Electricals Pvt Ltd\t\t:\t\t\t5 LPA",
                "90\t Dolly kumari \t\t\t:\t\tME\t\t\t:\t\tGulati Auto Electricals Pvt Ltd\t\t\t:\t\t5 LPA",
                "91\t Rishabh kumar\t\t\t:\t\tME\t\t\t:\t\tGulati Auto Electricals Pvt Ltd\t\t:\t\t\t5 LPA",
                "92\tShivani\t\t\t:\t\tECE\t\t\t:\t\tGulati Auto Electricals Pvt Ltd\t\t:\t\t\t5 LPA"
                );

        List<String> mittwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> mittwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");


        List<String> mittwentyone = Arrays.asList("\bTCS\n" +
                "\n" +
                "Sl. No.\t\t\t\tName \t\t\t\tDiscipline",
                "1.\t\t\t\tkundan kumar\t\t\t\t CE\n" +
                "\n" +
                "2. \t\t\t\tVikash kumar\t\t\t\t CE\n" +
                "\n" +
                "3. \t\t\t\tAnkit Jha \t\t\t\tIT\n" +
                "\n" +
                "4. \t\t\t\tAnkit kumar\t\t\t\t IT\n" +
                "\n" +
                "5.\t\t\t\tShantanu kumar\t\t\t\t IT\n" +
                "\n" +
                "6.\t\t\t\tRiya Agrawal\t\t\t\t IT\n" +
                "\n" +
                "7.\t\t\t\tNitish Shrivastava\t\t\t\tIT\n" +
                "\n" +
                "8.\t\t\t\tPratyasha shree \t\t\t\tIT\n" +
                "\n" +
                "9.\t\t\t\tManish kumar\t\t\t\t EE\n" +
                "\n" +
                "10.\t\t\t\tTamanna Choudhary \t\t\t\tEE\n" +
                "\n" +
                "11.\t\t\t\tGaurav kumar\t\t\t\t ECE\n" +
                "\n" +
                "12.\t\t\t\tAshmita kumari\t\t\t\tECE\n" +
                "\n",
                "Alstom Transport India Ltd",
                "Sl. No.\t\t\t\t Name\t\t\t\t Discipline\n" +
                "\n" +
                "1.\t\t\t\tNeha Singh \t\t\t\tEE\n" +
                "\n" +
                "2.\t\t\t\tAnjali Gupta \t\t\t\tME\n" +
                "\n" +
                " \n" +
                "\n" +
                "HCL Technologies\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\tDiscipline\n" +
                "\n" +
                "1.\t\t\t\t Ankit Jha \t\t\t\t IT\n" +
                "\n" +
                "2.\t\t\t\t Anurag Gupta \t\t\t\tIT\n" +
                "\n" +
                "3.\t\t\t\tAparna Rani\t\t\t\t ECE\n" +
                "\n" +
                "4.\t\t\t\t Esha Nandini \t\t\t\tIT\n" +
                "\n" +
                "5. \t\t\t\tIffat Naaz \t\t\t\tIT\n" +
                "\n" +
                "6.\t\t\t\tKumar Shivam \t\t\t\tIT\n" +
                "\n" +
                "7.\t\t\t\t MD. Obaidullah \t\t\t\tIT\n" +
                "\n" +
                "8.\t\t\t\tNisha\t\t\t\t ECE\n" +
                "\n" +
                "9.\t\t\t\t Priti Kumari \t\t\t\tME\n" +
                "\n" +
                "10. \t\t\t\tSaubhik Kumar \t\t\t\tME\n" +
                "\n" +
                "11.\t\t\t\t Shailendra Kumar Vishwakarma\t\t\t\tIT\n" +
                "\n" +
                "12.\t\t\t\tSupriya Bharti\t\t\t\tECE\n" +
                "\n" +
                "13.\t\t\t\t Vanisha Sharma \t\t\t\tEE\n" +
                "\n" +
                "14.\t\t\t\t Rahul JHA \t\t\t\tIT\n" +
                "\n" +
                "15. \t\t\t\tRahul Sinha \t\t\t\tIT\n" +
                "\n" +
                " \n" +
                "\n" +
                "Cinif Technologies Ltd\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\tDiscipline\n" +
                "\n" +
                "1. \t\t\t\tPRINCE KUMAR \t\t\t\tECE\n" +
                "\n" +
                "2. \t\t\t\tAbhishek Rana\t\t\t\t ECE\n" +
                "\n" +
                "3.\t\t\t\t MANDEEP THAKUR \t\t\t\tECE\n" +
                "\n" +
                "4.\t\t\t\t RAJESH DAS \t\t\t\tECE\n" +
                "\n" +
                "5. \t\t\t\tBipul Kumar \t\t\t\tECE\n" +
                "\n" +
                "6. \t\t\t\tPrince Kumar \t\t\t\tECE\n" +
                "\n" +
                "7. \t\t\t\tSumit kumar \t\t\t\tEE\n" +
                "\n" +
                "8. \t\t\t\tSHIVAM DUBEY \t\t\t\tEE\n" +
                "\n" +
                "9. \t\t\t\tASHWINI KUMAR \t\t\t\tEE\n" +
                "\n" +
                "10. \t\t\t\tMOHAMMAD EHSHANULLAH \t\t\t\tEE\n" +
                "\n" +
                "11. \t\t\t\tABHIMANYU KUMAR SINGH \t\t\t\tEE\n" +
                "\n" +
                "12.\t\t\t\tAditya Shankar \t\t\t\tEE\n" +
                "\n" +
                "13.\t\t\t\t VISHAL KUMAR \t\t\t\tEE\n" +
                "\n" +
                "14.\t\t\t\t Abhishek Kumar \t\t\t\t IT\n" +
                "\n" +
                "15.\t\t\t\t SHUBHAM KUMAR \t\t\t\tIT\n" +
                "\n" +
                "16.\t\t\t\t SHIVAM SAGAR \t\t\t\tME\n" +
                "\n" +
                "17. \t\t\t\t Narendra kumar kamat \t\t\t\t ME\n" +
                "\n" +
                "18.\t\t\t\t Anurag kumar sharma\t\t\t\t IT\n" +
                "\n\n" +
                "RAPS iTECH\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Ankit Jha \t\t\t\t IT\n" +
                "\n" +
                "2.\t\t\t\t Pratyush Chandra \t\t\t\t ME\n" +
                "\n" +
                "3.\t\t\t\t Ayush kumar \t\t\t\tME\n" +
                "\n");



        List<String> mittwenty = Arrays.asList("Alstom Transport India Ltd\n" +
                "\n" +
                "Sl. No.\t\t\t\t Name Discipline\n" +
                "\n" +
                "1.\t\t\t\t Priyam kumari \t\t\t\tEE\n" +
                "\n" +
                "2.\t\t\t\t Nishant kiran \t\t\t\tME\n" +
                "\n" ,
                " HCL\n\n" +
                "Sl. No. \t\t\t\tName \t\t\t\tDiscipline\n" +
                "1. \t\t\t\t Anubhav Shrivastava \t\t\t\tME\n" +
                "\n" +
                "2. \t\t\t\t Md Arshadullah \t\t\t\t ECE\n" +
                "\n" +
                " \n" +
                "\n" +
                " TCS\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Himanshu Raj \t\t\t\t ECE\n" +
                "\n" +
                "2. \t\t\t\tNidhi \t\t\t\tECE\n" +
                "\n" +
                "3. \t\t\t\t Aparna kumari \t\t\t\t IT\n" +
                "\n" +
                "4. \t\t\t\t Shagufta saheen \t\t\t\t IT\n" +
                "\n" +
                "5. \t\t\t\t Amisha \t\t\t\t IT\n" +
                "\n" +
                "\nIBM India\n" +
                "\n" +
                "Sl. No.\t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Apoorva Rathore \t\t\t\t IT\n" +
                "\n" +
                "2. \t\t\t\t Megha Sinha \t\t\t\t IT\n" +
                "\n" +
                "\nPrism Johnson Ltd\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name\t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Rishav kumar \t\t\t\t CE\n" +
                "\n" +
                "2.\t\t\t\t Mani Shankar \t\t\t\t CE\n" +
                "\n" +
                "\nWipro\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1.\t\t\t\t Aditya Ranjan \t\t\t\t IT \t\t\t\t,+" +
                        "\n\nWioska Mouldings Pvt Ltd.\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Ashutosh kumar \t\t\t\t ME\n" +
                "\n" +
                "\nOkaya Infocom\n" +
                "\n" +
                "Sl. No. \t\t\t\tName \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Ujjawal kumar \t\t\t\t EE\n" +
                "\n" +
                "\n Grifeo Technology\n" +
                "\n" +
                "Sl.No.\t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\tSUGANDHA KUMARI \t\t\t\t ECE\n" +
                "\n" +
                "2. \t\t\t\t SHIVANI \t\t\t\t ECE\n" +
                "\n" +
                "3. \t\t\t\t PUJA KUMARI \t\t\t\t ECE\n" +
                "\n" +
                "4. \t\t\t\tMAMTA KUMARI \t\t\t\t ECE\n" +
                "\n" +
                "5. \t\t\t\t VIMLA BHARTI \t\t\t\t ECE\n" +
                "\n" +
                "6. \t\t\t\t SHAGUFTA ANJUM \t\t\t\t EE\n" +
                "\n" +
                "7. \t\t\t\t ANJALI KUMARI \t\t\t\t EE\n" +
                "\n" +
                "8. \t\t\t\t PREETI KUMARI \t\t\t\t EE\n" +
                "\n" +
                "9. \t\t\t\t SUMIT KUMAR \t\t\t\t EE\n" +
                "\n" +
                "10. \t\t\t\t ANAND RANJAN \t\t\t\t EE\n" +
                "\n" +
                "11. \t\t\t\t GUNJAN KUMAR \t\t\t\t EE\n" +
                "\n" +
                "12. \t\t\t\t PARMANAND KUMAR \t\t\t\t EE\n" +
                "\n" +
                "13. \t\t\t\tSHANTANU KUMAR SINGH \t\t\t\t EE\n" +
                "\n" +
                "14. \t\t\t\t KESHAV CHANDRA \t\t\t\t EE\n" +
                "\n" +
                "15. \t\t\t\t NISHI ANAND \t\t\t\t IT\n" +
                "\n" +
                "16. \t\t\t\t BEAUTY KUMARI \t\t\t\t IT\n" +
                "\n" +
                "17. \t\t\t\t RUBY KUMARI \t\t\t\t IT\n" +
                "\n" +
                "18. \t\t\t\tSHWETA KUMARI \t\t\t\t IT\n" +
                "\n" +
                "19. \t\t\t\tRAIMA \t\t\t\tIT\n" +
                "\n" +
                "20. \t\t\t\t KUMARI JAHANVI \t\t\t\t IT\n" +
                "\n" +
                "21. \t\t\t\t RASHMI KUMARI \t\t\t\t IT\n" +
                "\n" +
                "22. \t\t\t\t MD KAIFEE \t\t\t\t IT\n" +
                "\n" +
                "23. \t\t\t\t AYUSHMAN \t\t\t\t IT\n" +
                "\n" +
                "24. \t\t\t\t MD NIZAMUDDIN \t\t\t\t IT\n" +
                "\n" +
                "25. \t\t\t\t SANDEEP RAHUL \t\t\t\t ME\n" +
                "\n" +
                "26. \t\t\t\t ABHISHEK ANAND \t\t\t\t ME\n" +
                "\n" +
                "27. \t\t\t\t KRISHNA KUMAR \t\t\t\t  ME\n" +
                "\n" +
                "\nPIE Infocomm\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Md Shaquib Ullah \t\t\t\t IT\n" +
                "\n" +
                "2. \t\t\t\t Anshuli kumari \t\t\t\t IT\n" +
                "\n" +
                "3. \t\t\t\t Aditya Singh \t\t\t\t IT\n" +
                "\n" +
                "4. \t\t\t\t Kanhaiya kumar \t\t\t\t ME\n" +
                "\n" +
                "5. \t\t\t\t Srishti Sneha \t\t\t\t ECE\n" +
                "\n" +
                "6. \t\t\t\t Vishal kumar \t\t\t\t ECE\n" +
                "\n" +
                "7. \t\t\t\t Rahul kumar Mishra \t\t\t\t CE\n" +
                "\n" +
                "8. \t\t\t\t Pratik Anand \t\t\t\t EE\n" +
                "\n" +
                "9. \t\t\t\t Bajrangi kumar \t\t\t\t EE\n" +
                "\n" +
                "\nSS Teleservices\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Sanjay kumar \t\t\t\t IT\n" +
                "\n" +
                "2. \t\t\t\t Anurag kumar \t\t\t\t IT\n" +
                "\n" +
                "3. \t\t\t\t Gaurav kumar \t\t\t\t IT\n" +
                "\n" +
                "4. \t\t\t\t Akash Raj \t\t\t\t ECE\n" +
                "\n" +
                "5. \t\t\t\t Naman kumar \t\t\t\t EE\n" +
                "\n" +
                "6. \t\t\t\t Praveen \t\t\t\t EE\n" +
                "\n" +
                "\nChibber Constructions\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Md Qamre Alam \t\t\t\t CE\n" +
                "\n" +
                "\nShyam Designers & Consultants\n" +
                "\n" +
                "Sl. No. \t\t\t\t Name \t\t\t\t Discipline\n" +
                "\n" +
                "1. \t\t\t\t Richa Sinha \t\t\t\t CE\n" +
                "\n" +
                "2. \t\t\t\t Pankaj kumar \t\t\t\t CE\n" +
                "\n" +
                "3. \t\t\t\t Rakesh kumar \t\t\t\t CE\n" +
                "\n" +
                "4. \t\t\t\t Raushan kumar \t\t\t\t CE\n" +
                "\n" +
                "5. \t\t\t\t Rahul kumar Mishra \t\t\t\t CE");

        List<Semester> Muzaffarpur = new ArrayList<>();
        Muzaffarpur.add(new Semester("2024", mittwentyfour));
        Muzaffarpur.add(new Semester("2023", mittwenttythree));
        Muzaffarpur.add(new Semester("2022", mittwentytwo));
        Muzaffarpur.add(new Semester("2021", mittwentyone));
        Muzaffarpur.add(new Semester("2020", mittwenty));

        branches.add(new Branch("MIT Muzaffarpur", Muzaffarpur));

        //BCE Bhagalpur
        List<String> bhagalpurtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> bhagalpurtwenttythree = Arrays.asList("S.No\n" +
                        "Session" +
                        "\nName" +
                        "\nBranch" +
                        "\nName of the Company" +
                        "\nSalary" +
                        "\nPackage" +
                        "\nMale /Female",

                "\n1." +
                        "\n" +
                        "2022-23\n" +
                        "Nancy Kumari" +
                        "\nECE" +
                        "\nVodafone Idea Ltd." +
                        "\n4.5 LPA" +
                        "\nFemale\n",
                "2." +
                        "\n2022-23" +
                        "\nKomal Sonali" +
                        "\nECE\n" +
                        "Vodafone Idea Ltd." +
                        "\n4.5 LPA" +
                        "\nFemale\n" +
                        "\n3.\n" +
                        "2022-23" +
                        "\nBharti Kumari" +
                        "\nECE\n" +
                        "Vodafone Idea Ltd. " +
                        "\n4.5 LPA" +
                        "\nFemale\n" +
                        "\n4." +
                        "\n2022-23" +
                        "\nAkash Kumar" +
                        "\nECE\n" +
                        "Mantra Softech Pvt. Ltd" +
                        "\n7.1 Lakhs\nMale\n" +
                        "\n5." +
                        "\n2022-23" +
                        "\nRishu Raj" +
                        "\nECE\n" +
                        "Mantra Softech Pvt. Ltd" +
                        "\n7.1 Lakhs" +
                        "\nMale\n" +
                        "\n6." +
                        "\n2022-23\n" +
                        "Rituraj Kumar Singh" +
                        "\nECE\n" +
                        "Mantra Softech Pvt. Ltd \n7.1 Lakhs \nMale\n" +
                        "\n7.\n 2022-23 \nAnuj Kumar \nEE\n" +
                        "High -Technext Engineering & Telecom Pvt. Ltd.\n" +
                        "3.5 LPA Male\n" +
                        "\n8. \n2022-23 \nSaurav Kumar \nEE \n3.5 LPA \nMale\n" +
                        "\n9.\n2022-23\n Manish Kumar \nEE \n3.5 LPA\n Male\n" +
                        "\n10. \n2022-23 \nRahul Kumar\n EE \n3.5 LPA \nMale\n" +
                        "\n11. \n2022-23 \nSushant Kumar \nEE \n3.5 LPA \nMale\n" +
                        "\n12. \n2022-23 \nRahul Kumar \nEE \n3.5 LPA \nMale\n" +
                        "\n13. \n2022-23\n" +
                        "Md. Aman Ansari \nEE \n3.5 LPA \nMale\n" +
                        "\n14.\n 2022-23\n Atul Ambashta\n EE\n 3.5 LPA\n Male\n" +
                        "\n15.\n 2022-23\n Mayank Kumar\n EE \n3.5 LPA\n Male\n" +
                        "\n16.\n 2022-23\n Prince Kumar \nEE \n3.5 LPA \nMale\n" +
                        "\n17.\n 2022-23 \nNishant Kumar\n EE \n3.5 LPA \nMale\n" +
                        "\n18.\n 2022-23 \nSunil Kumar \nEE \n3.5 LPA \nMale\n" +
                        "\n19.\n 2022-23\n" +
                        "Ravi Ranjan jha\n ECE\n 3.5 LPA \nMale\n" +
                        "\n20.\n 2022-23\n Prince Kumar \nECE\n 3.5 LPA\n Male\n" +
                        "\n21.\n2022-23\nPrince Raj\nECE\n3.5 LPA\nMale\n" +
                        "\n22.\n2022-23\n" +
                        "Pavan Kumar Thakur\nECE\n3.5 LPA\nMale\n" +
                        "\n23.\n2022-23\nSaurav Suman\nECE\n3.5 LPA\nMale\n" +
                        "\n24.2022-23\n" +
                        "Jay Prakash Kumar\nECE\n3.5 LPA\nMale\n" +
                        "\n25.\n2022-23\nKundan Kumar\nEE\nHiremi\n6-10 LPA\nMale\n" +
                        "\n26.\n2022-23\nShruti Sinha\nCSE\nHiremi\n6-10 LPA\nFemale\n" +
                        "\n27.\n2022-23\n" +
                        "Samrendra Kumar\n" +
                        "ME\nHiremi\n6-10 LPA\nMale\n" +
                        "\n28.\n2022-23\nSaurav Kumar\nEE\nHiremi\n6-10 LPA\nMale\n" +
                        "\n29.\n2022-23\n" +
                        "Vivek Kumar Chanchal\n" +
                        "EE\nHiremi\n6-10 LPA\nMale\n" +
                        "\n30.\n2022-23\nPiyush Bansal\nECE\nHiremi\n6-10 LPA\nMale",
                "\n31." +
                        "\n2022-23" +
                        "\nFiza Rahmani" +
                        "\nEE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nFemale\n" +
                        "\n32." +
                        "\n2022-23 Kumar" +
                        "\nGaurav" +
                        "\nME" +
                        "\nHiremi\n" +
                        "6-10 LPA" +
                        "\nMale\n" +
                        "\n33." +
                        "\n2022-23\n" +
                        "Mohammad Aiyaz Raza\n" +
                        "ECE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n34." +
                        "\n2022-23" +
                        "\nNishant Kumar" +
                        "\nME" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n35." +
                        "\n2022-23\n" +
                        "Ravikumar Thakur\n" +
                        "ECE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n36." +
                        "\n2022-23" +
                        "\nRahul Kumar" +
                        "\nEE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n37." +
                        "\n2022-23" +
                        "\nKrishna Kumar CSE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n38." +
                        "\n2022-23\n" +
                        "Shashi Kumar Parbat\n" +
                        "EE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n39." +
                        "\n2022-23" +
                        "\nMukesh Kumar" +
                        "\nECE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n40." +
                        "\n2022-23" +
                        "\nAnshu Priya" +
                        "\nCSE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nFemale\n" +
                        "\n41." +
                        "\n2022-23" +
                        "\nAditi Kumari" +
                        "\nECE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n42." +
                        "\n2022-23" +
                        "\nAbhishek Raj" +
                        "\nME " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n43. " +
                        "\n2022-23\n" +
                        "Pavankumar Thakur\n" +
                        "ECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n44." +
                        "\n2022-23" +
                        "\nMd Aman Ansari" +
                        "\nEE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n45." +
                        "\n2022-23" +
                        "\nRahul Kumar" +
                        "\nEE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n46." +
                        "\n2022-23" +
                        "\nAryan Keshri" +
                        "\nCSE" +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n47." +
                        "2022-23 " +
                        "\nShalini Sangeet " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nFemale\n" +
                        "\n48. " +
                        "\n2022-23 " +
                        "\nRidhi Kumari " +
                        "\nCSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nFemale\n" +
                        "\n49. " +
                        "\n2022-23" +
                        "\nGuddi Kumari " +
                        "\nCSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nFemale\n" +
                        "\n50." +
                        "\n2022-23\n" +
                        "Aashutosh Ranjan\n" +
                        "ME " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n51." +
                        "\n2022-23 " +
                        "\nShubham Kumar " +
                        "\nCSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n52. " +
                        "\n2022-23 " +
                        "\nKumar Abhishek " +
                        "\nEE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n53. " +
                        "\n2022-23 " +
                        "\nKrishna Kumar " +
                        "\nEE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n54. " +
                        "\n2022-23 " +
                        "\nKumar Gaurav " +
                        "\nME " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n55. " +
                        "\n2022-23 " +
                        "\nShatakshi " +
                        "\nCSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nFemale\n" +
                        "\n56. " +
                        "\n2022-23 " +
                        "\nDeepak Kumar " +
                        "\nCSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n57. " +
                        "\n2022-23\n" +
                        "Sadanand Kumar\n" +
                        "CSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n58. " +
                        "\n2022-23 " +
                        "\nSushant Kumar " +
                        "\nEE " +
                        "\nHiremi " +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n59. " +
                        "\n2022-23 " +
                        "\nSaurav Suman " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n60." +
                        "\n2022-23 " +
                        "\nRahul Kumar " +
                        "\nCSE " +
                        "\nHiremi " +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n61. " +
                        "\n2022-23\n" +
                        "Abhishek Abhigyanam\n" +
                        "CSE" +
                        "\nHiremi" +
                        "\n6-10 LPA" +
                        "\nMale\n" +
                        "\n62. " +
                        "\n2022-23 " +
                        "\nKomal Sonali " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nFemale\n" +
                        "\n63." +
                        "\n2022-23\n" +
                        "Bhanu Prakash Jha\n" +
                        "CSE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n64. " +
                        "\n2022-23" +
                        "\nSubham Kumar " +
                        "\nEE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n65. " +
                        "\n2022-23\n" +
                        "Krrish Kumar Gupta\n" +
                        "ME" +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n66. " +
                        "\n2022-23 " +
                        "\nRahul Kumar " +
                        "\nCSE " +
                        "\nHiremi" +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n67. " +
                        "\n2022-23 " +
                        "\nMukesh Kumar " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n68. " +
                        "\n2022-23 " +
                        "\nAshutosh Kumar " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n69. " +
                        "\n2022-23" +
                        "\nPraveen Kumar " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n",
                "\n70." +
                        "\n2022-23 " +
                        "\nManav Raj " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n71." +
                        "\n2022-23 " +
                        "\nSunil Kumar" +
                        "\nME " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nMale\n" +
                        "\n72." +
                        "\n2022-23 " +
                        "\nNidhi Sahu " +
                        "\nECE " +
                        "\nHiremi " +
                        "\n6-10 LPA " +
                        "\nFemale\n" +
                        "\n73." +
                        "\n2022-23\n" +
                        "Prince Kumar " +
                        "\nME " +
                        "\nKube Autotech Pvt. Ltd.,\n" +
                        "3.6 LPA " +
                        "\nMale\n" +
                        "\n74." +
                        "\n2022-23\n" +
                        "Md. Danish " +
                        "\nME " +
                        "\nKube Autotechn Pvt. Ltd.,\n" +
                        "3.6 LPA " +
                        "\nMale\n" +
                        "\n75." +
                        "\n2022-23 " +
                        "\nRahul Kumar" +
                        "\nCSE\n" +
                        "Q Spiders" +
                        "\n4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n76." +
                        "\n2022-23 " +
                        "\nSaurav Suman " +
                        "\nECE\n" +
                        "Q Spiders " +
                        "\n4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n77." +
                        "\n2022-23\n" +
                        "Md Faizan Zubair " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n78." +
                        "\n2022-23 " +
                        "\nKumar Abhishek " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n79." +
                        "\n2022-23 " +
                        "\nDeepak Kumar " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n80." +
                        "\n2022-23 " +
                        "Aayush Raj " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n81." +
                        "\n2022-23 " +
                        "\nKumar Gaurav " +
                        "\nME\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n82." +
                        "\n2022-23 " +
                        "\nNaincy Kumari " +
                        "\nECE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Female\n" +
                        "\n83." +
                        "\n2022-23 " +
                        "\nPrity Kumari " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Female\n" +
                        "\n84." +
                        "\n2022-23 " +
                        "\nManish Kumar " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n85." +
                        "\n2022-23\n" +
                        "Abhishek Abhigyanam " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n86." +
                        "\n2022-23 " +
                        "\nFiza Rahmani " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Female\n" +
                        "\n87." +
                        "\n2022-23 " +
                        "\nVinay Kumar " +
                        "\nECE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n88." +
                        "\n2022-23 " +
                        "\nSaurav Kumar " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n89." +
                        "\n2022-23 " +
                        "\nRajeev Ranjan " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n90." +
                        "\n2022-23 " +
                        "\nRahul Kumar " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n91." +
                        "\n2022-23" +
                        "\nAshant Kumar " +
                        "\nME\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n92." +
                        "\n2022-23 " +
                        "\nPriyanka Kumari " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Female\n" +
                        "\n93." +
                        "\n2022-23" +
                        "\nKajal Kumari " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Female\n" +
                        "\n94." +
                        "\n2022-23 " +
                        "\nRahul Kumar " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n95." +
                        "\n2022-23\n" +
                        "Aashutosh Ranjan " +
                        "\nME\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n96." +
                        "\n2022-23\n" +
                        "Ravi Kumar Thakur " +
                        "\nECE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n97." +
                        "\n2022-23\n" +
                        "Vivek Kumar Chanchal " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n98." +
                        "\n2022-23 " +
                        "\nNishikant Jivan " +
                        "\nME\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n",
                "\n99." +
                        "\n2022-23" +
                        "\nAnimesh " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n100." +
                        "\n2022-23 " +
                        "\nMridul " +
                        "\nECE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n101." +
                        "\n2022-23" +
                        "\nAryan Keshri " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n102." +
                        "\n2022-23 " +
                        "\nManish Kumar " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n103." +
                        "\n2022-23 " +
                        "\nVarun Singh " +
                        "\nECE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n104." +
                        "\n2022-23\n" +
                        "Suman Kumar Roy " +
                        "\nEE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n105." +
                        "\n2022-23 " +
                        "\nPrerit Dutta " +
                        "\nCSE\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n106." +
                        "\n2022-23 " +
                        "\nAkash Singh " +
                        "\nCivil\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n107." +
                        "2022-23\n" +
                        "Pankaj Kumar Gupta " +
                        "\nM.Tech\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n108." +
                        "\n2022-23 " +
                        "\nSaifullah Ansari " +
                        "\nM.Tech\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Male\n" +
                        "\n109." +
                        "\n2022-23 " +
                        "\nPriyanka Kumari " +
                        "\nM.Tech\n" +
                        "Q Spiders 4.2 – 4.8 LPA\n" +
                        "Female\n" +
                        "\n110." +
                        "\n2022-23\n" +
                        "Md. Aman Ansari\n" +
                        "EE" +
                        "\nGulati Auto Electricals Pvt. Ltd.\n" +
                        "Upto 05 LPA\n" +
                        "Male\n" +
                        "\n111." +
                        "\n2022-23\n" +
                        "Prince Kumar" +
                        "\nME Gulati " +
                        "\nAuto Electricals Pvt. Ltd.\n" +
                        "Upto 05 LPA\n" +
                        "Male\n" +
                        "\n112." +
                        "\n2022-23\n" +
                        "Fiza Rahmani " +
                        "\nEE " +
                        "\nGulati Auto Electricals Pvt. Ltd.\n" +
                        "Upto 05 LPA\n" +
                        "Female\n" +
                        "\n113." +
                        "\n2022-23\n" +
                        "Preeti Kumari " +
                        "\nME " +
                        "\nGulati Auto Electricals Pvt. Ltd.\n" +
                        "Upto 05 LPA\n" +
                        "Female\n" +
                        "\n114." +
                        "\n2022-23\n" +
                        "Kumar Guarav" +
                        "\nME Gulati Auto Electricals Pvt. Ltd.\n" +
                        "Upto 05 LPA\n" +
                        "Male\n" +
                        "\n115." +
                        "\n2022-23\n" +
                        "Anurag Basant " +
                        "\nVLSI Rinex Technologies Pvt. Ltd\n" +
                        "Upto 5.2 LPA\n" +
                        "Male\n" +
                        "\n116. " +
                        "\n2022-23\n" +
                        "Kumar Gaurav " +
                        "\nME Rinex\n" +
                        "Technologies Pvt. Ltd " +
                        "\nUpto 5.2 LPA\n" +
                        "Male\n" +
                        "\n117." +
                        "\n2022-23\n" +
                        "Krrish Kumar Gupta\n" +
                        "ME " +
                        "\nRinex Technologies Pvt. Ltd\n" +
                        "Upto 5.2 LPA\n" +
                        "Male\n" +
                        "\n118. " +
                        "\n2022-23\n" +
                        "Ravi Kumar Thakur\n" +
                        "ECE\n " +
                        "Rinex Technologies Pvt. Ltd\n" +
                        "Upto 5.2 LPA\n" +
                        "Male\n" +
                        "\n119." +
                        "\n2022-23\n" +
                        "Rahul Kumar " +
                        "\nCSE Rinex Technologies Pvt. Ltd\n" +
                        "Upto 5.2 LPA\n" +
                        "Male\n",
                "\n120. " +
                        "\n2022-23\n" +
                        "Krishna Kumar " +
                        "\nEE " +
                        "\nRinex Technologies Pvt. Ltd\n" +
                        "Upto 5.2 LPA\n" +
                        "Male\n" +
                        "\n121." +
                        "\n2022-23\n" +
                        "Abhishek Kumar Singh\n" +
                        "EE " +
                        "\nRinex Technologies Pvt. Ltd\n" +
                        "Upto 5.2 LPA\n" +
                        "Male\n" +
                        "\n122." +
                        "\n2022-23\n" +
                        "Kumar Gaurav " +
                        "\nME " +
                        "\nVictory Electric International\n" +
                        "5 LPA " +
                        "\nMale\n" +
                        "\n123." +
                        "\n2022-23\n" +
                        "Fiza Rahmani " +
                        "\nEE " +
                        "\nVictory Electric International\n" +
                        "5 LPA " +
                        "\nFemale\n" +
                        "\n124." +
                        "\n2022-23\n" +
                        "Rahul Kumar " +
                        "\nEE " +
                        "\nVictory Electric International\n" +
                        "5 LPA " +
                        "\nMale\n" +
                        "\n125." +
                        "\n2022-23\n" +
                        "Santosh Kumar " +
                        "\nEE " +
                        "\nVictory Electric International\n" +
                        "5 LPA " +
                        "\nMale\n" +
                        "\n126." +
                        "\n2022-23 " +
                        "\nSumit Kumar\n" +
                        "CE " +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n127. " +
                        "\n2022-23 " +
                        "\nPushkar Piyush\n" +
                        "CE " +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n128." +
                        "\n2022-23\n" +
                        "Sumit Kumar Mishra\n" +
                        "CE" +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n129. " +
                        "\n2022-23 " +
                        "\nDeepak Kumar\n" +
                        "CSE " +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n130." +
                        "\n2022-23 " +
                        "\nRahul Kumar\n" +
                        "CSE" +
                        "\nAcademor " +
                        "\n4 to 6\n" +
                        "LPA\n" +
                        "Male\n" +
                        "\n131." +
                        "\n2022-23 " +
                        "\nRajeev Ranjan\n" +
                        "CSE " +
                        "\nAcademor 4 to 6 LPA\n" +
                        "Male\n" +
                        "\n132." +
                        "\n2022-23 " +
                        "\nRidhi Kumari\n" +
                        "CSE" +
                        "\nAcademor 4 to 6 LPA\n" +
                        "Female\n" +
                        "\n133." +
                        "\n2022-23 " +
                        "\nDeepak Kumar\n" +
                        "ME" +
                        "\nAcademor " +
                        "4 to 6 LPA\n" +
                        "Male\n" +
                        "\n134. " +
                        "\n2022-23 " +
                        "\nManish Kumar\n" +
                        "CSE" +
                        "\nAcademor " +
                        "4 to 6 LPA\n" +
                        "Male\n" +
                        "\n135." +
                        "\n2022-23 " +
                        "\nNidhi Sahu\n" +
                        "ECE " +
                        "\nAcademor 4 to 6 LPA\n" +
                        "Female\n" +
                        "\n136." +
                        "\n2022-23 " +
                        "\nAbhishek Raj\n" +
                        "ME " +
                        "\nAcademor 4 to 6 LPA\n" +
                        "Male\n" +
                        "\n137." +
                        "\n2022-23\n" +
                        "Krrish Kumar Gupta\n" +
                        "ME" +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n138." +
                        "\n2022-23 " +
                        "\nAkash Kumar\n" +
                        "ECE " +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n139." +
                        "\n2022-23 " +
                        "\nDeepak Kumar\n" +
                        "EE " +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n140." +
                        "\n2022-23 " +
                        "\nSaurav Kumar\n" +
                        "EE " +
                        "\nAcademor " +
                        "\n4 to 6 LPA\n" +
                        "Male\n" +
                        "\n141." +
                        "\n2022-23 " +
                        "\nAnu Kumari\n" +
                        "VLSI Academor " +
                        "\n6 to 9 LPA\n" +
                        "Female\n" +
                        "\n142." +
                        "\n2022-23 " +
                        "\nAnurag Basant\n" +
                        "VLSI Academor " +
                        "\n6 to 9 LPA\n" +
                        "Male\n",
                "\n143." +
                        "\n2022-23 " +
                        "\nKaiser Azad\n" +
                        "Civil " +
                        "\nEcospace Infrastructures Pvt. Ltd.\n" +
                        "2.4 LPA" +
                        "\nMale\n" +
                        "\n144.\n" +
                        "2022-23 " +
                        "\nAniket " +
                        "\nCSE " +
                        "\nStreebo " +
                        "\n4 LPA " +
                        "\nMale\n" +
                        "\n145. " +
                        "\n2022-23 " +
                        "\nShumbham Raj " +
                        "\nCSE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n146." +
                        "\n2022-23 " +
                        "\nDeepak Kumar " +
                        "\nCSE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n147." +
                        "\n2022-23 " +
                        "\nRishi Kumari " +
                        "\nCSE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nFemale\n" +
                        "\n148." +
                        "\n2022-23 " +
                        "\nAbhinav " +
                        "\nCSE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n149." +
                        "\n2022-23 " +
                        "\nManish Kumar " +
                        "\nCSE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n150." +
                        "\n2022-23 " +
                        "\nRahul Kumar " +
                        "\nCSE " +
                        "\nTCS 3.5 LPA " +
                        "\nMale\n" +
                        "\n151." +
                        "\n2022-23 " +
                        "\nShambhav Kumar Azad " +
                        "\nCSE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n152." +
                        "\n2022-23 " +
                        "\nDharamveer Arya " +
                        "\nECE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n153." +
                        "\n2022-23 " +
                        "\nPrince Kumar " +
                        "\nECE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n154." +
                        "\n2022-23 " +
                        "\nAryan Kumar " +
                        "\nECE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n155." +
                        "\n2022-23 " +
                        "\nShalini Sangeet " +
                        "\nECE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nFemale\n" +
                        "\n156." +
                        "\n2022-23 " +
                        "\nNancy Kumari " +
                        "\nECE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nFemale\n" +
                        "\n157." +
                        "\n2022-23 " +
                        "\nHimanshu Raj " +
                        "\nECE " +
                        "\nTCS 3.5 LPA " +
                        "\nMale\n" +
                        "\n158." +
                        "\n2022-23 " +
                        "\nKumar Gaurav " +
                        "\nME " +
                        "\nTCS 3.5 LPA " +
                        "\nMale\n" +
                        "\n159." +
                        "\n2022-23 " +
                        "\nSanrendra Kumar " +
                        "\nME " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nMale\n" +
                        "\n160." +
                        "\n2022-23 " +
                        "\nSristhi " +
                        "\nEE " +
                        "\nTCS " +
                        "\n3.5 LPA " +
                        "\nFemale\n" +
                        "\n161." +
                        "\n2022-23 " +
                        "\nMridul Bhaskar " +
                        "\nECE Hexaware " +
                        "\n6 LPA " +
                        "\nFemale\n" +
                        "\n162." +
                        "\n2022-23 " +
                        "\nAryan " +
                        "\nECE " +
                        "\nHexaware " +
                        "\n6 LPA " +
                        "\nMale\n" +
                        "\n163.\n" +
                        "2022-23 " +
                        "\nDeepankar Pandey " +
                        "\nEE\n" +
                        "Nagarro Software pvt. ltd.\n" +
                        "3.5 LPA " +
                        "\nMale\n" +
                        "\n164." +
                        "\n2022-23 " +
                        "\nFiza Rahmani " +
                        "\nEE " +
                        "\nInMovidu " +
                        "\n3 LPA " +
                        "\nMale\n" +
                        "\n165." +
                        "\n2022-23 " +
                        "\nAayush Raj " +
                        "\nCSE " +
                        "\nAshok Leyland " +
                        "\n8.5 lacs " +
                        "\nMale\n" +
                        "\n166." +
                        "\n2022-23 " +
                        "\nAshutosh Kumar " +
                        "\nECE " +
                        "\nTCS " +
                        "\nDigital Role " +
                        "\n7 Lacs " +
                        "\nMale\n" +
                        "\n167." +
                        "\n2022-23 " +
                        "\nAashutosh kumar " +
                        "\nEE " +
                        "\nPagarbook " +
                        "\n13LPA " +
                        "\nMale\n" +
                        "\n168.\n" +
                        "2022-23 " +
                        "\nShubham Kumar " +
                        "\nEE\n" +
                        "Tata Consultancy Services\n" +
                        "4 LPA " +
                        "\nMale\n" +
                        "\n169." +
                        "\n2022-23 " +
                        "\nFiza Rehmani " +
                        "\nEE " +
                        "\nItobuz Technologies " +
                        "\n3.5 LPA " +
                        "\nFemale\n" +
                        "\n170." +
                        "\n2022-23 " +
                        "\nAyush Anand " +
                        "\nEE " +
                        "\nSSCJE Level 6 " +
                        "\nMale\n" +
                        "\n171. " +
                        "\n2022-23 " +
                        "\nPranjal Pushp " +
                        "\nEE " +
                        "\nSSCJE Level 6 " +
                        "\nMale\n" +
                        "\n172. " +
                        "\n2022-23 " +
                        "\nHarsh Raj " +
                        "\nME " +
                        "\nGreedy Game Media" +
                        "\n9-15 LPA " +
                        "\nMale\n" +
                        "\n173.\n" +
                        "2022-23 " +
                        "\nRavi Shankar Pandey " +
                        "\nME " +
                        "\nParth asharm " +
                        "\n4.2 LPA " +
                        "\nMale",
                "\n174.\n" +
                        "2022-23\n " +
                        "Chandan Kumar \n" +
                        "CSE\n" +
                        "Postal Department of India\n" +
                        "1.80 LPA " +
                        "\nMale\n" +
                        "\n175. " +
                        "\n2022-23 " +
                        "\nManish Kumar " +
                        "\nCSE " +
                        "\nTCSL " +
                        "\n7 LPA " +
                        "\nMale\n" +
                        "\n176.\n" +
                        "2022-23 " +
                        "\nAbhishek Kumar " +
                        "\nEE " +
                        "\nPGCIL PSU Norms " +
                        "\nMale\n" +
                        "\n177.\n " +
                        "2022-23 " +
                        "\nKumar Gaurav " +
                        "\nME " +
                        "\nHCL Technologies " +
                        "\nMale\n" +
                        "\n178." +
                        "\n2022-23 " +
                        "\nFiza Rahmani " +
                        "\nEE " +
                        "\nHCL " +
                        "\nTechnologies " +
                        "\nMale\n" +
                        "\n179. " +
                        "\n2022-23 " +
                        "\nSattivik Pravar " +
                        "\nME " +
                        "\nHCL Technologies " +
                        "\nMale\n" +
                        "\n180. " +
                        "\n2022-23 " +
                        "\nJyotish Malviya " +
                        "\nME " +
                        "\nHCL Technologies " +
                        "\nMale\n" +
                        "\n181.\n" +
                        "2022-23 " +
                        "\nNeha Sinha\n" +
                        "VLSI & Microelectronics(ECE)\n" +
                        "Tata Cummins " +
                        "\nFemale");


        List<String> bhagalpurtwentytwo = Arrays.asList("Sl.No. Session Name Branch Name of the\n" +
                "Company\n" +
                "Salary\n" +
                "Package\n" +
                "Male/\n" +
                "Female\n" +
                "\n1. 2021-22 SAURAB KUMAR CSE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n2. 2021-22 SHALU KUMARI ECE Wipro\n" +
                "Technologies 3.5 LPA Female\n" +
                "\n3. 2021-22 MUKAND KUMAR CSE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n4. 2021-22 ABHINAV KUMAR ME Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n5. 2021-22 ANANT KUMAR ECE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n6. 2021-22 GAURAV KUMAR ECE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n7. 2021-22 Vandana Bharti CSE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n8. 2021-22 Annu Prasad CSE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n9. 2021-22 Abhijeet Kumar CSE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n10. 2021-22 SHUBHAM KUMAR ECE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n11. 2021-22 Sonali Kumari CSE Wipro\n" +
                "Technologies 3.5 LPA Female\n" +
                "\n12. 2021-22 Ruchika CSE Wipro\n" +
                "Technologies 3.5 LPA Female\n" +
                "\n13. 2021-22 Saurabh Kumar ECE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n14. 2021-22 Vijay ME Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n15. 2021-22 Kundan Kumar CE Wipro\n" +
                "Technologies 3.5 LPA Male\n" +
                "\n16. 2021-22 Shruti Mehta EE Wipro\n" +
                "Technologies 3.5 LPA Female\n" +
                "\n17. 2021-22 Anshika Kumari EE Wipro\n" +
                "Technologies 3.5 LPA Female\n" +
                "\n18. 2021-22 Gudiya Rani EE Wipro\n" +
                "Technologies 3.5 LPA Female\n" +
                "\n19. 2021-22 ANKIT KUMAR CSE Capegemini 3.4 LPA Male\n" +
                "\n20. 2021-22 ADITYA RAJ CSE Capegemini 3.4 LPA Male\n" +
                "\n21. 2021-22 APARNA CSE Capegemini 3.4 LPA Female\n" +
                "\n22. 2021-22 ANJALI BHARTI ECE Capegemini 3.4 LPA Female\n" +
                "\n23. 2021-22 AMISHA BHARTI ECE Capegemini 3.4 LPA Female\n" +
                "\n24. 2021-22 Vandana Bharti CSE Capegemini 3.4 LPA Female\n" +
                "\n25. 2021-22 Anita Kumari CSE IBM 4 LPA Female\n" +
                "\n26. 2021-22 SHUBHAM AKELA ECE Infosys 5 LPA Male\n" +
                "\n27. 2021-22 SAURAB KUMAR CSE Infosys 5 LPA Male\n" +
                "\n28. 2021-22 APARNA CSE Infosys 5 LPA Female\n" +

                "\n29. 2021-22 ANJALI BHARTI CSE Infosys 5 LPA Female\n" +
                "\n30. 2021-22 SAPNA KUMARI ECE Infosys 5 LPA Female\n" +
                "\n31. 2021-22 RAUSHAN\n" +
                "KUMAR CSE Infosys 5 LPA Male\n" +
                "\n32. 2021-22 NEHA KUMARI CSE Infosys 5 LPA Female\n" +
                "\n33. 2021-22 SHUBHAM AKELA ECE Techglaz Labs\n" +
                "Pvt. Ltd. Founder Male\n" +
                "\n34. 2021-22 NISHANT KUMAR ECE Techglaz Labs\n" +
                "Pvt. Ltd. Founder Male\n" +
                "\n35. 2021-22 ROHAN KUMAR ECE Tech Lateetud\n" +
                "Private Limited. 4 LPA Male\n" +
                "\n36. 2021-22 Sakshi Gupta CSE Josh Talks 10 LPA Female\n" +
                "\n37. 2021-22 Mohit Gupta CSE Josh Talks 10 LPA Male\n" +
                "\n38. 2021-22 Shalini Kumari CSE Josh Talks 10 LPA Female\n" +
                "\n39. 2021-22 Mohit Gupta CSE Neon Byte 16 LPA Male\n" +
                "\n40. 2021-22 Kumar Saurabh Raj CSE Front Row 15 LPA Male\n" +
                "\n41. 2021-22 Kumar Saurabh Raj CSE Sorcero 30 LPA Male\n" +
                "\n42. 2021-22 Sonali Kumari CSE Raja Software\n" +
                "Labs Pvt. Ltd 6 LPA Female\n" +
                "\n43. 2021-22 Aman Kumar Jha CSE Raja Software\n" +
                "Labs Pvt. Ltd 6 LPA Male\n" +
                "\n44. 2021-22 Ranjan Kumar ECE Cognizant 3.8 LPA Male\n" +
                "\n45. 2021-22 Sumit Kumar Sah ECE Cognizant 3.8 LPA Male\n" +
                "\n46. 2021-22 Kumar Anubhav CSE Cognizant 3.8 LPA Male\n" +
                "\n47. 2021-22 Manisha Kumari CSE Cognizant 3.8 LPA Female\n" +
                "\n48. 2021-22 Aashi Kumari CSE Cognizant 3.8 LPA Female\n" +
                "\n49. 2021-22 Ravi Kumar Chaudhary CSE\n" +
                "LCX -Liechtenstein Cryptoassets Exchange\n" +
                "4.5 LPA Male\n" +
                "\n50. 2021-22 Mushkan Burnwal CSE Accolite Digital\n" +
                "India Pvt. Ltd. 5 LPA Female\n" +
                "\n51. 2021-22 Neha Kumari CSE Geeks for\n" +
                "Geeks 5 LPA Female\n" +
                "\n52. 2021-22 Raushan Kumar CSE Hexaview\n" +
                "Technologies 4 LPA Male\n" +
                "\n53. 2021-22 Anjali Kumari Soni CSE Sopra Steria\n" +
                "Noida 3.5 LPA Female\n" +
                "\n54. 2021-22 Aman Kumar CSE Albanero 5.5 LPA Male\n" +
                "\n55. 2021-22 Gaurav Kumar CE Prism Johnson Male\n" +
                "\n56. 2021-22 Piyush Kumar CE Prism Johnson Male\n" +
                "\n57. 2021-22 Madhav raj CE Prism Johnson Male\n" +
                "\n58. 2021-22 Anjali Kumari CSE Wipro Female\n" +
                "\n59. 2021-22 Mohit Gupta CSE Wipro Male\n" +
                "\n60. 2021-22 Vandana Bharti CSE Wipro Female\n" +
                "\n61. 2021-22 RASHMI KUMARI CSE Wipro Female\n" +
                "\n62. 2021-22 Sonali Kumari CSE Wipro Female\n" +
                "\n63. 2021-22 PUMMY BABY CSE Wipro Female\n" +
                "\n64. 2021-22 ABHIJEET KUMAR CSE Wipro Male\n" +

                "\n65. 2021-22 ANNU PRASAD CSE Wipro Male\n" +
                "\n66. 2021-22 SAURAB KUMAR CSE Wipro Male\n" +
                "\n67. 2021-22 Shalu Kumari ECE Wipro Female\n" +
                "\n68. 2021-22 Prince Kumar patel CSE Byju's Male\n" +
                "\n69. 2021-22 Amit Kumar ME Byju's Male\n" +
                "\n70. 2021-22 Prince kumar patel CSE HCL\n" +
                "Technologies Male\n" +
                "\n71. 2021-22 Sintu Kumar Sah ECE HCL\n" +
                "Technologies Male\n" +
                "\n72. 2021-22 Atul Raj CSE HCL\n" +
                "Technologies Male\n" +
                "\n73. 2021-22 Sonali Kumari CSE HCL\n" +
                "Technologies Female\n" +
                "\n74. 2021-22 MD. SADIQUE\n" +
                "NASIM CSE HCL\n" +
                "Technologies Male\n" +
                "\n75. 2021-22 Vandana CSE HCL\n" +
                "Technologies Female\n" +
                "\n76. 2021-22 Shivani Kumari CSE HCL\n" +
                "Technologies Female\n" +
                "\n77. 2021-22 Aashish Anurag CSE Savantis\n" +
                "Solutions Male\n" +
                "\n78. 2021-22 RAUSHAN KUMAR\n" +
                "RAUT ECE Savantis\n" +
                "Solutions Male\n" +
                "\n79. 2021-22 Radhamani kumari EE Savantis\n" +
                "Solutions Female\n" +
                "\n80. 2021-22 Sintu Kumar Sah ECE HCL\n" +
                "Technologies Male\n" +
                "\n81. 2021-22 Rajesh Kumar CSE Info Stretch\n" +
                "Corporation Male\n" +
                "\n82. 2021-22 Prince kumar patel CSE HCL\n" +
                "Technologies Male\n" +
                "\n83. 2021-22 Atul Raj CSE HCL\n" +
                "Technologies Male\n" +
                "\n84. 2021-22 Bulbul Kumari CSE HCL\n" +
                "Technologies Female\n" +
                "\n85. 2021-22 Abhay kumar ECE HCL\n" +
                "Technologies Male\n" +
                "\n86. 2021-22 Aditya Kumar EE HCL\n" +
                "Technologies Male\n" +
                "\n87. 2021-22 Himanshu Ranjan EE HCL\n" +
                "Technologies Male\n" +
                "\n88. 2021-22 Neeraj Kumar EE HCL\n" +
                "Technologies Male\n" +
                "\n89. 2021-22 Shubham Kumar CSE HCL\n" +
                "Technologies Male\n" +
                "\n90. 2021-22 Mohammad Adnan CSE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n91. 2021-22 Aradhya EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +

                "\n92. 2021-22 RUCHIKA\n" +
                "SHARMA CSE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n93. 2021-22 ABHINAV KUMAR ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n94. 2021-22 Prabhas Kumar ECE\n" +
                "Wyreflow (CRTD echnologies) 7 LPA Male\n" +
                "\n95. 2021-22 Sushant Pratap\n" +
                "Singh ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n96. 2021-22 Shweta EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n97. 2021-22 MD SHAHAN\n" +
                "PARVEZ ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n98. 2021-22 Rohan pratap EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n99. 2021-22 Nishtha Prabha CSE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n100. 2021-22 Subham sinha EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n101. 2021-22 Praveen kumar singh ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n102. 2021-22 Aarti Kumari CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n103. 2021-22 Prashant EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n104. 2021-22 Shalu Kumari ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n105. 2021-22 Manjeet kumar EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n106. 2021-22 Raushan kumar ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n107. 2021-22 Abhay kumar CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n108. 2021-22 Nishi Kumari EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +

                "\n109. 2021-22 Aditya Raj ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n110. 2021-22 Nandan Kumar\n" +
                "Singh CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n111. 2021-22 Ritu Kumari EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n112. 2021-22 Ujjawal Kumar ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n113. 2021-22 Krishna Kumar Jha ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n114. 2021-22 Himanshu Mishra ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n115. 2021-22 Ankit kumar ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n116. 2021-22 Kumar Sarang ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n117. 2021-22 Kumar Prabhakar ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n118. 2021-22 Vijay prakash ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n119. 2021-22 Kumar Aman ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n120. 2021-22 Srishti Singh CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA\n" +
                "\n121. 2021-22 Suraj Kumar CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n122. 2021-22 Abhishek Raj CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n123. 2021-22 Ayushi Rani CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n124. 2021-22 Madhav Raj CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n125. 2021-22 Anshika Kumari EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +

                "\n126. 2021-22 Nikki Kumari EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n127. 2021-22 Deepak kumar CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n128. 2021-22 Apoorva Krishna ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n129. 2021-22 Shree Ram Kumar CSE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n130. 2021-22 Md Naiyar Azam ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n131. 2021-22 Amit Kumar ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n132. 2021-22 Sonu Kumar ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n133. 2021-22 Nishant Kumar ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n134. 2021-22 ATUL\n" +
                "PRABHAKAR ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n135. 2021-22 Kumari Archana EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n136. 2021-22 Gudiya Rani EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n137. 2021-22 Nadim Ahmed khan EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n138. 2021-22 Vivek Roshan ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n139. 2021-22 Anju Kumari CSE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n140. 2021-22 Gaurav Kumar ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n141. 2021-22 Sapna Kumari ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n142. 2021-22 Abhishek Ayushya ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +

                "\n143. 2021-22 Suman ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n144. 2021-22 DEEPAK KUMAR ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n145. 2021-22 HANS RAJ KUMAR ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n146. 2021-22 Satyam Kumar EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n147. 2021-22 Md Osama Khalid ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n148. 2021-22 MUKUND KUMAR ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n149. 2021-22 Urvashi Kashyap ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n150. 2021-22 NITISH KUMAR EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n151. 2021-22 Avinash Kumar ECE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n152. 2021-22 ANUJ ANAND ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n153. 2021-22 PIYUSH KUMAR\n" +
                "SINHA EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n154. 2021-22 Amir suhail CE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n155. 2021-22 SARVESH KUMAR CE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n156. 2021-22 Sundaram Kumar CE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n157. 2021-22 Akash kumar CE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n158. 2021-22 Rupak kumar ME\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n159. 2021-22 Md Aayanul Hoda ME\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +

                "\n160. 2021-22 SHIVAM KUMAR ME\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n161. 2021-22 Deepak kumar CSE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n162. 2021-22 Dhiraj Kumar ME\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n163. 2021-22 HIMANSHU\n" +
                "KUMAR SINGH ME\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Male\n" +
                "\n164. 2021-22 Kundan Kumar CE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n165. 2021-22 Ranvir Kumar ME\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n166. 2021-22 RANVEER RAJ EE\n" +
                "Wyreflow(CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n167. 2021-22 Vinod Kumar CE\n" +
                "Wyreflow(CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n168. 2021-22 Anant kumar ECE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n169. 2021-22 GOLU KUMAR CE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n170. 2021-22 Shruti Mehta EE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Female\n" +
                "\n171. 2021-22 Kumari Akriti EE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Female\n" +
                "\n172. 2021-22 Prabhat Priydarshi ECE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n173. 2021-22 Avinash kumar ME\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Female\n" +
                "\n174. 2021-22 S Kumar Sahil CE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n175. 2021-22 Rohan Kumar ECE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n176. 2021-22 Aman Kumar EE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +

                "\n177. 2021-22 SUMIT KUMAR\n" +
                "SUMAN EE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Female\n" +
                "\n178. 2021-22 UTKARSH KUMAR\n" +
                "MAURYA ECE\n" +
                "Wyreflow  (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n179. 2021-22 RAHUL\n" +
                "CHAUDHARY ECE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n180. 2021-22 Aashish Anurag CSE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n181. 2021-22 VIKASH KUMAR ECE\n" +
                "Wyreflow (CRTDTechnologies)\n" +
                "7 LPA Male\n" +
                "\n182. 2021-22 Shweta Dev EE\n" +
                "Wyreflow (CRTD Technologies)\n" +
                "7 LPA Female\n" +
                "\n183. 2021-22 AMAN KUMAR\n" +
                "JHA CSE Carnation\n" +
                "Infotech\n" +
                "4.5 LPA Male\n" +
                "\n184. 2021-22 Shree Ram Kumar CSE Carnation\n" +
                "Infotech\n" +
                "4.5 LPA Male\n" +
                "\n185. 2021-22 Riya Ranjan ECE Vodafone\n" +
                "Idea Ltd\n" +
                "4.5 LPA Male\n" +
                "\n186. 2021-22 Riya Choudhary ECE Vodafone Idea Ltd\n" +
                "4.5 LPA Male\n" +
                "\n187. 2021-22 Gracy Kumari ECE Vodafone Idea Ltd\n" +
                "4.5 LPA Female\n" +
                "\n188. 2021-22 Shilpi Kumari ECE Vodafone\n" +
                "Idea Ltd\n" +
                "4.5 LPA Female");


        List<String> bhagalpurtwentyone = Arrays.asList("S.no\n" +
                ".\n" +
                "Academic\n" +
                "Session\n" +
                "Name of student Branch Name of\n" +
                "Company\n" +
                "Salary\n" +
                "Package\n" +
                "Male/Female\n" +
                "\n1. 2020-21 Richa Raj ECE TCS 3.36\n" +
                "LPA Female\n" +
                "\n2. 2020-21 Sanu kumar CSE TCS 3.36\n" +
                "LPA Male\n" +
                "\n3. 2020-21 ANKIT MISHRA CSE TCS 3.36\n" +
                "LPA Male\n" +
                "\n4. 2020-21 Akshay Rishabh CSE TCS 3.36\n" +
                "LPA Male\n" +
                "\n5.\n 2020-21 NISHU KUMARI CSE TCS 3.36\n" +
                "LPA Female\n" +
                "\n6. 2020-21 Manisha Kumari CSE Infosys 5 LPA Female\n" +
                "\n7. 2020-21 Aashi Kumari CSE TCS 3.36\n" +
                "LPA Female\n" +
                "\n8. 2020-21 Aditya Kumar CSE TCS 3.36\n" +
                "LPA Male\n" +
                "\n9. 2020-21 Stuti Gupta EE TCS 3.36\n" +
                "LPA Female\n" +
                "\n10. 2020-21 Sweety Kumari EE TCS 3.36\n" +
                "LPA Female\n" +
                "\n11.. 2020-21 Shubham Kumar Singh ECE TCS 3.36\n" +
                "LPA Male\n" +
                "\n12. 2020-21 Vinit Kumar CE Prism Johnson 5.4\n" +
                "LPA Male\n" +
                "\n13. 2020-21 Anup Mishra ME Cognizant 3.8\n" +
                "LPA Male\n" +
                "\n14. 2020-21 Shubham Kumar ME TCS 3.36\n" +
                "LPA Male\n" +
                "\n15. 2020-21 Sumit KR. Sah ECE Cognizant 3.8\n" +
                "LPA Male\n" +
                "\n16. 2020-21 Swati Kumari CSE HCL TECHNOLO GIES\n" +
                "3 LPA Female\n" +
                "\n17. 2020-21 Priya CSE HCL\n" +
                "technologies 3 LPA Female\n" +
                "\n18. 2020-21 Kishan Kumar Singh CSE WIpro 3.3\n" +
                "LPA Male\n" +
                "\n19. 2020-21 Manisha Kumari CSE Cognizant 3.8\n" +
                "LPA Female\n" +
                "\n20. 2020-21 Sushmita Madhuri CSE Accenture 3.6\n" +
                "LPA Female\n" +
                "\n21. 2020-21 Nikku Priya CSE Wipro Technologies\n" +
                "3.3 LPA Female\n" +
                "\n22. 2020-21 Manisha Kumari CSE Accenture 3.6\n" +
                "LPA Female\n" +

                "\n23. 2020-21 Richa Siddhi CSE Accenture 3.6\n" +
                "LPA Female\n" +
                "\n24. 2020-21 Iqbal Zafar CSE xtramarks Education India Pvt. Ltd.\n" +
                "3.6 LPA Male\n" +
                "\n25. 2020-21 Aashi Kumari CSE IBM 6 LPA Female\n" +
                "\n26. 2020-21 Aashi Kumari CSe Accenture 3.6\n" +
                "LPA Female\n" +
                "\n27. 2020-21 Aashi Kumari CSE Cognizant 3.8\n" +
                "LPA Female\n" +
                "\n28. 2020-21 Braj Kishore CSE Accenture 3.6\n" +
                "LPA Male\n" +
                "\n29. 2020-21 Divyanshu Kumar CSE Accenture 3.6\n" +
                "LPA Male\n" +
                "\n30. 2020-21 Aman Kumar CSE Albanero 5.5\n" +
                "LPA Male\n" +
                "\n31. 2020-21 Kumar Anubhav CSE Cognizant 3.8\n" +
                "LPA Male\n" +
                "\n32. 2020-21 Aashi Kumari CSE Capegemini 3.4LPA Female\n" +
                "\n33. 2020-21 Anjali Kumari Soni CSE Sopra Steria Noida\n" +
                "3.5 LPA Female\n" +
                "\n34. 2020-21 Suresh Kumar CSE\n" +
                "Vidyayan Eduventure Pvt Ltd Founder\n" +
                "Male\n" +
                "\n35. 2020-21 Durga kumari ECE HCL 3 LPA Female\n" +
                "\n36. 2020-21 Mitul Prasad ECE TCS 3.36\n" +
                "LPA Male\n" +
                "\n37. 2020-21 Khushboo Kumari ECE HCL 3 LPA Female\n" +
                "\n38. 2020-21 Chandni Kumari ECE HCL 3 LPA Female\n" +
                "\n39. 2020-21 Utkarsh Kr. Maurya ECE Wyreflow 3.6\n" +
                "LPA Male\n" +
                "\n40. 2020-21 Saumya Sumit ECE Accenture 3.6\n" +
                "LPA Male\n" +
                "\n41. 2020-21 Shilpi Kumari ECE Vodafone Idea Ltd.\n" +
                "4.5 LPA Female\n" +
                "\n42. 2020-21 Ranjan Kumar ECE Congizant 3.8\n" +
                "LPA Male\n" +
                "\n43. 2020-21 Rahul Choudhary ECE Wyreflow 3.6\n" +
                "LPA Male\n" +
                "\n44. 2020-21 Surya Prakash ECE TCS 3.36\n" +
                "LPA Male\n" +
                "\n45. 2020-21 Keshav Kumar ECE Congizant 3.8\n" +
                "LPA Male\n" +
                "\n46. 2020-21 Sumit KR. Sah ECE TCS 3.36\n" +
                "LPA Male\n" +
                "\n47. 2020-21 Swetak Kumar ECE BYJU's 8 LPA Male\n" +
                "\n48. 2020-21 Riya Ranjan ECE Vodafone Idea Ltd.\n" +
                "4.5 LPA Male\n" +
                "\n49. 2020-21 Vikash Kumar ECE Wyreflow 3.6 LPA Male");


        List<String> bhagalpurtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Bhagalpur = new ArrayList<>();
        Bhagalpur.add(new Semester("2024", bhagalpurtwentyfour));
        Bhagalpur.add(new Semester("2023", bhagalpurtwenttythree));
        Bhagalpur.add(new Semester("2022", bhagalpurtwentytwo));
        Bhagalpur.add(new Semester("2021", bhagalpurtwentyone));
        Bhagalpur.add(new Semester("2020", bhagalpurtwenty));

        branches.add(new Branch("BCE Bhagalpur", Bhagalpur));


        //GCE Gaya
        List<String> gayatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> gayatwenttythree = Arrays.asList("S.No. Name Branch Placed into CTC(In LPA) Placement\n" +
                "\n\n1. Darshan Kumar ME HCL 2.2 Pool Campus\n" +
                "\n\n2. Shwet Nisha ME TCS 3.36 Pool Campus\n" +
                "\n\n3. Md. Shahid Anwar ME TCS 3.36 Pool Campus\n" +
                "\n\n4. Avinash Kumar ME Aviotron Aerospace 3 On Campus\n" +
                "HCL 2.2 Pool Campus\n" +
                "High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n5. Alok Kumar ME Aviotron Aerospace 3 On Campus\n" +
                "\n\n6. Dilip Kumar sharma ME Aviotron Aerospace 3 On Campus\n" +
                "\n\n7. Jai prakash kumar ME HCL 2.2 Pool Campus\n" +
                "Sampoorn Ev pvt Ltd. 5 On Campus\n" +
                "ASC International 5 On Campus\n" +
                "Gulati auto Electricals pvt. Ltd. 5 On Campus\n" +
                "Kube Infotech 3.6 On Campus\n" +
                "\n\n9. Babita kumari ME Sampoorn Ev pvt Ltd. 5 On Campus\n" +
                "\n\n10. Md.Kamran Ansari ME High tech next Engineering &Telcom pvt.Ltd. 2.5 off campus\n" +
                "\n\n11. vishwajeet Bharti ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n12. Ayush Raj ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n13. Anand Aman ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n14. Deepak kumar Sah ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n15. Amrit lal shetty ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n16. Rajesh Kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n17. Arbind Kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n18. Rakesh kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n19. Dipesh Kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n20. Kaushar Kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n21. Aryan deo ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n22. Aman kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n23. Aman kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n24. Mrinal Kumar ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n25. Neeraj ME High tech next Engineering &Telcom pvt.Ltd. 2.2 -3.6 On Campus\n" +
                "\n\n26. Md. Shahab Sabah ME ASC International 5 On Campus\n" +
                "\n\n27. Md. Kamran Ansari ME ASC International 5 On Campus\n" +
                "\n\n28. Rahul kumar ME Kube Infotech 3.6 On Campus\n" +
                "\n\n29. Ravi Ranjan Kumar ME Kube Infotech 3.6 On Campus");

        List<String> gayatwentytwo = Arrays.asList("S.No. Session Name of Student Branch Name of Company Salary Package\n" +
                "\n\n1. 2020-2021 Rohit kumar CE Prism Johnson Limited 5 lakhs\n" +
                "\n\n2. 2020-2021 Raja kumar CE Prism Johnson Limited 5 lakhs\n" +
                "\n\n3. 2020-2021 Ishant Patel CE Prism Johnson Limited 5 lakhs\n" +
                "\n\n4. 2020-2021 Ankita kumari CE GRIEFO 4.8 lakhs\n" +
                "\n\n5. 2020-2021 PREM KUMAR EEE GRIEFO 4.8 lakhs\n" +
                "\n\n6. 2020-2021 Pankaj Kumar EEE GRIEFO 4.8 lakhs\n" +
                "\n\n7. 2020-2021 Romi Raushan EEE GRIEFO 4.8 lakhs\n" +
                "\n\n8. 2020-2021 Saurav Kumar EEE GRIEFO 4.8 lakhs\n" +
                "\n\n9. 2020-2021 Kumari Sneha EEE GRIEFO 4.8 lakhs\n" +
                "\n\n10. 2020-2021 Ashish Ranjan EEE GRIEFO 4.8 lakhs\n" +
                "\n\n11. 2020-2021 Adarsh Kumar EEE GRIEFO 4.8 lakhs\n" +
                "\n\n12. 2020-2021 Puja Kumari EEE GRIEFO 4.8 lakhs\n" +
                "\n\n13. 2020-2021 Ravi kumar EEE GRIEFO 4.8 lakhs\n" +
                "\n\n14. 2020-2021 Akash Kumar ME GRIEFO 4.8 lakhs\n" +
                "\n\n15. 2020-2021 Nitish kumar ME GRIEFO 4.8 lakhs\n" +
                "\n\n16. 2020-2021 Sumesh kumar yadav ME GRIEFO 4.8 lakhs\n" +
                "\n\n17. 2020-2021 POOJA VERMA CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n18. 2020-2021 ARTI KUMARI CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n19. 2020-2021 ANUJ KUMAR CSE GRIEFO 4.8 lakhs\n" +
                "\n\n20. 2020-2021 ARADHANA KUMARI CSE GRIEFO 4.8 lakhs\n" +
                "\n\n21. 2020-2021 Prince Priyadarshi CSE GRIEFO 4.8 lakhs\n" +
                "\n\n22. 2020-2021 Rahul kumar CSE GRIEFO 4.8 lakhs\n" +
                "\n\n23. 2020-2021 Suman kumar CSE GRIEFO 4.8 lakhs\n" +
                "\n\n24. 2020-2021 Vivek Kumar CSE GRIEFO 4.8 lakhs\n" +
                "\n\n25. 2020-2021 Saurav Kumar CSE GRIEFO 4.8 lakhs\n" +
                "\n\n26. 2020-2021 RAJNI ROJA CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n27. 2020-2021 ANAHITA SINHA CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n28. 2020-2021 MONIKA KUMARI CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n29. 2020-2021 NISHU CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n30. 2020-2021 SWEETY SHAILESH CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n31. 2020-2021 Nitish kumar CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n32. 2020-2021 Atul Raj CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n33. 2020-2021 Niraj kumar sharma CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n34. 2020-2021 Akshay Mirnal CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n35. 2020-2021 Mukesh Gupta CSE GRIEFO 4.8 lakhs\n" +
                "\n\n36. 2021-2022 MAYANK ANAND CE PRISM JOHNSON LIMITED 4.5 LAKHS\n" +
                "\n\n37. 2021-2022 SUMIT KUMAR CE PRISM JOHNSON LIMITED 4.5 LAKHS\n" +
                "\n\n38. 2021-2022 RISHIKESH NARAYAN CE PRISM JOHNSON LIMITED 4.5 LAKHS\n" +
                "\n\n39. 2021-2022 VIKRAM KUMAR CE PRISM JOHNSON LIMITED 4.5 LAKHS\n" +
                "\n\n40. 2021-2022 ANSHUMAN KUMAR CE HCL 2.2 LAKHS\n" +
                "\n\n41. 2021-2022 ARWAZ HASAN CE HCL 2.2 LAKHS\n" +
                "\n\n42. 2021-2022 SHIVANSH SHARMA CE INFOSYS 3.6 LAKHS\n" +
                "\n\n43. 2021-2022 DEEPAK YADAV CE KASHISH DEVELOPERS LIMITED 5 LAKHS\n" +
                "\n\n44. 2021-2022 SUPRIYA KUMARI EEE HCL 2.8 LAKHS\n" +
                "\n\n45. 2021-2022 GULAM RASHUL EEE HCL 2.8 LAKHS\n" +
                "\n\n46. 2021-2022 ADARSH EEE SAVANTIS SOLUTION 3 LAKHS\n" +
                "\n\n47. 2021-2022 ADITYA RAJ EEE BYJU'S 10 LAKHS\n" +
                "\n\n48. 2021-2022 SIDDHRATH SINHA EEE BYJU'S 10 LAKHS\n" +
                "\n\n49. 2021-2022 SHREYA SINGH EEE HCL 2.2 LAKHS\n" +
                "\n\n50. 2021-2022 MANOJ KUMAR KUSHWAHAEEE HCL/BYJUS 2.2 LAKHS /5 LAKHS\n" +
                "\n\n51. 2021-2022 VIKASH KUMAR JHA EEE HCL 2.2 LAKHS\n" +
                "\n\n52. 2021-2022 SWETA SANIA EEE HCL 2.2 LAKHS\n" +
                "\n\n53. 2021-2022 RITIK RAJ EEE HCL 2.2 LAKHS\n" +
                "\n\n54. 2021-2022 ASHISH RANJAN EEE CARNATION INFOTECH 4.5 LAKHS\n" +
                "\n\n55. 2021-2022 SUNNY KUMAR SHIVAM EEE CARNATION INFOTECH 4.5 LAKHS\n" +
                "\n\n56. 2021-2022 SHARIK KHURSEED EEE E-ASHWA 3.6 LAKHS\n" +
                "\n\n57. 2021-2022 SHUBHAM KUMAR EEE E-ASHWA 3.6 LAKHS\n" +
                "\n\n58. 2021-2022 VIVEK KUMAR EEE HCL TECH 2.2 LAKHS\n" +
                "\n\n59. 2021-2022 TANU AISHWARYA EEE VOIS 6 LAKHS\n" +
                "\n\n60. 2021-2022 MUKESH KUMAR MANDALEEE BYJUS 5 LAKHS\n" +
                "\n\n61. 2021-2022 CHANDAN KUMAR EEE BYJUS 5 LAKHS\n" +
                "\n\n62. 2021-2022 NAVEEN KUMAR EEE BYJUS 5 LAKHS\n" +
                "\n\n63. 2021-2022 PUMMY KUMARI EEE OKAYA INFOCOM 2 lakhs\n" +
                "\n\n64. 2021-2022 JAY PRAKASH KUMAR ME KP RELIABLE TECHNIQUE PVT.LTD/ACHAL INDUSTRIES 3 LAKHS/2.8 LAKHS\n" +
                "\n\n65. 2021-2022 ABHAY KUMAR ME KP RELIABLE TECHNIQUE PVT.LTD 3 LAKHS\n" +
                "\n\n66. 2021-2022 GOVIND KUMAR ME HCL 2.2 LAKHS\n" +
                "\n\n67. 2021-2022 PRABHAT KUMAR JHA ME HCL 2.2 LAKHS\n" +
                "\n\n68. 2021-2022 SUMAN SAINIK ME HCL 2.2 LAKHS\n" +
                "\n\n69. 2021-2022 SHUBHAM RAJ AGRAWAL ME HCL 2.2 LAKHS\n" +
                "\n\n70. 2021-2022 ASHISH KUMAR ME HCL 2.2 LAKHS\n" +
                "\n\n71. 2021-2022 SHASHI BHUSHAN KUMAR ME HCL 2.2 LAKHS\n" +
                "\n\n72. 2021-2022 ANJALI KUMARI RAJAK ME HCL/ E-ASHWA 2.2 LAKHS/3.6 LAKHS\n" +
                "\n\n73. 2021-2022 ANNU BHARTI ME HCL 2.2 LAKHS\n" +
                "\n\n74. 2021-2022 AMIT KUMAR THAKUR ME HCL 2.2 LAKHS\n" +
                "\n\n75. 2021-2022 FAIZAN AHMAD ME E-ASHWA 3.6 LAKHS\n" +
                "\n\n76. 2021-2022 ASHIRWAD PRAKASH ME E-ASHWA 3.6 LAKHS\n" +
                "\n\n77. 2021-2022 SHUBHAM KUMAR ME ACHAL INDUSTRIES 2.8 LAKHS\n" +
                "\n\n78. 2021-2022 MANISH RAJ ME HCL 2.2 LAKHS\n" +
                "\n\n79. 2021-2022 MD ASHFAQUE AHMAD ME INFOSYS 3.5 LAKHS\n" +
                "\n\n80. 2021-2022 SHASHI BHUSHAN KUMAR ME BYJUS 5 LAKHS\n" +
                "\n\n81. 2021-2022 ANAND KUMAR DAS ME BYJUS 5 LAKHS\n" +
                "\n\n82. 2021-2022 ALOK GOSWAMI ME BYJUS 10 LAKHS\n" +
                "\n\n83. 2021-2022 RANI KUMARI CSE HCL 2.2 LAKHS\n" +
                "\n\n84. 2021-2022 RAJAT PRASAD CSE HCL 2.2 LAKHS\n" +
                "\n\n85. 2021-2022 HRITHIK RAJ CSE HCL 2.2 LAKHS\n" +
                "\n\n86. 2021-2022 RIYA LAL CSE HCL 2.2 LAKHS\n" +
                "\n\n87. 2021-2022 ASHISH RANJAN CSE HCL 2.2 LAKHS\n" +
                "\n\n88. 2021-2022 ANUPAM PATEL CSE HCL 2.8 LAKHS\n" +
                "\n\n89. 2021-2022 PRASHANT KASHYAP CSE HCL 2.8 LAKHS\n" +
                "\n\n90. 2021-2022 SARGAM KUMAR CSE HCL 2.8 LAKHS\n" +
                "\n\n91. 2021-2022 PRITY KUMARI CSE HCL/INFOSYS 2.2 LAKHS/3.6 LAKHS\n" +
                "\n\n92. 2021-2022 RITIK KUMAR CSE HCL 2.2 LAKHS\n" +
                "\n\n93. 2021-2022 ANSHU KUMAR SINGH CSE HCL 2.2 LAKHS\n" +
                "\n\n94. 2021-2022 KRITI KUMARI CSE HCL 2.2 LAKHS\n" +
                "\n\n95. 2021-2022 SUBHASHINI CSE HCL 2.2 LAKHS\n" +
                "\n\n96. 2021-2022 SHWETA CSE CARNATION INFOTECH 4.5 LAKHS\n" +
                "\n\n97. 2021-2022 SANTOSH KUMAR CSE CARNATION INFOTECH 4.5 LAKHS\n" +
                "\n\n98. 2021-2022 SANJEEV KUMAR CSE TCS 3.6 LAKHS\n" +
                "\n\n99. 2021-2022 SUDHA KUMARI CSE WIPRO 3.5 LAKHS\n" +
                "\n\n100. 2021-2022 AARTI KUMARI CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n101. 2021-2022 GAYATRI BHARTI CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n102. 2021-2022 RASHMI KUMARI CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n103. 2021-2022 RAKHI KUMARI SINGH CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n104. 2021-2022 DEEP SIKHA CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n105. 2021-2022 SARGAM KUMAR CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n106. 2021-2022 MONIKA KUMARI CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n107. 2021-2022 VIVEK KUMAR CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n108. 2021-2022 SANTOSH KR.CHOUDHARY CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n109. 2021-2022 JEEVAN KUMAR CSE SAVANTIS SOLUTION PVT.LTD 3 LAKHS\n" +
                "\n\n110. 2021-2022 CHANDAN KUMAR CSE CAPGEMINI 4 LAKHS\n" +
                "\n\n111. 2021-2022 RAHUL KUMAR CSE WIPRO 3.36 LAKHS\n" +
                "\n\n112. 2021-2022 Saurabh Kumar CSE Infosys 3.5 LAKHS\n" +
                "\n\n113. 2021-2022 Manish Kumar CSE Infosys 3.5 LAKHS\n" +
                "\n\n114. 2021-2022 Kshitij Kumar CSE Infosys 3.5 LAKHS\n" +
                "\n\n115. 2021-2022 Rahul Kumar CSE TCS 3.36 LAKHS\n" +
                "\n\n116. 2021-2022 Sanket Kumar CSE TCS 3.36 LAKHS\n" +
                "\n\n117. 2021-2022 NEHAL KUMAR SINGH CSE TCS 3.36 LAKHS\n" +
                "\n\n118. 2021-2022 Aakanksha CSE ACCENTURE 4.5 LAKHS\n" +
                "\n\n119. 2021-2022 Satyam Pandey CSE ACCENTURE 4.5 LAKHS\n" +
                "\n\n120. 2021-2022 Nikhil Pathak CSE Wipro 3.5 LAKHS\n" +
                "\n\n121. 2021-2022 ABHISHEK KUMAR CSE AMAZON 24 LAKHS\n" +
                "\n\n122. 2021-2022 RANJEET KUMAR CSE Capgemini 3 LAKHS\n" +
                "\n\n123. 2021-2022 CHANDRA MANI CSE COGNIZANT 4.5 LAKHS\n" +
                "\n\n124. 2021-2022 SUJEET KUMAR YADAV CSE VIRTUSA 4 LAKHS\n" +
                "\n\n125. 2021-2022 SHAHZAD CSE WIPRO 3.5 LAKHS\n" +
                "\n\n126. 2021-2022 JYOTI KIRAN CSE COGNZANT 7 LAKHS\n" +
                "\n\n127. 2021-2022 SURBHI KUMARI CSE OPTUM 14.7 LAKHS\n" +
                "\n\n128. 2021-2022 MD. INZEMAMUL HAQUE CSE HCL TECHNOLOGIES 3.6 LAKHS\n" +
                "\n\n129. 2021-2022 SANDEEP KUMAR CSE MINDTREE 4 LAKHS\n" +
                "\n\n130. 2021-2022 ARYAN RAJ CSE TECH MAHINDRA 3.5-4 LAKHS\n" +
                "\n\n131. 2021-2022 SHUBHAM KUMAR SINGH CSE ATOS SYNTEL PVT LTD 3.5 LAKHS\n" +
                "\n\n132. 2021-2022 ANJALI RANI CSE TCS 3.36 LAKHS\n" +
                "\n\n133. 2021-2022 RAHUL RANJAN CSE TCS 3.36 LAKHS\n" +
                "\n\n134. 2021-2022 MOHAMMAD AADIL CSE TCS 3.36 LAKHS\n" +
                "\n\n135. 2021-2022 Khushbu kumari CSE Infosys 3.5 lakhs\n" +
                "\n\n136. 2021-2022 NAGHMA BANO CSE HCL TECHNOLOGIES 3.6 LAKHS\n" +
                "\n\n137. 2021-2022 APRAJITA PRIYADARSHINI CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n138. 2021-2022 SHALINI KUMARI CSE HCL Technologies 2.7 lakhs\n" +
                "\n\n139. 2021-2022 Sakshi Kumari CSE Torry Harish business solutions 4.0 lakhs");

        List<String> gayatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> gayatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Gaya = new ArrayList<>();
        Gaya.add(new Semester("2024", gayatwentyfour));
        Gaya.add(new Semester("2023", gayatwenttythree));
        Gaya.add(new Semester("2022", gayatwentytwo));
        Gaya.add(new Semester("2021", gayatwentyone));
        Gaya.add(new Semester("2020", gayatwenty));

        branches.add(new Branch("GCE Gaya", Gaya));

        //NCE Nalanda
        List<String> nalandatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> nalandatwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> nalandatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> nalandatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> nalandatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Nalanda = new ArrayList<>();
        Nalanda.add(new Semester("2024", nalandatwentyfour));
        Nalanda.add(new Semester("2023", nalandatwenttythree));
        Nalanda.add(new Semester("2022", nalandatwentytwo));
        Nalanda.add(new Semester("2021", nalandatwentyone));
        Nalanda.add(new Semester("2020", nalandatwenty));

        branches.add(new Branch("NCE Nalanda", Nalanda));

        //DCE Darbhanga
        List<String> darbhangatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> darbhangatwenttythree = Arrays.asList("Sl. No. Full Name Registration Number Branch Placed Through Designation CTC Offered Image\n" +
                "\n\n1. Mohamme Afzal Imam 19105111024\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Cisco Ideathon\n" +
                "2022\n" +
                "Consulting Engineer 17.39 LPA\n" +
                "\n\n1. Aman Kumar 19105111028\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "TCS Codevita\n" +
                "2022\n" +
                "System Engineer 7 LPA\n" +
                "\n\n2. Sonu Kumar 19105111013\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "TCS Codevita\n" +
                "2022\n" +
                "Assistant System\n" +
                "Engineer\n" +
                "3.36 LPA\n" +
                "Batch: 2019 - 2023\n" +
                "CISCO\n" +
                "Tata Consultancy Services (TCS)\n" +
                "\n\n3. Prashant Kumar 19105111005\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "TCS NQT 2023\n" +
                "Assistant System\n" +
                "Engineer\n" +
                "3.36 LPA\n" +
                "\n\n4. Sweta Kumari 19105111042\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "TCS NQT 2023\n" +
                "Assistant System\n" +
                "Engineer\n" +
                "3.36 LPA\n" +
                "\n\n5. Nishant Kumar 19105111010\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "TCS NQT 2023\n" +
                "Assistant System\n" +
                "Engineer\n" +
                "3.36 LPA\n" +
                "\n\n6. Abhishek Kumar 19105111007\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "TCS NQT 2023\n" +
                "Assistant System\n" +
                "Engineer\n" +
                "3.36 LPA\n" +
                "\n\n1. Prashant Kumar 19105111005\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Pool Campus\n" +
                "Hiring (DST) Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n2. Chandan Kumar 19110111048\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Pool Campus\n" +
                "Hiring (DST) Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n3. Sonu Kumar 19105111013\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Pool Campus\n" +
                "Hiring (DST) Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "HCL Technologies\n" +
                "\n\n4. Neha Bhardwaj 19105111018\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Pool Campus\n" +
                "Hiring (DST) Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n5. Rishabh Kumar 19101111024\n" +
                "Civil\n" +
                "Engineering\n" +
                "(CE)\n" +
                "Pool Campus\n" +
                "Hiring (DST) Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n6. Anjali Kumari 20110111910 (College\n" +
                "Dropout in Final Year)\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Pool Campus\n" +
                "Hiring (DST) Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n7. Amit Kumar 19105111001\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Pool Campus\n" +
                "Hiring (Jaipur)\n" +
                "L1 Network Analyst &\n" +
                "Infrastructure 3.6 LPA\n" +
                "\n\n8. Abhishek Kumar Shaw 18102111045\n" +
                "Mechanical\n" +
                "Engineering\n" +
                "(ME)\n" +
                "Pool Campus\n" +
                "Hiring (Jaipur)\n" +
                "L1 Network Analyst &\n" +
                "Infrastructure 3.6 LPA\n" +
                "\n\n1. Shashi Nirala 19105111014\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Pool Campus\n" +
                "Hiring\n" +
                "(Jamshedpur)\n" +
                "Technology Trainee 5.72 LPA\n" +
                "\n\n1. Shefa Rahat Ali 19105111006\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Off Campus\n" +
                "Hiring\n" +
                "Business Development\n" +
                "Associate (BDA) &\n" +
                "Revenue Growth\n" +
                "Associate (RGA)\n" +
                "6.5 LPA & 5.19\n" +
                "LPA\n" +
                "mJunction\n" +
                "PlanetSpark\n" +
                "\n\n2. Ankit Kumar 19110111005\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Pool Campus\n" +
                "Hiring (DST)\n" +
                "Business Development\n" +
                "Associate (BDA) 6.64 LPA\n" +
                "\n\n3. Sweta Kumari 19105111042\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Business Development\n" +
                "Councellor (BDC) 6.5 LPA\n" +
                "\n\n4. Vishaka Kumari 19101111046\n" +
                "Civil\n" +
                "Engineering\n" +
                "(CE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Business Development\n" +
                "Councellor (BDC) 6.5 LPA\n" +
                "\n\n5. Sweety Rai 19105111035\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Off Campus\n" +
                "Hiring\n" +
                "Revenue Growth\n" +
                "Associate (RGA) 5.19 LPA\n" +
                "\n\n1. Tannu Priya 19105111050\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Off Campus\n" +
                "Hiring\n" +
                "Business Development\n" +
                "Associate (BDA) 6 LPA\n" +
                "\n\n2. Soumya Kumari 19110111025\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Off Campus\n" +
                "Hiring\n" +
                "Business Development\n" +
                "Associate (BDA) 3 LPA\n" +
                "\n\n1. Richa Shukla 19110111030\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Pool Campus\n" +
                "Hiring (GEC Vaishali)\n" +
                "Graduate Engineer\n" +
                "Trainee\n" +
                "Waiting for Offer\n" +
                "Letter\n" +
                "DoubtNut\n" +
                "MetalMan MicroTurner\n" +
                "\n\n2. Riti Kumari 19110111013\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Pool Campus\n" +
                "Hiring (GECnVaishali)\n" +
                "Graduate Engineer\n" +
                "Trainee\n" +
                "Waiting for Offer\n" +
                "Letter\n" +
                "\n\n3. Shruti Kumari 19110111039\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "Pool Campus\n" +
                "Hiring (GEC Vaishali)\n" +
                "Graduate Engineer\n" +
                "Trainee\n" +
                "Waiting for Offer\n" +
                "Letter\n" +
                "\n\n4. Sunil Kumar 19102111042\n" +
                "Mechanical\n" +
                "Engineering\n" +
                "(ME)\n" +
                "Pool Campus\n" +
                "Hiring (GEC\n" +
                "Vaishali)\n" +
                "Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n5. Animesh Kumar 19102111056\n" +
                "Mechanical\n" +
                "Engineering\n" +
                "(ME)\n" +
                "Pool Campus\n" +
                "Hiring (GEC\n" +
                "Vaishali)\n" +
                "Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n1. Avkash Kumar\n" +
                "Mechanical\n" +
                "Engineering\n" +
                "(ME)\n" +
                "Pool Campus\n" +
                "Hiring (GEC\n" +
                "Vaishali)\n" +
                "Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n1. Saurav Bhardwaj 20102111904\n" +
                "Mechanical\n" +
                "Engineering\n" +
                "(ME)\n" +
                "Pool Campus\n" +
                "Hiring (GEC\n" +
                "Vaishali)\n" +
                "Waiting for Offer Letter Waiting for Offer\n" +
                "Letter\n" +
                "\n\n1. Alataf Ansari 19105111053\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "Off Campus\n" +
                "Hiring\n" +
                "Junior Software\n" +
                "Developer 4.5 LPA\n" +
                "Vabroc Polymers\n" +
                "Mindsprint, Bangalore\n" +
                "Aaensa Tech\n" +
                "Tata Motors\n" +
                "\n\n1. Prashant Kumar 19105111005\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "\n\n2. Amit Kumar 19105111001\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "\n\n3. Priyanka Soni 19105111003\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "\n\n4. Abhishek Kumar\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "\n\n5. Nidhi Kumari 19105111034\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "\n\n6. Aarti Kumari\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "On Campus DCE\n" +
                "\n\n7. Abhishek Kumar Shaw\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "On Campus DCE\n" +
                "qSpiders\n" +
                "\n\n1. Prashant Kumar 19105111005\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n2. Amit Kumar 19105111001\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n3. Rishi Ranjan 19110111057\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n4. Rishabh Kumar 1910111024\n" +
                "Civil\n" +
                "Engineering\n" +
                "(CE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n5. Ritesh Kumar 19105111026\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n6. Shivani Kumari 19110111042\n" +
                "Electrical and\n" +
                "Electronics\n" +
                "Engineering\n" +
                "(EEE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n7. Abhay Pratap 19105111047\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n8. Alok Kumar Singh 19101111037\n" +
                "Civil\n" +
                "Engineering\n" +
                "(CE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n9. Tannu Priya 19105111050\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n10. Chandan Kumar 19105111033\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n11. Neha Bhardwaj 19105111018\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n12. Nishant Kumar 19105111040\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n13. Rupesh Raj 19102111016\n" +
                "Mechanical\n" +
                "Engineering\n" +
                "(ME)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n14. Ritik Sangam 19105111057\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA\n" +
                "\n\n15. Sonu Kumar 19105111013\n" +
                "Computer\n" +
                "Science and\n" +
                "Engineering\n" +
                "(CSE)\n" +
                "On Campus DCE\n" +
                "(Online)\n" +
                "Selected for Training\n" +
                "followed by Interview\n" +
                "Opportunity\n" +
                "Upto 4.8 LPA");

        List<String> darbhangatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> darbhangatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> darbhangadatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Darbhanga = new ArrayList<>();
        Darbhanga.add(new Semester("2024", darbhangatwentyfour));
        Darbhanga.add(new Semester("2023", darbhangatwenttythree));
        Darbhanga.add(new Semester("2022", darbhangatwentytwo));
        Darbhanga.add(new Semester("2021", darbhangatwentyone));
        Darbhanga.add(new Semester("2020", darbhangadatwenty));

        branches.add(new Branch("DCE Darbhanga", Darbhanga));


        //MCE Motihari
        List<String> motiharitwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> motiharitwenttythree = Arrays.asList("S.NO. NAME " +
                        "\nROLL NO. " +
                        "\nCOMPANY " +
                        "\nDESIGNATION " +
                        "\nPACKAGE " +
                        "\nBRANCH",
                "1. DIKSHA PRAKASH " +
                        "\n19345 " +
                        "\nTCS ASST. SYSTEM ENGINEER – TRAINEE\n" +
                        "3.6 L.P.A" +
                        "\nCSE",
                "2. NIKITA BHARTI " +
                        "19310 TCS ASST. SYSTEM\n" +
                        "ENGINEER\n" +
                        "3.6 L.P.A" +
                        "\nCSE",
                "3. PRATIBHA ANAND\n" +
                        "19351 " +
                        "\nTCS ASST. SYSTEM ENGINEER\n" +
                        "3.6 L.P.A" +
                        "\nCSE",
                "4. AMAN PRAKASH KANTH\n" +
                        "19301 " +
                        "\nTCS ASST. SYSTEM ENGINEER\n" +
                        "3.6 L.P.A" +
                        "\nCSE",
                "5. MANISH KUMAR AZAD\n" +
                        "19342 " +
                        "\nHCL NETWORK ENGINEER\n" +
                        "3.5 L.P.A" +
                        "\nCSE",
                "6. ANJALI SINGH " +
                        "\n19128 " +
                        "\nHCL NETWORK ENGINEER\n" +
                        "3.5 L.P.A" +
                        "\nEEE",
                "7. ASHIT KUNJ " +
                        "\n19213 " +
                        "\nHCL NETWORK ENGINEER\n" +
                        "3.5 L.P.A\n" +
                        "ME");

        List<String> motiharitwentytwo = Arrays.asList("2018-22 Electrical and Electronics Engineering\n\n\n" +
                "S. No. Name " +
                "\nRoll Number " +
                "\nPlaced in\n" +
                "Annual Package (LPA)\n" +

                "\n\n1. Prabhakar Kumar Karn " +
                "\n18156 " +
                "\nCapgemini 4 LPA\n" +

                "\n\n2. Arti Kumari 18123 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n3. Manish Kumar 18121\n" +
                "CRTD\n" +
                "Technologies,\n" +
                "BYJU’s 4 LPA,\n" +
                "4.5 LPA\n" +

                "\n\n4. Manish Kumar 18159 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n5. Amarjit Kumar Sah LE-19164 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n6. Deepak Kumar 18132 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n7. Rajeev Ranjan 18137 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n8. Pushpesh Ratna 18145\n" +
                "CRTD\n" +
                "Technologies,\n" +
                "Immovidu\n" +
                "4 LPA,\n" +
                "7 LPA\n" +

                "\n\n9. Kajal Goswami 18102 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n10. Rajesh Kumar 18112 CRTD\n" +
                "Technologies 4 lakh\n" +

                "\n\n11. Rahul Kumar 18113 CRTD\n" +
                "Technologies 4LPA\n" +

                "\n\n12. Mithun Kumar\n" +
                "Paswan 18114 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n13. Rohit Kumar 18127 CRTD,QSPIDER, BYJU’s 4LPA, 4.5LPA\n" +

                "\n\n14. Rahul Raj 18135 Infosys 3.6 LPA\n" +

                "\n\n15. Ankit Raj 18140 Infosys 3.6 LPA\n" +

                "\n\n16. Arati Kumari 18143 Infosys 3.6 LPA\n" +

                "\n\n17. Ravi Ranjan\n" +
                "Kumar 18151\n" +
                "Infosys,\n" +
                "Capgemini,\n" +
                "Wipro,\n" +
                "HCL,\n" +
                "CRTD\n" +
                "Technologies\n" +
                "3.6 LPA,\n" +
                "4.25 LPA,\n" +
                "3.6 LPA,\n" +
                "4.0LPA,\n" +
                "4 LPA\n" +

                "\n\n18. Ashish Kumar 18116 INFOSYS,\n" +
                "WIPRO\n" +
                "3.6 LPA,\n" +
                "3.5 LPA\n" +

                "\n\n19. Shivesh Kumar 18141\n" +
                "Infosys,\n" +
                "Wipro,\n" +
                "Capgemini,\n" +
                "Tech Mahindra,\n" +
                "HCL\n" +
                "3.6 LPA,\n" +
                "3.5 LPA,\n" +
                "4 LPA,\n" +
                "3.25 LPA,\n" +
                "4.25 LPA\n" +

                "\n\n20. Jyoti Kumari 18101\n" +
                "KPIT,\n" +
                "Infosys,\n" +
                "Wipro,\n" +
                "CRTD\n" +
                "Technologies\n" +
                "4LPA,\n" +
                "3.6LPA,\n" +
                "3.5LPA,\n" +
                "4LPA\n" +

                "\n\n21. Santosh Ram 18108 Q-Spider 3.5 LPA\n" +

                "\n\n22. Asmita 18154 Qspiders 3.5 LPA\n" +

                "\n\n23. Rupali Kumari 18158 Qspiders -\n" +

                "\n\n24. Gaurav Gunjan 18130 Wipro 3 LPA\n" +

                "\n\n25. Kamlesh Kumar LE-19165 Wipro 3.5LPA\n" +

                "\n\n26. Sumit Kumar - BYJU’s 7.5 LPA\n" +

                "\n\n2018-22 Mechanical Engineering\n\n" +

                "\n\n1. Nitish Kumar 18222 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n2. Md. Atif Ahsan 18250 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n3. Ashwin Suman 18244 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n4. Nitesh Kumar 18218 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n5. Saurav Kumar 18215 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n6. Vikash Kumar 18225 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n7. Siddharth Kiran 18217\n" +
                "CRTD\n" +
                "Technologies,\n" +
                "QSpider\n" +
                "4 LPA\n" +

                "\n\n8. Animesh Kumar 18221 INFOSYS 3.6 LPA\n" +
                "\n\n9. Shubham Kumar Jaiswal 18240 INFOSYS 3.6 LPA\n" +

                "\n\n10. Rohit Raj 18242 INFOSYS 3.6 LPA\n" +

                "\n\n11. Ankit Kumar Jha 18202 INFOSYS,\n" +
                "WIPRO\n" +
                "3.6 LPA,\n" +
                "3.5 LPA\n" +

                "\n\n2018-22 Civil Engineering\n\n" +

                "\n\n1. Abhishek Kumar - BYJU’s 4.5 LPA\n" +

                "\n\n2. Sidharth Kumar 18416 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n3. Rahul Kumar 18457 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n4. Faisal Gazi 18403 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n5. Mukul Anand 18445 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n6. Vishram Patel 18433 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n7. Saurabh Kumar 18447\n" +
                "CRTD Technologies,\n" +
                "Immovidu\n" +
                "3 LPA,\n" +
                "7 LPA\n" +

                "\n\n8. Rahul Kumar LE-19463 Prism Johnson Ltd. 5 LPA\n" +

                "\n\n9. Abhinav Kumar 18404 SmartWriter.ai 9 LPA\n" +

                "\n\n10. MD Afsar Ansari 18460 Wipro 3.5 LPA\n" +

                "\n\n2018-22 Computer Science and Engineering\n\n" +

                "\n\n1. Abhishek Kumar 18336 Capgemini 4 LPA\n" +

                "\n\n2. Abhishek Pushp Srivastava\n" +
                "18346 Capgemini 4 LPA\n" +

                "\n\n3. Sanjana 18314\n" +
                "Capgemini,\n" +
                "Carnation Infotech\n" +
                "4 LPA,\n" +
                "4.5 LPA\n" +

                "\n\n4. Abhimanyu Kumar Raghuvansh\n" +
                "18356 Capgemini\n" +
                "Nihilent 4 LPA\n" +

                "\n\n5. Sukrity Singh 18344 Capgemini,\n" +
                "Tech Mahindra\n" +
                "4 LPA,\n" +
                "3.25 LPA\n" +

                "\n\n6. Amartyaveer 18347 Carnation\n" +
                "Infotech 4.5 LPA\n" +

                "\n\n7. Atul Kumar 18341 Carnation\n" +
                "Infotech 4.5 LPA\n" +

                "\n\n8. Jyoti Kiran 18301\n" +
                "Carnation\n" +
                "Infotech,\n" +
                "INFOSYS\n" +
                "4.5 LPA,\n" +
                "3.6 LPA\n" +

                "\n\n9. Amardeep Kumar 18317 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n10. Sachin Kumar Rao 18338\n" +
                "CRTD\n" +
                "Technologies,\n" +
                "BYJU’s\n" +
                "4 LPA,\n" +
                "4.5 LPA\n" +

                "\n\n11. Mukul Kumar 18304 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n12. Sujeet Kumar 18319 CRTD\n" +
                "Technologies 4 LPA\n" +

                "\n\n13. Shikha Sinha 18333 Hexaware\n" +
                "technologies 4 LPA\n" +

                "\n\n14. Shambhavi 18359\n" +
                "Hexaware\n" +
                "Technologies,\n" +
                "Infosys,\n" +
                "Wipro,\n" +
                "HCL\n" +
                "6 LPA,\n" +
                "3.65 LPA,\n" +
                "3.5 LPA,\n" +
                "4.25 LPA\n" +

                "\n\n15. Shivam Raj 18340 Hexaware,\n" +
                "Wipro, Revature 4 LPA\n" +

                "\n\n16. Kaushki Raj 18306 IBM,\n" +
                "Capgemini\n" +
                "4.25 LPA,\n" +
                "4 LPA\n" +

                "\n\n17. Niraj Kumar Singh 18354 INFOSYS 3.6 LPA\n" +

                "\n\n18. Krishna Mohan Jha 18310 INFOSYS 3.6 LPA\n" +

                "\n\n19. Juhi Kumari 18348 INFOSYS 3.6 LPA\n" +

                "\n\n20. Misha Bharti 18307 INFOSYS 3.6 LPA\n" +

                "\n\n21. Bhawna Anand 18332 INFOSYS,\n" +
                "Qspider 3.6 LPA\n" +

                "\n\n22. Yashaswi Anand 18342\n" +
                "INFOSYS,\n" +
                "Carnation\n" +
                "Infotech\n" +
                "3.6 LPA,\n" +
                "4.5 LPA\n" +

                "\n\n23. Rahul Kumar 18321\n" +
                "K12 Techno\n" +
                "Services Pvt. Ltd.\n" +
                "4 LPA\n" +

                "\n\n24. Gulshan Kumar 18303\n" +
                "Namas Industries,\n" +
                "Qspider\n" +
                "5 LPA\n" +

                "\n\n25. Moni Kumari 18352 Qspider Full Stack -\n" +

                "\n\n26. Pallavi Payal 18316\n" +
                "TCS,\n" +
                "INFOSYS,\n" +
                "NPCI\n" +
                "3.36 LPA,\n" +
                "3.6 LPA,\n" +
                "6.89 LPA\n" +

                "\n\n27. Akshay Prakash 18349\n" +
                "Tech Mahindra,\n" +
                "INFOSYS,\n" +
                "Revature India,\n" +
                "Techvanto Pvt.\n" +
                "Ltd\n" +
                "3.25 LPA,\n" +
                "3.6 LPA,\n" +
                "4 LPA,\n" +
                "3.5 LPA\n" +

                "\n\n28. Md Arif Hasan 18325 Wigzo\n" +
                "Technologies 4.8 LPA\n" +

                "\n\n29. Pragya Kumari 18315 Wipro 3.6 LPA\n" +

                "\n\n30. Raja Bhaskar 18353 Wipro 3.5 LPA\n" +

                "\n\n31. Nisha Kumari 18337 Wipro,\n" +
                "Tech Mahindra\n" +
                "3.5 LPA,\n" +
                "3.25 LPA");

        List<String> motiharitwentyone = Arrays.asList("S. NO. NAME " +
                "\nREGISTRATION NO.\n" +
                "COMPANY PACKAGE\nBRANCH",
        "1. RITIKA SHRIVASTAVA " +
                "\n17105113008\n" +
                " CAPGEMINI- HYDERABAD,\n" +
                " ARENYAM TECHNOLOGY\n" +
                "3.8LPA\nCSE",

                "2. BEAUTI KUMARI " +
                        "\n18105113007 " +
                        "\nINFOSYS- MYSURU " +
                        "\n3.6LPA\nCSE",
                "3. ABHIMANYU KUMAR " +
                        "\n17105113024 " +
                        "\nINFOSYS- MYSURU " +
                        "\n3.6LPA\nCSE",
                "4. MANISH KUMAR " +
                        "\n17105113030 " +
                        "\nBYJU " +
                        "\n4.8 LPA\nCSE",
                "5. RAJEEV KUMAR SINGH\n" +
                        "DIVYA LAKSHYA COACHING\n2 LPA \nCE",
                "6. VICKY KUMAR\n" +
                        "DIVYA LAKSHYA COACHING \n2 LPA" +
                        "\nCE",
                "7. AMIT KUMAR\n" +
                        "DIVYA LAKSHYA COACHING\n" +
                        " 2 LPA\nME",
                "8. PURNENDU PATHAK " +
                        "\n17102113002 " +
                        "\nDIVYA LAKSHYA COACHING\n" +
                        " 2 LPA\nME",
                "9. MONIKA KUMARI " +
                        "\n17102113013 " +
                        "\nYAZAKI GROUP R&D\n" +
                        "3.2 LPA,\nME",
                "10. AMANDEEP KUMAR " +
                        "\n17110113002 " +
                        "\nNETWORK ENGINEER\n" +
                        "HCL\n" +
                        "3 LPA\nEEE",
                "11. ANKIT KUMAR JHA\n" +
                        "17110113212\n" +
                        " DIVYA LAKSHYA\n" +
                        " COACHING 2 LPA \nEEE");

        List<String> motiharitwenty = Arrays.asList("S. NO. NAME " +
                "\nREGISTRATION NO.\n" +
                "COMPANY " +
                "\nPACKAGE\nBRANCH" ,


                "1. AMLESH KUMAR\n" +
                "16105113021 " +
                        "\nGRIFEO 1.68 L.P.A\nCSE" +

                "\n\n2. ARVIND KUMAR 16105113020 GRIFEO 1.68 L.P.A\nCSE" +

                "\n\n3.VANDANA SINGH 16105113024\n" +
                "SIGNITY GROUP\n" +
                "OF COMPANY 1.80 L.P.A\nCSE" +

                "\n\n4. MONU KUMAR\n" +
                "16105113007 CAPGEMINI 4.0 L.P.A\nCSE" +

                "\n\n5. JYOTI KUMARI 16105113016 CAPGEMINI 4.0 L.P.A\nCSE" +

                "\n\n6. PRASHNATO PRIYANSHU\n" +
                "16105113013 LENSKART 4.0 L.P.A\nCSE" +

                "\n\n7. RAHUL RAJ 16105113022 IBM 3.5 L.P.A\nCSE" +

                        "\n\n8. APURVA KUMARI\n" +
                "16105113028 TCS 3.6 L.P.A\nCSE" +


                "\n\n9. SHAKTI DEV SAH\n" +
                "16103113013 GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n10. GAURAV KAEWALYA\n" +
                "16103113015 GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n11. SHALINI BHARTI 16103113014 GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n12. POOJA BHARTI 16103113016 GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n13. DANISH AFTAB 16103113022 GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n14. MANISH KUMAR\n" +
                "16103113011 GRIFEO 1.68 L.P.A\n" +
                " EEE\n" +

                "\n\n15. SAURABH KUMAR RANJA\n" +
                "16103113031 GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n16. SHAKTINATH KUMAR\n" +
                "GRIFEO 1.68 L.P.A\nEEE" +

                "\n\n17. DANISH AFTAB 16103113022\n" +
                "SIGNITY GROUP\n" +
                "OF COMPANY 1.80 L.P.A\nEEE" +

                "\n\n18. POOJA BHARTI 16103113016\n" +
                "SIGNITY GROUP\n" +
                "OF COMPANY 1.80 L.P.A\nEEE" +

                "\n\n19. ARNAV RAJ 16102113012\n" +
                "HCL,\n" +
                "GRIFEO 3.0 L.P.A\nME" +

                "\n\n20. DAMINI RAJ 16102113013 GRIFEO 1.68 L.P.A\nME" +
                "\n\n21. AMIT KUMAR GRIFEO 1.68 L.P.A\nME" +

                "\n\n22. SATYENDRA KUMAR\n" +
                "16102113018 GRIFEO 1.68 L.P.A\nME" +
                "\n\n23. RAHUL KUMAR GRIFEO 1.68 L.P.A\nME" +
                "\n\n24. ARNAV RAJ 16102113012\n" +
                "SIGNITY GROUP OF COMPANY\n " +
                        "1.80 L.P.A\nME" +
                "\n\n25. SATYENDRA KUMAR 16102113018\n" +
                "SIGNITY GROUP OF COMPANY\n" +
                " 1.80 L.P.A\nME" +
                "\n\n26. RAHUL KUMAR\n" +
                "SIGNITY GROUP OF COMPANY\n" +
                " 1.80 L.P.A\nME" +
                "\n\n27. SUJEET KUMAR 17102113901\n" +
                "SIGNITY GROUP OF COMPANY\n" +
                " 1.80 L.P.A\nME" +

                "\n\n28. ANKIT SUMAN 16102113028\n" +
                "SIGNITY GROUP\n" +
                "OF COMPANY 1.80 L.P.A\nME" +
                "\n\n29. PANKAJ KUMAR 16102113022\n" +
                "SIGNITY GROUP OF COMPANY 1.80 L.P.A\n" +

                "\n\n30. SATYENDRA KUMAR\n" +
                "16102113018 VICTORA AUTO\n" +
                "Pvt. Ltd 1.54 L.P.A\nME" +

                "\n\n31. ARNAV RAJ 16102113012 TECH MAHINDRA 4.0 L.P.A\nME" +
                "\n\n32. RAHUL KUMAR\n" +
                "FLEETGUARD FILTERS Pvt.ltd,\n" +
                "Jamshedpur.\nME" +

                "\n\n33. SUJEET KUMAR 17102113901\n" +
                "FLEETGUARD\n" +
                "FILTERS Pvt.ltd,\n" +
                        "Jamshedpur.\nME" +

                        "\n\n34. VIKASH KUMAR 5102113033 IIT\n" +
                "KANPUR/M.Tech\n" +
                " NA\nME" +

                        "\n\n35. ALOK KUMAR 16102113904 BYJU 4.5 L.P.A\nME" +

                        "\n\n36. RAUSAN KUMAR 16101113009 SIGNITY GROUP OF COMPANY\n" +
                " 1.80 L.P.A\nME" +

                        "\n\n37. AMIT KUMAR SIGNITY GROUP OF COMPANY\n" +
                "1.80 L.P.A\nME");

        List<Semester> Motihari = new ArrayList<>();
        Motihari.add(new Semester("2024", motiharitwentyfour));
        Motihari.add(new Semester("2023", motiharitwenttythree));
        Motihari.add(new Semester("2022", motiharitwentytwo));
        Motihari.add(new Semester("2021", motiharitwentyone));
        Motihari.add(new Semester("2020", motiharitwenty));

        branches.add(new Branch("MCE Motihari", Motihari));


        //LNJPIT Chhapra
        List<String> chhapratwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> chhapratwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> chhapratwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> chhapratwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> chhapratwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Chhapra = new ArrayList<>();
        Chhapra.add(new Semester("2024", chhapratwentyfour));
        Chhapra.add(new Semester("2023", chhapratwenttythree));
        Chhapra.add(new Semester("2022", chhapratwentytwo));
        Chhapra.add(new Semester("2021", chhapratwentyone));
        Chhapra.add(new Semester("2020", chhapratwenty));

        branches.add(new Branch("LNJPIT Chhapra", Chhapra));

        //BCE Bakhtiyarpur
        List<String> bakhtiyarpurtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bakhtiyarpurtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bakhtiyarpurtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bakhtiyarpurtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bakhtiyarpurtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Bakhtiyarpur = new ArrayList<>();
        Bakhtiyarpur.add(new Semester("2024", bakhtiyarpurtwentyfour));
        Bakhtiyarpur.add(new Semester("2023", bakhtiyarpurtwenttythree));
        Bakhtiyarpur.add(new Semester("2022", bakhtiyarpurtwentytwo));
        Bakhtiyarpur.add(new Semester("2021", bakhtiyarpurtwentyone));
        Bakhtiyarpur.add(new Semester("2020", bakhtiyarpurtwenty));

        branches.add(new Branch("BCE Bakhtiyarpur", Bakhtiyarpur));

        //SEC Sasaram
        List<String> sasaramtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> sasaramtwenttythree = Arrays.asList("1. NAINA KUMARI (CSE) HCL",
                "2. DEEPAK KUMAR RAUSHAN (EEE) HCL",
                "3. SACHIDANAND (ME) HCL",
                "4. DIVYA BHARTI (CSE) HCL",
                "5. RAHUL KUMAR SHARMA (EEE) HCL",
                "6. GITANJALI KUMARI (CE) HCL",
                "7. GAURAV KUMAR (ME) HCL",
                "8. PRATHAM RAJ (CSE) HCL",
                "9. ANKUSH AMAN (CE) HCL",
                "10. SOMYA BHATT (CSE) HCL",
                "11. NEHA KUMARI (ME) HCL",
                "12. KRITIKA RAJ (EEE) HCL",
                "13. RIYA KUMARI (EEE) HCL",
                "14. RAVI RANJAN (CE)  HCL");


        List<String> sasaramtwentytwo = Arrays.asList("Qspider",
                "1. RAKESH KUMAR (CSE) 4.8LPA ",
                "2. JYOTI KUMARI (CSE) 4.8LPA ",
                "3. PAWAN KUMAR (CSE) 4.8LPA ",
                "4. AMAR KUMAR (CSE) 4.8LPA ",
                "5. RAHUL KUMAR (CSE) 4.8LPA ");

        List<String> sasaramtwentyone = Arrays.asList("HCL",
                "1. SATYAM KUMAR (ME)",
                "2. MANUAWAR HUSSAIN (EEE)",
                "3. AMAN KUMAR JHA (ME) ",
                "4. ASHISH KUMAR (CSE)",
                "5. ABHIJEET KUMAR (ME)",
                "6. AYUSH KUMAR SINGH (ME)",
                "7. SAPNA KUMARI (CSE)",
                "8. SHREYA SINHA (CE)",
                "9. MOHINI SINGH (CSE) ",
                "10. ANJALI KUMARI (CSE)");


        List<String> sasaramtwenty = Arrays.asList("1. ARPITA SINGH (HCL TECHNOLOGY) 3.75LPA");

        List<Semester> Sasaram = new ArrayList<>();
        Sasaram.add(new Semester("2024", sasaramtwentyfour));
        Sasaram.add(new Semester("2023", sasaramtwenttythree));
        Sasaram.add(new Semester("2022", sasaramtwentytwo));
        Sasaram.add(new Semester("2021", sasaramtwentyone));
        Sasaram.add(new Semester("2020", sasaramtwenty));

        branches.add(new Branch("SEC Sasaram", Sasaram));


        //SIT Sitamarhi
        List<String> sitamarhitwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> sitamarhitwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> sitamarhitwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> sitamarhitwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> sitamarhitwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Sitamarhi = new ArrayList<>();
        Sitamarhi.add(new Semester("2024", sitamarhitwentyfour));
        Sitamarhi.add(new Semester("2023", sitamarhitwenttythree));
        Sitamarhi.add(new Semester("2022", sitamarhitwentytwo));
        Sitamarhi.add(new Semester("2021", sitamarhitwentyone));
        Sitamarhi.add(new Semester("2020", sitamarhitwenty));

        branches.add(new Branch("SIT Sitamarhi", Sitamarhi));


        //BP Mandal Madhepura
        List<String> madhepuratwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> madhepuratwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> madhepuratwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> madhepuratwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> madhepuratwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Madhepura = new ArrayList<>();
        Madhepura.add(new Semester("2024", madhepuratwentyfour));
        Madhepura.add(new Semester("2023", madhepuratwenttythree));
        Madhepura.add(new Semester("2022", madhepuratwentytwo));
        Madhepura.add(new Semester("2021", madhepuratwentyone));
        Madhepura.add(new Semester("2020", madhepuratwenty));

        branches.add(new Branch("BP Mandal Madhepura", Madhepura));


        //KEC Katihar
        List<String> katihartwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> katihartwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> katihartwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> katihartwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> katihartwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Katihar = new ArrayList<>();
        Katihar.add(new Semester("2024", katihartwentyfour));
        Katihar.add(new Semester("2023", katihartwenttythree));
        Katihar.add(new Semester("2022", katihartwentytwo));
        Katihar.add(new Semester("2021", katihartwentyone));
        Katihar.add(new Semester("2020", katihartwenty));

        branches.add(new Branch("KEC Katihar", Katihar));


        //SCE Supaul
        List<String> supaultwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> supaultwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> supaultwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> supaultwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> supaultwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Supaul = new ArrayList<>();
        Supaul.add(new Semester("2024", supaultwentyfour));
        Supaul.add(new Semester("2023", supaultwenttythree));
        Supaul.add(new Semester("2022", supaultwentytwo));
        Supaul.add(new Semester("2021", supaultwentyone));
        Supaul.add(new Semester("2020", supaultwenty));

        branches.add(new Branch("SCE Supaul", Supaul));


        //PCE Purnea
        List<String> purneatwentyfour = Arrays.asList("Module 1: Circuit Theory", "Module 2: Digital Logic");
        List<String> purneatwenttythree = Arrays.asList("1. GAURAV KUMAR (CE) HCL - 2.7LPA",
                "2. ANKIT MOHAN (EE) HCL - 2.7LPA",
                "3. VED PRAKASH (CE) HIREMI - 10.0LPA",
                "4. KESHAV KUMAR SINGH (EE) CAREER LABS - 3.5LPA",
                "5. BHARTI KUMAR (ECE) Q SPIDERS - 4.2LPA",
                "6. PRITI KUMARI (EE) CAREER LABS - 3.5LPA",
                "7. TARA KUMARI (ECE) HIREMI - 10.0LPA",
                "8.  VISHNU KUMAR KAMAT (EE) CAREERS LABS - 3.5LPA",
                "9. RITIK KUMAR (CE) HIREMI - 10.0LPA",
                "10. SHNNI KUMAR (ME) CAREER LABS - 3.5LPA",
                "11. HARSH KUMAR (ME) CAREER LABS - 3.5LPA",
                "12. NIKHIL KUMAR (ME) HIGH-TECHNEXT ENGINEERING & TELECOM PVT. LTD. - 2.5LPA",
                "13. AQIB ANWAR (ME) HIREMI - 10.0LPA",
                "14. PRADEEP KUMAR (ME) HIGH-TECHNEXT ENGINEERING & TELECOM PVT. LTD. - 2.5LPA",
                "15. RAJDEEP KUMAR (ME) HIGH-TECHNEXT ENGINEERING & TELECOM PVT. LTD. - 2.5LPA",
                "16. VISHWAJEET KUMAR SHARMA (ME) HIGH-TECHNEXT ENGINEERING & TELECOM PVT. LTD. - 2.5LPA",
                "17. RAKESH KUMAR (EE) HIGH-TECHNEXT ENGINEERING & TELECOM PVT. LTD. - 2.5LPA",
                "18. VIVEKANAND KUMAR (ME) Q SPIDERS - 4.2 LPA",
                "19. Manish Raaz (EE) High-Technext Engineering & Telecom Pvt. Ltd. - 2.5 LPA",
                "20. RANJAN KUMAR (EE) HIGH-TECHNEXT ENGINEERING & TELECOM PVT. LTD. - 2.5LPA",
                "21. DEEPIKA KUMARI (ME) HIKE EDUCATION PVT. LTD. - 6.2LPA",
                "22. BHAVYA KUAMRI (EE) Q SPIDERS - 4.2LPA",
                "23. PRITY JHA (ECE) HIREMI - 10.0LPA",
                "25. ABHISHEK RAJ (EE) CAREER LABS - 3.5LPA",
                "26. SANTOSH KUMAR (ECE) HIREMI - 10.0LPA",
                "27. SONU KUMAR (CE) HIKE EDUCATION PVT. LTD. - 6.42LPA",
                "28. ADARSH KUMAAR (EE) Q SPIDERS - 4.2LPA",
                "29. DHEERAJ KUMAR (ECE) Q SPIDERS - 4.2LPA",
                "30. SHIKHA KUMARI (EE) HIREMI - 10.0LPA",
                "31. PRAVEEN KUMAR PRAKHAR (EE) Q SPIDERS - 4.2 LPA",
                "32. ANIL KUMAR (ECE) Q SPIDERS - 4.2 LPA",
                "33. DEEPAK KUAMR SINGH (ME) Q SPIDERS - 4.2 LPA",
                "34. NISHANT KUMAR (ECE) Q SPIDERS - 4.2 LPA",
                "35. RJA HAIDAR (ECE) Q SPIDERS - 4.2 LPA",
                "36. ANKIT KUMAR (CE) Q SPIDERS - 4.2 LPA",
                "37. AKASH KUMAR (EC) Q SPIDERS - 4.2 LPA",
                "38. DEEPAK KUMAR (CE) Q SPIDERS - 4.2 LPA",
                "40. SUMAN SAURAV (ME) AVIOTORON AERO SPACE - 3.5LPA",
                "42. AUSHTOSH KUMAR (EE) AVIOTORON AERO SPACE - 3.5LPA",
                "43. GUDIYA KUMARI (ECE) AVIOTORON AERO SPACE - 3.5LPA",
                "44. PALLAVI KUMARI (EE) HIREMI - 10.0LPA",
                "45. NIRAJ KUAMR (EE) HIREMI - 10.0LPA",
                "46. AATISH KUMAR (EE) HIREMI - 10.0LPA",
                "47. RISHIKESH JHA (CE) HIREMI - 10.0LPA",
                "48. AMAN KUAMR (CE) HIREMI - 10.0LPA",
                "49. NAYAN KUMAR (CE) HIREMI - 10.0LPA",
                "50. UJJAWAL KUMAR (ME) HIREMI - 10.0LPA",
                "51. ROHAN PASWAN (EE) HIREMI - 10.0LPA",
                "52. DEEPAK KUMAR SINGH (ME) HIREMI - 10.0LPA",
                "53. DEVENDRA KUAMR (EE) HIREMI - 10.0LPA",
                "54. ANIL KUAMR (ECE) HIREMI - 10.0LPA",
                "55. KAJAL KUAMRI (CE) HIREMI - 10.0LPA",
                "56. NISHANT KUMAR (ECE) HIREMI - 10.0LPA",
                "57. NITISH KUMAR (ME) HIREMI - 10.0LPA",
                "58. RAJA KUAMR (EE) HIREMI - 10.0LPA");

        List<String> purneatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> purneatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");

        List<String> purneatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Purnea = new ArrayList<>();
        Purnea.add(new Semester("2024", purneatwentyfour));
        Purnea.add(new Semester("2023", purneatwenttythree));
        Purnea.add(new Semester("2022", purneatwentytwo));
        Purnea.add(new Semester("2021", purneatwentyone));
        Purnea.add(new Semester("2020", purneatwenty));

        branches.add(new Branch("PCE Purnea", Purnea));


        //SCE Saharsa
        List<String> saharsatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> saharsatwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> saharsatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> saharsatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> saharsatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Saharsa = new ArrayList<>();
        Saharsa.add(new Semester("2024", saharsatwentyfour));
        Saharsa.add(new Semester("2023", saharsatwenttythree));
        Saharsa.add(new Semester("2022", saharsatwentytwo));
        Saharsa.add(new Semester("2021", saharsatwentyone));
        Saharsa.add(new Semester("2020", saharsatwenty));

        branches.add(new Branch("SCE Saharsa", Saharsa));


        //GEC Jamui
        List<String> jamuitwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> jamuitwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> jamuitwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> jamuitwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> jamuitwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Jamui = new ArrayList<>();
        Jamui.add(new Semester("2024", jamuitwentyfour));
        Jamui.add(new Semester("2023", jamuitwenttythree));
        Jamui.add(new Semester("2022", jamuitwentytwo));
        Jamui.add(new Semester("2021", jamuitwentyone));
        Jamui.add(new Semester("2020", jamuitwenty));

        branches.add(new Branch("GEC Jamui", Jamui));


        //GEC Banka
        List<String> bankatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bankatwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bankatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bankatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> bankatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Banka = new ArrayList<>();
        Banka.add(new Semester("2024", bankatwentyfour));
        Banka.add(new Semester("2023", bankatwenttythree));
        Banka.add(new Semester("2022", bankatwentytwo));
        Banka.add(new Semester("2021", bankatwentyone));
        Banka.add(new Semester("2020", bankatwenty));

        branches.add(new Branch("GEC Banka", Banka));


        //GEC VAISHALI
        List<String> VAISHALItwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> VAISHALItwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> VAISHALItwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> VAISHALItwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> VAISHALItwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> VAISHALI = new ArrayList<>();
        VAISHALI.add(new Semester("2024", VAISHALItwentyfour));
        VAISHALI.add(new Semester("2023", VAISHALItwenttythree));
        VAISHALI.add(new Semester("2022", VAISHALItwentytwo));
        VAISHALI.add(new Semester("2021", VAISHALItwentyone));
        VAISHALI.add(new Semester("2020", VAISHALItwenty));

        branches.add(new Branch("GEC VAISHALI", VAISHALI));


        //GEC Nawada
        List<String> Nawadatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Nawadatwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Nawadatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Nawadatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Nawadatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Nawada = new ArrayList<>();
        Nawada.add(new Semester("2024", Nawadatwentyfour));
        Nawada.add(new Semester("2023", Nawadatwenttythree));
        Nawada.add(new Semester("2022", Nawadatwentytwo));
        Nawada.add(new Semester("2021", Nawadatwentyone));
        Nawada.add(new Semester("2020", Nawadatwenty));

        branches.add(new Branch("GEC Nawada", Nawada));


        //GEC Kishanganj
        List<String> Kishanganjtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kishanganjtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kishanganjtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kishanganjtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kishanganjtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Kishanganj = new ArrayList<>();
        Kishanganj.add(new Semester("2024", Kishanganjtwentyfour));
        Kishanganj.add(new Semester("2023", Kishanganjtwenttythree));
        Kishanganj.add(new Semester("2022", Kishanganjtwentytwo));
        Kishanganj.add(new Semester("2021", Kishanganjtwentyone));
        Kishanganj.add(new Semester("2020", Kishanganjtwenty));

        branches.add(new Branch("GEC Kishanganj", Kishanganj));


        //GEC Munger
        List<String> Mungertwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Mungertwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Mungertwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Mungertwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Mungertwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Munger = new ArrayList<>();
        Munger.add(new Semester("2024", Mungertwentyfour));
        Munger.add(new Semester("2023", Mungertwenttythree));
        Munger.add(new Semester("2022", Mungertwentytwo));
        Munger.add(new Semester("2021", Mungertwentyone));
        Munger.add(new Semester("2020", Mungertwenty));

        branches.add(new Branch("GEC Munger", Munger));


        //GEC Sheohar
        List<String> Sheohartwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheohartwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheohartwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheohartwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheohartwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Sheohar = new ArrayList<>();
        Sheohar.add(new Semester("2024", Sheohartwentyfour));
        Sheohar.add(new Semester("2023", Sheohartwenttythree));
        Sheohar.add(new Semester("2022", Sheohartwentytwo));
        Sheohar.add(new Semester("2021", Sheohartwentyone));
        Sheohar.add(new Semester("2020", Sheohartwenty));

        branches.add(new Branch("GEC Sheohar", Sheohar));


        //GEC West Champaran
        List<String> Champarantwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Champarantwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Champarantwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Champarantwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Champarantwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Champaran = new ArrayList<>();
        Champaran.add(new Semester("2024", Champarantwentyfour));
        Champaran.add(new Semester("2023", Champarantwenttythree));
        Champaran.add(new Semester("2022", Champarantwentytwo));
        Champaran.add(new Semester("2021", Champarantwentyone));
        Champaran.add(new Semester("2020", Champarantwenty));

        branches.add(new Branch("GEC West Champaran", Champaran));


        //GEC Aurangabad
        List<String> Aurangabadtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Aurangabadtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Aurangabadtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Aurangabadtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Aurangabadtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Aurangabad = new ArrayList<>();
        Aurangabad.add(new Semester("2024", Aurangabadtwentyfour));
        Aurangabad.add(new Semester("2023", Aurangabadtwenttythree));
        Aurangabad.add(new Semester("2022", Aurangabadtwentytwo));
        Aurangabad.add(new Semester("2021", Aurangabadtwentyone));
        Aurangabad.add(new Semester("2020", Aurangabadtwenty));

        branches.add(new Branch("GEC Aurangabad", Aurangabad));


        //GEC Kaimur
        List<String> Kaimurtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kaimurtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kaimurtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kaimurtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Kaimurtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Kaimur = new ArrayList<>();
        Kaimur.add(new Semester("2024", Kaimurtwentyfour));
        Kaimur.add(new Semester("2023", Kaimurtwenttythree));
        Kaimur.add(new Semester("2022", Kaimurtwentytwo));
        Kaimur.add(new Semester("2021", Kaimurtwentyone));
        Kaimur.add(new Semester("2020", Kaimurtwenty));

        branches.add(new Branch("GEC Kaimur", Kaimur));


        //GEC Gopalganj
        List<String> Gopalganjtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Gopalganjtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Gopalganjtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Gopalganjtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Gopalganjtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Gopalganj = new ArrayList<>();
        Gopalganj.add(new Semester("2024", Gopalganjtwentyfour));
        Gopalganj.add(new Semester("2023", Gopalganjtwenttythree));
        Gopalganj.add(new Semester("2022", Gopalganjtwentytwo));
        Gopalganj.add(new Semester("2021", Gopalganjtwentyone));
        Gopalganj.add(new Semester("2020", Gopalganjtwenty));

        branches.add(new Branch("GEC Gopalganj", Gopalganj));


        //GEC Madhubani
        List<String> Madhubanitwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Madhubanitwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Madhubanitwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Madhubanitwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Madhubanitwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Madhubani = new ArrayList<>();
        Madhubani.add(new Semester("2024", Madhubanitwentyfour));
        Madhubani.add(new Semester("2023", Madhubanitwenttythree));
        Madhubani.add(new Semester("2022", Madhubanitwentytwo));
        Madhubani.add(new Semester("2021", Madhubanitwentyone));
        Madhubani.add(new Semester("2020", Madhubanitwenty));

        branches.add(new Branch("GEC Madhubani", Madhubani));


        //GEC Siwan
        List<String> Siwantwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Siwantwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Siwantwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Siwantwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Siwantwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Siwan = new ArrayList<>();
        Siwan.add(new Semester("2024", Siwantwentyfour));
        Siwan.add(new Semester("2023", Siwantwenttythree));
        Siwan.add(new Semester("2022", Siwantwentytwo));
        Siwan.add(new Semester("2021", Siwantwentyone));
        Siwan.add(new Semester("2020", Siwantwenty));

        branches.add(new Branch("GEC Siwan", Siwan));


        //GEC Jehanabad
        List<String> Jehanabadtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Jehanabadtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Jehanabadtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Jehanabadtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Jehanabadtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Jehanabad = new ArrayList<>();
        Jehanabad.add(new Semester("2024", Jehanabadtwentyfour));
        Jehanabad.add(new Semester("2023", Jehanabadtwenttythree));
        Jehanabad.add(new Semester("2022", Jehanabadtwentytwo));
        Jehanabad.add(new Semester("2021", Jehanabadtwentyone));
        Jehanabad.add(new Semester("2020", Jehanabadtwenty));

        branches.add(new Branch("GEC Jehanabad", Jehanabad));


        //GEC Arwal
        List<String> Arwaltwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Arwaltwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Arwaltwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Arwaltwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Arwaltwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Arwal = new ArrayList<>();
        Arwal.add(new Semester("2024", Arwaltwentyfour));
        Arwal.add(new Semester("2023", Arwaltwenttythree));
        Arwal.add(new Semester("2022", Arwaltwentytwo));
        Arwal.add(new Semester("2021", Arwaltwentyone));
        Arwal.add(new Semester("2020", Arwaltwenty));

        branches.add(new Branch("GEC Arwal", Arwal));


        //GEC Samastipur
        List<String> Samastipurtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Samastipurtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Samastipurtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Samastipurtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Samastipurtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Samastipur = new ArrayList<>();
        Samastipur.add(new Semester("2024", Samastipurtwentyfour));
        Samastipur.add(new Semester("2023", Samastipurtwenttythree));
        Samastipur.add(new Semester("2022", Samastipurtwentytwo));
        Samastipur.add(new Semester("2021", Samastipurtwentyone));
        Samastipur.add(new Semester("2020", Samastipurtwenty));

        branches.add(new Branch("GEC Samastipur", Samastipur));


        //GEC Khagaria
        List<String> Khagariatwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Khagariatwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Khagariatwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Khagariatwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Khagariatwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Khagaria = new ArrayList<>();
        Khagaria.add(new Semester("2024", Khagariatwentyfour));
        Khagaria.add(new Semester("2023", Khagariatwenttythree));
        Khagaria.add(new Semester("2022", Khagariatwentytwo));
        Khagaria.add(new Semester("2021", Khagariatwentyone));
        Khagaria.add(new Semester("2020", Khagariatwenty));

        branches.add(new Branch("GEC Khagaria", Khagaria));


        //GEC Buxar
        List<String> Buxartwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Buxartwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Buxartwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Buxartwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Buxartwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Buxar = new ArrayList<>();
        Buxar.add(new Semester("2024", Buxartwentyfour));
        Buxar.add(new Semester("2023", Buxartwenttythree));
        Buxar.add(new Semester("2022", Buxartwentytwo));
        Buxar.add(new Semester("2021", Buxartwentyone));
        Buxar.add(new Semester("2020", Buxartwenty));

        branches.add(new Branch("GEC Buxar", Buxar));



        //GEC Bhojpur
        List<String> Bhojpurtwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Bhojpurtwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Bhojpurtwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Bhojpurtwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Bhojpurtwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Bhojpur = new ArrayList<>();
        Bhojpur.add(new Semester("2024", Bhojpurtwentyfour));
        Bhojpur.add(new Semester("2023", Bhojpurtwenttythree));
        Bhojpur.add(new Semester("2022", Bhojpurtwentytwo));
        Bhojpur.add(new Semester("2021", Bhojpurtwentyone));
        Bhojpur.add(new Semester("2020", Bhojpurtwenty));

        branches.add(new Branch("GEC Bhojpur", Bhojpur));


        //GEC Sheikhpura
        List<String> Sheikhpuratwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheikhpuratwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheikhpuratwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheikhpuratwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Sheikhpuratwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Sheikhpura = new ArrayList<>();
        Sheikhpura.add(new Semester("2024", Sheikhpuratwentyfour));
        Sheikhpura.add(new Semester("2023", Sheikhpuratwenttythree));
        Sheikhpura.add(new Semester("2022", Sheikhpuratwentytwo));
        Sheikhpura.add(new Semester("2021", Sheikhpuratwentyone));
        Sheikhpura.add(new Semester("2020", Sheikhpuratwenty));

        branches.add(new Branch("GEC Sheikhpura", Sheikhpura));


        //GEC Lakhisarai
        List<String> Lakhisaraitwentyfour = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Lakhisaraitwenttythree = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Lakhisaraitwentytwo = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Lakhisaraitwentyone = Arrays.asList("Coming Soon....Check it Next Year..");
        List<String> Lakhisaraitwenty = Arrays.asList("Coming Soon....Check it Next Year..");

        List<Semester> Lakhisarai = new ArrayList<>();
        Lakhisarai.add(new Semester("2024", Lakhisaraitwentyfour));
        Lakhisarai.add(new Semester("2023", Lakhisaraitwenttythree));
        Lakhisarai.add(new Semester("2022", Lakhisaraitwentytwo));
        Lakhisarai.add(new Semester("2021", Lakhisaraitwentyone));
        Lakhisarai.add(new Semester("2020", Lakhisaraitwenty));

        branches.add(new Branch("GEC Lakhisarai", Lakhisarai));






        return branches;
    }
}


