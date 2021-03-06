package am.project.x.activities.old;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import am.project.x.R;
import am.project.x.widgets.citylistview.CitysListView;


public class CityListActivity extends Activity {


	private ListView listView;

	private CitysListView.BaseCitysAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.old_activity_citylist);
		super.onCreate(savedInstanceState);
		listView = (ListView) findViewById(android.R.id.list);
		adapter = new MyCitysAdapter(this, android.R.layout.simple_list_item_2);
		listView.setAdapter(adapter);

	}

}
