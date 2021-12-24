package o.osman.kitleendekshesaplama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class    MainActivity extends AppCompatActivity {

    Button hesaplabt;
    EditText btext,ktext;
    double sonuc;
    TextView vkesonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesaplabt=(Button) findViewById(R.id.hesaplabt);
        btext=(EditText) findViewById(R.id.btext);
        ktext=(EditText) findViewById(R.id.ktext);
        vkesonuc=(TextView) findViewById((R.id.vkesonuc));

        hesaplabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayac=0;
                String boy,kilo;
                boy=btext.getText().toString();
                kilo=ktext.getText().toString();
                double boykaresi;
                if("".equals(boy)) {Toast.makeText(getApplicationContext(),"Boy Değerini Giriniz...",Toast.LENGTH_LONG).show(); sayac++;}
                if("".equals(kilo)) {Toast.makeText(getApplicationContext(),"Kilo Değerini Giriniz...",Toast.LENGTH_LONG).show(); sayac++;}
                if (sayac==0)
                {
                    boykaresi=(Double.parseDouble(boy.toString())/100)*(Double.parseDouble(boy.toString())/100);
                    vkesonuc.setText(String.valueOf(Double.parseDouble(kilo.toString())/boykaresi));
                }
            }
        });
    }
}
