package com.pratap.gplaystore;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.pratap.gplaystore.adapters.PLAdapter;
import com.pratap.gplaystore.adapters.RC1Adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class DashBoardActivity extends AppCompatActivity {

    private RecyclerView RC1,RCPopularLangs;

    // ArrayList for person names
    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android,R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android, R.drawable.android));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_board_activity);

        RC1 = (RecyclerView)findViewById(R.id.rc1);
        RCPopularLangs = (RecyclerView)findViewById(R.id.rcPopularLangs);

        GridLayoutManager layoutManager = new GridLayoutManager(DashBoardActivity.this,2);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);

        RC1.setLayoutManager(layoutManager);
        RC1Adapter adapter = new RC1Adapter(DashBoardActivity.this,personNames,personImages);
        RC1.setAdapter(adapter);

        GridLayoutManager layoutManager1 = new GridLayoutManager(DashBoardActivity.this,1);
        layoutManager1.setOrientation(LinearLayout.HORIZONTAL);

        RCPopularLangs.setLayoutManager(layoutManager1);
        PLAdapter adapter1 = new PLAdapter(DashBoardActivity.this,personNames);
        RCPopularLangs.setAdapter(adapter1);
    }//onCreate
}
