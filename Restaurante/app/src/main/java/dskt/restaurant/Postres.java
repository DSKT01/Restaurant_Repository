package dskt.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class Postres extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);

        lvItems = (ListView)findViewById(R.id.lv_itemsPostres);

        item = new Entidad("Tomate..........$7.000", "Tomate endulzado.");
        lista.add(item);
        item = new Entidad("Donas...........$6.000", "Dulces donas.");
        lista.add(item);


        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
