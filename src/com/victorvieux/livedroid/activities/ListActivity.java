package com.victorvieux.livedroid.activities;

import android.os.Bundle;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.victorvieux.livedroid.R;
import com.victorvieux.livedroid.data.Player;

public class ListActivity extends BaseActivty {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPlayer((Player) getIntent().getExtras().getSerializable("player"));
        setContentView(R.layout.list);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.menu_list, menu);
        return true;
    }
    
}