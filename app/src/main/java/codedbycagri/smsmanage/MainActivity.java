package codedbycagri.smsmanage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText phoneNo = (EditText)findViewById(R.id.editText);
        final EditText message = (EditText)findViewById(R.id.editText2);

        Button send = (Button)findViewById(R.id.button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.telephony.SmsManager sms = android.telephony.SmsManager.getDefault();
                sms.sendTextMessage(phoneNo.getText().toString(), null, message.getText().toString(), null, null);

            }
        });
    }
}
