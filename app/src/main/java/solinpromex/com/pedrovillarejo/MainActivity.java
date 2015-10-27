package solinpromex.com.pedrovillarejo;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.PushService;

import java.util.ArrayList;

public class MainActivity extends Activity {
    GridView gv;
    Context context;
    ArrayList prgmName;
    public static String [] prgmNameList={"Llámenos","Autos Nuevos","Seminuevos","Descuento Proveedores","Citas a servicio","Mapa","Enviar Email","Enviar Mensaje","Compartir App"};
    public static int [] prgmImages={R.mipmap.llamar,R.mipmap.nuevos,R.mipmap.seminuevos,R.mipmap.descuento,R.mipmap.citas,R.mipmap.mapa,R.mipmap.email,R.mipmap.sms,R.mipmap.compartir};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Parse.initialize(this, "BgMIR069diLQoLTF1vRm0E7IMhLQ31eQWaqba64S", "8eqKjrvR8lVyJT3qUWHfBnSxTiX2Z8CE9wWPaY3k");
        ParseInstallation.getCurrentInstallation().saveInBackground();
       // PushService.subscribe(context, "yourChannelName", MainActivity.class);

        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.grid);
        gv.setAdapter(new CustomAdapter(this, prgmNameList, prgmImages));
    }

}