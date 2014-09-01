package com.envenomedsoftware.pokemarker;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonSetup();
	}
	
	public void buttonSetup() {
		LinearLayout poke1 = (LinearLayout) findViewById(R.id.block1);
		LinearLayout poke2 = (LinearLayout) findViewById(R.id.block2);
		LinearLayout poke3 = (LinearLayout) findViewById(R.id.block3);
		LinearLayout poke4 = (LinearLayout) findViewById(R.id.block4);
		LinearLayout poke5 = (LinearLayout) findViewById(R.id.block5);
		LinearLayout poke6 = (LinearLayout) findViewById(R.id.block6);
		
		addPokeListener(poke1);
		addPokeListener(poke2);
		addPokeListener(poke3);
		addPokeListener(poke4);
		addPokeListener(poke5);
		addPokeListener(poke6);
	}

	public void addPokeListener(LinearLayout pokeLayout) {
		final LinearLayout pokeLO = pokeLayout;
		final Context context = this;
		Button pokeBtn = (Button) pokeLayout.findViewById(R.id.party_mem);
		pokeBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(context);
				builder.setTitle("Markings");
				builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
			           public void onClick(DialogInterface dialog, int id) {
			           }
			       });
				AlertDialog alert = builder.create();
				final View content = getLayoutInflater().inflate(R.layout.marking_dialog, null);
				
				Button stat1 = (Button) content.findViewById(R.id.stat1);
				stat1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						TextView stat1 = (TextView) pokeLO.findViewById(R.id.stat1);
						if(stat1.getTextColors().getDefaultColor() == Color.WHITE) {
							stat1.setTextColor(Color.TRANSPARENT);
							((Button) content.findViewById(R.id.stat1)).setTextColor(Color.parseColor("#20ffffff"));
						} else {
							stat1.setTextColor(Color.WHITE);
							((Button) content.findViewById(R.id.stat1)).setTextColor(Color.WHITE);
						}
					}
				});
				
				Button stat2 = (Button) content.findViewById(R.id.stat2);
				stat2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						TextView stat2 = (TextView) pokeLO.findViewById(R.id.stat2);
						if(stat2.getTextColors().getDefaultColor() == Color.WHITE) {
							stat2.setTextColor(Color.TRANSPARENT);
							((Button) content.findViewById(R.id.stat2)).setTextColor(Color.parseColor("#20ffffff"));
						} else {
							stat2.setTextColor(Color.WHITE);
							((Button) content.findViewById(R.id.stat2)).setTextColor(Color.WHITE);
						}
					}
				});
				
				Button stat3 = (Button) content.findViewById(R.id.stat3);
				stat3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						TextView stat3 = (TextView) pokeLO.findViewById(R.id.stat3);
						if(stat3.getTextColors().getDefaultColor() == Color.WHITE) {
							stat3.setTextColor(Color.TRANSPARENT);
							((Button) content.findViewById(R.id.stat3)).setTextColor(Color.parseColor("#20ffffff"));
						} else {
							stat3.setTextColor(Color.WHITE);
							((Button) content.findViewById(R.id.stat3)).setTextColor(Color.WHITE);
						}
					}
				});
				
				Button stat4 = (Button) content.findViewById(R.id.stat4);
				stat4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						TextView stat4 = (TextView) pokeLO.findViewById(R.id.stat4);
						if(stat4.getTextColors().getDefaultColor() == Color.WHITE) {
							stat4.setTextColor(Color.TRANSPARENT);
							((Button) content.findViewById(R.id.stat4)).setTextColor(Color.parseColor("#20ffffff"));
						} else {
							stat4.setTextColor(Color.WHITE);
							((Button) content.findViewById(R.id.stat4)).setTextColor(Color.WHITE);
						}
					}
				});
				
				Button stat5 = (Button) content.findViewById(R.id.stat5);
				stat5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						TextView stat5 = (TextView) pokeLO.findViewById(R.id.stat5);
						if(stat5.getTextColors().getDefaultColor() == Color.WHITE) {
							stat5.setTextColor(Color.TRANSPARENT);
							((Button) content.findViewById(R.id.stat5)).setTextColor(Color.parseColor("#20ffffff"));
						} else {
							stat5.setTextColor(Color.WHITE);
							((Button) content.findViewById(R.id.stat5)).setTextColor(Color.WHITE);
						}
					}
				});
				
				Button stat6= (Button) content.findViewById(R.id.stat6);
				stat6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						TextView stat6 = (TextView) pokeLO.findViewById(R.id.stat6);
						if(stat6.getTextColors().getDefaultColor() == Color.WHITE) {
							stat6.setTextColor(Color.TRANSPARENT);
							((Button) content.findViewById(R.id.stat6)).setTextColor(Color.parseColor("#20ffffff"));
						} else {
							stat6.setTextColor(Color.WHITE);
							((Button) content.findViewById(R.id.stat6)).setTextColor(Color.WHITE);
						}
					}
				});
				
				alert.setView(content);
				alert.show();
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		return super.onOptionsItemSelected(item);
	}
}
