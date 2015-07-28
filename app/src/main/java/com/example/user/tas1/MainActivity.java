package com.example.user.tas1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends ActionBarActivity {
    private ListView listView;
    ArrayList<String> listItems;
    private ArrayAdapter<String> arrayAdapter;
    EditText editText;
    private String[] items={
            "Taylor Swift - Shake it Off (Official Loop Cover)",
            "Ellie Goulding - Burn (Matthew & Soco Remix Feat. Alexi Blue Cover)",
            "Imagine Cover (Halfmoon Bay Beach)",
            "Rule The World By Walk Off The Earth Cover By Across The Board",
            "DEIEDRA - (Whiskey in the jar) Guiski Botila Bat (Oficial video 2014)",
            "Team By Lorde Cover By Across The Board",
            "1Take .TV:Holly Walker (Must Be Love Mash Up)",
            "The El Cajon Summer Concert Series Featuring CALIBER",
            "Daylight: No One's Deserving - Live - AltarTV",
            "Red vs. Blue Season 4",
            "Spider-Man: The Peril of Doc Ock",
            "Popeye The Sailor: Big Bad Sinbad",
            "Daylight: Outside Of Me/On The Way To Dads - Live"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        editText=(EditText)findViewById(R.id.editText);
        initList();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals("")){
                    // reset listview
                    initList();
                }
                else{
                    // perform search
                    searchItem(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        ImageButton b = (ImageButton) findViewById(R.id.imageButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pop.class));
            }
        });
    }
    public void initList(){
        listItems=new ArrayList<>(Arrays.asList(items));
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String a = ((TextView) view).getText().toString();
                if(a.equals("Taylor Swift - Shake it Off (Official Loop Cover)")){
                    a = "https://ia801400.us.archive.org/3/items/FO72F8706522/FO72F8706522.mp4";
                } else if(a.equals("Ellie Goulding - Burn (Matthew & Soco Remix Feat. Alexi Blue Cover)")){
                    a = "https://ia800502.us.archive.org/25/items/EllieGouldingBurnMatthewHeyerSocoRemixFeatAlexiBlueCo\n" +
                            "vervFHtqMGJqg/Ellie%20Goulding%20-%20Burn%20%28Matthew%20Heyer%20%26%20Soco%20Remix%20Feat.\n" +
                            "%20Alexi%20Blue%20Cover%20%29-vFHtqMG-Jqg.f137.mp4";
                } else if(a.equals("Imagine Cover (Halfmoon Bay Beach)")){
                    a = "https://ia800306.us.archive.org/3/items/AdaltoandDavidImagineCoverHalfmoonBaybeach/Imagine_Cov\n" +
                            "er_reduced3_512kb.mp4";
                } else if(a.equals("Rule The World By Walk Off The Earth Cover By Across The Board")){
                    a = "https://ia801500.us.archive.org/32/items/RuleTheWorldByWalkOffTheEarthCoverByAcrossTheBoard/Ru\n" +
                            "le%20The%20World%20by%20Walk%20Off%20The%20Earth%20Cover%20by%20Across%20The%20Board.mp4";
                } else if(a.equals("DEIEDRA - (Whiskey in the jar) Guiski Botila Bat (Oficial video 2014)")){
                    a = "https://ia802702.us.archive.org/31/items/DEIEDRAGuiskiBotilaBatVIDEOCLIPOFICIAL2014Original/DE\n" +
                            "IEDRA%20-%20Guiski%20botila%20bat___%20%28VIDEOCLIP%20OFICIAL%202014%29%20-Original-.mp4";
                } else if(a.equals("Team By Lorde Cover By Across The Board")){
                    a = "https://ia801008.us.archive.org/14/items/TeamByLordeCoverByAcrossTheBoard/Team%20by%20Lorde\n" +
                            "%20Cover%20by%20Across%20The%20Board.mp4";
                } else if(a.equals("1Take .TV:Holly Walker (Must Be Love Mash Up)")){
                    a = "https://ia801900.us.archive.org/8/items/bliptv-20131011-071718-1TakeTV-\n" +
                            "1TakeTVHollyWalkerMustBeLoveMashUp801/bliptv-20131011-071718-1TakeTV-\n" +
                            "1TakeTVHollyWalkerMustBeLoveMashUp801.mp4";
                }else if(a.equals("The El Cajon Summer Concert Series Featuring CALIBER")){
                    a = "https://ia801002.us.archive.org/35/items/TheElCajonSummerConcertSeriesFeaturingCaliber/\n"+
                            "ElCajonMUSICcaliberHD2.mp4";
                }else if(a.equals("Daylight: No One's Deserving - Live - AltarTV")) {
                    a = "https://ia601001.us.archive.org/19/items/bliptv-20131012-204902-AltarTV-DaylightNoOnesDeservingLiveAltarTV332/bliptv-20131012-204902-AltarTV-DaylightNoOnesDeservingLiveAltarTV332.mp4";
                }else if(a.equals("Red vs. Blue Season 4")) {
                    a = "https://ia600305.us.archive.org/2/items/RvB_S4/RvB_s4_e01_512kb.mp4";
                }else if(a.equals("Spider-Man: The Peril of Doc Ock")) {
                    a = "https://ia902703.us.archive.org/4/items/peril_of_doc_ock/peril_of_doc_ock_512kb.mp4";
                }else if(a.equals("Popeye The Sailor: Big Bad Sinbad")) {
                    a = "https://ia800301.us.archive.org/7/items/popeye_big_bad_sinbad/popeye_big_bad_sinbad_512kb.mp4";
                }else if(a.equals("Daylight: Outside Of Me/On The Way To Dads - Live")) {
                    a = "https://ia801006.us.archive.org/4/items/bliptv-20131012-114338-AltarTV-DaylightOutsideOfMeOnTheWayToDadsLive426/bliptv-20131012-114338-AltarTV-DaylightOutsideOfMeOnTheWayToDadsLive426.mp4\n" +
                            "https://ia600306.us.archive.org/1/items/Titanic-ChristoValiente/MyHeartWillGoOntitanic-ChristoValienteSubtituladaEnEspaol.mp4";
                }
                video(a);
            }
        });
    }

    public void searchItem(String textToSearch){
        for(String item:items){
            if(!item.contains(textToSearch)){
                listItems.remove(item);
            }
        }
        arrayAdapter.notifyDataSetChanged();
    }

    public void video(String path)
    {
        Intent i=new Intent(MainActivity.this,video.class);
        i.putExtra("path",path);
        startActivity(i);
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.imageButton) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
