package edu.ucuccs.mysterypersons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Category extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category);

	}

	public void clickPolitician(View v) {

		Intent i = new Intent(Category.this, Pol_QuestionOne.class);
		startActivity(i);

	}

	public void clickCelebrity(View v) {

		Intent i = new Intent(Category.this, Cel_QuestionOne.class);
		startActivity(i);

	}

	public void clickScientist(View v) {

		Intent i = new Intent(Category.this, Sci_QuestionOne.class);
		startActivity(i);

	}

	public void clickProgrammer(View v) {

		Intent i = new Intent(Category.this, Pro_QuestionOne.class);
		startActivity(i);

	}

}
