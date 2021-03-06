package am.project.x.activities.old;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import am.project.x.R;
import am.project.x.widgets.connectview.ConnectImageView;


public class ConnectImageActivity extends Activity implements OnClickListener{
	private ConnectImageView connectImage;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.old_activity_connectimage);
		connectImage = (ConnectImageView) findViewById(R.id.image);
		connectImage.setDrawables(R.drawable.old_connectting, R.drawable.old_connected,
				R.drawable.old_unconnect);
		findViewById(R.id.btn_connect).setOnClickListener(this);
		findViewById(R.id.btn_failure).setOnClickListener(this);
		findViewById(R.id.btn_success).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_connect:
			connectImage.startConnectting();
			break;
		case R.id.btn_failure:
			connectImage.stopToFailure();
			break;
		case R.id.btn_success:
			connectImage.stopToSuccess();
			break;
		default:
			break;
		}
	}

}
