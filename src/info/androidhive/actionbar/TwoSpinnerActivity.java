package info.androidhive.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Da on 2014/5/26.
 */
public class TwoSpinnerActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ActionBar.LayoutParams layout = new ActionBar.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayUseLogoEnabled(false);
		//actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		View view = getLayoutInflater().inflate(R.layout.menu_custom, null);
		actionBar.setCustomView(view, layout);
	}
}
