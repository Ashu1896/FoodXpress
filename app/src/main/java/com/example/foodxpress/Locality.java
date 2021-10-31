package com.example.foodxpress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;


public class Locality extends AppCompatActivity implements OnItemSelectedListener {


    private Spinner spinner, spinner1;
    private Button ok, cancel;


    String[] state = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telagana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal"};

    String[] station_Name= {"Agra Fort", "Agra Cantt.", "Ahmedabad", "Ajmer", "Allahabad", "Ambala Cantt.", "Amritsar", "Anuppur", "Azamgarh", "Ballia", "Bandra(T)", "Bangalore City", "Bangalore Cantt.", "Baranui Jn.", "Betul", "Bhavnagar", "Bhopal", "Bhubaneswar", "Bhuj", "Bhusaval", "Bikaner", "Bilaspur", "Bina", "Bakaro Steel City", "Bokaro", "Buxar", "Chandigarh", "Chennai Central", "Chennai Egmore", "Chhapra", "Chhindwara", "Chopan", "Chunar", "Coimbatore Jn.", "Cuttack", "Dadar", "Damoh", "Darbhanga", "Dehradun", "Dhanbad", "Durg", "Ernakulam Jn.", "Firozpur", "Gaya", "Gondia", "Gorakhpur", "Gurgaon", "Guwahati", "Gwalior", "Hajipur", "Hapa", "Haridwar", "Howrah", "Hubli", "Hyderabad", "Indore", "Itarsi", "Jabalpur", "Jagdalpur", "Jaipur", "Jaisalmer", "Jammu Tawi", "Jamnagar", "Jhansi", "Jodhpur", "Kanniyakumari", "Kanpur Central", "Katni", "Katni Murwara", "Kochuveli", "Kolkata", "Kota", "Lokmanya Tilak(T)", "Lucknow", "Madgaon(Goa)", "Madurai Jn.", "Malda Town", "Mangalore", "Manmad", "Mathura", "Mughal Sarai", "Mumbai Central", "Mumbai CST", "Mysore", "Nagpur", "Nainpur", "New Delhi", "Nizamuddin", "Okha", "Patna", "Porbandar", "Pune Jn.", "Puri", "Raipur", "Rajendranagar", "Rajkot", "Ranchi", "Raxaul", "Secunderabad", "Shimla", "Siliguri", "Siliguri Town", "Surat", "Tatanagar", "Thiruvanthapuram", "Tuticorin", "Udaipur City", "Vadodara", "Varanasi", "Vasco-Da-Gama", "Vijayawada", "Visakhapatnam", "Yesvantpur"};

    String[] station_Name_Codes = {"AF", "AGC", "ADI", "AII", "ALD", "UMB", "ASR", "APR", "AMH", "BUI", "BDTS", "SBC", "BNC", "BJU", "BZU", "BGP", "BVC", "BPL", "BBS", "BHUJ", "BSL", "BKN", "BSP", "BINA", "BKSC", "BXR", "CDG", "MAS", "MS", "CPR", "CWA", "CPU", "CAR", "CBE", "CTC", "DR", "DMO", "DBG", "DDN", "DHN", "DURG", "ERS", "FZP", "GAYA", "G", "GKP", "GGN", "GHY", "GWL", "HBJ", "HJP", "HAPA", "HW", "HWH", "UBL", "HYB", "INDB", "ET", "JBP", "JDB", "JP", "JSM", "JAT", "JHS", "JU", "CAPE", "CNB", "KTE", "KMZ", "KCVL", "KOAA", "KOTA", "LTT", "LJN/LKO", "MAO", "MDU", "MLDT", "MAJN", "MMR", "MTJ", "MGS", "BCT", "CSTM", "MYS", "NGP", "NIR", "NDLS", "NZM", "OKHA", "PNBE", "PBR", "PUNE", "PURI", "R", "RJQ", "RJT", "RNC", "RXL", "SC", "SML", "SGUJ", "SGUT", "ST", "TATA", "TVC", "TN", "UDZ", "BRC", "BSB", "VSG", "BZA", "VSKP", "YPR"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locality);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.select_state, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.select_station, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
    {
        String text = parent.getItemAtPosition(pos).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();

        String text1 = parent.getItemAtPosition(pos).toString();
        Toast.makeText(parent.getContext(), text1, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

}


