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

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Immersive extends Activity
{

	private Button homeButton;
	private Button resetButton;
	private RelativeLayout background;
	private TextView playerRight;
	private TextView playerLeft;
	private TextView enemyRight;
	private TextView enemyLeft;
	private ImageButton enemyLeftHand;
	private ImageButton enemyRightHand;
	private ImageButton playerRightHand;
	private ImageButton playerLeftHand;
	private int enemyLeftHandNumber;
	private int enemyRightHandNumber;
	private int playerRightHandNumber;
	private int playerLeftHandNumber;
	private boolean enemyTurn;
	private boolean enemyRightHandSelected;
	private boolean enemyLeftHandSelected;
	private boolean playerLeftHandSelected;
	private boolean playerRightHandSelected;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_immersive);
		homeButton = (Button) findViewById(R.id.homeButton);
		resetButton = (Button) findViewById(R.id.resetButton);
		enemyLeftHand = (ImageButton) findViewById(R.id.enemyLeftHand);
		enemyRightHand = (ImageButton) findViewById(R.id.enemyRightHand);
		playerRightHand = (ImageButton) findViewById(R.id.playerRightHand);
		playerLeftHand = (ImageButton) findViewById(R.id.playerLeftHand);
		playerRight = (TextView) findViewById(R.id.playerRight);
		playerLeft = (TextView) findViewById(R.id.playerLeft);
		enemyRight = (TextView) findViewById(R.id.enemyRight);
		enemyLeft = (TextView) findViewById(R.id.enemyLeft);
		background = (RelativeLayout) findViewById(R.id.layout);
		enemyLeftHandNumber = 1;
		enemyRightHandNumber = 1;
		playerRightHandNumber = 1;
		playerLeftHandNumber = 1;
		enemyTurn = false;
		enemyRightHandSelected = false;
		enemyLeftHandSelected = false;
		playerRightHandSelected = false;
		playerLeftHandSelected = false;
		
		setupListeners();
	}
	@Override
	 public void onWindowFocusChanged(boolean hasFocus) 
	{
	     super.onWindowFocusChanged(hasFocus);
	     if (hasFocus)
	     {
	         getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
	                 | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
	                 | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
	                 | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
	                 | View.SYSTEM_UI_FLAG_FULLSCREEN
	                 | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	     }
	 }
	private void setupListeners()
	{
		
		resetButton.setOnClickListener(new View.OnClickListener()
		{

				@Override
				public void onClick(View currentView) 
				{
					background.setBackgroundResource(R.drawable.tennis2);
					enemyTurn = false;
					enemyLeft.setText("1");
					enemyRight.setText("1");
					playerLeft.setText("1");
					playerRight.setText("1");
					enemyRightHandSelected = false;
					enemyLeftHandSelected = false;
					playerRightHandSelected = false;
					playerLeftHandSelected = false;
					enemyLeftHandNumber = 1;
					enemyRightHandNumber = 1;
					playerRightHandNumber = 1;
					playerLeftHandNumber = 1;
					enemyRightHand.setBackgroundResource(R.drawable.right1);
					enemyLeftHand.setBackgroundResource(R.drawable.left1);
					playerLeftHand.setBackgroundResource(R.drawable.left1);
					playerRightHand.setBackgroundResource(R.drawable.right1);
				}
			});
		
	
		enemyLeftHand.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View currentView)
			{
				if(enemyTurn)
				{
					enemyLeftHandSelected = true;
					enemyRightHandSelected = false;
				}
				else
				{
				if(playerRightHandSelected && ((playerRightHandNumber + enemyLeftHandNumber) < 5) && (enemyLeftHandNumber != 0) && (playerRightHandNumber != 0))
				{
					enemyLeftHandNumber = (playerRightHandNumber + enemyLeftHandNumber);
					enemyTurn = true;
					background.setBackgroundResource(R.drawable.tennis1);
					enemyLeft.setText("" +enemyLeftHandNumber);
					if(enemyLeftHandNumber == 1)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(enemyLeftHandNumber == 2)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(enemyLeftHandNumber == 3)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(enemyLeftHandNumber == 4)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left4);
					}
					
				}
				else
				if(playerRightHandSelected && ((playerRightHandNumber + enemyLeftHandNumber) > 5) && (enemyLeftHandNumber != 0) && (playerRightHandNumber != 0))
				{
					enemyLeftHandNumber = ((playerRightHandNumber + enemyLeftHandNumber) - 5);
					enemyTurn = true;
					background.setBackgroundResource(R.drawable.tennis1);
					enemyLeft.setText("" +enemyLeftHandNumber);
					if(enemyLeftHandNumber == 1)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(enemyLeftHandNumber == 2)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(enemyLeftHandNumber == 3)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(enemyLeftHandNumber == 4)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(playerRightHandSelected && ((playerRightHandNumber + enemyLeftHandNumber) == 5) && (enemyLeftHandNumber != 0) && (playerRightHandNumber != 0))
				{
					enemyLeftHandNumber = ((playerRightHandNumber + enemyLeftHandNumber) - 5);
					enemyTurn = true;
					background.setBackgroundResource(R.drawable.tennis1);
					enemyLeft.setText("" +enemyLeftHandNumber);
					enemyLeftHand.setBackgroundResource(R.drawable.left0);
				}
				else
				if(playerLeftHandSelected && ((playerLeftHandNumber + enemyLeftHandNumber) < 5) && (enemyLeftHandNumber != 0) && (playerLeftHandNumber != 0))
				{
					enemyLeftHandNumber = (playerLeftHandNumber + enemyLeftHandNumber);
					enemyTurn = true;
					background.setBackgroundResource(R.drawable.tennis1);
					enemyLeft.setText("" +enemyLeftHandNumber);
					if(enemyLeftHandNumber == 1)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(enemyLeftHandNumber == 2)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(enemyLeftHandNumber == 3)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(enemyLeftHandNumber == 4)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(playerLeftHandSelected && ((playerLeftHandNumber + enemyLeftHandNumber) > 5) && (enemyLeftHandNumber != 0) && (playerLeftHandNumber != 0))
				{
					enemyLeftHandNumber = ((playerLeftHandNumber + enemyLeftHandNumber) - 5);
					enemyTurn = true;
					background.setBackgroundResource(R.drawable.tennis1);
					enemyLeft.setText("" +enemyLeftHandNumber);
					if(enemyLeftHandNumber == 1)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(enemyLeftHandNumber == 2)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(enemyLeftHandNumber == 3)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(enemyLeftHandNumber == 4)
					{
						enemyLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(playerLeftHandSelected && ((playerLeftHandNumber + enemyLeftHandNumber) == 5) && (enemyLeftHandNumber != 0) && (playerLeftHandNumber != 0))
				{
					enemyLeftHandNumber = ((playerLeftHandNumber + enemyLeftHandNumber) - 5);
					enemyTurn = true;
					background.setBackgroundResource(R.drawable.tennis1);
					enemyLeft.setText("" +enemyLeftHandNumber);
					enemyLeftHand.setBackgroundResource(R.drawable.left0);
				}
				}
			}
		});
		enemyRightHand.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View currentView)
			{
				if(enemyTurn)
				{
					enemyLeftHandSelected = false;
					enemyRightHandSelected = true;
				}
				else
				{
					if(playerRightHandSelected && ((playerRightHandNumber + enemyRightHandNumber) < 5) && (enemyRightHandNumber != 0) && (playerRightHandNumber != 0))
					{
						enemyRightHandNumber = (playerRightHandNumber + enemyRightHandNumber);
						enemyTurn = true;
						background.setBackgroundResource(R.drawable.tennis1);
						enemyRight.setText("" +enemyRightHandNumber);
						if(enemyRightHandNumber == 1)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right1);
						}
						else
						if(enemyRightHandNumber == 2)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right2);
						}
						else
						if(enemyRightHandNumber == 3)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right3);
						}
						else
						if(enemyRightHandNumber == 4)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right4);
						}
					}
					else
					if(playerRightHandSelected && ((playerRightHandNumber + enemyRightHandNumber) > 5) && (enemyRightHandNumber != 0) && (playerRightHandNumber != 0))
					{
						enemyRightHandNumber = ((playerRightHandNumber + enemyRightHandNumber) - 5);
						enemyTurn = true;
						background.setBackgroundResource(R.drawable.tennis1);
						enemyRight.setText("" +enemyRightHandNumber);
						if(enemyRightHandNumber == 1)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right1);
						}
						else
						if(enemyRightHandNumber == 2)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right2);
						}
						else
						if(enemyRightHandNumber == 3)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right3);
						}
						else
						if(enemyRightHandNumber == 4)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right4);
						}
					}
					else
					if(playerRightHandSelected && ((playerRightHandNumber + enemyRightHandNumber) == 5) && (enemyRightHandNumber != 0) && (playerRightHandNumber != 0))
					{
						enemyRightHandNumber = ((playerRightHandNumber + enemyRightHandNumber) - 5);
						enemyTurn = true;
						background.setBackgroundResource(R.drawable.tennis1);
						enemyRight.setText("" +enemyRightHandNumber);
						enemyRightHand.setBackgroundResource(R.drawable.right0);
					}
					else
					if(playerLeftHandSelected && ((playerLeftHandNumber + enemyRightHandNumber) < 5) && (enemyRightHandNumber != 0) && (playerLeftHandNumber != 0))
					{
						enemyRightHandNumber = (playerLeftHandNumber + enemyRightHandNumber);
						enemyTurn = true;
						background.setBackgroundResource(R.drawable.tennis1);
						enemyRight.setText("" +enemyRightHandNumber);
						if(enemyRightHandNumber == 1)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right1);
						}
						else
						if(enemyRightHandNumber == 2)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right2);
						}
						else
						if(enemyRightHandNumber == 3)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right3);
						}
						else
						if(enemyRightHandNumber == 4)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right4);
						}
					}
					else
					if(playerLeftHandSelected && ((playerLeftHandNumber + enemyRightHandNumber) > 5) && (enemyRightHandNumber != 0) && (playerLeftHandNumber != 0))
					{
						enemyRightHandNumber = ((playerLeftHandNumber + enemyRightHandNumber) - 5);
						enemyTurn = true;
						background.setBackgroundResource(R.drawable.tennis1);
						enemyRight.setText("" +enemyRightHandNumber);
						if(enemyRightHandNumber == 1)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right1);
						}
						else
						if(enemyRightHandNumber == 2)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right2);
						}
						else
						if(enemyRightHandNumber == 3)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right3);
						}
						else
						if(enemyRightHandNumber == 4)
						{
							enemyRightHand.setBackgroundResource(R.drawable.right4);
						}
					}
					else
					if(playerLeftHandSelected && ((playerLeftHandNumber + enemyRightHandNumber) == 5) && (enemyRightHandNumber != 0) && (playerLeftHandNumber != 0))
					{
						enemyRightHandNumber = ((playerLeftHandNumber + enemyRightHandNumber) - 5);
						enemyTurn = true;
						background.setBackgroundResource(R.drawable.tennis1);
						enemyRight.setText("" +enemyRightHandNumber);
						enemyRightHand.setBackgroundResource(R.drawable.right0);
					}
				}
			}
		});
		playerLeftHand.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View currentView)
			{
				if(!enemyTurn)
				{
					playerLeftHandSelected = true;
					playerRightHandSelected = false;
				}
				else
				{
				if(enemyRightHandSelected && ((enemyRightHandNumber + playerLeftHandNumber) < 5) && (playerLeftHandNumber != 0) && (enemyRightHandNumber != 0))
				{
					playerLeftHandNumber = (enemyRightHandNumber + playerLeftHandNumber);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerLeft.setText("" +playerLeftHandNumber);
					if(playerLeftHandNumber == 1)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(playerLeftHandNumber == 2)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(playerLeftHandNumber == 3)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(playerLeftHandNumber == 4)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(enemyRightHandSelected && ((enemyRightHandNumber + playerLeftHandNumber) > 5) && (playerLeftHandNumber != 0) && (enemyRightHandNumber != 0))
				{
					playerLeftHandNumber = ((enemyRightHandNumber + playerLeftHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerLeft.setText("" +playerLeftHandNumber);
					if(playerLeftHandNumber == 1)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(playerLeftHandNumber == 2)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(playerLeftHandNumber == 3)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(playerLeftHandNumber == 4)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(enemyRightHandSelected && ((enemyRightHandNumber + playerLeftHandNumber) == 5) && (playerLeftHandNumber != 0) && (enemyRightHandNumber != 0))
				{
					playerLeftHandNumber = ((enemyRightHandNumber + playerLeftHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerLeft.setText("" +playerLeftHandNumber);
					playerLeftHand.setBackgroundResource(R.drawable.left0);
				}
				else
				if(enemyLeftHandSelected && ((enemyLeftHandNumber + playerLeftHandNumber) < 5) && (playerLeftHandNumber != 0) && (enemyLeftHandNumber != 0))
				{
					playerLeftHandNumber = (enemyLeftHandNumber + playerLeftHandNumber);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerLeft.setText("" +playerLeftHandNumber);
					if(playerLeftHandNumber == 1)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(playerLeftHandNumber == 2)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(playerLeftHandNumber == 3)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(playerLeftHandNumber == 4)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(enemyLeftHandSelected && ((enemyLeftHandNumber + playerLeftHandNumber) > 5) && (playerLeftHandNumber != 0) && (enemyLeftHandNumber != 0))
				{
					playerLeftHandNumber = ((enemyLeftHandNumber + playerLeftHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerLeft.setText("" +playerLeftHandNumber);
					if(playerLeftHandNumber == 1)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left1);
					}
					else
					if(playerLeftHandNumber == 2)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left2);
					}
					else
					if(playerLeftHandNumber == 3)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left3);
					}
					else
					if(playerLeftHandNumber == 4)
					{
						playerLeftHand.setBackgroundResource(R.drawable.left4);
					}
				}
				else
				if(enemyLeftHandSelected && ((enemyLeftHandNumber + playerLeftHandNumber) == 5) && (playerLeftHandNumber != 0) && (enemyLeftHandNumber != 0))
				{
					playerLeftHandNumber = ((enemyLeftHandNumber + playerLeftHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerLeft.setText("" +playerLeftHandNumber);
					playerLeftHand.setBackgroundResource(R.drawable.left0);
				}
				}
			}
		});
		
		homeButton.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View currentView)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();

			}
		});
		
		playerRightHand.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View currentView)
			{
				if(!enemyTurn)
				{
					playerLeftHandSelected = false;
					playerRightHandSelected = true;
				}
				else
				{
				if(enemyRightHandSelected && ((enemyRightHandNumber + playerRightHandNumber) < 5) && (playerRightHandNumber != 0) && (enemyRightHandNumber != 0))
				{
					playerRightHandNumber = (enemyRightHandNumber + playerRightHandNumber);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerRight.setText("" +playerRightHandNumber);
					if(playerRightHandNumber == 1)
					{
						playerRightHand.setBackgroundResource(R.drawable.right1);
					}
					else
					if(playerRightHandNumber == 2)
					{
						playerRightHand.setBackgroundResource(R.drawable.right2);
					}
					else
					if(playerRightHandNumber == 3)
					{
						playerRightHand.setBackgroundResource(R.drawable.right3);
					}
					else
					if(playerRightHandNumber == 4)
					{
						playerRightHand.setBackgroundResource(R.drawable.right4);
					}
				}
				else
				if(enemyRightHandSelected && ((enemyRightHandNumber + playerRightHandNumber) > 5) && (playerRightHandNumber != 0) && (enemyRightHandNumber != 0))
				{
					playerRightHandNumber = ((enemyRightHandNumber + playerRightHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerRight.setText("" +playerRightHandNumber);
					if(playerRightHandNumber == 1)
					{
						playerRightHand.setBackgroundResource(R.drawable.right1);
					}
					else
					if(playerRightHandNumber == 2)
					{
						playerRightHand.setBackgroundResource(R.drawable.right2);
					}
					else
					if(playerRightHandNumber == 3)
					{
						playerRightHand.setBackgroundResource(R.drawable.right3);
					}
					else
					if(playerRightHandNumber == 4)
					{
						playerRightHand.setBackgroundResource(R.drawable.right4);
					}
				}
				else
				if(enemyRightHandSelected && ((enemyRightHandNumber + playerRightHandNumber) == 5) && (playerRightHandNumber != 0) && (enemyRightHandNumber != 0))
				{
					playerRightHandNumber = ((enemyRightHandNumber + playerRightHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerRight.setText("" +playerRightHandNumber);
					playerRightHand.setBackgroundResource(R.drawable.right0);
				}
				else
				if(enemyLeftHandSelected && ((enemyLeftHandNumber + playerRightHandNumber) < 5) && (playerRightHandNumber != 0) && (enemyLeftHandNumber != 0))
				{
					playerRightHandNumber = (enemyLeftHandNumber + playerRightHandNumber);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerRight.setText("" +playerRightHandNumber);
					if(playerRightHandNumber == 1)
					{
						playerRightHand.setBackgroundResource(R.drawable.right1);
					}
					else
					if(playerRightHandNumber == 2)
					{
						playerRightHand.setBackgroundResource(R.drawable.right2);
					}
					else
					if(playerRightHandNumber == 3)
					{
						playerRightHand.setBackgroundResource(R.drawable.right3);
					}
					else
					if(playerRightHandNumber == 4)
					{
						playerRightHand.setBackgroundResource(R.drawable.right4);
					}
				}
				else
				if(enemyLeftHandSelected && ((enemyLeftHandNumber + playerRightHandNumber) > 5) && (playerRightHandNumber != 0) && (enemyLeftHandNumber != 0))
				{
					playerRightHandNumber = ((enemyLeftHandNumber + playerRightHandNumber) - 5);
					if(playerRightHandNumber == 1)
					{
						playerRightHand.setBackgroundResource(R.drawable.right1);
					}
					else
					if(playerRightHandNumber == 2)
					{
						playerRightHand.setBackgroundResource(R.drawable.right2);
					}
					else
					if(playerRightHandNumber == 3)
					{
						playerRightHand.setBackgroundResource(R.drawable.right3);
					}
					else
					if(playerRightHandNumber == 4)
					{
						playerRightHand.setBackgroundResource(R.drawable.right4);
					}
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerRight.setText("" +playerRightHandNumber);
				}
				else
				if(enemyLeftHandSelected && ((enemyLeftHandNumber + playerRightHandNumber) == 5) && (playerRightHandNumber != 0) && (enemyLeftHandNumber != 0))
				{
					playerRightHandNumber = ((enemyLeftHandNumber + playerRightHandNumber) - 5);
					enemyTurn = false;
					background.setBackgroundResource(R.drawable.tennis2);
					playerRight.setText("" +playerRightHandNumber);
					playerRightHand.setBackgroundResource(R.drawable.right0);
				}
				}
			}
		});
	}
}
