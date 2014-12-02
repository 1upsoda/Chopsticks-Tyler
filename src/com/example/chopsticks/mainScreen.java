package com.example.chopsticks;



import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class mainScreen extends Activity
{
	private Button startButton;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainscreen);
		startButton = (Button) findViewById(R.id.startButton);
		
		setupListeners();
	}
	private void setupListeners()
	{
	startButton.setOnClickListener(new View.OnClickListener() 
	{

		@Override
		public void onClick(View currentView) 
		{
			// TODO Auto-generated method stub
			Intent otherScreenIntent = new Intent(currentView.getContext(),Immersive.class);
			startActivityForResult(otherScreenIntent, 0);
		}
	});
	}
}
