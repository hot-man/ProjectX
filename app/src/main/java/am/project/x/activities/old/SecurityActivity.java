package am.project.x.activities.old;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import am.project.x.R;
import am.project.x.security.AntiEmulatorUtils;
import diff.strazzere.anti.AntiEmulator;

/**
 * 安全检测 Activity
 * Created by Alex on 2016/4/6.
 */
public class SecurityActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.old_activity_security);
        TextView tvSecurity = (TextView) findViewById(R.id.security);
        String log = "";
        log += "isDebuggable = " + AntiEmulatorUtils.isDebuggable(this) + "\n";
        log += "isQEmuEnvDetected = " + AntiEmulator.isQEmuEnvDetected(this) + "\n";
        log += "isDebugged = " + AntiEmulator.isDebugged() + "\n";
        log += "isMonkeyDetected = " + AntiEmulator.isMonkeyDetected() + "\n";
        log += "isTaintTrackingDetected = " + AntiEmulator.isTaintTrackingDetected(this) + "\n";
        log += "Signature = " + AntiEmulatorUtils.getSignature(this);
        tvSecurity.setText(log);
    }
}
