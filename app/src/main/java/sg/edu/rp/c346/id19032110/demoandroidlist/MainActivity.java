package sg.edu.rp.c346.id19032110.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVersions;
    ArrayList<AndroidVersion> alversionList;
    ArrayAdapter<AndroidVersion> aaVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVersions = findViewById(R.id.listViewVersions);
        alversionList = new ArrayList<>();
        adapter = new CustomAdapter(this, R.layout.row, alversionList);

        /*
        versionList.add("Pie - 9.0");
        versionList.add("Oreo - 8.0 - 8.1");
        versionList.add("Nougat - 7.0 - 7.1.2");
        versionList.add("Marshmallow - 6.0 - 6.0.1");
        versionList.add("Lollipop - 5.0 - 5.1.1");
        versionList.add("KitKat - 4.4 - 4.4.4");
        versionList.add("Jelly Bean - 4.1 - 4.3.1");*/

        AndroidVersion version1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion version2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion version3 = new AndroidVersion("Nouat", "7.0 - 7.1.2");
        AndroidVersion version4 = new AndroidVersion("Marshmallow", "6.0 - 6.0.1");
        AndroidVersion version5 = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion version6 = new AndroidVersion("Kitkat", "4.4 - 4.4.4");
        AndroidVersion version7 = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");

       //alversionList.add(new AndroidVersion("Pie", "9.0"));

        alversionList.add(version1);
        alversionList.add(version2);
        alversionList.add(version3);
        alversionList.add(version4);
        alversionList.add(version5);
        alversionList.add(version6);
        alversionList.add(version7);



        aaVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alversionList);
        lvVersions.setAdapter(adapter);


    }
}
